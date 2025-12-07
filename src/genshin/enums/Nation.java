package genshin.enums;

public enum Nation {
    MONSTADT("Monstadt"), LIYUE("Liyue"), INAZUMA("Inazuma"), SUMERU("Sumeru"), FONTAINE("Fontaine"), NATLAN("Natlan"),
    NOD_KRAI("Nod Krai"), SNEZHNAYA("Snezhnaya"), OUTSIDE("Outside");

    public final String NAME;
    Nation(String name){
        this.NAME = name;
    }
}
