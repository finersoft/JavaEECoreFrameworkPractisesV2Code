package springconfig;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "test")
public class SpringConfig {

	@Bean(name = "xxxxxxxxxxxxxxxxxxxxxxx")
	public Date createDate() {
		Date date = new Date();
		System.out.println("public Date createDate() xxxxxxxxxxxxxxxxxxxxxxx=" + date.hashCode());
		return date;
	}

	@Bean(name = "zzzzzzzzzzzzzzzzzzzzz")
	public Date getDate() {
		Date date = new Date();
		System.out.println("public Date getDate() zzzzzzzzzzzzzzzzzzzzz=" + date.hashCode());
		return date;
	}

}
