package factory;

import model.AsusVivoBook;
import model.DellAltitude;
import model.Laptop;

public class OfficeLaptopFactory implements LaptopFactory{

	@Override
	public Laptop buildLaptop(String laptop) {
		if(laptop.equals("asus")) {
			return new AsusVivoBook();
		}
		if(laptop.equals("dell")) {
			return new DellAltitude();
		}
		
		throw new IllegalArgumentException("not found");
	}

}
