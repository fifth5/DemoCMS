package com.democms.controller.test;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


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
