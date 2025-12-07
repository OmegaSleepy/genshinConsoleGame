package genshin.enums;

import java.util.Arrays;

import static genshin.enums.Element.*;
import static genshin.enums.Weapon.*;
import static genshin.enums.Nation.*;

public enum Char {
    NOELE("Noele",1.0,GEO,MONSTADT,CLAYMORE,false,true,new String[] {"Noel"}),
    SUCROSE("Sucrose",1.0,ANEMO,MONSTADT,CATALYST,false,true),
    KAEYA("Kaeya",1.0,CRYO,MONSTADT,SWORD,false,false),
    RAZOR("Razor",1.0,ELECTRO,MONSTADT,CLAYMORE,false,false),
    LISA("Lisa",1.0,ELECTRO,MONSTADT,CATALYST,false,true),
    FISCHL("Fischl",1.0,ELECTRO,MONSTADT,BOW,false,true,new String[] {"Fisc","Fish","Fishl"}),
    BARBARA("Barbara",1.0,HYDRO,MONSTADT,CATALYST,false,true),
    BENNETT("Bennett",1.0,PYRO,MONSTADT,SWORD,false,false,new String[] {"Ben Ten"}),
    AMBER("Amber",1.0,PYRO,MONSTADT,BOW,false,true),
    DIONA("Diona",1.1,CRYO,MONSTADT,BOW,false,true),
    ROSALIA("Rosalia",1.4,CRYO,MONSTADT,POLEARM,false,true,new String[] {"Rozalia","Roza","Rosa"}),
    MIKA("Mika",3.5,CRYO,MONSTADT,POLEARM,false,false),
    DAHLIA("Dahlia",5.7,HYDRO,MONSTADT,SWORD,false,false),
    VENTI("Venti",1.0,ANEMO,MONSTADT,BOW,true,false),
    JEAN("Jean",1.0,ANEMO,MONSTADT,SWORD,true,true),
    MONA("Mona",1.0,HYDRO,MONSTADT,CATALYST,true,true),
    KLEE("Klee",1.0,PYRO,MONSTADT,CATALYST,true,true,new String[] {"Kle"}),
    DILUC("Diluc",1.0,PYRO,MONSTADT,CLAYMORE,true,false),
    ALBEDO("Albedo",1.2,GEO,MONSTADT,SWORD,true,false),
    EULA("Eula",1.5,CRYO,MONSTADT,CLAYMORE,true,true),
    DURIN("Durin",6.2,PYRO,MONSTADT,SWORD,true,false),
    VARKA("Varka",6.3,ANEMO,MONSTADT,CLAYMORE,true,false),
    NINGUANG("Ninguang",1.0,GEO,LIYUE,CATALYST,false,true),
    CHONGYUN("Chongyun",1.0,CRYO,LIYUE,CLAYMORE,false,false),
    BEIDOU("Beidou",1.0,ELECTRO,LIYUE,CLAYMORE,false,true),
    XIANGLING("Xiangling",1.0,PYRO,LIYUE,POLEARM,false,true),
    XINGQIU("Xingqiu",1.0,HYDRO,LIYUE,SWORD,false,false,new String[] {"Xingqui"}),
    XIANYAN("Xianyan",1.1,PYRO,LIYUE,CLAYMORE,false,true),
    YAN_FEI("Yan Fei",1.5,PYRO,LIYUE,CATALYST,false,true,new String[] {"Fei"}),
    YUN_JIN("Yun Jin",2.4,GEO,LIYUE,POLEARM,false,true,new String[] {"Yun","Jin"}),
    YAOYAO("Yaoyao",3.4,DENTRO,LIYUE,POLEARM,false,true,new String[] {"Yao"}),
    GAMING("Gaming",4.4,PYRO,LIYUE,CLAYMORE,false,false),
    LAN_YAN("Lan Yan",5.3,ANEMO,LIYUE,CATALYST,false,true,new String[] {"Lan"}),
    QIQI("Qiqi",1.0,CRYO,LIYUE,SWORD,true,true),
    KEQING("Keqing",1.0,ELECTRO,LIYUE,SWORD,true,true),
    ZHONGLI("Zhongli",1.1,GEO,LIYUE,CLAYMORE,true,false),
    GANYU("Ganyu",1.2,CRYO,LIYUE,BOW,true,true),
    HU_TAO("Hu Tao",1.3,PYRO,LIYUE,POLEARM,true,true),
    XIAO("Xiao",1.3,ANEMO,LIYUE,POLEARM,true,false),
    SHENHE("Shenhe",2.4,CRYO,LIYUE,POLEARM,true,true),
    YELAN("Yelan",2.7,HYDRO,LIYUE,BOW,true,true),
    BAIZHU("Baizhu",3.6,DENTRO,LIYUE,CATALYST,true,false),
    XIANYUN("Xianyun",4.4,ANEMO,LIYUE,CATALYST,true,true),
    CALEDON_MARE("Caledon Mare",6.3,ANEMO,LIYUE,BOW,true,true,new String[] {"Horse"}),
    TARTAGLIA("Tartaglia",1.1,HYDRO,SNEZHNAYA,BOW,true,false,new String[] {"Childe","Ajax"}),
    ARLECCHINO("Arlecchino",4.6,PYRO,SNEZHNAYA,POLEARM,true,true,new String[] {"Perier","The Knave","Father","Peruere","Arle","Arlechino"}),
    SAYU("Sayu",2.0,ANEMO,INAZUMA,CLAYMORE,false,true),
    KUJOU_SARA("Kujou Sara",2.1,ELECTRO,INAZUMA,BOW,false,true,new String[] {"Kujou","Sara"}),
    THOMA("Thoma",2.2,PYRO,INAZUMA,POLEARM,false,false),
    GOROU("Gorou",2.3,GEO,INAZUMA,BOW,false,false),
    KUKI_SHINOBU("Kuki Shinobu",2.7,ELECTRO,INAZUMA,SWORD,false,true,new String[] {"Kuki","Shinobu"}),
    SHIKANOIN_HEIZOU("Shikanoin Heizou",2.8,ANEMO,INAZUMA,CATALYST,false,false,new String[] {"Heizhou","Shikanoin"}),
    KIRARA("Kirara",3.7,DENTRO,INAZUMA,SWORD,false,true),
    KAEDEHARA_KAZUHA("Kaedehara Kazuha",1.6,ANEMO,INAZUMA,SWORD,true,false,new String[] {"Kazuha","Kazu","Kaedahara"}),
    YOIMIYA("Yoimiya",2.0,PYRO,INAZUMA,BOW,true,true),
    KAMISATO_AYAKA("Kamisato Ayaka",2.0,CRYO,INAZUMA,SWORD,true,true,new String[] {"Ayaka"}),
    RAIDEN_SHOGUN("Raiden Shogun",2.1,ELECTRO,INAZUMA,POLEARM,true,true,new String[] {"Raiden","Ei"}),
    SANGONOMIYA_KOKOMI("Sangonomiya Kokomi",2.1,HYDRO,INAZUMA,CATALYST,true,true,new String[] {"Kokomi"}),
    ARATAKI_ITTO("Arataki Itto",2.3,GEO,INAZUMA,CLAYMORE,true,false,new String[] {"Itto","Arataki"}),
    YAE_MIKO("Yae Miko",2.5,ELECTRO,INAZUMA,CATALYST,true,true,new String[] {"Yae","Miko"}),
    KAMISATO_AYATO("Kamisato Ayato",2.6,HYDRO,INAZUMA,SWORD,true,false,new String[] {"Ayato"}),
    CHIORI("Chiori",4.5,GEO,INAZUMA,SWORD,true,true),
    YUMEMIZUKI_MIZUKI("Yumemizuki Mizuki",5.4,ANEMO,INAZUMA,CATALYST,true,true,new String[] {"Mizuki"}),
    ALOY("Aloy",2.1,CRYO,OUTSIDE,BOW,true,true,new String[] {"Alloy"}),
    SKIRK("Skirk",5.7,CRYO,OUTSIDE,SWORD,true,true),
    COLLEI("Collei",3.0,DENTRO,SUMERU,BOW,false,true),
    DORI("Dori",3.0,ELECTRO,SUMERU,CLAYMORE,false,true),
    CANDACE("Candace",3.1,HYDRO,SUMERU,POLEARM,false,true),
    LAYLA("Layla",3.2,CRYO,SUMERU,SWORD,false,true),
    FARUZAN("Faruzan",3.3,ANEMO,SUMERU,BOW,false,true),
    KAVEH("Kaveh",3.6,DENTRO,SUMERU,CLAYMORE,false,false),
    SETHOS("Sethos",4.7,ELECTRO,SUMERU,BOW,false,false),
    TIGHNARI("Tighnari",3.0,DENTRO,SUMERU,BOW,true,false,new String[] {"Tigh"}),
    CYNO("Cyno",3.1,ELECTRO,SUMERU,POLEARM,true,false),
    NILOU("Nilou",3.1,HYDRO,SUMERU,SWORD,true,true),
    NAHIDA("Nahida",3.2,DENTRO,SUMERU,CATALYST,true,true),
    WANDERER("Wanderer",3.3,ANEMO,SUMERU,CATALYST,true,false),
    ALHAITHAM("Alhaitham",3.4,DENTRO,SUMERU,SWORD,true,false),
    DEHYA("Dehya",3.4,PYRO,SUMERU,CLAYMORE,true,true),
    LYNETTE("Lynette",4.0,ANEMO,FONTAINE,SWORD,false,true),
    FREMINET("Freminet",4.0,CRYO,FONTAINE,CLAYMORE,false,false),
    CHARLOTTE("Charlotte",4.2,CRYO,FONTAINE,CATALYST,false,true),
    CHEVREUSE("Chevreuse",4.3,PYRO,FONTAINE,POLEARM,false,true,new String[] {"Chev"}),
    LYNEY("Lyney",4.0,PYRO,FONTAINE,BOW,true,false,new String[] {"Lini"}),
    NEUVILLETTE("Neuvillette",4.1,HYDRO,FONTAINE,CATALYST,true,false,new String[] {"Neuv"}),
    WRIOTHESLEY("Wriothesley",4.1,CRYO,FONTAINE,CATALYST,true,false,new String[] {"Wrio"}),
    FURINA("Furina",4.2,HYDRO,FONTAINE,SWORD,true,true),
    NAVIA("Navia",4.3,GEO,FONTAINE,CLAYMORE,true,true),
    CLORINDE("Clorinde",4.7,ELECTRO,FONTAINE,SWORD,true,true),
    SIGEWINNE("Sigewinne",4.7,HYDRO,FONTAINE,BOW,true,true),
    EMILIE("Emilie",4.8,DENTRO,FONTAINE,POLEARM,true,true,new String[] {"Emili","Emy","Emily","Emi","Emyly","Emylie"}),
    ESCOFFIER("Escoffier",5.6,CRYO,FONTAINE,POLEARM,true,true,new String[] {"Nescaffe"}),
    KACHINA("Kachina",5.0,GEO,NATLAN,POLEARM,false,true),
    ORORON("Ororon",5.2,ELECTRO,NATLAN,BOW,false,false,new String[] {"Orororon"}),
    IANSAN("Iansan",5.5,ELECTRO,NATLAN,POLEARM,false,true),
    IFA("Ifa",5.6,ANEMO,NATLAN,CATALYST,false,false),
    MUALANI("Mualani",5.0,HYDRO,NATLAN,CATALYST,true,true,new String[] {"lani","mua"}),
    KINICH("Kinich",5.0,DENTRO,NATLAN,CLAYMORE,true,false),
    XILONEN("Xilonen",5.1,GEO,NATLAN,SWORD,true,true),
    CHASCA("Chasca",5.2,ANEMO,NATLAN,BOW,true,true),
    CITLALI("Citlali",5.3,CRYO,NATLAN,CATALYST,true,true,new String[] {"Citalali","Citali"}),
    MAVUIKA("Mavuika",5.3,PYRO,NATLAN,CLAYMORE,true,true,new String[] {"Mav"}),
    VARESA("Varesa",5.5,ELECTRO,NATLAN,CATALYST,true,true),
    AINO("Aino",6.0,HYDRO,NOD_KRAI,CLAYMORE,false,true),
    JAHODA("Jahoda",6.2,ANEMO,NOD_KRAI,BOW,false,true, new String[]{"Jagoda","Yagoda","Yahoda"}),
    INEFFA("Ineffa",5.8,ELECTRO,NOD_KRAI,POLEARM,true,true),
    LAUMA("Lauma",6.0,DENTRO,NOD_KRAI,CATALYST,true,true),
    KYRRYL_CHUDOMIROVICH_FLINS("Kyrryl Chudomirovich Flins",6.0,ELECTRO,NOD_KRAI,POLEARM,true,false,new String[] {"Flins","Kiril","Kyrryl","Chudomirovich","Gojo","Metodii","Lamp"}),
    NEFER("Nefer",6.1,DENTRO,NOD_KRAI,CATALYST,true,true),
    COLUMBINA("Columbina",6.3,HYDRO,NOD_KRAI,POLEARM,true,true);

