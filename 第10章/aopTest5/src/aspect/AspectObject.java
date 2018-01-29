package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

public class AspectObject {

	public void before() {
		System.out.println("public void before()");
	}

	public void after() {
		System.out.println("public void after()");
	}

	public void afterReturning() {
		System.out.println("public void afterReturning()");
	}

	public void afterThrowing() {
		System.out.println("public void afterThrowing()");
	}

}
