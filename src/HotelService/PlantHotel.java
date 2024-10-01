package HotelService;
import Plants.*;

import java.util.ArrayList;
import java.util.List;

public class PlantHotel {

    private List<Plant> hotelGuests;

    public PlantHotel(){
        hotelGuests = new ArrayList<Plant>();
    }

    public List<Plant> getHotelGuests() {
        return hotelGuests;
    }

    public void checkInPlant(Plant plant){
        hotelGuests.add(plant);
    }

    public void checkOutPlant(Plant plant){
        hotelGuests.remove(plant);
    }

    public Plant findPlant(String plantName){
        for (Plant p: getHotelGuests()){
            if(p.getName().equalsIgnoreCase(plantName)){
                return p;
            }
        }
        return null;
    }
}

