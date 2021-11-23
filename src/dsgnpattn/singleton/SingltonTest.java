package dsgnpattn.singleton;

import org.junit.After;
import org.junit.Test;

import dsgnpattn.cmm.TestBase;
import dsgnpattn.singleton.example.Printer;
import dsgnpattn.singleton.example.PrinterStatic;
import dsgnpattn.singleton.example.PrinterSync;

public class SingltonTest extends TestBase {

	private static final int THREAD_NUM = 5;

	@After
	public void sleep() throws Exception{
		Thread.sleep(1000);
	}
	
	@Test
	public void testPrinter() {
		
		for(int i = 0 ; i < THREAD_NUM; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					Printer printer = Printer.getPrinter();
					printer.print(Thread.currentThread().getName() + " print using" + printer.toString());
				}
			}).start();
		}
		
	}
	
	
	@Test
	public void testStaticPrinter(){
		
		for(int i = 0 ; i < THREAD_NUM; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					PrinterStatic printer = PrinterStatic.getPrinter();
					printer.print(Thread.currentThread().getName() + " print using" + printer.toString());
				}
			}).start();
		}
	}

	
	@Test
	public void testSyncPrinter() {
		
		for(int i = 0 ; i < THREAD_NUM; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					PrinterSync printer = PrinterSync.getPrinter();
					printer.print(Thread.currentThread().getName() + " print using" + printer.toString());
				}
			}).start();
		} 
		
	}
}
