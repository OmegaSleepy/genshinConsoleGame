package clash;

import java.util.Arrays;

public class Card {
    public String[] alternativeNames = new String[0];
    String name;
    int elixir;
    Rarity rarity;
    Type type;
    int year;

    Card (String name, int elixir, Rarity rarity, Type type, String [] alternativeNames){
        this.name = name;
        this.elixir = elixir;
        this.rarity = rarity;
        this.type = type;
        this.alternativeNames = alternativeNames;
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

    //===RARE===

    final static Card HEAL_SPIRIT = new Card("Heal Spirit",1,Rarity.RARE,Type.TROOP);
    final static Card ICE_GOLEM = new Card("Ice Golem",2,Rarity.RARE,Type.TROOP);
    final static Card SUSPICIOUS_BUSH = new Card("Suspicious Bush",2,Rarity.RARE,Type.TROOP);
    final static Card MEGA_MINION = new Card("Mega Minion",3,Rarity.RARE,Type.TROOP);
    final static Card DART_GOBLIN = new Card("Dart Goblin",3,Rarity.RARE,Type.TROOP);
    final static Card ELIXIR_GOLEM = new Card("Elixir Golem",3,Rarity.RARE,Type.TROOP);
    final static Card MINI_PEKKA = new Card("Mini PEKKA",4,Rarity.RARE,Type.TROOP);
    final static Card MUSKETEER = new Card("Musketeer",4,Rarity.RARE,Type.TROOP);
    final static Card VALKYRIE = new Card("Valkyrie",4,Rarity.RARE,Type.TROOP);
    final static Card BATTLE_RAM = new Card("Battle Ram",4,Rarity.RARE,Type.TROOP);
    final static Card FLYING_MACHINE = new Card("Flying Machine",4,Rarity.RARE,Type.TROOP);
    final static Card HOG_RIDER = new Card("Hog Rider",4,Rarity.RARE,Type.TROOP);
    final static Card BATTLE_HEALER = new Card("Battle Healer",4,Rarity.RARE,Type.TROOP,
            new String[]{"Healer"});
    final static Card FURNACE = new Card("Furnace",4,Rarity.RARE,Type.TROOP);
    final static Card ZAPPIES = new Card("Zappies",4,Rarity.RARE,Type.TROOP);
    final static Card GOBLIN_DEMOLISHER = new Card("Goblin Demolisher",4,Rarity.RARE,Type.TROOP);
    final static Card GIANT = new Card("Giant",5,Rarity.RARE,Type.TROOP);
    final static Card WIZARD = new Card("Wizard",5,Rarity.RARE,Type.TROOP);
    final static Card ROYAL_HOGS = new Card("Royal Hogs",5,Rarity.RARE,Type.TROOP);
    final static Card THREE_MUSKETEERS = new Card("Three Musketeers",9,Rarity.RARE,Type.TROOP);


    final static Card EARTH_QUAKE = new Card("Earth Quake",3,Rarity.RARE,Type.TROOP);
    final static Card FIRE_BALL = new Card("Fire Ball",4,Rarity.RARE,Type.BUILDING);
    final static Card ROCKET = new Card("Rocket",6,Rarity.RARE,Type.BUILDING);


    final static Card TOMB_STONE = new Card("Tomb Stone",3,Rarity.RARE,Type.BUILDING);
    final static Card GOBLIN_HUT = new Card("Goblin Hut",4,Rarity.RARE,Type.BUILDING);
    final static Card GOBLIN_CAGE = new Card("Goblin Cage",4,Rarity.RARE,Type.BUILDING);
    final static Card BOMB_TOWER = new Card("Bomb Tower",4,Rarity.RARE,Type.BUILDING);
    final static Card INFERNO_TOWER = new Card("Inferno Tower",5,Rarity.RARE,Type.BUILDING);
    final static Card BARBARIAN_HUT = new Card("Barbarian Hut",6,Rarity.RARE,Type.BUILDING);
    final static Card ELIXIR_PUMP = new Card("Elixir Pump",6,Rarity.RARE,Type.BUILDING);

    //==EPIC==

    final static Card BARBARIAN_BARREL = new Card("Barbarian Barrel",1,Rarity.RARE,Type.BUILDING);



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
