package clash;

import java.util.Arrays;

public class Card {
    public String[] alternativeNames;
    String name;
    int elixir;
    Rarity rarity;
    Type type;
    int year;

    Card (String name, int elixir, Rarity rarity, Type type, int year){
        this.name = name;
        this.elixir = elixir;
        this.rarity = rarity;
        this.type = type;
        this.year = year;
    }
    Card (String name, int elixir, Rarity rarity, Type type){
        this.name = name;
        this.elixir = elixir;
        this.rarity = rarity;
        this.type = type;
    }

    public boolean hasAlternativeNames(){
        return !Arrays.equals(alternativeNames, new String[0]);
    }

    enum Rarity{
        COMMON, RARE, EPIC, LEGENDARY, CHAMPION
    }
    enum Type{
        TROOP, SPELL, BUILDING
    }

    //===COMMON===
    final static Card SKELETONS = new Card("Skeletons",1,Rarity.COMMON,Type.TROOP);
    final static Card ELECTRO_SPIRIT = new Card("Electro Spirit",1,Rarity.COMMON,Type.TROOP);
    final static Card FIRE_SPIRIT = new Card("Fire Spirit ",1,Rarity.COMMON,Type.TROOP);
    final static Card ICE_SPIRIT = new Card("Ice Spirit",1,Rarity.COMMON,Type.TROOP);
    final static Card GOBLINS = new Card("Goblins",2,Rarity.COMMON,Type.TROOP);
    final static Card SPEAR_GOBLINS = new Card("Spear Goblins",2,Rarity.COMMON,Type.TROOP);
    final static Card BOMBER = new Card("Bomber",2,Rarity.COMMON,Type.TROOP);
    final static Card BATS = new Card("Bats",2,Rarity.COMMON,Type.TROOP);
    final static Card BERSERKER = new Card("Berserker",2,Rarity.COMMON,Type.TROOP);
    final static Card ARCHERS = new Card("Archers",3,Rarity.COMMON,Type.TROOP);
    final static Card KNIGHT = new Card("Knight",3,Rarity.COMMON,Type.TROOP);
    final static Card MINIONS = new Card("Minions",3,Rarity.COMMON,Type.TROOP);
    final static Card GOBLIN_GANG = new Card("Goblin Gang",3,Rarity.COMMON,Type.TROOP);
    final static Card SKELETON_BARREL = new Card("Skeleton Barrel",3,Rarity.COMMON,Type.TROOP);
    final static Card FIRE_CRACKER = new Card("Fire Cracker",3,Rarity.COMMON,Type.TROOP);
    final static Card SKELETON_DRAGONS = new Card("Skeleton Dragons",4,Rarity.COMMON,Type.TROOP);
    final static Card BARBARIANS = new Card("Barbarians",5,Rarity.COMMON,Type.TROOP);
    final static Card MINION_HORDE = new Card("Minion Horde",5,Rarity.COMMON,Type.TROOP);
    final static Card RASCALS = new Card("Rascals",5,Rarity.COMMON,Type.TROOP);
    final static Card ROYAL_GIANT = new Card("Royal Giant",6,Rarity.COMMON,Type.TROOP);
    final static Card ELITE_BARBARIANS = new Card("Elite Barbarians",6,Rarity.COMMON,Type.TROOP);
    final static Card ROYAL_RECRUITS = new Card("Royal Recruits",7,Rarity.COMMON,Type.TROOP);


    final static Card ZAP = new Card("Zap",2,Rarity.COMMON,Type.SPELL);
    final static Card SNOW_BALL = new Card("Snow Ball",2,Rarity.COMMON,Type.SPELL);
    final static Card ARROWS = new Card("Arrows",3,Rarity.COMMON,Type.SPELL);
    final static Card ROYAL_DELIVERY = new Card("Royal Delivery",3,Rarity.COMMON,Type.SPELL);


    final static Card CANNON = new Card("Cannon",3,Rarity.COMMON,Type.BUILDING);
    final static Card Mortar = new Card("Mortar",4,Rarity.COMMON,Type.BUILDING);
    final static Card TESLA = new Card("Tesla",4,Rarity.COMMON,Type.BUILDING);

    //===CHAMPIONS===

    final static Card LITTLE_PRINCE = new Card("Little Prince",3,Rarity.CHAMPION,Type.TROOP);
    final static Card GOLDEN_NIGHT = new Card("Golden Night",4,Rarity.CHAMPION,Type.TROOP);
    final static Card SKELETON_KING = new Card("Skeleton King",4,Rarity.CHAMPION,Type.TROOP);
    final static Card MIGHTY_MINER = new Card("Mighty Miner",4,Rarity.CHAMPION,Type.TROOP);
    final static Card ARCHER_QUEEN = new Card("Archer Queen",5,Rarity.CHAMPION,Type.TROOP);
    final static Card GOBLINSTEIN = new Card("Goblinstein",5,Rarity.CHAMPION,Type.TROOP);
    final static Card MONK = new Card("Monk",5,Rarity.CHAMPION,Type.TROOP);
    final static Card BOSS_BANDIT = new Card("Boss Bandit",6,Rarity.CHAMPION,Type.TROOP);


}
