package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springconfig.SpringConfig;

public class Test1 {

	// Caused by:
	// org.springframework.beans.factory.NoSuchBeanDefinitionException: No
	// qualifying bean of type 'entity2.Userinfo' available: expected at least 1
	// bean which qualifies as autowire candidate. Dependency annotations: {}

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(SpringConfig.class);
	}

}
