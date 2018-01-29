package advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		System.out.println("ThrowsAdvice信息，方法名称=" + method.getName() + " 参数个数：" + args.length + " 原始对象：" + target
				+ " 异常信息：" + ex.getMessage());
	}

}
