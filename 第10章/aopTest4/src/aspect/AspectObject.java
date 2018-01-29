package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectObject {

	@Before(value = "execution(* service.UserinfoService.*(..))")
	public void before() {
		System.out.println("public void before()");
	}

	@After(value = "execution(* service.UserinfoService.*(..))")
	public void after() {
		System.out.println("public void after()");
	}

	@AfterReturning(value = "execution(* service.UserinfoService.*(..))")
	public void afterReturning() {
		System.out.println("public void afterReturning()");
	}

	@AfterThrowing(value = "execution(* service.UserinfoService.*(..))")
	public void afterThrowing() {
		System.out.println("public void afterThrowing()");
	}

}
