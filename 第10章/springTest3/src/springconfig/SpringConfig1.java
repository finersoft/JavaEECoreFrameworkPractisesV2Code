package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import entity.Bookinfo;

@Configuration
@Import(value = SpringConfig2.class)
public class SpringConfig1 {
	@Bean
	public Bookinfo getBookinfo() {
		Bookinfo bookinfo = new Bookinfo();
		System.out.println("getBookinfo bookinfo=" + bookinfo.hashCode());
		return bookinfo;
	}
}
