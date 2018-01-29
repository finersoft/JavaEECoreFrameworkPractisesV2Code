package myconverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateConverter extends StrutsTypeConverter {

	private SimpleDateFormat[] format = new SimpleDateFormat[] { new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyy/MM/dd"), new SimpleDateFormat("yyyyƒÍMM‘¬dd»’"),
	};

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		String dateString = arg1[0];

		for (int i = 0; i < format.length; i++) {
			try {
				return format[i].parse(dateString);
			} catch (ParseException e) {
			}
		}

		return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		return null;
	}

}
