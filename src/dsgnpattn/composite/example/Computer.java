package dsgnpattn.composite.example;

import java.util.ArrayList;
import java.util.List;

public class Computer {
	private List<Device> devices = new ArrayList<Device>();
	
	public void addDevice(Device device) {
		devices.add(device);
	}
	
	public void removeDevice(Device device) {
		devices.remove(device);
	}
	
	public long getPrice() {
		int sum = 0;
		for(Device device : devices) {
			sum += device.getPrice();
		}
		
		return sum;
	}
	
	public int getPower() {
		int sum = 0;
		for(Device device : devices) {
			sum += device.getPower();
		}
		
		return sum;
	}
}
