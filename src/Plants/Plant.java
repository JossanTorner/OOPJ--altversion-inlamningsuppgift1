package Plants;

import Nutrition.PlantNutrition;

public abstract class Plant {

    //Inkapsling; gör instansvariabler private och åtkomliga via setters&getters
    private final PlantType PLANT_TYPE;
    private String name;
    private double heightInMeters;
    private PlantNutrition nutritionPlan;

    //Konstruktor
    public Plant(String name, double heightInMeters, PlantType plantType, PlantNutrition nutritionPlan) {

        setName(name);
        setHeightInMeters(heightInMeters);
        setNutritionPlan(nutritionPlan);
        this.PLANT_TYPE = plantType;

    }

    //Setter & Getters

    public PlantType getPlantType(){
        return PLANT_TYPE;
    }

    public PlantNutrition getNutritionPlan() {
        return nutritionPlan;
    }

    public void setNutritionPlan(PlantNutrition nutritionPlan) {
        if (nutritionPlan == null) {
            throw new IllegalArgumentException("Ogiltig parameter");
        }
        this.nutritionPlan = nutritionPlan;
        nutritionPlan.calculateDailyNutritionNeed(heightInMeters); //Här beräknas näringsbehov för objektet
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Ogiltigt namn!");
        this.name = name;
    }

    public double getHeightInMeters() { return heightInMeters; }

    public void setHeightInMeters(double heightInMeters) {
        if (heightInMeters < 0) throw new IllegalArgumentException("Ogiltig höjd!");
        this.heightInMeters = heightInMeters;
    }

    public String getHeightWithUnit(){
        return (getHeightInMeters() < 1) ? (getHeightInMeters()*100) + " cm" :  getHeightInMeters() + " m ";
    }

    //Skriver ut all info om plantan
    public String plantInfo(){
        return name +
                "\nPlanttyp: " + getPlantType().getType() +
                "\nHöjd: " + getHeightWithUnit() +
                "\nNäringstyp: " + nutritionPlan.getNutritionType().getType() +
                "\nNäringsbehov/dag: " + nutritionPlan.getNutritionWithUnit();
    }

}
