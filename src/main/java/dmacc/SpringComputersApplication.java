package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computer;
import dmacc.beans.Manufacturer;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputersApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
	}

	@Autowired
	ComputerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		//Spring container to read in our configuration class and obtain the empty bean
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Computer c = appContext.getBean("computer", Computer.class);
		c.setListPrice(699.99);
		repo.save(c);
		
		//Creating a bean to use - not managed by Spring
		Computer d = new Computer("Dell", "XPS", 2019, 799.99);
		Manufacturer m = new Manufacturer("Dell", "Austin", "TX");
		d.setManufacturer(m);
		repo.save(d);
		
		List<Computer> allMyComputers = repo.findAll();
		
		for(Computer machine: allMyComputers) {
			System.out.println(machine.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
		
	}
}
