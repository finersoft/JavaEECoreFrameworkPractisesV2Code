package a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/a")
public class UserinfoControllerA {
	// org.springframework.beans.factory.BeanDefinitionStoreException:
	// Unexpected exception parsing XML document from ServletContext resource
	// [/WEB-INF/springMVC-servlet.xml]; nested exception is
	// org.springframework.context.annotation.ConflictingBeanDefinitionException:
	// Annotation-specified bean name 'userinfoController' for bean class
	// [b.controller.UserinfoController] conflicts with existing, non-compatible
	// bean definition of same name and class [a.controller.UserinfoController]

	// java.lang.IllegalStateException: Cannot map handler 'userinfoControllerB'
	// to URL path [/login]: There is already handler of type [class
	// a.controller.UserinfoControllerA] mapped.

	@RequestMapping(value = "login")
	public String listStringMethod() {
		System.out.println("a login new");
		return "index.jsp";
	}
}
