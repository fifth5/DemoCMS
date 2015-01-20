package com.democms.controller.test;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.democms.model.po.TUser;
import com.democms.util.Tool;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Servlet implementation class ProxoolServlet
 */
@WebServlet("/ProxoolServlet")
public class ProxoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ProxoolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connection = null;
		try {
			/**
			//Class.forName("org.logicalcobwebs.proxool.ProxoolDriver");//数据库的驱动 org.logicalcobwebs.proxool.ProxoolDriver
			//connection = DriverManager.getConnection("proxool.alias:com.mysql.jdbc.Driver:jdbc:mysql://127.0.0.1:3306/demodb","demo","password");
			connection = DriverManager.getConnection("proxool.demodb");
			PreparedStatement p = connection.prepareStatement(" select * from t_user ");
			ResultSet set = p.executeQuery();
			while(set.next()){
				System.out.println(set.getString(2));
			}
			set.close();
			connection.close();
			//end proxool
			 * 
			 */
			
			
			
		    /***
	        //使用注解  // hibernate query
			//Configuration config = new Configuration().configure("/config/hibernate/hibernate_jdbc.xml"); //jdbc 连接
			Configuration config = new Configuration().configure("/config/hibernate/hibernate_proxool.xml"); //连接池连接
			ServiceRegistry  sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();           	
			SessionFactory sf = config.buildSessionFactory(sr);  			 
			Session session = sf.openSession();  
			//Transaction tx = session.beginTransaction();
			//save
			//	TUser user = new TUser();
			//	user.setId("aaa");
			//	session.save(user);	
			//query
			TUser o = (TUser)session.get(TUser.class, "a0c2edf7-9a2b-11e4-9ca2-8c89a5ecb19c");
			System.out.println("hibernate query result:username:>>>>>>>>>>>>>>"+o.getUsername());
			//tx.commit();
			session.close();  
			System.out.println("end hibernate");  
			**/

			//jpa demo
	        
	        EntityManager em = Tool.factory.createEntityManager();  
	        TUser person = em.find(TUser.class,"a0c2edf7-9a2b-11e4-9ca2-8c89a5ecb19c"); //类似于hibernate的get方法,没找到数据时，返回null  
	        System.out.println(person.getUsername());  
	        em.close();  
	        //factory.close();  
			System.out.println("end jpa");  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("proxool servlet");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
