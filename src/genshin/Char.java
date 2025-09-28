package genshin;

import java.util.Arrays;

public class Char {
    String name;
    double version;
    Element element;
    Nation nation;
    Weapon weapon;
    boolean isFiveStar;
    boolean isFemale;
    String[] alternativeNames = new String[0];
    Char (String name, double version, Element element, Nation nation, Weapon weapon, boolean isFiveStar, boolean isFemale){
        this.name = name;
        this.version = version;
        this.element = element;
        this.nation = nation;
        this.weapon = weapon;
        this.isFiveStar = isFiveStar;
        this.isFemale = isFemale;
    }
    Char (String name, double version, Element element, Nation nation, Weapon weapon, boolean isFiveStar, boolean isFemale, String[] alternativeNames){
        this.name = name;
        this.version = version;
        this.element = element;
        this.nation = nation;
        this.weapon = weapon;
        this.isFiveStar = isFiveStar;
        this.isFemale = isFemale;
        this.alternativeNames = alternativeNames;
    }
    //===OUTSIDE===//

    static final Char ALOY = new Char("Aloy", 2.1, Element.CRYO, Nation.OUTSIDE, Weapon.BOW, true, true,
            new String[]{"Alloy"});
    static final Char SKIRK = new Char("Skirk", 5.7, Element.CRYO, Nation.OUTSIDE, Weapon.SWORD, true, true);

    //===MONSTADT===//

    static final Char NOELE = new Char("Noele", 1.0, Element.GEO, Nation.MONSTADT, Weapon.CLAYMORE, false, true,
            new String[]{"Noel"});
    static final Char SUCROSE = new Char("Sucrose", 1.0, Element.ANEMO, Nation.MONSTADT, Weapon.CATALYST, false, true);
    static final Char KAEYA = new Char("Kaeya", 1.0, Element.CRYO, Nation.MONSTADT, Weapon.SWORD, false, false);
    static final Char RAZOR = new Char("Razor", 1.0, Element.ELECTRO, Nation.MONSTADT, Weapon.CLAYMORE, false, false);
    static final Char LISA = new Char("Lisa", 1.0, Element.ELECTRO, Nation.MONSTADT, Weapon.CATALYST, false, true);
    static final Char FISCHL = new Char("Fischl", 1.0, Element.ELECTRO, Nation.MONSTADT, Weapon.BOW, false, true,
            new String[]{"Fisc","Fish","Fishl"});
    static final Char BARBARA = new Char("Barbara", 1.0, Element.HYDRO, Nation.MONSTADT, Weapon.CATALYST, false, true);
    static final Char BENNETT = new Char("Bennett", 1.0, Element.PYRO, Nation.MONSTADT, Weapon.SWORD, false, false,
            new String[]{"Ben Ten"});
    static final Char AMBER = new Char("Amber", 1.0, Element.PYRO, Nation.MONSTADT, Weapon.BOW, false, true);
    static final Char DIONA = new Char("Diona", 1.1, Element.CRYO, Nation.MONSTADT, Weapon.BOW, false, true);
    static final Char ROSALIA = new Char("Rosalia", 1.4, Element.CRYO, Nation.MONSTADT, Weapon.POLEARM, false, true,
            new String[]{"Rozalia","Roza","Rosa"});
    static final Char MIKA = new Char("Mika", 3.5, Element.CRYO, Nation.MONSTADT, Weapon.POLEARM, false, false);
    static final Char DAHLIA = new Char("Dahlia", 5.7, Element.HYDRO, Nation.MONSTADT, Weapon.SWORD, false, false);

