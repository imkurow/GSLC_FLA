package program;

import java.util.Scanner;

import factory.GamingLaptopFactory;
import factory.LaptopFactory;
import model.Laptop;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void menu() {
		System.out.println("[asus | dell]");
		System.out.print("input one of the type above : ");
	}
	
	public static void main(String[] args) {
		
		menu();
		String option1 = scan.nextLine();
		LaptopFactory gaming = new GamingLaptopFactory();
		
		Laptop laptop = gaming.buildLaptop(option1);
		System.out.println("laptop name \"" + laptop.getLaptopName() + "\"");
	}
}
