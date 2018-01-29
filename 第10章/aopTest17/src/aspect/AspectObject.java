package aspect;

import java.util.Date;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectObject {

	public void method1Before(ProceedingJoinPoint point, int xxxxxx) throws Throwable {
		System.out.println("切面开始：public void method1Before(ProceedingJoinPoint point, int xxxxxx) xxxxxx=" + xxxxxx);
		point.proceed();
		System.out.println("切面结束：public void method1Before(ProceedingJoinPoint point, int xxxxxx) xxxxxx=" + xxxxxx);
	}

	public Object method2Before(ProceedingJoinPoint point, String u, String p, int a, Date i) throws Throwable {
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

	public void method3AfterReturning(Object returnParam) {
		System.out.println("public void method3AfterReturning(Object returnParam) returnParam=" + returnParam);
	}

	public void method4AfterThrowing(Throwable t) {
		System.out.println("public void method4AfterThrowing(Throwable t) t=" + t);
	}

}
