package phiggyBankLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import phiggyBank.landing.LandingHome;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class PhiggyBankDisplay extends JFrame {

	
	private JPanel mainPane;
	public JTextField txtUname;
	public JPasswordField txtPword;
	public String conUname;
	public String conPword;


	public PhiggyBankDisplay() {
		SysReminders sysRem = new SysReminders();		
		setTitle(sysRem.Title);
		//Getting the Look and Feel of Designer
		try {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch(Exception e) {
			  System.out.println("Error setting native LAF: " + e);
			}
//WINDOW		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);
		setLocationRelativeTo(null);
//WINDOW END
		
		
		


		
		
//OBJECTS		
		JPanel topHeaderPane = new JPanel();
		topHeaderPane.setBackground(SystemColor.controlHighlight);
		topHeaderPane.setBounds(0, 0, 784, 32);
		mainPane.add(topHeaderPane);
		topHeaderPane.setLayout(null);
		
		JLabel lblSystemDate = new JLabel(sysRem.varSystemDate);
		lblSystemDate.setBounds(718, 11, 56, 14);
		topHeaderPane.add(lblSystemDate);
		
		JPanel trailPane = new JPanel();
		trailPane.setBackground(new Color(0, 0, 128));
		trailPane.setBounds(0, 529, 784, 32);
		mainPane.add(trailPane);
		trailPane.setLayout(null);
		
		JLabel lblVersion = new JLabel(sysRem.valVersion);
		lblVersion.setBounds(705, 11, 69, 14);
		lblVersion.setForeground(Color.WHITE);
		trailPane.add(lblVersion);
		
		JPanel centerPane = new JPanel();
		centerPane.setBounds(0, 33, 784, 496);
		mainPane.add(centerPane);
		centerPane.setLayout(null);
		
		JPanel loginPane = new JPanel();
		loginPane.setBackground(SystemColor.controlHighlight);
		loginPane.setBounds(243, 99, 260, 263);
		centerPane.add(loginPane);
		loginPane.setLayout(null);
		
		txtUname = new JTextField();
		txtUname.setBounds(108, 83, 86, 20);
		loginPane.add(txtUname);
		txtUname.setColumns(10);
		
		txtPword = new JPasswordField();
		txtPword.setBounds(108, 114, 86, 20);
		loginPane.add(txtPword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(50, 86, 48, 14);
		loginPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(52, 117, 46, 14);
		loginPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(txtUname.getText());
					getUname();
					System.out.println(conUname);
					LoginBehav loginBehav = new LoginBehav();
					loginBehav.LoginClicked(conUname,conPword);
					
					}
					});
		
		
		btnLogin.setBounds(91, 163, 89, 23);
		loginPane.add(btnLogin);
	}
//Uname and Pword Getter	
public void getUname(){
	conUname = txtUname.getText();
	conPword = txtPword.getText();
}
	












}
