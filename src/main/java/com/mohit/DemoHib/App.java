package com.mohit.DemoHib;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	UserName name = new UserName();
    	name.setFirstName("Mohit");
    	name.setMiddleName("Dilip");
    	name.setLastName("Chhapru");
    	
    	User mohit = new User();
		
		mohit.setuNum(20); 
		mohit.setName(name); 
		mohit.setAge(29);
		
    	Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);    	
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	session.save(mohit);
    	
    	mohit = (User) session.get(User.class, 20);
    	    	
    	tx.commit();
    	    
    }
}
