package phiggyBankLogin;

import java.awt.*;
import java.sql.*;


import javax.swing.*;


public class LoginBehav  extends PhiggyBankDisplay{





	public void LoginClicked(String conUname,String conPword){
		
		
		ConnClass conny = new ConnClass();
		
		
		System.out.println(conUname);
		System.out.println(conPword);
		
		conny.connect();
		conny.loginValidation(conUname,conPword);
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	

}
