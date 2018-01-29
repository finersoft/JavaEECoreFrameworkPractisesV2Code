package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("MethodInterceptor begin");
		Object value = arg0.proceed();
		System.out.println("MethodInterceptor   end");
		return value;
	}
}
