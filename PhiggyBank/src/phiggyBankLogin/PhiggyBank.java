package phiggyBankLogin;

import java.awt.EventQueue;

public class PhiggyBank {

	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhiggyBankDisplay frame = new PhiggyBankDisplay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		

	}

}
