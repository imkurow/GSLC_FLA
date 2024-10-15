package factory;

import model.AsusRog;
import model.DellAlienware;
import model.Laptop;

public class GamingLaptopFactory implements LaptopFactory{

	@Override
	public Laptop buildLaptop(String laptop) {
		if(laptop.equals("asus")) {
			return new AsusRog();
		}
		if(laptop.equals("dell")) {
			return new DellAlienware();
		}
		throw new IllegalArgumentException("not found");
	}

}
