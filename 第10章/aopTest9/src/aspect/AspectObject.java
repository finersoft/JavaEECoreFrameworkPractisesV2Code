package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

public class AspectObject {
	public Object around(ProceedingJoinPoint point) {
		Object returnObject = null;
		try {
			System.out.println("¿ªÊ¼");
			returnObject = point.proceed();
			System.out.println("½áÊø");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return returnObject;
	}
}
