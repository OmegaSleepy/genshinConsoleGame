package genshin;

public enum Nation {
    MONSTADT("Monstadt"), LIYUE("Liyue"), INAZUMA("Inazuma"), SUMERU("Sumeru"), FONTAINE("Fontaine"), NATLAN("Natlan"),
    NOD_KRAI("Nod Krai"), SNEZHNAYA("Snezhnaya"), OUTSIDE("Outside");

    String name;
    Nation(String name){
        this.name = name;
    }
}
