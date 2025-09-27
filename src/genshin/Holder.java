package genshin;

import java.util.*;

public class Holder {
    public static List<Char> characters = new ArrayList<>();
    static {
        characters.add(Char.ALOY);
        characters.add(Char.SKIRK);
        characters.add(Char.NOELE);
        characters.add(Char.SUCROSE);
        characters.add(Char.KAEYA);
        characters.add(Char.RAZOR);
        characters.add(Char.LISA);
        characters.add(Char.FISCHL);
        characters.add(Char.BARBARA);
        characters.add(Char.BENNETT);
        characters.add(Char.AMBER);
        characters.add(Char.DIONA);
        characters.add(Char.ROSALIA);
        characters.add(Char.MIKA);
        characters.add(Char.DAHLIA);
        characters.add(Char.VENTI);
        characters.add(Char.JEAN);
        characters.add(Char.MONA);
        characters.add(Char.KLEE);
        characters.add(Char.DILUC);
        characters.add(Char.ALBEDO);
        characters.add(Char.EULA);
        characters.add(Char.VARKA);
        characters.add(Char.DURIN);
        characters.add(Char.NINGUANG);
        characters.add(Char.CHONGYUN);
        characters.add(Char.BEIDOU);
        characters.add(Char.XIANGLING);
        characters.add(Char.XINGQIU);
        characters.add(Char.XIANYAN);
        characters.add(Char.YAN_FEI);
        characters.add(Char.YUN_JIN);
        characters.add(Char.YAOYAO);
        characters.add(Char.GAMING);
        characters.add(Char.LAN_YAN);
        characters.add(Char.QIQI);
        characters.add(Char.KEQING);
        characters.add(Char.ZHONGLI);
        characters.add(Char.GANYU);
        characters.add(Char.HU_TAO);
        characters.add(Char.XIAO);
        characters.add(Char.SHENHE);
        characters.add(Char.YELAN);
        characters.add(Char.BAIZHU);
        characters.add(Char.XIANYUN);
        characters.add(Char.CALEDON_MARE);
        characters.add(Char.TARTAGLIA);
        characters.add(Char.ARLECCHINO);
        characters.add(Char.SAYU);
        characters.add(Char.KUJOU_SARA);
        characters.add(Char.THOMA);
        characters.add(Char.GOROU);
        characters.add(Char.KUKI_SHINOBU);
        characters.add(Char.SHIKANOIN_HEIZOU);
        characters.add(Char.KIRARA);
        characters.add(Char.KAEDAHA_KAZUHA);
        characters.add(Char.YOIMIYA);
        characters.add(Char.KAMISATO_AYAKA);
        characters.add(Char.RAIDEN_SHOGUN);
        characters.add(Char.SANGONOMIYA_KOKOMI);
        characters.add(Char.ARATAKI_ITTO);
        characters.add(Char.YAE_MIKO);
        characters.add(Char.KAMISATO_AYATO);
        characters.add(Char.CHIORI);
        characters.add(Char.YUMEMIZUKI_MIZUKI);
        characters.add(Char.COLLEI);
        characters.add(Char.DORI);
        characters.add(Char.CANDACE);
        characters.add(Char.LAYLA);
        characters.add(Char.FARUZAN);
        characters.add(Char.KAVEH);
        characters.add(Char.SETHOS);
        characters.add(Char.TIGHNARI);
        characters.add(Char.CYNO);
        characters.add(Char.NILOU);
        characters.add(Char.NAHIDA);
        characters.add(Char.WANDERER);
        characters.add(Char.ALHAITHAM);
        characters.add(Char.DEHYA);
        characters.add(Char.LYNETTE);
        characters.add(Char.FREMINET);
        characters.add(Char.CHARLOTTE);
        characters.add(Char.CHEVREUSE);
        characters.add(Char.LYNEY);
        characters.add(Char.NEUVILLETTE);
        characters.add(Char.WRIOTHESLEY);
        characters.add(Char.FURINA);
        characters.add(Char.NAVIA);
        characters.add(Char.CLORINDE);
        characters.add(Char.SIGEWINNE);
        characters.add(Char.EMILIE);
        characters.add(Char.ESCOFFIER);
        characters.add(Char.KACHINA);
        characters.add(Char.ORORON);
        characters.add(Char.IANSAN);
        characters.add(Char.IFA);
        characters.add(Char.MUALANI);
        characters.add(Char.KINICH);
        characters.add(Char.XILONEN);
        characters.add(Char.CHASCA);
        characters.add(Char.CITLALI);
        characters.add(Char.MAVUIKA);
        characters.add(Char.VARESA);
        characters.add(Char.AINO);
        characters.add(Char.JAHODA);
        characters.add(Char.INEFFA);
        characters.add(Char.LAUMA);
        characters.add(Char.KYRRYL_CHUDOMIROVICH_FLINS);
        characters.add(Char.NEFER);
        characters.add(Char.COLUMBINA);
    }

