package aspect;

import java.util.Date;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class AspectObject {

	public void method1Before(int xxxxxx) {
		System.out.println("학충：public void method1Before(int xxxxxx) xxxxxx=" + xxxxxx);
	}

	public void method2Before(String u, String p, int a, Date i) {
		System.out.println("학충：public void method2Before(String u, String p, int a, Date i) u=" + u + " p=" + p + " a="
				+ a + " i=" + i);
	}

	public void method3AfterReturning(Object returnParam) {
		System.out.println("public void method3AfterReturning(Object returnParam) returnParam=" + returnParam);
	}

	public void method4AfterThrowing(Throwable t) {
		System.out.println("public void method4AfterThrowing(Throwable t) t=" + t);
	}

}
