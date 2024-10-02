package Plants;

import PlantCare.PlantCare;

public abstract class Plant {

    //Inkapsling; gör instansvariabler private och åtkomliga via setters getters
    private final PlantType PLANT_TYPE;
    private String name;
    private double heightInMeters;
    private PlantCare carePlan;

    //Konstruktor
    public Plant(String name, double heightInMeters, PlantType plantType, PlantCare carePlan) {

        setName(name);
        setHeightInMeters(heightInMeters);
        setCarePlan(carePlan);
        this.PLANT_TYPE = plantType;

    }

    //Setter & Getters

    public PlantType getPlantType(){
        return PLANT_TYPE;
    }

    public PlantCare getCarePlan() {
        return carePlan;
    }

    public void setCarePlan(PlantCare carePlan) {
        if (carePlan == null) {
            throw new IllegalArgumentException("Ogiltig parameter");
        }
        this.carePlan = carePlan;
        carePlan.calculateDailyNeed(heightInMeters); //Här beräknas näringsbehov för objektet
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
                "\nVätskesort: " + carePlan.getLiquidType().getType() +
                "\nVätska/dag: " + carePlan.getDailyNeedWithUnit();
    }

}
