package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectObject {

	@Pointcut(value = "execution(* service.UserinfoService.*(..))")
	public void publicPointcut() {

	}

	@Before(value = "publicPointcut()")
	public void before() {
		System.out.println("public void before()");
	}

	@After(value = "publicPointcut()")
	public void after() {
		System.out.println("public void after()");
	}

	@AfterReturning(value = "publicPointcut()")
	public void afterReturning() {
		System.out.println("public void afterReturning()");
	}

	@AfterThrowing(value = "publicPointcut()")
	public void afterThrowing() {
		System.out.println("public void afterThrowing()");
	}

}