    public static Map<String, Char> nameToCharacter = new HashMap<>();
    static {
        nameToCharacter.put("aloy",Char.ALOY);
        nameToCharacter.put("alloy",Char.ALOY);
        nameToCharacter.put("skirk",Char.SKIRK);
        nameToCharacter.put("noele",Char.NOELE);
        nameToCharacter.put("noel",Char.NOELE);
        nameToCharacter.put("sucrose",Char.SUCROSE);
        nameToCharacter.put("kaeya",Char.KAEYA);
        nameToCharacter.put("razor",Char.RAZOR);
        nameToCharacter.put("lisa",Char.LISA);
        nameToCharacter.put("fischl",Char.FISCHL);
        nameToCharacter.put("fisc",Char.FISCHL);
        nameToCharacter.put("barbara",Char.BARBARA);
        nameToCharacter.put("bennett",Char.BENNETT);
        nameToCharacter.put("ben ten",Char.BENNETT);
        nameToCharacter.put("amber",Char.AMBER);
        nameToCharacter.put("diona",Char.DIONA);
        nameToCharacter.put("rosalia",Char.ROSALIA);
        nameToCharacter.put("rozalia",Char.ROSALIA);
        nameToCharacter.put("roza",Char.ROSALIA);
        nameToCharacter.put("rosa",Char.ROSALIA);
        nameToCharacter.put("mika",Char.MIKA);
        nameToCharacter.put("dahlia",Char.DAHLIA);
        nameToCharacter.put("venti",Char.VENTI);
        nameToCharacter.put("jean",Char.JEAN);
        nameToCharacter.put("mona",Char.MONA);
        nameToCharacter.put("klee",Char.KLEE);
        nameToCharacter.put("kle",Char.KLEE);
        nameToCharacter.put("diluc",Char.DILUC);
        nameToCharacter.put("albedo",Char.ALBEDO);
        nameToCharacter.put("eula",Char.EULA);
        nameToCharacter.put("varka",Char.VARKA);
        nameToCharacter.put("durin",Char.DURIN);
        nameToCharacter.put("ninguang",Char.NINGUANG);
        nameToCharacter.put("chongyun",Char.CHONGYUN);
        nameToCharacter.put("beidou",Char.BEIDOU);
        nameToCharacter.put("xiangling",Char.XIANGLING);
        nameToCharacter.put("xingqiu",Char.XINGQIU);
        nameToCharacter.put("xingqui",Char.XINGQIU);
        nameToCharacter.put("xianyan",Char.XIANYAN);
        nameToCharacter.put("yan fei",Char.YAN_FEI);
        nameToCharacter.put("fei",Char.YAN_FEI);
        nameToCharacter.put("yun jin",Char.YUN_JIN);
        nameToCharacter.put("yun",Char.YUN_JIN);
        nameToCharacter.put("jin",Char.YUN_JIN);
        nameToCharacter.put("yaoyao",Char.YAOYAO);
        nameToCharacter.put("yao",Char.YAOYAO);
        nameToCharacter.put("gaming",Char.GAMING);
        nameToCharacter.put("lan yan",Char.LAN_YAN);
        nameToCharacter.put("lan",Char.LAN_YAN);
        nameToCharacter.put("qiqi",Char.QIQI);
        nameToCharacter.put("keqing",Char.KEQING);
        nameToCharacter.put("zhongli",Char.ZHONGLI);
        nameToCharacter.put("ganyu",Char.GANYU);
        nameToCharacter.put("hu tao",Char.HU_TAO);
        nameToCharacter.put("xiao",Char.XIAO);
        nameToCharacter.put("shenhe",Char.SHENHE);
        nameToCharacter.put("yelan",Char.YELAN);
        nameToCharacter.put("baizhu",Char.BAIZHU);
        nameToCharacter.put("xianyun",Char.XIANYUN);
        nameToCharacter.put("caledon mare",Char.CALEDON_MARE);
        nameToCharacter.put("horse",Char.CALEDON_MARE);
        nameToCharacter.put("tartaglia",Char.TARTAGLIA);
        nameToCharacter.put("childe",Char.TARTAGLIA);
        nameToCharacter.put("ajax",Char.TARTAGLIA);
        nameToCharacter.put("arlecchino",Char.ARLECCHINO);
        nameToCharacter.put("perier",Char.ARLECCHINO);
        nameToCharacter.put("the knave",Char.ARLECCHINO);
        nameToCharacter.put("father",Char.ARLECCHINO);
        nameToCharacter.put("peruere",Char.ARLECCHINO);
        nameToCharacter.put("arle",Char.ARLECCHINO);
        nameToCharacter.put("arlechino",Char.ARLECCHINO);
        nameToCharacter.put("sayu",Char.SAYU);
        nameToCharacter.put("kujou sara",Char.KUJOU_SARA);
        nameToCharacter.put("kujou",Char.KUJOU_SARA);
        nameToCharacter.put("sara",Char.KUJOU_SARA);
        nameToCharacter.put("thoma",Char.THOMA);
        nameToCharacter.put("gorou",Char.GOROU);
        nameToCharacter.put("kuki shinobu",Char.KUKI_SHINOBU);
        nameToCharacter.put("kuki",Char.KUKI_SHINOBU);
        nameToCharacter.put("shinobu",Char.KUKI_SHINOBU);
        nameToCharacter.put("shikanoin heizou",Char.SHIKANOIN_HEIZOU);
        nameToCharacter.put("heizhou",Char.SHIKANOIN_HEIZOU);
        nameToCharacter.put("shikanoin",Char.SHIKANOIN_HEIZOU);
        nameToCharacter.put("kirara",Char.KIRARA);
        nameToCharacter.put("kaedaha kazuha",Char.KAEDAHA_KAZUHA);
        nameToCharacter.put("kazuha",Char.KAEDAHA_KAZUHA);
        nameToCharacter.put("yoimiya",Char.YOIMIYA);
        nameToCharacter.put("kamisato ayaka",Char.KAMISATO_AYAKA);
        nameToCharacter.put("ayaka",Char.KAMISATO_AYAKA);
        nameToCharacter.put("raiden shogun",Char.RAIDEN_SHOGUN);
        nameToCharacter.put("raiden",Char.RAIDEN_SHOGUN);
        nameToCharacter.put("ei",Char.RAIDEN_SHOGUN);
        nameToCharacter.put("sangonomiya kokomi",Char.SANGONOMIYA_KOKOMI);
        nameToCharacter.put("kokomi",Char.SANGONOMIYA_KOKOMI);
        nameToCharacter.put("arataki itto",Char.ARATAKI_ITTO);
        nameToCharacter.put("itto",Char.ARATAKI_ITTO);
        nameToCharacter.put("arataki",Char.ARATAKI_ITTO);
        nameToCharacter.put("yae miko",Char.YAE_MIKO);
        nameToCharacter.put("yae",Char.YAE_MIKO);
        nameToCharacter.put("miko",Char.YAE_MIKO);
        nameToCharacter.put("kamisato ayato",Char.KAMISATO_AYATO);
        nameToCharacter.put("ayato",Char.KAMISATO_AYATO);
        nameToCharacter.put("chiori",Char.CHIORI);
        nameToCharacter.put("yumemizuki mizuki",Char.YUMEMIZUKI_MIZUKI);
        nameToCharacter.put("mizuki",Char.YUMEMIZUKI_MIZUKI);
        nameToCharacter.put("collei",Char.COLLEI);
        nameToCharacter.put("dori",Char.DORI);
        nameToCharacter.put("candace",Char.CANDACE);
        nameToCharacter.put("layla",Char.LAYLA);
        nameToCharacter.put("faruzan",Char.FARUZAN);
        nameToCharacter.put("kaveh",Char.KAVEH);
        nameToCharacter.put("sethos",Char.SETHOS);
        nameToCharacter.put("tighnari",Char.TIGHNARI);
        nameToCharacter.put("cyno",Char.CYNO);
        nameToCharacter.put("nilou",Char.NILOU);
        nameToCharacter.put("nahida",Char.NAHIDA);
        nameToCharacter.put("wanderer",Char.WANDERER);
        nameToCharacter.put("alhaitham",Char.ALHAITHAM);
        nameToCharacter.put("dehya",Char.DEHYA);
        nameToCharacter.put("lynette",Char.LYNETTE);
        nameToCharacter.put("freminet",Char.FREMINET);
        nameToCharacter.put("charlotte",Char.CHARLOTTE);
        nameToCharacter.put("chevreuse",Char.CHEVREUSE);
        nameToCharacter.put("lyney",Char.LYNEY);
        nameToCharacter.put("lini",Char.LYNEY);
        nameToCharacter.put("neuvillette",Char.NEUVILLETTE);
        nameToCharacter.put("neuv",Char.NEUVILLETTE);
        nameToCharacter.put("wriothesley",Char.WRIOTHESLEY);
        nameToCharacter.put("wrio",Char.WRIOTHESLEY);
        nameToCharacter.put("furina",Char.FURINA);
        nameToCharacter.put("navia",Char.NAVIA);
        nameToCharacter.put("clorinde",Char.CLORINDE);
        nameToCharacter.put("sigewinne",Char.SIGEWINNE);
        nameToCharacter.put("emilie",Char.EMILIE);
        nameToCharacter.put("emili",Char.EMILIE);
        nameToCharacter.put("emy",Char.EMILIE);
        nameToCharacter.put("emily",Char.EMILIE);
        nameToCharacter.put("emi",Char.EMILIE);
        nameToCharacter.put("emyly",Char.EMILIE);
        nameToCharacter.put("emylie",Char.EMILIE);
        nameToCharacter.put("escoffier",Char.ESCOFFIER);
        nameToCharacter.put("nescaffe",Char.ESCOFFIER);
        nameToCharacter.put("kachina",Char.KACHINA);
        nameToCharacter.put("ororon",Char.ORORON);
        nameToCharacter.put("orororon",Char.ORORON);
        nameToCharacter.put("iansan",Char.IANSAN);
        nameToCharacter.put("ifa",Char.IFA);
        nameToCharacter.put("mualani",Char.MUALANI);
        nameToCharacter.put("kinich",Char.KINICH);
        nameToCharacter.put("xilonen",Char.XILONEN);
        nameToCharacter.put("chasca",Char.CHASCA);
        nameToCharacter.put("citlali",Char.CITLALI);
        nameToCharacter.put("mavuika",Char.MAVUIKA);
        nameToCharacter.put("varesa",Char.VARESA);
        nameToCharacter.put("aino",Char.AINO);
        nameToCharacter.put("jahoda",Char.JAHODA);
        nameToCharacter.put("ineffa",Char.INEFFA);
        nameToCharacter.put("lauma",Char.LAUMA);
        nameToCharacter.put("kyrryl chudomirovich flins",Char.KYRRYL_CHUDOMIROVICH_FLINS);
        nameToCharacter.put("flins",Char.KYRRYL_CHUDOMIROVICH_FLINS);
        nameToCharacter.put("kiril",Char.KYRRYL_CHUDOMIROVICH_FLINS);
        nameToCharacter.put("kyrryl",Char.KYRRYL_CHUDOMIROVICH_FLINS);
        nameToCharacter.put("chudomirovich",Char.KYRRYL_CHUDOMIROVICH_FLINS);
        nameToCharacter.put("gojo",Char.KYRRYL_CHUDOMIROVICH_FLINS);
        nameToCharacter.put("metodii",Char.KYRRYL_CHUDOMIROVICH_FLINS);
        nameToCharacter.put("lamp",Char.KYRRYL_CHUDOMIROVICH_FLINS);
        nameToCharacter.put("",Char.KYRRYL_CHUDOMIROVICH_FLINS);
        nameToCharacter.put("nefer",Char.NEFER);
        nameToCharacter.put("columbina",Char.COLUMBINA);
    }

