package Nutrition;

public interface INutrition {

    void calculateDailyNutritionNeed(double height);

    double getDailyNutritionNeed();

    String getNutritionWithUnit();

}
