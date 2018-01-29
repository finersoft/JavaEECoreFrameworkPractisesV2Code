package struts2_xml;

import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Create {

	public static void main(String[] args) throws DocumentException, IOException {
		Document document = DocumentHelper.createDocument();
		Element mymvcElement = document.addElement("mymvc");
		Element actionsElement = mymvcElement.addElement("actions");

		Element listElement = actionsElement.addElement("action");
		listElement.addAttribute("name", "list");
		listElement.addAttribute("class", "controller.List");

		Element toListJSPElement = listElement.addElement("result");
		toListJSPElement.addAttribute("name", "toListJSP");
		toListJSPElement.setText("/list.jsp");
		Element toShowUserinfoListElement = listElement.addElement("result");
		toShowUserinfoListElement.addAttribute("name", "toShowUserinfoList");
		toShowUserinfoListElement.addAttribute("type", "redirect");
		toShowUserinfoListElement.setText("showUserinfoList.ghy");

		Element showUserinfoListElement = actionsElement.addElement("action");
		showUserinfoListElement.addAttribute("name", "showUserinfoList");
		showUserinfoListElement.addAttribute("class", "controller.ShowUserinfoList");

		Element toShowUserinfoListJSPElement = showUserinfoListElement.addElement("result");
		toShowUserinfoListJSPElement.addAttribute("name", "toShowUserinfoListJSP");
		toShowUserinfoListJSPElement.setText("/showUserinfoList.jsp");

		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileWriter("abc.xml"), format);
		writer.write(document);
		writer.close();

	}

}
