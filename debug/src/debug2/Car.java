package debug2;

/**
 * Car class
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */
import java.lang.*;

public class Car {
    public Car(){
        int wheels = 4;
        boolean lights = false;
        String colour = "blue";
    }
    
    public static String shortestRoute(int [] route1, int [] route2, int [] route3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int i=0; i < Math.max(Math.max(route1.length, route2.length), route3.length); i++)
        {
           if(i < route1.length)
        	sum1 += route1[i];
           
           if(i < route2.length)
            sum2 += route2[i];
           
           if(i < route3.length)
            sum3 += route3[i];
        }
        
        if(sum1 < sum2 && sum1 < sum3)
        {
            return "route 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return "route 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return "route 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3)
            {
                return "routes 1, 2 and 3";
            }else if(sum1 == sum3)
            {
                return "routes 1 and 3";
            }else if(sum2 == sum3){
                return "routes 2 and 3";
            }else{
                return "routes 1 and 2";
            }
        }
        
    }

    public static void main(String[] args) {
        Car car = new Car();
        int[] route1 = {12,34,21,46,25};
        int[] route2 = {24,1,5,64,10,15,21};
        int[] route3 = {1,5,6,7,8,10,20,46,104};
        System.out.println("The shortest route is:"+Car.shortestRoute(route1,route2,route3)+".");
    }
}
