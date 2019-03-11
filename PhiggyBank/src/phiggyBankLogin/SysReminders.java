package phiggyBankLogin;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SysReminders {

	String varSystemDate;
	String valVersion;
	String Title;
	public SysReminders(){
		
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
		
		
		varSystemDate = timeStamp; //TimeStamp
		valVersion = "Version 0.1"; //Versioning
		Title  = "Phiggy Bank"; //Bank Name
		
		
		
		
		
		
	}
}
