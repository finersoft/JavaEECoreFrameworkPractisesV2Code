package myinterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("begin");
		String resultValue = arg0.invoke();
		System.out.println("  end");
		return resultValue;
	}
}
