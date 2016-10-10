package DesignContract;

/**
 * Main class of the Java program.
 * 
 * @author UC3M MOOC Team
 * @since 2016-04
 * 
 */
public class Main {

    public static void main(String[] args) {
        FuelTank fuelTank = new FuelTank(40, 15);
        fuelTank.fill(-1);
        fuelTank.consume(5);
        System.out.println("The amount of fuel in the tank is " + fuelTank.getTankLevel());
    }
    
    
}