    static final Char VENTI = new Char("Venti", 1.0, Element.ANEMO, Nation.MONSTADT, Weapon.BOW, true, false);
    static final Char JEAN = new Char("Jean", 1.0, Element.ANEMO, Nation.MONSTADT, Weapon.SWORD, true, true);
    static final Char MONA = new Char("Mona", 1.0, Element.HYDRO, Nation.MONSTADT, Weapon.CATALYST, true, true);
    static final Char KLEE = new Char("Klee", 1.0, Element.PYRO, Nation.MONSTADT, Weapon.CATALYST, true, true,
            new String[]{"Kle"});
    static final Char DILUC = new Char("Diluc", 1.0, Element.PYRO, Nation.MONSTADT, Weapon.CLAYMORE, true, false);
    static final Char ALBEDO = new Char("Albedo", 1.2, Element.GEO, Nation.MONSTADT, Weapon.SWORD, true, false);
    static final Char EULA = new Char("Eula", 1.5, Element.CRYO, Nation.MONSTADT, Weapon.CLAYMORE, true, true);
    static final Char VARKA = new Char("Varka", 6.2, Element.ANEMO, Nation.MONSTADT, Weapon.CLAYMORE, true, false);
    static final Char DURIN = new Char("Durin", 6.4, Element.PYRO, Nation.MONSTADT, Weapon.SWORD, true, false);

    //===LIYUE===//

    static final Char NINGUANG = new Char("Ninguang", 1.0, Element.GEO, Nation.LIYUE, Weapon.CATALYST, false, true);
    static final Char CHONGYUN = new Char("Chongyun", 1.0, Element.CRYO, Nation.LIYUE, Weapon.CLAYMORE, false, false);
    static final Char BEIDOU = new Char("Beidou", 1.0, Element.ELECTRO, Nation.LIYUE, Weapon.CLAYMORE, false, true);
    static final Char XIANGLING = new Char("Xiangling", 1.0, Element.PYRO, Nation.LIYUE, Weapon.POLEARM, false, true);
    static final Char XINGQIU = new Char("Xingqiu", 1.0, Element.HYDRO, Nation.LIYUE, Weapon.SWORD, false,false,
            new String[]{"Xingqui"});
    static final Char XIANYAN = new Char("Xianyan", 1.1, Element.PYRO, Nation.LIYUE, Weapon.CLAYMORE, false, true);
    static final Char YAN_FEI = new Char("Yan Fei", 1.5, Element.PYRO, Nation.LIYUE, Weapon.CATALYST, false, true,
            new String[]{"Fei"});
    static final Char YUN_JIN = new Char("Yun Jin", 2.4, Element.GEO, Nation.LIYUE, Weapon.POLEARM, false, true,
            new String[]{"Yun", "Jin"});
    static final Char YAOYAO = new Char("Yaoyao", 3.4, Element.DENTRO, Nation.LIYUE, Weapon.POLEARM, false, true,
            new String[]{"Yao"});
    static final Char GAMING = new Char("Gaming", 4.4, Element.PYRO, Nation.LIYUE, Weapon.CLAYMORE, false, false);
    static final Char LAN_YAN = new Char("Lan Yan", 5.3, Element.ANEMO, Nation.LIYUE, Weapon.CATALYST, false, true,
            new String[]{"Lan"});

    static final Char QIQI = new Char("Qiqi", 1.0, Element.CRYO, Nation.LIYUE, Weapon.SWORD, true, true);
    static final Char KEQING = new Char("Keqing", 1.0, Element.ELECTRO, Nation.LIYUE, Weapon.SWORD, true, true);
    static final Char ZHONGLI = new Char("Zhongli", 1.1, Element.GEO, Nation.LIYUE, Weapon.CLAYMORE, true, false);
    static final Char GANYU = new Char("Ganyu", 1.2, Element.CRYO, Nation.LIYUE, Weapon.BOW, true, true);
    static final Char HU_TAO = new Char("Hu Tao", 1.3, Element.PYRO, Nation.LIYUE, Weapon.POLEARM, true, true);
    static final Char XIAO = new Char("Xiao", 1.3, Element.ANEMO, Nation.LIYUE, Weapon.POLEARM, true, false);
    static final Char SHENHE = new Char("Shenhe", 2.4, Element.CRYO, Nation.LIYUE, Weapon.POLEARM, true,true);
    static final Char YELAN = new Char("Yelan", 2.7, Element.HYDRO, Nation.LIYUE, Weapon.BOW, true,true);
    static final Char BAIZHU = new Char("Baizhu", 3.6, Element.DENTRO, Nation.LIYUE, Weapon.CATALYST, true,false);
    static final Char XIANYUN = new Char("Xianyun", 4.4, Element.ANEMO, Nation.LIYUE, Weapon.CATALYST, true,true);
    static final Char CALEDON_MARE = new Char("Caledon Mare", 6.3, Element.ANEMO, Nation.LIYUE, Weapon.BOW, true,true,
            new String[]{"Horse"});

