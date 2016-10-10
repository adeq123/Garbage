package test;
import fuel.*;

public class TravelTest {

	FuelTank tank = null;
	Car car = null;
	GasStation station = null;
	double kilometer = 550;
	
	public TravelTest() {
		
		tank = new FuelTank(40, 10);
		car = new Car(this.tank, 0.1);
		station = new GasStation(0.8, 1);
			
	}

	public void integrationTest(){
		 CarTest carT = new CarTest();
	     carT.testNotEnoughFuelForTravel();
	     double klimoetersToTravel = kilometer - car.amountKilometers(tank.getTankLevel());
		System.out.println("Paymanet on the gas station:"+station.refuel(car, klimoetersToTravel)+"(expected 6.89 dolars)");
		System.out.println(" Missing kilometers to travel: "+klimoetersToTravel+" Fuel in the tank is enough for: "+car.amountKilometers(tank.getTankLevel()));
		
	}
	
}
