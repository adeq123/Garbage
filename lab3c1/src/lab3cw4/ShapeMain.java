package lab3cw4;

public class ShapeMain {

	public static void main(String[] args) {
		Kwadrat kwadrat = new Kwadrat("kwadrat");
		kwadrat.draw();
		
		System.out.println();
		
		Trojkat trojkat = new Trojkat("trojkat");
		trojkat.draw();
		
		System.out.println();
		
		Prostokat prostokat = new Prostokat("prostokat");
		prostokat.draw();
		
		System.out.println();
			
		Kolo kolo = new Kolo("kolo");
		kolo.draw();

	}

}
