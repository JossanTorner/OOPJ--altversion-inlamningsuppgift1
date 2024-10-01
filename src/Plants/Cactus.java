package Plants;

import Nutrition.NutritionType;
import Nutrition.PlantNutrition;

public class Cactus extends Plant {

    //Inuti konstruktorn initieras objektets PlantNutrition-objekt
    public Cactus(String name, double heightInMeters){
        super(name, heightInMeters, PlantType.KAKTUS,
                new PlantNutrition(0.02, 0, NutritionType.MINERALVATTEN));
    }

}
