import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Member;



public class MainTest {

	public static void main(String[] args) {

		Member member = new Member();
		
		member.setId(3);
		member.setName("Hasan");
		member.setFamily("Hasani");
		
		SessionFactory sf = new Configuration().configure("/config/ProjectConfig.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx  = session.beginTransaction();
		
		session.save(member);
		tx.commit();
		session.close();

	}

}
