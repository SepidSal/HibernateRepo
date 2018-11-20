import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainTest {

	public static void main(String[] args) {

		Member member = new Member();
		
		member.setId(1);
		member.setName("Sepideh");
		member.setFamily("Saljooghi");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx  = session.beginTransaction();
		
		session.save(member);
		tx.commit();
		session.close();

	}

}
