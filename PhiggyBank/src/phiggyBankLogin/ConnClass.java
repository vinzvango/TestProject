package phiggyBankLogin;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ConnClass  {
private String conUname;
private String conPword;

protected  void connect() {
	//Connection
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	}
	
	catch(Exception e) {
	System.out.println(e);;

	}
}

public void loginValidation(String conUname,String conPword){
	
	//Login Query
	try {
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/maindb","root","password");
	Statement stmt = con.createStatement();
	String sqlLogin="Select * FROM maindb.sttm_users WHERE userId='"+conUname+"' and " + "pword = '"+conPword+"'";
	
	ResultSet rs = stmt.executeQuery(sqlLogin);
		if (rs.next())
		{
			JOptionPane.showMessageDialog(null, "ACCESS GRANTED");
		}
		else

			JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
			con.close();
				}
	
				catch(Exception e) {
				System.out.println(e);;
		
				}
				}

}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	

