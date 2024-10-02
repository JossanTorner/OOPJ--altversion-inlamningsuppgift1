package PlantCare;

public interface INutrition {

    void calculateDailyNeed(double height);

    double getDailyNeed();

    String getDailyNeedWithUnit();

}
