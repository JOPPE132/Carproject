package no.ntnu.iir.selfmade;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Dealership {

    private ArrayList<Car> cars;
    private Car car;


    public Dealership() {

        cars = new ArrayList<>();
        populateArrayList();

    }

    public void populateArrayList(){

        cars.add(new Car("Grey", "BMW", 180, 2012, 80000));

    }

    public void addCar(Car car){

        cars.add(car);

    }


    public int getSize() {

        return cars.size();

    }

    public void printAllCars() {

        Iterator<Car> it = cars.iterator();

        while(it.hasNext()) {

            Car c = it.next();
            printDetails(c);

        }
    }

    public ArrayList searchForCarWithColor(String color) {

        ArrayList<Car> foundCars = new ArrayList<>();

        for (Car c : cars) {

            if (color.equals((car.getColor()))) {

                foundCars.add(c);

            }
        }

        return foundCars;
    }


        public ArrayList searchForCarWithSalesPrice ( int salesPrice) {

            ArrayList<Car> foundCars20000 = new ArrayList<>();

            for (Car c : cars) {

                if (salesPrice >= 0 && salesPrice <= 20000) {

                    foundCars20000.add(c);

                }

                if (salesPrice >= 20001 && salesPrice <= 100000) {

                    foundCars20000.add(c);
                }
            }
            return foundCars20000;
        }

            public void printDetails (Car car){

                System.out.println("Brand:          " + car.getBrand());
                System.out.println("Color:          " + car.getColor());
                System.out.println("Horsepower:     " + car.getHorsePower());
                System.out.println("Model:          " + car.getModel());
                System.out.println("Salesprice:     " + car.getSalesPrice());

            }
    }

