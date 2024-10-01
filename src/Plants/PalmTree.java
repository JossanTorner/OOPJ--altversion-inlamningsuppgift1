package Plants;

import Nutrition.NutritionType;
import Nutrition.PlantNutrition;

public class PalmTree extends Plant {

    //Inuti konstruktorn initieras objektets PlantNutrition-objekt
    public PalmTree(String name, double heightInMeters){
        super(name, heightInMeters, PlantType.PALM,
                new PlantNutrition(0,0.5, NutritionType.KRANVATTEN));
    }

}
