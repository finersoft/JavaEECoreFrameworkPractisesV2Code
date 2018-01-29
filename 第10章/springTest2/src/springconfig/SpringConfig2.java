package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Userinfo;

@Configuration
public class SpringConfig2 {
	@Bean
	public Userinfo getUserinfo() {
		Userinfo userinfo = new Userinfo();
		System.out.println("getUserinfo userinfo=" + userinfo.hashCode());
		return userinfo;
	}
}
