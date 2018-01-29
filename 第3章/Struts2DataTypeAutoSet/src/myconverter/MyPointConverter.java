package myconverter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import entity.MyPoint;

public class MyPointConverter extends StrutsTypeConverter {

	// Login-conversion.properties
	// ClassName-conversion.properties
	// 和Controller类放在同一个包中

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		String x = arg1[0].split("\\_")[0];
		String y = arg1[0].split("\\_")[1];

		MyPoint point = new MyPoint();
		point.setX(x);
		point.setY(y);

		return point;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		return null;
	}

}
