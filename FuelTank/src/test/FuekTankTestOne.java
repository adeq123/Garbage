package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fuel.FuelTank;

public class FuekTankTestOne {

		FuelTank tank = null;	
		
		@Before
		public void setUp(){
			tank = new FuelTank(60,20);
		}
		
		@Test
		public void testGetTankLevel() {
			assertEquals(tank.getTankLevel(), 20, 0);
		}

		@Test
		public void testGetTankMax() {
			assertTrue(tank.getTankMax() == 60);
		}

		@Test
		public void testEmpty() {
			tank.consume(20);
			assertTrue(tank.empty());
		}
		
		@Test
		public void testHalfFullTank (){
			tank.fill(10);
			assertFalse(!(tank.getTankLevel() == 30));
		}
	}


