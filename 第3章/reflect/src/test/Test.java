package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import entity.Userinfo;

public class Test {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Class class1 = Class.forName("entity.Userinfo");
		Class class2 = new Userinfo().getClass();
		Class class3 = Userinfo.class;
		Class class4 = Test.class.getClassLoader().loadClass("entity.Userinfo");

		System.out.println(class1.hashCode());
		System.out.println(class2.hashCode());
		System.out.println(class3.hashCode());
		System.out.println(class4.hashCode());

		Userinfo userinfo1 = (Userinfo) class4.newInstance();
		System.out.println(userinfo1.getId() + " " + userinfo1.getUsername() + " " + userinfo1.getPassword() + " "
				+ userinfo1.getAge() + " " + userinfo1.getInsertdate());

		Constructor constructor = class4.getDeclaredConstructor(null);
		userinfo1 = (Userinfo) constructor.newInstance(null);
		System.out.println(userinfo1.getId() + " " + userinfo1.getUsername() + " " + userinfo1.getPassword() + " "
				+ userinfo1.getAge() + " " + userinfo1.getInsertdate());

		constructor = class4.getDeclaredConstructor(int.class, String.class, String.class, int.class, Date.class);
		userinfo1 = (Userinfo) constructor.newInstance(2, "username2", "password2", 22, new Date());
		System.out.println(userinfo1.getId() + " " + userinfo1.getUsername() + " " + userinfo1.getPassword() + " "
				+ userinfo1.getAge() + " " + userinfo1.getInsertdate());

		Method method1 = class4.getDeclaredMethod("printAll1");
		method1.invoke(userinfo1);

		Method method2 = class4.getDeclaredMethod("printAll2", String.class);
		method2.invoke(userinfo1, "中国");

		Method method3 = class4.getDeclaredMethod("printAll3", String.class);
		System.out.println(method3.invoke(userinfo1, "中国人"));

	}

}