    //===SNEZHNAYA===

    static final Char TARTAGLIA = new Char("Tartaglia", 1.1, Element.HYDRO, Nation.SNEZHNAYA, Weapon.BOW, true, false,
            new String[]{"Childe", "Ajax"});
    static final Char ARLECCHINO = new Char("Arlecchino", 4.6, Element.PYRO, Nation.SNEZHNAYA, Weapon.POLEARM, true, true,
            new String[]{"Perier", "The Knave", "Father", "Peruere", "Arle", "Arlechino"});
    //perier is not intentional, I just spelled the name wrongly and was so funny that I decided to leave it there

    //===INAZUMA===

    static final Char SAYU = new Char("Sayu", 2.0, Element.ANEMO, Nation.INAZUMA, Weapon.CLAYMORE, false,true);
    static final Char KUJOU_SARA = new Char("Kujou Sara", 2.1, Element.ELECTRO, Nation.INAZUMA, Weapon.BOW, false,true,
            new String[]{"Kujou","Sara"});
    static final Char THOMA = new Char("Thoma", 2.2, Element.PYRO, Nation.INAZUMA, Weapon.POLEARM, false,false);
    static final Char GOROU = new Char("Gorou", 2.3, Element.GEO, Nation.INAZUMA, Weapon.BOW, false,false);
    static final Char KUKI_SHINOBU = new Char("Kuki Shinobu", 2.7, Element.ELECTRO, Nation.INAZUMA, Weapon.SWORD, false,true,
            new String[]{"Kuki","Shinobu"});
    static final Char SHIKANOIN_HEIZOU = new Char("Shikanoin Heizou", 2.8, Element.ANEMO, Nation.INAZUMA, Weapon.CATALYST, false,false,
            new String[]{"Heizhou","Shikanoin"});
    static final Char KIRARA = new Char("Kirara", 3.7, Element.DENTRO, Nation.INAZUMA, Weapon.SWORD, false,true);

    static final Char KAEDAHA_KAZUHA = new Char("Kaedaha Kazuha", 1.6, Element.ANEMO, Nation.INAZUMA, Weapon.SWORD, true, false,
            new String[]{"Kazuha"});
    static final Char YOIMIYA = new Char("Yoimiya", 2.0, Element.PYRO, Nation.INAZUMA, Weapon.BOW, true,true);
    static final Char KAMISATO_AYAKA = new Char("Kamisato Ayaka", 2.0, Element.CRYO, Nation.INAZUMA, Weapon.SWORD, true, true,
            new String[]{"Ayaka"});
    static final Char RAIDEN_SHOGUN = new Char("Raiden Shogun", 2.1, Element.ELECTRO, Nation.INAZUMA, Weapon.POLEARM, true, true,
            new String[]{"Raiden","Ei"});
    static final Char SANGONOMIYA_KOKOMI = new Char("Sangonomiya Kokomi", 2.1, Element.HYDRO, Nation.INAZUMA, Weapon.CATALYST, true, true,
            new String[]{"Kokomi"});
    static final Char ARATAKI_ITTO = new Char("Arataki Itto", 2.3, Element.GEO, Nation.INAZUMA, Weapon.CLAYMORE, true, false,
            new String[]{"Itto","Arataki"});
    static final Char YAE_MIKO = new Char("Yae Miko", 2.5, Element.ELECTRO, Nation.INAZUMA, Weapon.CATALYST, true, true,
            new String[]{"Yae","Miko"});
    static final Char KAMISATO_AYATO = new Char("Kamisato Ayato", 2.6, Element.HYDRO, Nation.INAZUMA, Weapon.SWORD, true, false,
            new String[]{"Ayato"});
    static final Char CHIORI = new Char("Chiori", 4.5, Element.GEO, Nation.INAZUMA, Weapon.SWORD, true, true);
    static final Char YUMEMIZUKI_MIZUKI = new Char("Yumemizuki Mizuki", 5.4, Element.ANEMO, Nation.INAZUMA, Weapon.CATALYST, true, true,
            new String[]{"Mizuki"});

