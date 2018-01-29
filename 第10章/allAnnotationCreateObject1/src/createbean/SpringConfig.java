package createbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Userinfo;

@Configuration
public class SpringConfig {

	@Bean(name="u1")
	public Userinfo createUserinfo1() {
		Userinfo userinfo1 = new Userinfo();
		System.out.println("userinfo1 " + userinfo1.hashCode());
		return userinfo1;
	}

	@Bean(name="u2")
	public Userinfo xxxxxxxxxxxxxxx() {
		Userinfo userinfo2 = new Userinfo();
		System.out.println("userinfo2 " + userinfo2.hashCode());
		return userinfo2;
	}

}
