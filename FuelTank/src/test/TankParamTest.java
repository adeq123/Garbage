package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import fuel.FuelTank;

@RunWith(Parameterized.class)

public class TankParamTest {

    double param, result;
    FuelTank tank;
    public TankParamTest(double param, double result){
    	this.param = param;
    	this.result = result;
    }
    
@Parameters
public static Collection <Object [] > fillTank(){
	
	Object [] [] tankFills = { {5,15}, {10,20}, {15,25}, {20,30}, {30,40}};
	
	return Arrays.asList(tankFills);
    
}


	
	@Before
	public void setUp() throws Exception {
		
		tank = new FuelTank(60,10);
		
	}

	@Test
	public void Filltest() {
		tank.fill(param);
		assertEquals(tank.getTankLevel(), result, 0);
	}

}
