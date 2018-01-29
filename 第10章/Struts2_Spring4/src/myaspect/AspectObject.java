package myaspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AspectObject {

	public AspectObject() {
		System.out.println("public AspectObject()----------------");
	}

	@Pointcut(value = "execution(* controller..*.execute(..))")
	public void struts2ExecuteMethodPointCut() {
	}

	@Before(value = "struts2ExecuteMethodPointCut()")
	public void beforeAspectMethod() {
		System.out.println("��ʼ��־����ʼʱ�䣺" + System.currentTimeMillis());
	}

	@After(value = "struts2ExecuteMethodPointCut()")
	public void afterAspectMethod() {
		System.out.println("������־������ʱ�䣺" + System.currentTimeMillis());
	}

}
