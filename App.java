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
            else if(navigationChoice.equals("search pets")){
                System.out.println("WHAT TYPE OF PET ARE YOU LOOKING FOR?");
                String newPet= myConsole.readLine();
                System.out.println("HERE IS WHAT WE HAVE:");
                for(PetStore individualPet: allPets){
                    if(individualPet.animalIWant(newPet)){
                        System.out.println("HERE ARE ALL OUR PETS");
                    System.out.println("---------------------");
                    System.out.println(individualPet.getName());
                    System.out.println(individualPet.getType());
                    System.out.println(individualPet.getColor());

                    }
                }
            }
            else if(navigationChoice.equals("add pet")){
                System.out.println("ALRIGHT LET US ADD A PET:Enter its name:");
                String petName=myConsole.readLine();
                System.out.println("WHAT TYPE OF PET IS IT:");
                String petType=myConsole.readLine();
                System.out.println("WHAT COLOR IS THE PET:");
                String petColor=myConsole.readLine();
                PetStore userPet=new PetStore(petName,petType,petColor);
                allPets.add(userPet);
                System.out.println("here are your pet details");
                System.out.println(userPet.getName());
                System.out.println(userPet.getType());
                System.out.println(userPet.getColor());

            }
            else{
                System.out.println("COULDNT RECOGNIZE THAT");
            }
        }
        
    }







}