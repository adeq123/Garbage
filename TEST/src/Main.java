import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		LinkedList <String> l1 = new LinkedList <String> ();
		//ListIterator <String> i1 = l1.listIterator();
		l1.add("asdas");
		l1.add("asdas");
		l1.add("asdas");
		ListIterator <String> i2 = l1.listIterator();
		//l1.add("asdas");
		//l1.add("asdas");
		//l1.add("asdas");
		//ListIterator <String> i3 = l1.listIterator();
		
		
			
		while(i2.hasNext()){
			i2.next();
		}
		
		/*
		while(i3.hasNext())
			i3.next();
		
		while(i1.hasNext())
			i1.next();
		*/
		
		//System.out.println("i1: "+i1.previousIndex()+" \n i2: "+i2.previousIndex()+" \n i3: "+i3.previousIndex());

	}

}
