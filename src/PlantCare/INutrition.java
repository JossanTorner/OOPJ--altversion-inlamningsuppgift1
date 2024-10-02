package PlantCare;

//interface med metoder en klass som berör näringsbehov vill implementera
public interface INutrition {

    void calculateDailyNeed(double height);

    double getDailyNeed();

    String getDailyNeedWithUnit();

}
