import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App{
    public static void main(String[] args) {
        Console myConsole=System.console();
        List<PetStore> allPets= new ArrayList<PetStore>();
        while(true){
            System.out.println("WELCOME TO PAWFECTMATCH:CONTINUE WITH:all pets,search pets or add pet");
            String navigationChoice =myConsole.readLine();
            if(navigationChoice.equals("all pets")){
                for(PetStore individualPet: allPets){
                    System.out.println("HERE ARE ALL OUR PETS");
                    System.out.println("---------------------");
                    System.out.println(individualPet.getName());
                    System.out.println(individualPet.getType());
                    System.out.println(individualPet.getColor());

                }
                
            }
        }
        
    }







}