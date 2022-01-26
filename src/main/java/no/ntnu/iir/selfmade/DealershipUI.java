package no.ntnu.iir.selfmade;
import java.util.Scanner;

public class DealershipUI {

    private final Dealership dealership;
    private static final int ADD_CAR = 1;
    private static final int REMOVE_CAR = 2;
    private static final int PRINT_CARS = 3;
    private static final int QUIT = 4;


    public DealershipUI(){
        this.dealership = new Dealership();
    }






    public void startApp(){

        boolean finished = false;

        while(!finished){
            int menuChoice = showWelcome();

            switch(menuChoice) {

                case ADD_CAR: // Menuchoice 1
                    this.addCar();
                    break;

                //case REMOVE_CAR: // Menuchoice 2
                  //  this.removeCar();
                    //break;

                case PRINT_CARS: // Menuchoice 3
                    this.printCars();
                    break;

                case QUIT: // Menuchoice 4
                    finished = true;
                    System.out.println("Thanks for using the DealershipUI!");
                    break;
            }
        }
    }





    public int showWelcome(){

        System.out.println("---Welcome to the dealership---");
        System.out.println("Please enter any of the options below");
        System.out.println("");
        System.out.println("1. Add car to dealership");
        System.out.println("2. Remove car from dealership");
        System.out.println("3. Print all cars in dealership");


        Scanner userInput = new Scanner(System.in);

        int menuChoice;

        if(userInput.hasNextInt()){

            menuChoice = userInput.nextInt();
        }
        else{
            menuChoice = 0;
        }
        return menuChoice;
    }





    private void addCar(){

        Scanner sc = new Scanner(System.in);

            System.out.println("Please enter the cars brand:");
            String brand = sc.nextLine();
            System.out.println("");

            System.out.println("Please enter the cars color:");
            String color = sc.nextLine();
            System.out.println("");

            System.out.println("Please enter cars amount of horsepower:");
            int horsePower = sc.nextInt();
            System.out.println("");

            System.out.println("Please enter the cars model:");
            int model = sc.nextInt();
            System.out.println("");

            System.out.println("Please enter the cars salesprice:");
            int salesPrice = sc.nextInt();
            System.out.println("");

            dealership.addCar(new Car(brand,color, horsePower,model,salesPrice));
            System.out.println("The car has been added to the dealership!");
            System.out.println("");
        }


    private void removeCar(){

    }

    private void printCars(){

        this.dealership.printAllCars();

    }














    public static void main(String[] args){
        DealershipUI dealershipUI = new DealershipUI();
        dealershipUI.startApp();
    }
}
