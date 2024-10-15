package factory;

import model.Laptop;

public interface LaptopFactory {
	Laptop buildLaptop(String laptop);

}
