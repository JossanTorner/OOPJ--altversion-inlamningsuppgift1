package HotelService;
import javax.swing.*;
import Plants.*;

public class Main {

    private PlantHotel greenest;

    //Polymorfism - får olika svar på plantInfo beroende på vilken instans av Plant som skrivs ut
    public void displayPlantInfo(String plantName){
        Plant plant = greenest.findPlant(plantName);
        if(plant != null){
            JOptionPane.showMessageDialog(null, plant.plantInfo());
        }
        else{
            JOptionPane.showMessageDialog(null, "Plantan är inte incheckad på hotellet!");
        }
    }

    //Tar emot ett namn från användaren
    public void promptPlantName(){

        while(true){
            String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (plantName == null){
                break;
            }
            displayPlantInfo(plantName);
        }
    }

    Main(){

        greenest = new PlantHotel();

        try{
            greenest.checkInPlant(new Cactus("Igge", 0.2));
            greenest.checkInPlant(new PalmTree("Laura", 5.0));
            greenest.checkInPlant(new CarnivorousPlant("Meatloaf", 0.7));
            greenest.checkInPlant(new PalmTree("Olof", 1.0));
        }
        catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e);
        }

        promptPlantName();
    }

    public static void main(String[] args) {

        Main main = new Main();

    }
}
