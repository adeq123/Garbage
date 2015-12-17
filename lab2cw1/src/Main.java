import pkg2.*;
import pkg1.*;

public class Main {

	public static void main(String[] args) {
		
		C cObj = new C(1,"C");
		B bObj = new B(1,"B");
		A aObj = new A(1,"A");
		
		
aObj.callIncrement();
bObj.callIncrement();
cObj.callIncrement();

System.out.println("A: "+aObj.getNumber()+" B: "+bObj.getNumber()+" C: "+cObj.getNumber());
	}

}
