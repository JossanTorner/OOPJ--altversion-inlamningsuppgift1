package Nutrition;

public class PlantNutrition implements INutrition {

    //Inkapsling; gör variabler privata och åtkomliga via setters & getters
    private final NutritionType nutritionType;
    private double literNutritionBase;
    private double literNutritionTimesHeight;
    private double dailyNutritionNeed;

    public PlantNutrition(double literNutritionBase, double literNutritionTimesHeight, NutritionType nutritionType){

        setLiterNutritionBase(literNutritionBase);
        setLiterNutritionTimesHeight(literNutritionTimesHeight);
        this.nutritionType = nutritionType;

    }

    public NutritionType getNutritionType() {
        return nutritionType;
    }

    public double getLiterNutritionBase() {
        return literNutritionBase;
    }

    public void setLiterNutritionBase(double literNutritionBase) {
        if(literNutritionBase <0) throw new IllegalArgumentException("Ogiltigt värde på volym");
        this.literNutritionBase = literNutritionBase;
    }

    public double getLiterNutritionTimesHeight() {
        return literNutritionTimesHeight;
    }

    public void setLiterNutritionTimesHeight(double literNutritionTimesHeight) {
        if(literNutritionTimesHeight <0) throw new IllegalArgumentException("Ogiltigt värde på volym");
        this.literNutritionTimesHeight = literNutritionTimesHeight;
    }

    @Override
    public double getDailyNutritionNeed() {
        return dailyNutritionNeed;
    }

    @Override
    public void calculateDailyNutritionNeed(double heightMeters){
        this.dailyNutritionNeed = getLiterNutritionBase() + (getLiterNutritionTimesHeight()* heightMeters);
    }

    @Override
    public String getNutritionWithUnit(){
        if (getDailyNutritionNeed() < 1){
            return (getDailyNutritionNeed() * 100) + " cl ";
        }
        else{
            return getDailyNutritionNeed() + " liter ";
        }
    }
}