    //===SUMERU===

    static final Char COLLEI = new Char("Collei", 3.0, Element.DENTRO, Nation.SUMERU, Weapon.BOW, false, true);
    static final Char DORI = new Char("Dori", 3.0, Element.ELECTRO, Nation.SUMERU, Weapon.CLAYMORE, false, true);
    static final Char CANDACE = new Char("Candace", 3.1, Element.HYDRO, Nation.SUMERU, Weapon.POLEARM, false, true);
    static final Char LAYLA = new Char("Layla", 3.2, Element.CRYO, Nation.SUMERU, Weapon.SWORD, false, true);
    static final Char FARUZAN = new Char("Faruzan", 3.3, Element.ANEMO, Nation.SUMERU, Weapon.BOW, false, true);
    static final Char KAVEH = new Char("Kaveh", 3.6, Element.DENTRO, Nation.SUMERU, Weapon.CLAYMORE, false, false);
    static final Char SETHOS = new Char("Sethos", 4.7, Element.ELECTRO, Nation.SUMERU, Weapon.BOW, false, false);

    static final Char TIGHNARI = new Char("Tighnari", 3.0, Element.DENTRO, Nation.SUMERU, Weapon.BOW, true, false,
            new String[]{"Tigh"});
    static final Char CYNO = new Char("Cyno", 3.1, Element.ELECTRO, Nation.SUMERU, Weapon.POLEARM, true, false);
    static final Char NILOU = new Char("Nilou", 3.1, Element.HYDRO, Nation.SUMERU, Weapon.SWORD, true, true);
    static final Char NAHIDA = new Char("Nahida", 3.2, Element.DENTRO, Nation.SUMERU, Weapon.CATALYST, true, true);
    static final Char WANDERER = new Char("Wanderer", 3.3, Element.ANEMO, Nation.SUMERU, Weapon.CATALYST, true, false);
    static final Char ALHAITHAM = new Char("Alhaitham", 3.4, Element.DENTRO, Nation.SUMERU, Weapon.SWORD, true,false);
    static final Char DEHYA = new Char("Dehya", 3.4, Element.PYRO, Nation.SUMERU, Weapon.CLAYMORE, true,true);

    //===FONTAINE===

    static final Char LYNETTE = new Char("Lynette", 4.0, Element.ANEMO, Nation.FONTAINE, Weapon.SWORD, false,true);
    static final Char FREMINET = new Char("Freminet", 4.0, Element.CRYO, Nation.FONTAINE, Weapon.CLAYMORE, false,false);
    static final Char CHARLOTTE = new Char("Charlotte", 4.2, Element.CRYO, Nation.FONTAINE, Weapon.CATALYST, false,true);
    static final Char CHEVREUSE = new Char("Chevreuse", 4.3, Element.PYRO, Nation.FONTAINE, Weapon.POLEARM, false,true,
            new String[]{"Chev"});

    static final Char LYNEY = new Char("Lyney", 4.0, Element.PYRO, Nation.FONTAINE, Weapon.BOW, true,false,
            new String[]{"Lini"});
    static final Char NEUVILLETTE = new Char("Neuvillette", 4.1, Element.HYDRO, Nation.FONTAINE, Weapon.CATALYST, true,false,
            new String[]{"Neuv"});
    static final Char WRIOTHESLEY = new Char("Wriothesley", 4.1, Element.CRYO, Nation.FONTAINE, Weapon.CATALYST, true,false,
            new String[]{"Wrio"});
    static final Char FURINA = new Char("Furina", 4.2, Element.HYDRO, Nation.FONTAINE, Weapon.SWORD, true,true);
    static final Char NAVIA = new Char("Navia", 4.3, Element.GEO, Nation.FONTAINE, Weapon.CLAYMORE, true,true);
    static final Char CLORINDE = new Char("Clorinde", 4.7, Element.ELECTRO, Nation.FONTAINE, Weapon.SWORD, true,true);
    static final Char SIGEWINNE = new Char("Sigewinne", 4.7, Element.HYDRO, Nation.FONTAINE, Weapon.BOW, true,true);
    static final Char EMILIE = new Char("Emilie", 4.8, Element.DENTRO, Nation.FONTAINE, Weapon.POLEARM, true,true,
            new String[]{"Emili","Emy","Emily","Emi","Emyly","Emylie"});
    static final Char ESCOFFIER = new Char("Escoffier", 5.6, Element.CRYO, Nation.FONTAINE, Weapon.POLEARM, true,true,
            new String[]{"Nescaffe"});

