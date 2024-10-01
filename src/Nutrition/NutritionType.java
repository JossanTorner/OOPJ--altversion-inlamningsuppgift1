package Nutrition;

public enum NutritionType {

    KRANVATTEN ("kranvatten"),
    PROTEINDRYCK ("proteindryck"),
    MINERALVATTEN ("mineralvatten");

    final String type;

    NutritionType(String t) {
        this.type = t;
    }

    public String getType() {
        return type;
    }

}
