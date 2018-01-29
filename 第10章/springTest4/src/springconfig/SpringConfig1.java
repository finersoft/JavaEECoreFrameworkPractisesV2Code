package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import entity.Bookinfo;

@Configuration
@Import(SpringConfig2.class)
public class SpringConfig1 {
	@Bean
	public Bookinfo abc() {
		Bookinfo bookinfo = new Bookinfo();
		System.out.println("getBookinfo bookinfo=" + bookinfo.hashCode());
		return bookinfo;
	}
}
