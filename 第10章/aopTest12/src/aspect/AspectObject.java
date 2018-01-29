package aspect;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectObject {

	// ����@Pointcutע��Ľ��ͣ�
	// (1)@Pointcutע��Ĺ���������1���е���ʽ
	// (2)��������Ҫȡ�õ��÷���ʱ����Ĳ�����
	// ___����Ҫʹ��args���ʽ��args(xxxxxx)�����л�ȡ
	// (3)��@Pointcut���������Ĳ������Ʊ����args()���ʽ�е�xxxxxxһ��
	@Pointcut(value = "execution(* service.UserinfoService.method1(int)) && args(xxxxxx)")
	public void methodAspect1(int xxxxxx) {
	}

	// ����@Beforeע��Ľ��ͣ�
	// (1)����value = "methodAspect(ageabc)"�����÷�����
	// ___public void methodAspect(int xxxxxx)��
	// ___����ʱ�������ƿ��Բ�һ����һ����xxxxxx����1����ageabc
	// (2)��@Before�����ķ�����
	// ___public void method1Before(int ageabc)
	// ___�еĲ������Ʊ����@Before(value = "methodAspect(ageabc)")
	// ___�����з����Ĳ�������һ��
	// (3)@Pointcut��@Before���ӹ��������ڷ���������methodAspect��
	// ___����������������ͳһ��
	@Before(value = "methodAspect1(ageabc)")
	public void method1Before(int ageabc) {
		System.out.println("���棺public void method1Before(int ageabc) ageabc=" + ageabc);
	}

	//

	@Pointcut(value = "execution(* service.UserinfoService.method2(String,String,int,java.util.Date)) && args(u,p,a,i)")
	public void methodAspect2(String u, String p, int a, Date i) {
	}

	@Before(value = "methodAspect2(uu,pp,aa,ii)")
	public void method2Before(String uu, String pp, int aa, Date ii) {
		System.out.println("���棺public void method2Before(String uu, String pp, int aa, Date ii) uu=" + uu + " pp=" + pp
				+ " aa=" + aa + " ii=" + ii);
	}
}
