package ua.lviv.lgs.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ua.lviv.lgs.model.University;
import ua.lviv.lgs.services.UniversityService;

@SpringBootApplication(scanBasePackages={
		"ua.lviv.lgs.model", "ua.lviv.lgs.repositories", "ua.lviv.lgs.services"})
@EnableJpaRepositories("ua.lviv.lgs.repositories")
@EntityScan("ua.lviv.lgs.model")
public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Main.class, args);

		UniversityService us = ac.getBean(UniversityService.class);
		
		us.create(new University("1", 1, 1, "1"));
		System.out.println(us.read((long) 1));
		
		us.update(new University((long) 1, "2", 2, 2, "2"));
		System.out.println(us.read((long) 1));
		
		us.delete(new University((long) 1, "2", 2, 2, "2"));
		System.out.println(us.read((long)1));
		
		
		
	}

}
