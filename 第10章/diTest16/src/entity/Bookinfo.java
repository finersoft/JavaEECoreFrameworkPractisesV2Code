package entity;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bookinfo {
	public Bookinfo(String username, List<String> listString1) {
		for (int i = 0; i < listString1.size(); i++) {
			System.out.println("listString1=" + listString1.get(i) + " username=" + username);
		}
	}

	public Bookinfo(int age, List<Date> listString2) {
		for (int i = 0; i < listString2.size(); i++) {
			System.out.println("listString2=" + listString2.get(i) + " age=" + age);
		}
	}

	public Bookinfo(String username, Set<String> set1) {
		Iterator<String> iterator = set1.iterator();
		while (iterator.hasNext()) {
			System.out.println("set1=" + iterator.next() + " username=" + username);
		}
	}

	public Bookinfo(int age, Set<Date> set2) {
		Iterator<Date> iterator = set2.iterator();
		while (iterator.hasNext()) {
			System.out.println("set2=" + iterator.next() + " age=" + age);
		}
	}

	public Bookinfo(String username, Map<String, String> map1) {
		Iterator<String> iterator = map1.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("map1 key=" + key + " value=" + map1.get(key) + " username=" + username);
		}
	}

	public Bookinfo(int age, Map<String, Date> map2) {
		Iterator<String> iterator = map2.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("map2 key=" + key + " value=" + map2.get(key) + " age=" + age);
		}
	}
}
