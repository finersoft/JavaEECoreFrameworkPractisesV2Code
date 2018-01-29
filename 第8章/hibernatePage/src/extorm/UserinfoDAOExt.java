package extorm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import dto.PageEntity;
import orm.BaseHibernateDAO;
import orm.HibernateSessionFactory;
import utils.DBUtils;

public class UserinfoDAOExt extends BaseHibernateDAO {

	public PageEntity getUserinfoPageData(String username, String password, long beginAge, long endAge, Date beginDate,
			Date endDate, int gotoPage, int pageSize) {
		PageEntity pageEntity = new PageEntity();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		long beginPosition = (gotoPage - 1) * pageSize;

		String whereSQL = " where 1=1 ";
		String orderSQL = " order by id asc ";

		Map queryDBParamMap = new HashMap();
		Map queryUIParamMap = new HashMap();
		if (username != null && !"".equals(username)) {
			whereSQL = whereSQL + " and username like :username";
			queryDBParamMap.put("username", "%" + username + "%");
			queryUIParamMap.put("username", username);
		}
		if (password != null && !"".equals(password)) {
			whereSQL = whereSQL + " and password like :password";
			queryDBParamMap.put("password", "%" + password + "%");
			queryUIParamMap.put("password", password);
		}
		if (beginAge != -1) {
			whereSQL = whereSQL + " and age >= :beginAge";
			queryDBParamMap.put("beginAge", beginAge);
			queryUIParamMap.put("beginAge", beginAge);
		}
		if (endAge != -1) {
			whereSQL = whereSQL + " and age <= :endAge";
			queryDBParamMap.put("endAge", endAge);
			queryUIParamMap.put("endAge", endAge);
		}
		if (beginDate != null) {
			whereSQL = whereSQL + " and insertdate >= :beginDate";
			queryDBParamMap.put("beginDate", beginDate);
			queryUIParamMap.put("beginDate", format.format(beginDate));
		}
		if (endDate != null) {
			whereSQL = whereSQL + " and insertdate <= :endDate";
			queryDBParamMap.put("endDate", endDate);
			queryUIParamMap.put("endDate", format.format(endDate));
		}

		System.out.println(whereSQL);
		String selectPageListSQL = "from Userinfo ";
		String selectCountSQL = "select count(*) from Userinfo ";

		selectPageListSQL = selectPageListSQL + " " + whereSQL + " " + orderSQL;
		selectCountSQL = selectCountSQL + " " + whereSQL;

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction().begin();
		Query query = session.createQuery(selectPageListSQL);
		query = DBUtils.setQueryParam(query, queryDBParamMap);
		query.setFirstResult((int) beginPosition);
		query.setMaxResults(pageSize);
		List pageDataList = query.list();

		query = session.createQuery(selectCountSQL);
		query = DBUtils.setQueryParam(query, queryDBParamMap);
		long recordCount = Integer.parseInt(query.list().get(0).toString());
		long pageCount = 1;
		if (recordCount % pageSize != 0) {
			pageCount = recordCount / pageSize + 1;
		} else {
			pageCount = recordCount / pageSize;
		}
		List pageNumList = new ArrayList();
		for (int i = 0; i < pageCount; i++) {
			pageNumList.add(i + 1);
		}

		Map gotoPageMap = new HashMap();
		gotoPageMap.put("first", 1);
		gotoPageMap.put("last", pageCount);

		if (gotoPage - 1 <= 0) {
			gotoPageMap.put("prev", 1);
		} else {
			gotoPageMap.put("prev", gotoPage - 1);
		}

		if (gotoPage + 1 > pageCount) {
			gotoPageMap.put("next", pageCount);
		} else {
			gotoPageMap.put("next", gotoPage + 1);
		}

		gotoPageMap.put("pageNumList", pageNumList);

		session.getTransaction().commit();
		session.close();

		pageEntity.setPageDataList(pageDataList);
		pageEntity.setQueryUIParamMap(queryUIParamMap);
		pageEntity.setGotoPageMap(gotoPageMap);

		return pageEntity;
	}

}