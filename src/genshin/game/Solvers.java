package genshin.game;

import genshin.Holder;
import genshin.enums.Char;
import genshin.util.Random;

import java.util.List;

import static genshin.Game.isFirstRound;
import static genshin.Game.seed;
import static genshin.game.CharUtil.getRandomCharacter;
import static genshin.game.PossibleFinder.*;

public class Solvers {

    public static Char solveSmart () {
        // collect all possible candidates
        List<Char> possibleChar = possibleCharacters(Holder.characters);

        System.out.printf("<Total possible %s>\n", possibleChar.size());

        if (possibleChar.isEmpty()) {
            // fallback: shouldn’t normally happen
            return getRandomCharacter();
        }

        // if only 1 left, that's the answer
        if (possibleChar.size() == 1) {
            return possibleChar.getFirst();
        }

        // First round: aim for middle version (to split search space)
        if (isFirstRound) {
            double target = (minVersion + maxVersion) / 2.0;
            Char best = possibleChar.getFirst();
            double bestDiff = Math.abs(best.version - target);
            for (Char c : possibleChar) {
                double diff = Math.abs(c.version - target);
                if (diff < bestDiff) {
                    best = c;
                    bestDiff = diff;
                }
            }
            return best;
        }

        // Later rounds: try to maximize version narrowing
        double targetMid = (minVersion + maxVersion) / 2.0;
        Char best = possibleChar.getFirst();
        double bestScore = Double.MAX_VALUE;

        for (Char c : possibleChar) {
            double diff = Math.abs(c.version - targetMid);

            // Add small tie-breakers to encourage diverse exploration
            double tieBreaker = 0;
            if (possibleElements.size() > 1) tieBreaker += 0.2;
            if (possibleWeapons.size() > 1) tieBreaker += 0.1;
            if (possibleNations.size() > 1) tieBreaker += 0.05;

            double score = diff + tieBreaker;
            if (score < bestScore) {
                bestScore = score;
                best = c;
            }
        }

        return best;
    }

    public static Char solveRandom () {
        List<Char> possibleChar = possibleCharacters(Holder.characters);
        System.out.printf("<Total possible %s>\n", possibleChar.size());
        return possibleChar.get(new Random(seed).getRandomCapped(possibleChar.size()));

    }
}
