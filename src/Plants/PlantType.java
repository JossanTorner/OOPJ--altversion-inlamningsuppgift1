package Plants;

//enum för planttyp
public enum PlantType {

    KAKTUS ("kaktus"),
    PALM ("palm"),
    KÖTTÄTARE ("köttätare");

    public final String type;

    PlantType(String t){
        this.type = t;
    }

    public String getType() {
        return type;
    }
}
