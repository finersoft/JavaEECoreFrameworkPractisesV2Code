package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Bookinfo;

@Configuration
public class SpringConfig {
	@Bean
	public Bookinfo createBookinfo() {
		return new Bookinfo();
	}
}
