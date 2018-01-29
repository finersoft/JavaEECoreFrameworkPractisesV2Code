package tools;

public class Tools {
	public static String encodeString(String value) {
		return "_" + value;
	}

	public static String decodeString(String value) {
		return value.substring(1);
	}
}
