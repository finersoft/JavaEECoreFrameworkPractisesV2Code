package aspect;

import java.util.Date;

public class AspectObject {

	public void method1Before(int xxxxxx) {
		System.out.println("학충：public void method1Before(int xxxxxx) xxxxxx=" + xxxxxx);
	}

	public void method2Before(String uu, String pp, int aa, Date ii) {
		System.out.println("학충：public void method2Before(String uu, String pp, int aa, Date ii) uu=" + uu + " pp=" + pp
				+ " aa=" + aa + " ii=" + ii);
	}
}
