package dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageEntity {

	private Map queryUIParamMap = new HashMap();
	private List pageDataList = new ArrayList();
	private Map gotoPageMap = new HashMap();

	public Map getQueryUIParamMap() {
		return queryUIParamMap;
	}

	public void setQueryUIParamMap(Map queryUIParamMap) {
		this.queryUIParamMap = queryUIParamMap;
	}

	public List getPageDataList() {
		return pageDataList;
	}

	public void setPageDataList(List pageDataList) {
		this.pageDataList = pageDataList;
	}

	public Map getGotoPageMap() {
		return gotoPageMap;
	}

	public void setGotoPageMap(Map gotoPageMap) {
		this.gotoPageMap = gotoPageMap;
	}

}
