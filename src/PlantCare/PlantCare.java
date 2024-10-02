package PlantCare;

public class PlantCare implements INutrition {

    //Inkapsling; gör variabler privata och åtkomliga via setters&getters
    private final LiquidType liquidType;
    private double baseLiquidAmountLiters;
    private double liquidTimesHeightLiters;
    private double dailyLiquidNeed;

    public PlantCare(double baseLiquidAmountLiters, double liquidTimesHeightLiters, LiquidType liquidType){

        setBaseLiquidAmountLiters(baseLiquidAmountLiters);
        setLiquidTimesHeightLiters(liquidTimesHeightLiters);
        this.liquidType = liquidType;

    }

    public LiquidType getLiquidType() {
        return liquidType;
    }

    public double getBaseLiquidAmountLiters() {
        return baseLiquidAmountLiters;
    }

    public void setBaseLiquidAmountLiters(double baseLiquidAmountLiters) {
        if(baseLiquidAmountLiters <0) throw new IllegalArgumentException("Ogiltigt värde på volym");
        this.baseLiquidAmountLiters = baseLiquidAmountLiters;
    }

    public double getLiquidTimesHeightLiters() {
        return liquidTimesHeightLiters;
    }

    public void setLiquidTimesHeightLiters(double liquidTimesHeightLiters) {
        if(liquidTimesHeightLiters <0) throw new IllegalArgumentException("Ogiltigt värde på volym");
        this.liquidTimesHeightLiters = liquidTimesHeightLiters;
    }

    @Override
    public double getDailyNeed() {
        return dailyLiquidNeed;
    }

    @Override
    public void calculateDailyNeed(double heightInMeters){
        this.dailyLiquidNeed = getBaseLiquidAmountLiters() + (getLiquidTimesHeightLiters()* heightInMeters);
    }

    @Override
    public String getDailyNeedWithUnit(){
        return (getDailyNeed() < 1) ? (getDailyNeed() * 100) + " cl " : getDailyNeed() + " liter ";
    }
}
