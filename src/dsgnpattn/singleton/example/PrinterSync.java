package dsgnpattn.singleton.example;

public class PrinterSync {
	private static PrinterSync printer = null;
	private int counter;
	
	
	public synchronized static PrinterSync getPrinter() {
		if(printer == null) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
			}
			printer = new PrinterSync();
		}
		
		return printer;
	}
	
	public void print(String str) {
		synchronized (this) {
			counter++;
			System.out.println(str + " > " + counter);
		}
	}

}
