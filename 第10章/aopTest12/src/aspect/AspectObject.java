package aspect;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectObject {

	// 下面@Pointcut注解的解释：
	// (1)@Pointcut注解的功能是声明1个切点表达式
	// (2)由于切面要取得调用方法时传入的参数，
	// ___所以要使用args表达式：args(xxxxxx)来进行获取
	// (3)与@Pointcut关联方法的参数名称必须和args()表达式中的xxxxxx一样
	@Pointcut(value = "execution(* service.UserinfoService.method1(int)) && args(xxxxxx)")
	public void methodAspect1(int xxxxxx) {
	}

	// 下面@Before注解的解释：
	// (1)属性value = "methodAspect(ageabc)"是引用方法：
	// ___public void methodAspect(int xxxxxx)，
	// ___引用时参数名称可以不一样，一个是xxxxxx，另1个是ageabc
	// (2)与@Before关联的方法：
	// ___public void method1Before(int ageabc)
	// ___中的参数名称必须和@Before(value = "methodAspect(ageabc)")
	// ___配置中方法的参数名称一样
	// (3)@Pointcut和@Before交接关联点在于方法的名称methodAspect，
	// ___不包含参数的命名统一性
	@Before(value = "methodAspect1(ageabc)")
	public void method1Before(int ageabc) {
		System.out.println("切面：public void method1Before(int ageabc) ageabc=" + ageabc);
	}

	//

	@Pointcut(value = "execution(* service.UserinfoService.method2(String,String,int,java.util.Date)) && args(u,p,a,i)")
	public void methodAspect2(String u, String p, int a, Date i) {
	}

	@Before(value = "methodAspect2(uu,pp,aa,ii)")
	public void method2Before(String uu, String pp, int aa, Date ii) {
		System.out.println("切面：public void method2Before(String uu, String pp, int aa, Date ii) uu=" + uu + " pp=" + pp
				+ " aa=" + aa + " ii=" + ii);
	}
}
