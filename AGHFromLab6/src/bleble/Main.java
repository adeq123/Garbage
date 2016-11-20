package bleble;


public class Main {

	public static void main(String[] args) {
		DB1 db1 = new DB1();
		db1.connect();
		db1.listNames();
		db1.deleteISBN("1234567891234");
		System.out.println("");
		db1.listNames();
		System.out.println("");
		db1.findISBN("1234567891235");
		System.out.println("");
		db1.findAuthor("Ernest Hemingway");
		
	}

}
