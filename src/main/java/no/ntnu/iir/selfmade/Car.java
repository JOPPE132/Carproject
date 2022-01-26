package no.ntnu.iir.selfmade;

/**
 * Class represents a car.
 */

public class Car {

    private String color;
    private String brand;
    private int horsePower;
    private int model;
    private int salesPrice;


    /**
     * Constructor
     *
     * @param color
     * @param brand
     * @param horsePower
     * @param model
     * @param salesPrice
     */

    public Car(String color, String brand,int horsePower, int model, int salesPrice){

        color = color;
        brand = brand;
        horsePower = horsePower;
        model = model;
        salesPrice = salesPrice;

    }

    public String getColor(){

        return color;

    }

    public String getBrand(){

        return brand;

    }

    public int getHorsePower(){

        return horsePower;

    }

    public int getModel(){

        return model;

    }

    public int getSalesPrice(){

        return salesPrice;

    }

    public void printDetails(){

        System.out.println("Brand:          " + brand);
        System.out.println("Color:          " + color);
        System.out.println("Horsepower:     " + horsePower);
        System.out.println("Model:          " + model);
        System.out.println("Salesprice:     " + salesPrice);

    }
}

