package kr.co.ezenac.ridelog;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.context.WebServerPortFileWriter;

@SpringBootApplication
public class RideLogApplication {

	public static void main(String[] args) {
//		System.out.println("Hello, World Ezen!");
//		//SpringApplication.run(RideLogApplication.class, args);
//		
//		SpringApplication application = new SpringApplication(RideLogApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.addListeners(new ApplicationPidFileWriter(), new WebServerPortFileWriter());
//		application.run(args);
		
		
		
		new SpringApplicationBuilder(RideLogApplication.class)
			.bannerMode(Banner.Mode.OFF)
			.listeners(
					new ApplicationPidFileWriter(),
					new WebServerPortFileWriter())
			.build().run(args);
	}

}
