package utils;

import java.util.Iterator;
import java.util.Map;

import org.hibernate.Query;

public class DBUtils {

	public static Query setQueryParam(Query query, Map paramValue) {
		Iterator<String> iterator = paramValue.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Object value = paramValue.get(key);
			query.setParameter(key, value);
		}
		return query;
	}
}
