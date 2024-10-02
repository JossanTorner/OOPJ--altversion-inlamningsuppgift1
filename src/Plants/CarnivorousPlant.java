package Plants;

import PlantCare.LiquidType;
import PlantCare.PlantCare;

public class CarnivorousPlant extends Plant {

    //Inuti konstruktorn initieras objektets PlantNutrition-objekt
    public CarnivorousPlant(String name, double heightInMeters){
        super(name, heightInMeters, PlantType.KÖTTÄTARE,
                new PlantCare(0.1, 0.2, LiquidType.PROTEINDRYCK));
    }

}
