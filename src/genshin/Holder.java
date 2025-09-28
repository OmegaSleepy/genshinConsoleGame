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
        for(Char hero: characters){
            nameToCharacter.put(hero.name.toLowerCase(), hero);
            for (String name : hero.alternativeNames) {
                nameToCharacter.put(name.toLowerCase(),hero);
            }
        }
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
