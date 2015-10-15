package com.democms.wallet.democontroller;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.democms.model.po.TUser;
//import com.democms.util.PersistenceTool;

import java.io.IOException;
import java.sql.Connection;


/**
 * Servlet implementation class ProxoolServlet
 */
@WebServlet("/ProxoolServlet")
public class ProxoolServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
       

	
    public ProxoolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection connection = null;
		try {
			System.out.println("new test start>>>>>>>>>>>>>>>");
		   		
			//使用proxool连接池
			/** 
			 * java代码初始化
			 */
			//Class.forName("org.logicalcobwebs.proxool.ProxoolDriver");//数据库的驱动 org.logicalcobwebs.proxool.ProxoolDriver
			//connection = DriverManager.getConnection("proxool.alias:com.mysql.jdbc.Driver:jdbc:mysql://127.0.0.1:3306/demodb","demo","password");
			/**
			 * 配置文件中初始化
			 */
			//connection = DriverManager.getConnection("proxool.demodb");
	
			
			//spring容器中获取连接池的bean
			/**
			 * 推荐方法：spring注入datasource
			 *
			ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());  
			DataSource dataSource = (DataSource)applicationContext.getBean("dataSource");
			connection = dataSource.getConnection();
			
			
			PreparedStatement p = connection.prepareStatement(" select * from t_user ");
			ResultSet set = p.executeQuery();
			while(set.next()){
				System.out.println("this result" +set.getRow()  + " : " + set.getString(2));
			}
			set.close();
			connection.close();
			 */
			
		    /***
	        //使用注解  // hibernate query
	         * 
	         */
			//Configuration config = new Configuration().configure("/config/hibernate/hibernate_jdbc.xml"); //jdbc 连接
			//Configuration config = new Configuration().configure("/config/hibernate/hibernate_proxool.xml"); //连接池连接
			//ServiceRegistry  sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			//SessionFactory sf = config.buildSessionFactory(sr);
		
			//ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());  
			//SessionFactory sf = (SessionFactory)applicationContext.getBean("sessionFactory");
			//Session session = sf.openSession();
			
			//Transaction tx = session.beginTransaction();
			//save
			//	TUser user = new TUser();
			//	user.setId("aaa");
			//	session.save(user);	
			//query
			//TUser o = (TUser)session.get(TUser.class, "a0c2edf7-9a2b-11e4-9ca2-8c89a5ecb19c");
			//System.out.println("hibernate query result:username:>>>>>>>>>>>>>>"+o.getUsername());
			//tx.commit();
			//session.close();
			//sf=null;
			
			//System.out.println("end hibernate");  
			

			/**
			 * 使用jpa配置 配置文件:META-INF/persistence.xml        
			 */
			//EntityManagerFactory factory =  Persistence.createEntityManagerFactory("demodb"); 
			ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());  
			EntityManagerFactory factory = (EntityManagerFactory)applicationContext.getBean("entityManagerFactory");
			 
	        EntityManager em = factory.createEntityManager();//在Tool初始化 sessionfactory 测试用
	        TUser person = em.find(TUser.class,"a0c2edf7-9a2b-11e4-9ca2-8c89a5ecb19c"); //类似于hibernate的get方法,没找到数据时，返回null  
	        System.out.println(person.getUsername());  
	        em.close();  
	        //factory.close(); 
			System.out.println("end jpa"); 
			
			

			System.out.println("new test end>>>>>>>>>>>>>>>");
			
		} catch (Exception e) {	
			e.printStackTrace();
		} finally{
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
