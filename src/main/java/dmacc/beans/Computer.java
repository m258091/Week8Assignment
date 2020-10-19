package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Computer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String make;
	private String model;
	private int year;
	private double listPrice;
	@Autowired
	private Manufacturer manufacturer;
	
	public Computer() {
		super();
	}
	
	public Computer(String make) {
		this.make = make;
	}
	
	public Computer(String make, String model, int year, double listPrice) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.listPrice = listPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return "Computer [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", listPrice="
				+ listPrice + ", manufacturer=" + manufacturer + "]";
	}
	
}
