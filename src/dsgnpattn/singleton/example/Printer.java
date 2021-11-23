package dsgnpattn.singleton.example;

public class Printer {
	private static Printer printer = null;
	private int counter = 0;
	
	public static Printer getPrinter() {
		if(printer == null) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
			}
			printer = new Printer();
		}
		
		return printer;
	}
	
	public void print(String str) {
		counter++;
		System.out.println(str + " > " + counter);
	}
}
