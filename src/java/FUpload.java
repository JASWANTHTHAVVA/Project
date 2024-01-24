


import com.oreilly.servlet.MultipartRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
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
public class FUpload extends HttpServlet {
     File file;
  final String filepath = "D:\\";
  public String ptext;
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
				
//					name = request.getParameter("fname").toString();
//					user = request.getParameter("file").toString();
//                                        
//                                        state = request.getParameter("algorithm").toString();
                                        name="aes";
                                       String name1="fcs";
                                      
                                        System.out.println(name);
                                        System.out.println(user);
                                        System.out.println(state);
        MultipartRequest m = new MultipartRequest(request, filepath);
      File file = m.getFile("file");
      String filename = file.getName().toLowerCase();
      BufferedReader br = new BufferedReader(new FileReader(filepath + filename));
      StringBuffer sb = new StringBuffer();
      String temp = null;

      while ((temp = br.readLine()) != null) {
        sb.append(temp);
      }
      ptext = sb.toString();
System.out.println(ptext);
 String keys="thiskeyisUSEDforEncryption";
 String keys1="LEfvbgTfDCrBhySeCF%^NMJAS";
 if(name.equalsIgnoreCase("aes")){
                                   long start = System.nanoTime();
                                       AESenc en=new AESenc();
                                       country=en.encrypt(ptext,keys);
                                       email = en.encrypt(ptext,keys1);
                                       long stop = System.nanoTime();
                                     long ss = stop - start;
                                double elapsedTimeInSecond = (double) ss / 1_000_000_000;
                                 long convert = TimeUnit.SECONDS.convert(ss, TimeUnit.NANOSECONDS);
                                 long durationInMs = TimeUnit.NANOSECONDS.toMillis(ss);
                                       strQuery="insert into fupload (fname,content,file_key,algorithm) values('"+filename+"','"+country+"','"+keys+"','"+name+"')";
                                    System.out.println(strQuery);
                                    st = conn.createStatement();
                                    st.executeUpdate(strQuery);
                        String sql = "UPDATE graph " +
            "SET yaxis = '"+elapsedTimeInSecond+"' WHERE id =4";
         st.executeUpdate(sql);
              strQuery="insert into fupload (fname,content,file_key,algorithm) values('"+filename+"','"+email+"','"+keys1+"','"+name1+"')";
                                    System.out.println(strQuery);
                                    st = conn.createStatement();
                                    st.executeUpdate(strQuery);
                        String sql1 = "UPDATE graph " +
            "SET xaxis = '"+elapsedTimeInSecond+"' WHERE id =4";
         st.executeUpdate(sql);
         RequestDispatcher rd=request.getRequestDispatcher("/fupload.jsp");
						rd.forward(request, response);
						System.out.println("ret-forward");
                               }
				
				
				System.out.println("Connected to the database");
				

				
//				conn.close();
			System.out.println("Disconnected from database");
				
			} catch (Exception e) {
			e.printStackTrace();
			}
  }
    
}
