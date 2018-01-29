package i18nTest;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		Locale[] localeArray = Locale.getAvailableLocales();
		for (int i = 0; i < localeArray.length; i++) {
			System.out.println(localeArray[i].getCountry() + " " + localeArray[i].getLanguage());
		}
	}

}
