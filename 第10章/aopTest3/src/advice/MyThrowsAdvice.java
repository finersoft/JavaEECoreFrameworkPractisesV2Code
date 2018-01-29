package advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		System.out.println("ThrowsAdvice��Ϣ����������=" + method.getName() + " ����������" + args.length + " ԭʼ����" + target
				+ " �쳣��Ϣ��" + ex.getMessage());
	}

}
