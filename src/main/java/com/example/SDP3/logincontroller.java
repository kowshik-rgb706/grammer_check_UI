package com.example.SDP3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class logincontroller {

	@RequestMapping("login")
	public void logincheck(HttpServletRequest request) {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try{
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsd","root","root");
		    Statement st=conn.createStatement();
		    ResultSet rs = st.executeQuery("select password from register where email ='"+email+"'" );
		    while(rs.next()) {
		    	if(rs.getString(1).equals(password)) {
		    		System.out.println("success");
		    	
		    	}
		    	else {
		    		System.out.println("failed");
		    	}
		    }
		   
		}
		catch(Exception e){
		   System.out.println(e);
		}
		
		
		
	}
}
