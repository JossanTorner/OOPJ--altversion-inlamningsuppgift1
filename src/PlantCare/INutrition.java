package PlantCare;

//interface för metoder en klass som berör näringsbehov ska implementera
public interface INutrition {

    void calculateDailyNeed(double height);

    double getDailyNeed();

    String getDailyNeedWithUnit();

}
