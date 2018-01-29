package struts2_xml;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Update {

	public static void main(String[] args) throws DocumentException, IOException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(Update.class.getResourceAsStream("/abc.xml"));
		Element mymvcElement = document.getRootElement();
		Element actionsElement = mymvcElement.element("actions");
		List<Element> actionElementList = actionsElement.elements("action");
		for (int i = 0; i < actionElementList.size(); i++) {
			Element actionElement = actionElementList.get(i);
			List<Element> resultElementList = actionElement.elements("result");
			for (int j = 0; j < resultElementList.size(); j++) {
				Element resultElement = resultElementList.get(j);
				Attribute typeAttr = resultElement.attribute("type");
				if (typeAttr != null) {
					typeAttr.setValue("cccccccccccccccc");
					resultElement.setText("zzzzzzzzzzzzzzzzz");
				}
			}
		}
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileWriter("abc.xml"), format);
		writer.write(document);
		writer.close();
	}

}
