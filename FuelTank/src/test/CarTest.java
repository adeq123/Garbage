package test;
import fuel.*;

public class CarTest {

	  public void testNotEnoughFuelForTravel ()  {
	     FuelTank tank = new FuelTank(60, 10);
	     Car car = new Car(tank, 0.098);
	     double km = 200.0;
	     System.out.println(" Kilometers to travel: expected not 0, obtained: " + car.travel(km));
	  }	
	}