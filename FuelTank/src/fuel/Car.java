package fuel;

public class Car {
    FuelTank tank;
    double consumption;	
  
    public Car(FuelTank tank, double consumption)  {
        this.tank=tank; 
        this.consumption=consumption;
    }

    public double amountKilometers (double amountFuel)  {
        return amountFuel / consumption;
    }	

    public double amountFuel (double km) {
        return km * consumption;
    }		
 
    public double travel (double km){
        double amountFuelNeeded=amountFuel(km);	
        double amountFuelAvailable=tank.getTankLevel();
        if (amountFuelNeeded > amountFuelAvailable){ 
            tank.consume(amountFuelAvailable);
            return amountKilometers(amountFuelNeeded - amountFuelAvailable);
        } else {
            tank.consume(amountFuelNeeded); 
            return 0.0;
        }
    }	
}