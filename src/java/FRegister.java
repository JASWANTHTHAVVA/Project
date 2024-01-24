


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANAND
 */
public class FRegister extends HttpServlet {
    
      public void doPost(HttpServletRequest request, HttpServletResponse response)
                                   throws ServletException,IOException{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			System.out.println("MySQL Connect Example.");
			Connection conn = null;
			String url = "jdbc:mysql://localhost:3306/";
			String dbName = "cds";
			String driver = "com.mysql.cj.jdbc.Driver";
			String userName = "root"; 
			String password = "";

		   String name="";
		   String user="";
                   String pwd="";
                   String email="";
                   String gender="";
                   String state="";
                   String country="";
                    
		   
		   String strQuery= ""; 
                   String str= ""; 
			Statement st=null;
			ResultSet rs=null;
			HttpSession session = request.getSession(true);

			try {
				Class.forName(driver);
			conn = DriverManager.getConnection(url+dbName,userName,password);
				
					name = request.getParameter("username").toString();
					user = request.getParameter("name").toString();
                                        pwd = request.getParameter("password").toString();
                                        email = request.getParameter("mail").toString();
                                        gender = request.getParameter("mobile").toString();
                                        state = request.getParameter("algorithm").toString();
                                        
//                                        char[] nam = name.toCharArray();
//                                        char[] ph = gender.toCharArray();
//                                        char[] pa = email.toCharArray();
//                                        char[] em = country.toCharArray();
//String keey=""+nam[0]+ph[2]+nam[1]+ph[5]+em[1]+em[4]+nam[3]+ph[7]+em[0]+nam[4]+ph[5]+em[2]+pa[3]+pa[2]+pa[1]+pa[0];
//					//npass=k+pass;
//					 
 strQuery="insert into fregister (name,username,password,mail,mobile,algorithm) values('"+user+"','"+name+"','"+pwd+"','"+email+"','"+gender+"','"+state+"')";
System.out.println(strQuery);
st = conn.createStatement();
st.executeUpdate(strQuery);



				RequestDispatcher rd=request.getRequestDispatcher("/FCS.jsp");
						rd.forward(request, response);
						System.out.println("ret-forward");		 
					
				
				System.out.println("Connected to the database");
				

				
//				conn.close();
			System.out.println("Disconnected from database");
				
			} catch (Exception e) {
			e.printStackTrace();
			}
  }
    
}
