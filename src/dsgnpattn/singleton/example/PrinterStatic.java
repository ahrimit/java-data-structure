package dsgnpattn.singleton.example;

public class PrinterStatic {
	private static PrinterStatic printer = new PrinterStatic();
	private int counter = 0 ;
	
	
	public static PrinterStatic getPrinter() {
		return printer;
	}
	
	public void print(String str) {
		counter++;
		System.out.println(str + " > " + counter);
	}
}
