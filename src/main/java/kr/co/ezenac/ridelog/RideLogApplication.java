package kr.co.ezenac.ridelog;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RideLogApplication {

	public static void main(String[] args) {
		System.out.println("Hello, World Ezen!");
		//SpringApplication.run(RideLogApplication.class, args);
		
		SpringApplication application = new SpringApplication(RideLogApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
