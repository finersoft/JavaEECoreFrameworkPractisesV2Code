package createbean;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import entity1.entity2.Entity2222222222222222222;
import entity1.entity2.entity3.Userinfo;

@Configuration
@ComponentScan(basePackageClasses = { Entity2222222222222222222.class, Userinfo.class })
public class SpringConfig {
	@Bean
	public Date createDate() {
		Date nowDate = new Date();
		System.out.println("createDate " + nowDate.hashCode());
		return nowDate;
	}
}
