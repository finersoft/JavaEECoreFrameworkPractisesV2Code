package datasourcefactory;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;

import com.zaxxer.hikari.HikariDataSource;

public class MyDataSourceFactory implements DataSourceFactory {

	private Properties prop;

	@Override
	public DataSource getDataSource() {
		HikariDataSource ds = new HikariDataSource();

		ds.setDriverClassName(prop.getProperty("a"));
		ds.setUsername(prop.getProperty("b"));
		ds.setPassword(prop.getProperty("c"));
		ds.setJdbcUrl(prop.getProperty("d"));

		ds.setMaximumPoolSize(10);
		ds.setMinimumIdle(10);

		return ds;
	}

	@Override
	public void setProperties(Properties arg0) {
		prop = arg0;
	}

}
