package struts2_xml;

import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test1 {

	public static void main(String[] args) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(Test1.class.getResourceAsStream("/abc.xml"));
		Element mymvcElement = document.getRootElement();
		System.out.println(mymvcElement.getName());
		Element actionsElement = mymvcElement.element("actions");
		System.out.println("  " + actionsElement.getName());
		List<Element> actionElementList = actionsElement.elements("action");
		for (int i = 0; i < actionElementList.size(); i++) {
			Element actionElement = actionElementList.get(i);
			System.out.print("    " + actionElement.getName());
			System.out.print(" name=" + actionElement.attributeValue("name"));
			System.out.println(" class=" + actionElement.attributeValue("class"));

			List<Element> resultElementList = actionElement.elements("result");
			for (int j = 0; j < resultElementList.size(); j++) {
				Element resultElement = resultElementList.get(j);
				System.out.print("      " + resultElement.getName());
				System.out.print(" name=" + resultElement.attributeValue("name"));

				Attribute typeAttr = resultElement.attribute("type");
				if (typeAttr != null) {
					System.out.println(" type=" + resultElement.attributeValue("type"));
				} else {
					System.out.println();
				}
				System.out.println("        " + resultElement.getTextTrim());
			}
			System.out.println();
		}

	}

}