    static void sortByVersion(){
        characters.sort(new Comparator<Char>() {
            @Override
            public int compare (Char o1, Char o2) {
                if(o1.version>o2.version){
                    return 1;
                } if(o1.version<o2.version){
                    return -1;
                }
                int shorterCount = Math.min(o1.name.length(),o2.name.length());
                for (int i = 0; i < shorterCount; i++) {
                    if(o1.name.charAt(i)>o2.name.charAt(i)){
                        return 1;
                    } else if (o1.name.charAt(i)<o2.name.charAt(i)) {
                        return -1;
                    }
                }
                return 0;
            }
        });
    }

    static void printMap(){
        for(Char g: characters){
            String classNameWithSpaces = g.toString();
            StringBuilder className = new StringBuilder();

            for(Character c: classNameWithSpaces.toCharArray()){
                if(Character.isSpaceChar(c)){
                    className.append("_");
                } else{
                    className.append(c);
                }
            }

            System.out.println("nameToCharacter.put(\"" + g.name.toLowerCase() + "\",Char." + className + ");");

            if(g.hasAlternativeNames()){
                for(String alternativeName: g.alternativeNames){
                    System.out.println("nameToCharacter.put(\"" + alternativeName.toLowerCase() + "\",Char." + className + ");");
                }
            }
        }
    }

    public static void main (String[] args) {
        printMap();
    }
}
