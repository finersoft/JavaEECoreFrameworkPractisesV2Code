package aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
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

	@Around(value = "methodAspect1(xxxxxx)")
	public void method1Around(ProceedingJoinPoint point, int xxxxxx) throws Throwable {
		System.out.println("切面开始：public void method1Before(ProceedingJoinPoint point, int xxxxxx) xxxxxx=" + xxxxxx);
		point.proceed();
		System.out.println("切面结束：public void method1Before(ProceedingJoinPoint point, int xxxxxx) xxxxxx=" + xxxxxx);
	}

	@Around(value = "methodAspect2(u, p, a, i)")
	public Object method2Around(ProceedingJoinPoint point, String u, String p, int a, Date i) throws Throwable {
		Object returnValue = null;
		System.out.println(
				"切面开始：public void method2Before(ProceedingJoinPoint point, String u, String p, int a, Date i) u=" + u
						+ " p=" + p + " a=" + a + " i=" + i);
		returnValue = point.proceed();
		System.out.println(
				"切面开始：public void method2Before(ProceedingJoinPoint point, String u, String p, int a, Date i) u=" + u
						+ " p=" + p + " a=" + a + " i=" + i);
		return returnValue;
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
