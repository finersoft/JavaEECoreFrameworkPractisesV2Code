package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import entity.Bookinfo;

@Configuration
@ImportResource(value = "ac.xml")
public class SpringConfig1 {
	@Bean
	public Bookinfo getBookinfo() {
		Bookinfo bookinfo = new Bookinfo();
		System.out.println("getBookinfo bookinfo=" + bookinfo.hashCode());
		return bookinfo;
	}
}
