package com.example.SDP3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class post {
	
	@RequestMapping("post")
	 public void registerpage(HttpServletRequest request,HttpServletResponse res) throws IOException 
	{
		
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		



		try{
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsd","root","root");
		    Statement st=conn.createStatement();
		    st.executeUpdate(" insert into register values('"+username+"','"+password+"','"+email+"')");
		    
		}
		catch(Exception e){
		   System.out.println(e);
		}
		res.sendRedirect("login.html");
		
		
		
		
		
		
	  
	
	}

}