package MainClass;






import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistryBuilder;

import com.BankSystem.Models.Account;
import com.BankSystem.Models.Employee;
import com.BankSystem.Models.User;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		
		
		Configuration con = new Configuration().configure("./hibernate.cfg.xml").addAnnotatedClass(Account.class).addAnnotatedClass(Employee.class);
		
		
		
		ServiceRegistry rg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(rg);
		
		Session session1 =  sf.openSession();
		
		Transaction tx =  session1.beginTransaction();
		
		
		User u = new User(101,"Prdeep sAhu","Delhi",21,"Official.pradeepsahu@gmail.com",95993696);
		
		Account ac = new Account();
		ac.setAccountNumber(101191);
		ac.setUser(u);
		ac.setEmail("wrong");
		ac.setPhoneNumber(1900);
	
//		ac.setBalance(1000.00);
		
		
		session1.save(ac);
		tx.commit();
		session1.close();
		
		
		
	
		
	}

}
