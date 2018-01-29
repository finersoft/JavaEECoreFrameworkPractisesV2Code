package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import entity1.Bookinfo;
import entity2.Userinfo;

@Configuration
@ComponentScan(basePackages = "entity2")
public class SpringConfig {
	@Bean
	public Bookinfo getBookinfo(Userinfo userinfo) {
		System.out.println("public Bookinfo getBookinfo(Userinfo userinfo) userinfo=" + userinfo.hashCode());
		return new Bookinfo(userinfo);
	}
}
