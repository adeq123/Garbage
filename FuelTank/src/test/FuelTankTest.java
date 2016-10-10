package test;

import fuel.*;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class FuelTankTest {

	
	FuelTank tank = null;
	private double paramFill, resultFill, paramConsume, resultConsume;
	
	public FuelTankTest(double paramFill, double resultFill, double paramConsume, double resultConsume){
		
		this.paramFill = paramFill;
		this.resultFill = resultFill;
		this.paramConsume = paramConsume;
		this.resultConsume = resultConsume;
		
		
	}
	@Parameters
	public static Collection <Object []> fillConsumeTanks (){
		
		Object [] [] tanks = new Object [] [] {{10,30, 15, 15}, {5, 25 ,7 ,18}, {7, 27, 9, 18}};
		return Arrays.asList(tanks);
	}
	
	
	@Before
	public void setUp(){
		tank = new FuelTank(60,20);
	}
	
	
	@Test
	public void testFillConsume(){
		tank.fill(this.paramFill);
		assertEquals(this.resultFill,tank.getTankLevel(), 0);
		
		tank.consume(this.paramConsume);
		assertEquals(this.resultConsume,tank.getTankLevel(), 0);
	}

}