    public final String name;
    public final double version;
    public final Element element;
    public final Nation nation;
    public final Weapon weapon;

    @Deprecated
    final boolean isFiveStar;
    @Deprecated
    final boolean isFemale;
    public final String[] alternativeNames;


    Char (String name, double version, Element element, Nation nation, Weapon weapon){
        this(name,version,element,nation,weapon,false,false,new String[0]);
    }

    Char (String name, double version, Element element, Nation nation, Weapon weapon, boolean isFiveStar, boolean isFemale){
        this(name,version,element,nation,weapon,isFiveStar,isFemale,new String[0]);
    }

    Char (String name, double version, Element element, Nation nation, Weapon weapon,
          boolean isFiveStar, boolean isFemale, String[] alternativeNames){
        this.name = name;
        this.version = version;
        this.element = element;
        this.nation = nation;
        this.weapon = weapon;
        this.isFiveStar = isFiveStar;
        this.isFemale = isFemale;
        this.alternativeNames = alternativeNames;
    }


    //===MONSTADT===//

//    static final Char NOELE = new Char("Noele", 1.0, genshin.enums.Element.GEO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.CLAYMORE, false, true,
//            new String[]{"Noel"});
//    static final Char SUCROSE = new Char("Sucrose", 1.0, genshin.enums.Element.ANEMO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.CATALYST, false, true);
//    static final Char KAEYA = new Char("Kaeya", 1.0, genshin.enums.Element.CRYO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.SWORD, false, false);
//    static final Char RAZOR = new Char("Razor", 1.0, genshin.enums.Element.ELECTRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.CLAYMORE, false, false);
//    static final Char LISA = new Char("Lisa", 1.0, genshin.enums.Element.ELECTRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.CATALYST, false, true);
//    static final Char FISCHL = new Char("Fischl", 1.0, genshin.enums.Element.ELECTRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.BOW, false, true,
//            new String[]{"Fisc","Fish","Fishl"});
//    static final Char BARBARA = new Char("Barbara", 1.0, HYDRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.CATALYST, false, true);
//    static final Char BENNETT = new Char("Bennett", 1.0, genshin.enums.Element.PYRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.SWORD, false, false,
//            new String[]{"Ben Ten"});
//    static final Char AMBER = new Char("Amber", 1.0, genshin.enums.Element.PYRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.BOW, false, true);
//    static final Char DIONA = new Char("Diona", 1.1, genshin.enums.Element.CRYO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.BOW, false, true);
//    static final Char ROSALIA = new Char("Rosalia", 1.4, genshin.enums.Element.CRYO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.POLEARM, false, true,
//            new String[]{"Rozalia","Roza","Rosa"});
//    static final Char MIKA = new Char("Mika", 3.5, genshin.enums.Element.CRYO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.POLEARM, false, false);
//    static final Char DAHLIA = new Char("Dahlia", 5.7, HYDRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.SWORD, false, false);
//
//    static final Char VENTI = new Char("Venti", 1.0, genshin.enums.Element.ANEMO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.BOW, true, false);
//    static final Char JEAN = new Char("Jean", 1.0, genshin.enums.Element.ANEMO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.SWORD, true, true);
//    static final Char MONA = new Char("Mona", 1.0, HYDRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.CATALYST, true, true);
//    static final Char KLEE = new Char("Klee", 1.0, genshin.enums.Element.PYRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.CATALYST, true, true,
//            new String[]{"Kle"});
//    static final Char DILUC = new Char("Diluc", 1.0, genshin.enums.Element.PYRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.CLAYMORE, true, false);
//    static final Char ALBEDO = new Char("Albedo", 1.2, genshin.enums.Element.GEO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.SWORD, true, false);
//    static final Char EULA = new Char("Eula", 1.5, genshin.enums.Element.CRYO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.CLAYMORE, true, true);
//    static final Char VARKA = new Char("Varka", 6.2, genshin.enums.Element.ANEMO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.CLAYMORE, true, false);
//    static final Char DURIN = new Char("Durin", 6.4, genshin.enums.Element.PYRO, genshin.enums.Nation.MONSTADT, genshin.enums.Weapon.SWORD, true, false);
//
//    //===LIYUE===//
//
//    static final Char NINGUANG = new Char("Ninguang", 1.0, genshin.enums.Element.GEO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.CATALYST, false, true);
//    static final Char CHONGYUN = new Char("Chongyun", 1.0, genshin.enums.Element.CRYO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.CLAYMORE, false, false);
//    static final Char BEIDOU = new Char("Beidou", 1.0, genshin.enums.Element.ELECTRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.CLAYMORE, false, true);
//    static final Char XIANGLING = new Char("Xiangling", 1.0, genshin.enums.Element.PYRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.POLEARM, false, true);
//    static final Char XINGQIU = new Char("Xingqiu", 1.0, HYDRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.SWORD, false,false,
//            new String[]{"Xingqui"});
//    static final Char XIANYAN = new Char("Xianyan", 1.1, genshin.enums.Element.PYRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.CLAYMORE, false, true);
//    static final Char YAN_FEI = new Char("Yan Fei", 1.5, genshin.enums.Element.PYRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.CATALYST, false, true,
//            new String[]{"Fei"});
//    static final Char YUN_JIN = new Char("Yun Jin", 2.4, genshin.enums.Element.GEO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.POLEARM, false, true,
//            new String[]{"Yun", "Jin"});
//    static final Char YAOYAO = new Char("Yaoyao", 3.4, genshin.enums.Element.DENTRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.POLEARM, false, true,
//            new String[]{"Yao"});
//    static final Char GAMING = new Char("Gaming", 4.4, genshin.enums.Element.PYRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.CLAYMORE, false, false);
//    static final Char LAN_YAN = new Char("Lan Yan", 5.3, genshin.enums.Element.ANEMO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.CATALYST, false, true,
//            new String[]{"Lan"});
//
//    static final Char QIQI = new Char("Qiqi", 1.0, genshin.enums.Element.CRYO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.SWORD, true, true);
//    static final Char KEQING = new Char("Keqing", 1.0, genshin.enums.Element.ELECTRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.SWORD, true, true);
//    static final Char ZHONGLI = new Char("Zhongli", 1.1, genshin.enums.Element.GEO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.CLAYMORE, true, false);
//    static final Char GANYU = new Char("Ganyu", 1.2, genshin.enums.Element.CRYO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.BOW, true, true);
//    static final Char HU_TAO = new Char("Hu Tao", 1.3, genshin.enums.Element.PYRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.POLEARM, true, true);
//    static final Char XIAO = new Char("Xiao", 1.3, genshin.enums.Element.ANEMO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.POLEARM, true, false);
//    static final Char SHENHE = new Char("Shenhe", 2.4, genshin.enums.Element.CRYO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.POLEARM, true,true);
//    static final Char YELAN = new Char("Yelan", 2.7, HYDRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.BOW, true,true);
//    static final Char BAIZHU = new Char("Baizhu", 3.6, genshin.enums.Element.DENTRO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.CATALYST, true,false);
//    static final Char XIANYUN = new Char("Xianyun", 4.4, genshin.enums.Element.ANEMO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.CATALYST, true,true);
//    static final Char CALEDON_MARE = new Char("Caledon Mare", 6.3, genshin.enums.Element.ANEMO, genshin.enums.Nation.LIYUE, genshin.enums.Weapon.BOW, true,true,
//            new String[]{"Horse"});
//
//    //===SNEZHNAYA===
//
//    static final Char TARTAGLIA = new Char("Tartaglia", 1.1, HYDRO, genshin.enums.Nation.SNEZHNAYA, genshin.enums.Weapon.BOW, true, false,
//            new String[]{"Childe", "Ajax"});
//    static final Char ARLECCHINO = new Char("Arlecchino", 4.6, genshin.enums.Element.PYRO, genshin.enums.Nation.SNEZHNAYA, genshin.enums.Weapon.POLEARM, true, true,
//            new String[]{"Perier", "The Knave", "Father", "Peruere", "Arle", "Arlechino"});
//    //perier is not intentional, I just spelled the name wrongly and was so funny that I decided to leave it there
//
//    //===INAZUMA===
//
//    static final Char SAYU = new Char("Sayu", 2.0, genshin.enums.Element.ANEMO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.CLAYMORE, false,true);
//    static final Char KUJOU_SARA = new Char("Kujou Sara", 2.1, genshin.enums.Element.ELECTRO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.BOW, false,true,
//            new String[]{"Kujou","Sara"});
//    static final Char THOMA = new Char("Thoma", 2.2, genshin.enums.Element.PYRO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.POLEARM, false,false);
//    static final Char GOROU = new Char("Gorou", 2.3, genshin.enums.Element.GEO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.BOW, false,false);
//    static final Char KUKI_SHINOBU = new Char("Kuki Shinobu", 2.7, genshin.enums.Element.ELECTRO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.SWORD, false,true,
//            new String[]{"Kuki","Shinobu"});
//    static final Char SHIKANOIN_HEIZOU = new Char("Shikanoin Heizou", 2.8, genshin.enums.Element.ANEMO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.CATALYST, false,false,
//            new String[]{"Heizhou","Shikanoin"});
//    static final Char KIRARA = new Char("Kirara", 3.7, genshin.enums.Element.DENTRO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.SWORD, false,true);
//
//    static final Char KAEDAHARA_KAZUHA = new Char("Kaedehara Kazuha", 1.6, genshin.enums.Element.ANEMO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.SWORD, true, false,
//            new String[]{"Kazuha","Kazu","Kaedahara"});
//    static final Char YOIMIYA = new Char("Yoimiya", 2.0, genshin.enums.Element.PYRO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.BOW, true,true);
//    static final Char KAMISATO_AYAKA = new Char("Kamisato Ayaka", 2.0, genshin.enums.Element.CRYO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.SWORD, true, true,
//            new String[]{"Ayaka"});
//    static final Char RAIDEN_SHOGUN = new Char("Raiden Shogun", 2.1, genshin.enums.Element.ELECTRO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.POLEARM, true, true,
//            new String[]{"Raiden","Ei"});
//    static final Char SANGONOMIYA_KOKOMI = new Char("Sangonomiya Kokomi", 2.1, HYDRO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.CATALYST, true, true,
//            new String[]{"Kokomi"});
//    static final Char ARATAKI_ITTO = new Char("Arataki Itto", 2.3, genshin.enums.Element.GEO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.CLAYMORE, true, false,
//            new String[]{"Itto","Arataki"});
//    static final Char YAE_MIKO = new Char("Yae Miko", 2.5, genshin.enums.Element.ELECTRO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.CATALYST, true, true,
//            new String[]{"Yae","Miko"});
//    static final Char KAMISATO_AYATO = new Char("Kamisato Ayato", 2.6, HYDRO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.SWORD, true, false,
//            new String[]{"Ayato"});
//    static final Char CHIORI = new Char("Chiori", 4.5, genshin.enums.Element.GEO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.SWORD, true, true);
//    static final Char YUMEMIZUKI_MIZUKI = new Char("Yumemizuki Mizuki", 5.4, genshin.enums.Element.ANEMO, genshin.enums.Nation.INAZUMA, genshin.enums.Weapon.CATALYST, true, true,
//            new String[]{"Mizuki"});
//
//    //===OUTSIDE===//
//
//    static final Char ALOY = new Char("Aloy", 2.1, genshin.enums.Element.CRYO, genshin.enums.Nation.OUTSIDE, genshin.enums.Weapon.BOW, true, true,
//            new String[]{"Alloy"}, Tier.PASS);
//    static final Char SKIRK = new Char("Skirk", 5.7, genshin.enums.Element.CRYO, genshin.enums.Nation.OUTSIDE, genshin.enums.Weapon.SWORD, true, true);
//
//    //===SUMERU===
//
//    static final Char COLLEI = new Char("Collei", 3.0, genshin.enums.Element.DENTRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.BOW, false, true);
//    static final Char DORI = new Char("Dori", 3.0, genshin.enums.Element.ELECTRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.CLAYMORE, false, true);
//    static final Char CANDACE = new Char("Candace", 3.1, HYDRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.POLEARM, false, true);
//    static final Char LAYLA = new Char("Layla", 3.2, genshin.enums.Element.CRYO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.SWORD, false, true);
//    static final Char FARUZAN = new Char("Faruzan", 3.3, genshin.enums.Element.ANEMO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.BOW, false, true);
//    static final Char KAVEH = new Char("Kaveh", 3.6, genshin.enums.Element.DENTRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.CLAYMORE, false, false);
//    static final Char SETHOS = new Char("Sethos", 4.7, genshin.enums.Element.ELECTRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.BOW, false, false);
//
//    static final Char TIGHNARI = new Char("Tighnari", 3.0, genshin.enums.Element.DENTRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.BOW, true, false,
//            new String[]{"Tigh"});
//    static final Char CYNO = new Char("Cyno", 3.1, genshin.enums.Element.ELECTRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.POLEARM, true, false);
//    static final Char NILOU = new Char("Nilou", 3.1, HYDRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.SWORD, true, true);
//    static final Char NAHIDA = new Char("Nahida", 3.2, genshin.enums.Element.DENTRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.CATALYST, true, true);
//    static final Char WANDERER = new Char("Wanderer", 3.3, genshin.enums.Element.ANEMO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.CATALYST, true, false);
//    static final Char ALHAITHAM = new Char("Alhaitham", 3.4, genshin.enums.Element.DENTRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.SWORD, true,false);
//    static final Char DEHYA = new Char("Dehya", 3.4, genshin.enums.Element.PYRO, genshin.enums.Nation.SUMERU, genshin.enums.Weapon.CLAYMORE, true,true);
//
//    //===FONTAINE===
//
//    static final Char LYNETTE = new Char("Lynette", 4.0, genshin.enums.Element.ANEMO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.SWORD, false,true);
//    static final Char FREMINET = new Char("Freminet", 4.0, genshin.enums.Element.CRYO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.CLAYMORE, false,false);
//    static final Char CHARLOTTE = new Char("Charlotte", 4.2, genshin.enums.Element.CRYO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.CATALYST, false,true);
//    static final Char CHEVREUSE = new Char("Chevreuse", 4.3, genshin.enums.Element.PYRO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.POLEARM, false,true,
//            new String[]{"Chev"});
//
//    static final Char LYNEY = new Char("Lyney", 4.0, genshin.enums.Element.PYRO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.BOW, true,false,
//            new String[]{"Lini"});
//    static final Char NEUVILLETTE = new Char("Neuvillette", 4.1, HYDRO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.CATALYST, true,false,
//            new String[]{"Neuv"});
//    static final Char WRIOTHESLEY = new Char("Wriothesley", 4.1, genshin.enums.Element.CRYO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.CATALYST, true,false,
//            new String[]{"Wrio"});
//    static final Char FURINA = new Char("Furina", 4.2, HYDRO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.SWORD, true,true);
//    static final Char NAVIA = new Char("Navia", 4.3, genshin.enums.Element.GEO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.CLAYMORE, true,true);
//    static final Char CLORINDE = new Char("Clorinde", 4.7, genshin.enums.Element.ELECTRO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.SWORD, true,true);
//    static final Char SIGEWINNE = new Char("Sigewinne", 4.7, HYDRO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.BOW, true,true);
//    static final Char EMILIE = new Char("Emilie", 4.8, genshin.enums.Element.DENTRO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.POLEARM, true,true,
//            new String[]{"Emili","Emy","Emily","Emi","Emyly","Emylie"});
//    static final Char ESCOFFIER = new Char("Escoffier", 5.6, genshin.enums.Element.CRYO, genshin.enums.Nation.FONTAINE, genshin.enums.Weapon.POLEARM, true,true,
//            new String[]{"Nescaffe"});
//
//    //===NATLAN===
//
//    static final Char KACHINA = new Char("Kachina", 5.0, genshin.enums.Element.GEO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.POLEARM, false,true);
//    static final Char ORORON = new Char("Ororon", 5.2, genshin.enums.Element.ELECTRO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.BOW, false,false,
//            new String[]{"Orororon"});
//    static final Char IANSAN = new Char("Iansan", 5.5, genshin.enums.Element.ELECTRO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.POLEARM, false,true);
//    static final Char IFA = new Char("Ifa", 5.6, genshin.enums.Element.ANEMO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.CATALYST, false,false);
//
//    static final Char MUALANI = new Char("Mualani", 5.0, HYDRO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.CATALYST, true,true,
//            new String[]{"lani","mua"});
//    static final Char KINICH = new Char("Kinich", 5.0, genshin.enums.Element.DENTRO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.CLAYMORE, true,false);
//    static final Char XILONEN = new Char("Xilonen", 5.1, genshin.enums.Element.GEO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.SWORD, true,true);
//    static final Char CHASCA = new Char("Chasca", 5.2, genshin.enums.Element.ANEMO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.BOW, true,true);
//    static final Char CITLALI = new Char("Citlali", 5.3, genshin.enums.Element.CRYO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.CATALYST, true,true,
//            new String[]{"Citalali","Citali"});
//    static final Char MAVUIKA = new Char("Mavuika", 5.3, genshin.enums.Element.PYRO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.CLAYMORE, true,true,
//            new String[]{"Mav"});
//    static final Char VARESA = new Char("Varesa", 5.5, genshin.enums.Element.ELECTRO, genshin.enums.Nation.NATLAN, genshin.enums.Weapon.CATALYST, true,true);
//
//    //===NOD KRAI===
//
//    static final Char AINO = new Char("Aino", 6.0, HYDRO, genshin.enums.Nation.NOD_KRAI, genshin.enums.Weapon.CLAYMORE, false,true);
//    static final Char JAHODA = new Char("Jahoda", 6.2, genshin.enums.Element.ANEMO, genshin.enums.Nation.NOD_KRAI, genshin.enums.Weapon.BOW, false,true);
//
//    static final Char INEFFA = new Char("Ineffa", 5.8, genshin.enums.Element.ELECTRO, genshin.enums.Nation.NOD_KRAI, genshin.enums.Weapon.POLEARM, true,true);
//    static final Char LAUMA = new Char("Lauma", 6.0, genshin.enums.Element.DENTRO, genshin.enums.Nation.NOD_KRAI, genshin.enums.Weapon.CATALYST, true,true);
//    static final Char KYRRYL_CHUDOMIROVICH_FLINS = new Char("Kyrryl Chudomirovich Flins", 6.0, genshin.enums.Element.ELECTRO, genshin.enums.Nation.NOD_KRAI, genshin.enums.Weapon.POLEARM, true,false,
//            new String[] {"Flins","Kiril","Kyrryl","Chudomirovich", "Gojo", "Metodii", "Lamp"});
//    static final Char NEFER = new Char("Nefer", 6.1, genshin.enums.Element.DENTRO, genshin.enums.Nation.NOD_KRAI, genshin.enums.Weapon.CATALYST, true,true);
//    static final Char COLUMBINA = new Char("Columbina", 6.3, HYDRO, genshin.enums.Nation.NOD_KRAI, genshin.enums.Weapon.POLEARM, true,true);

    @Override
    public String toString () {
        return this.name.toUpperCase();
    }
    public boolean hasAlternativeNames(){
        return !Arrays.equals(alternativeNames, new String[0]);
    }


}
