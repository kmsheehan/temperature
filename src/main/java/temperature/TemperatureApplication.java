package temperature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TemperatureApplication {

    public static void main(String[] args) {
    	SpringApplication.run(TemperatureApplication.class, args);
//		new SpringApplicationBuilder(TemperatureApplication.class)
//		.initializers(new TemperatureApplicationInitializer())
//		.run(args);
    }
    
	public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		application.initializers(new TemperatureApplicationInitializer());
		application.sources(TemperatureApplication.class);
		return application;
	}
}
