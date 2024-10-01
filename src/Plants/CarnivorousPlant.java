package Plants;

import Nutrition.NutritionType;
import Nutrition.PlantNutrition;

public class CarnivorousPlant extends Plant {

    //Inuti konstruktorn initieras objektets PlantNutrition-objekt
    public CarnivorousPlant(String name, double heightInMeters){
        super(name, heightInMeters, PlantType.KÖTTÄTARE,
                new PlantNutrition(0.1, 0.2, NutritionType.PROTEINDRYCK));
    }

}
