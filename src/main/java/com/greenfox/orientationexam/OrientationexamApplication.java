package com.greenfox.orientationexam;

import com.greenfox.orientationexam.model.LicencePlate;
import com.greenfox.orientationexam.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrientationexamApplication implements CommandLineRunner {

	@Autowired
	CarRepo carRepo;

	public static void main(String[] args) {
		SpringApplication.run(OrientationexamApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		carRepo.save(new LicencePlate("MXS-803","Subaru","Legacy","Pink","2001", true , false));
		carRepo.save(new LicencePlate("JUO-705", "Infiniti", "M", "Crimson", "2004", true , false));
		carRepo.save(new LicencePlate("RB99-01", "Audi", "R8", "White", "2011" , false , true));




	}
}
