package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectObject {
	public Object around(ProceedingJoinPoint point) {
		Object returnObject = null;
		try {
			System.out.println("��ʼ");
			returnObject = point.proceed();
			System.out.println("����");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return returnObject;
	}
}
