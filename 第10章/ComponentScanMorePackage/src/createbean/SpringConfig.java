package createbean;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "entity1", "entity2" })
public class SpringConfig {
	@Bean
	public Date createDate() {
		Date nowDate = new Date();
		System.out.println("createDate " + nowDate.hashCode());
		return nowDate;
	}
}
