package com.mymvc.www.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ActionMappingManager {

	public static Map<String, ActionMapping> processXML(String configFile) {
		Map<String, ActionMapping> actionMappingMap = new HashMap<>();
		try {
			String[] configFileArray = configFile.split("\\,");
			for (int i = 0; i < configFileArray.length; i++) {
				String eachConfigFile = configFileArray[i];
				SAXReader reader = new SAXReader();
				Document document = reader.read(ActionMappingManager.class.getResourceAsStream("/" + eachConfigFile));
				Element actionsElement = document.getRootElement();
				List<Element> actionList = actionsElement.elements("action");
				for (int j = 0; j < actionList.size(); j++) {
					Element actionElement = actionList.get(j);

					ActionMapping actionMapping = new ActionMapping();

					String actionName = actionElement.attributeValue("name");
					String actionClass = actionElement.attributeValue("class");

					actionMapping.setActionName(actionName);
					actionMapping.setActionClass(actionClass);

					List<Element> resultList = actionElement.elements("result");
					for (int k = 0; k < resultList.size(); k++) {
						Element resultElement = resultList.get(k);

						ResultMapping resultMapping = new ResultMapping();
						String resultName = resultElement.attributeValue("name");
						String resultPath = resultElement.getTextTrim();
						resultMapping.setResultName(resultName);
						resultMapping.setResultPath(resultPath);

						Attribute typeAttr = resultElement.attribute("type");
						if (typeAttr != null) {
							String resultType = resultElement.attributeValue("type");
							if (resultType.equals("redirectAction")) {
								resultMapping.setRedirectAction(true);
							}
						}
						actionMapping.getResultMappingMap().put(resultName, resultMapping);
					}
					actionMappingMap.put(actionName, actionMapping);
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return actionMappingMap;
	}
}
