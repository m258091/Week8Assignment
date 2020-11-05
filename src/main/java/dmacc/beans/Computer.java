package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
	
	public Computer(String make) {
		this.make = make;
	}
	
	public Computer(String make, String model, int year, double listPrice) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.listPrice = listPrice;
	}
	
}
