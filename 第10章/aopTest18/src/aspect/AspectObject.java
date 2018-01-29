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
	public void methodAspect1() {
	}

	@Before(value = "methodAspect1()")
	public void method1Before() {
		System.out.println("切面开始：public void method1Before()");
	}

	@After(value = "methodAspect1()")
	public void method1After() {
		System.out.println("切面开始：public void method1After()");
	}

	@AfterReturning(value = "methodAspect1()")
	public void method3AfterReturning() {
		System.out.println("public void method3AfterReturning()");
	}

	@AfterThrowing(value = "methodAspect1()")
	public void method4AfterThrowing() {
		System.out.println("public void method4AfterThrowing()");
	}

}
