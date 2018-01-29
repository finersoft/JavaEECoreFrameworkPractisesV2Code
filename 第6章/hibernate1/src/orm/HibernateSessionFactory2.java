package orm;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory2 {
	// 0.1�汾
	// new�汾
	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration();
		config.configure("hibernateABCABC.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		return factory;
	}
}

// (1)hibernate��3.0(����3.0)�汾֮ǰʹ��3�д����ù���
// (2)hibernate��4.0ʹ��3�д����ù���ʱ
// ʹ��buildSessionhFactory()�����ڴ˰汾�б�����
// (3)����Ҫʹ�úܶ�������ù��������ʹ��Hibernate����ԱAPI���ڸ���
// (4)�ٷ��յ����������°汾��jar��֧�־ɰ汾3�е�д��
