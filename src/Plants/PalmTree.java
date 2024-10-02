package Plants;

import PlantCare.LiquidType;
import PlantCare.PlantCare;

public class PalmTree extends Plant {

    //Inuti konstruktorn initieras objektets PlantNutrition-objekt
    public PalmTree(String name, double heightInMeters){
        super(name, heightInMeters, PlantType.PALM,
                new PlantCare(0,0.5, LiquidType.KRANVATTEN));
    }

}
