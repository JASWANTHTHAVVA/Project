


import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
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
public class IBEDecrypt extends HttpServlet {
    
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
				
					name = request.getParameter("fname").toString();
                                        gender = request.getParameter("users").toString();
					user = request.getParameter("keey").toString();
                                        country = request.getParameter("algo").toString();
					//npass=k+pass;
					 System.out.println("algorithm"+ country);
             strQuery="select * from ibeuploads where fname='"+name+"' ";
					 System.out.println(strQuery);
					
					 st = DBconnect.getConnection().createStatement();
					rs = st.executeQuery(strQuery);
					while(rs.next())
                                        {
                                      email=rs.getString("idata");
					 pwd=rs.getString("ikey");
                                         System.out.println("u2");
                                       // System.out.println(p2);
                                        }
                                       if(country.equalsIgnoreCase("ibe")){
                                        IBEenc en=new IBEenc();
                                        state=en.decrypt(email,pwd);
                                        
                                        System.out.println(state);
                                        
                                       request.setAttribute("dataa",state);
                                       RequestDispatcher rd=request.getRequestDispatcher("/IBEDecrypt.jsp");
						rd.forward(request, response);
						System.out.println("ret-forward");
                                       }
                                        if(country.equalsIgnoreCase("hash")){
                                        String desenc = des(email);
                                        
                                        System.out.println(state);
                                        
                                       request.setAttribute("dataa",desenc);
                                       RequestDispatcher rd=request.getRequestDispatcher("/IBEDecrypt.jsp");
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
    private static Cipher ecipher;
  private static Cipher dcipher;
  private static SecretKey key;
  String encrypted;
  String decrypted;
  private String des(String ptext) throws NoSuchPaddingException,
  InvalidKeyException {
    long start = System.nanoTime();
    try {
      String encodedKey = "taJFubMpGvQ=";
      key = KeyGenerator.getInstance("DES").generateKey();
  byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
    SecretKey originalKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "DES");
      ecipher = Cipher.getInstance("DES");
      dcipher = Cipher.getInstance("DES");

      // initialize the ciphers with the given key

      ecipher.init(Cipher.ENCRYPT_MODE, originalKey);

      dcipher.init(Cipher.DECRYPT_MODE, originalKey);

      encrypted = enc(ptext);

      decrypted = dec(ptext);
      System.out.println("encrypted DES data"+encrypted);
      
    }
    
    catch(NoSuchAlgorithmException e) {
      return null;
      
    }
    long stop = System.nanoTime();
    long ss = stop - start;
      double elapsedTimeInSecond = (double) ss / 1_000_000_000;

        System.out.println(elapsedTimeInSecond + " seconds");

        // TimeUnit
        long convert = TimeUnit.SECONDS.convert(ss, TimeUnit.NANOSECONDS);
        long durationInMs = TimeUnit.NANOSECONDS.toMillis(ss);
        System.out.println(convert + " seconds");
        System.out.println(durationInMs + " Milliseconds");
    return new String(decrypted);
  }
  private String enc(String str) {

    try {

      byte[] utf8 = str.getBytes("UTF8");

      byte[] enc = ecipher.doFinal(utf8);

      enc = BASE64EncoderStream.encode(enc);
System.out.println("CHEKCING ENC FORMATE"+enc);
      return new String(enc);

    }

    catch(Exception e) {

      e.printStackTrace();

    }

    return null;
  }

  private String dec(String str) {
    
    try {


      byte[] dec = BASE64DecoderStream.decode(str.getBytes());

      byte[] utf8 = dcipher.doFinal(dec);

      // create new string based on the specified charset

      return new String(utf8, "UTF8");

    }

    catch(Exception e) {

      e.printStackTrace();

    }

    return null;
  } 
}