    //===NATLAN===

    static final Char KACHINA = new Char("Kachina", 5.0, Element.GEO, Nation.NATLAN, Weapon.POLEARM, false,true);
    static final Char ORORON = new Char("Ororon", 5.2, Element.ELECTRO, Nation.NATLAN, Weapon.BOW, false,false,
            new String[]{"Orororon"});
    static final Char IANSAN = new Char("Iansan", 5.5, Element.ELECTRO, Nation.NATLAN, Weapon.POLEARM, false,true);
    static final Char IFA = new Char("Ifa", 5.6, Element.ANEMO, Nation.NATLAN, Weapon.CATALYST, false,false);

    static final Char MUALANI = new Char("Mualani", 5.0, Element.HYDRO, Nation.NATLAN, Weapon.CATALYST, true,true,
            new String[]{"lani","mua"});
    static final Char KINICH = new Char("Kinich", 5.0, Element.DENTRO, Nation.NATLAN, Weapon.CLAYMORE, true,false);
    static final Char XILONEN = new Char("Xilonen", 5.1, Element.GEO, Nation.NATLAN, Weapon.SWORD, true,true);
    static final Char CHASCA = new Char("Chasca", 5.2, Element.ANEMO, Nation.NATLAN, Weapon.BOW, true,true);
    static final Char CITLALI = new Char("Citlali", 5.3, Element.CRYO, Nation.NATLAN, Weapon.CATALYST, true,true,
            new String[]{"Citalali","Citali"});
    static final Char MAVUIKA = new Char("Mavuika", 5.3, Element.PYRO, Nation.NATLAN, Weapon.CLAYMORE, true,true,
            new String[]{"Mav"});
    static final Char VARESA = new Char("Varesa", 5.5, Element.ELECTRO, Nation.NATLAN, Weapon.CATALYST, true,true);

    //===NOD KRAI===

    static final Char AINO = new Char("Aino", 6.0, Element.HYDRO, Nation.NOD_KRAI, Weapon.CLAYMORE, false,true);
    static final Char JAHODA = new Char("Jahoda", 6.2, Element.ANEMO, Nation.NOD_KRAI, Weapon.BOW, false,true);

    static final Char INEFFA = new Char("Ineffa", 5.8, Element.ELECTRO, Nation.NOD_KRAI, Weapon.POLEARM, true,true);
    static final Char LAUMA = new Char("Lauma", 6.0, Element.DENTRO, Nation.NOD_KRAI, Weapon.CATALYST, true,true);
    static final Char KYRRYL_CHUDOMIROVICH_FLINS = new Char("Kyrryl Chudomirovich Flins", 6.0, Element.ELECTRO, Nation.NOD_KRAI, Weapon.POLEARM, true,false,
            new String[] {"Flins","Kiril","Kyrryl","Chudomirovich", "Gojo", "Metodii", "Lamp"});
    static final Char NEFER = new Char("Nefer", 6.1, Element.DENTRO, Nation.NOD_KRAI, Weapon.CATALYST, true,true);
    static final Char COLUMBINA = new Char("Columbina", 6.3, Element.HYDRO, Nation.NOD_KRAI, Weapon.POLEARM, true,true);

    @Override
    public String toString () {
        return this.name.toUpperCase();
    }
    public boolean hasAlternativeNames(){
        return !Arrays.equals(alternativeNames, new String[0]);
    }
}
