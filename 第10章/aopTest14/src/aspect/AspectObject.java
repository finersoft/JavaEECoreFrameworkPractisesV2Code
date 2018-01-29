package aspect;

import java.util.Date;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectObject {

	@Pointcut(value = "execution(* service.UserinfoService.method1(int)) && args(xxxxxx)")
	public void methodAspect1(int xxxxxx) {
	}

	@Pointcut(value = "execution(* service.UserinfoService.method2(String,String,int,java.util.Date)) && args(u,p,a,i)")
	public void methodAspect2(String u, String p, int a, Date i) {
	}

	@Pointcut(value = "execution(* service.UserinfoService.*(..))")
	public void methodAspect3() {
	}

	@Before(value = "methodAspect1(xxxxxx)")
	public void method1Before(int xxxxxx) {
		System.out.println("학충：public void method1Before(int xxxxxx) xxxxxx=" + xxxxxx);
	}

	@Before(value = "methodAspect2(u, p, a, i)")
	public void method2Before(String u, String p, int a, Date i) {
		System.out.println("학충：public void method2Before(String u, String p, int a, Date i) u=" + u + " p=" + p + " a="
				+ a + " i=" + i);
	}

	@AfterReturning(value = "methodAspect3()", returning = "returnParam")
	public void method3AfterReturning(Object returnParam) {
		System.out.println("public void method3AfterReturning(Object returnParam) returnParam=" + returnParam);
	}

	@AfterThrowing(value = "methodAspect3()", throwing = "t")
	public void method4AfterThrowing(Throwable t) {
		System.out.println("public void method4AfterThrowing(Throwable t) t=" + t);
	}

}
