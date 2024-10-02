package Plants;

import PlantCare.LiquidType;
import PlantCare.PlantCare;

public class Cactus extends Plant {

    //Inuti konstruktorn initieras objektets PlantNutrition-objekt
    public Cactus(String name, double heightInMeters){
        super(name, heightInMeters, PlantType.KAKTUS,
                new PlantCare(0.02, 0, LiquidType.MINERALVATTEN));
    }

}
