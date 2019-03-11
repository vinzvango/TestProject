package phiggyBank.landing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LandingHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingHome frame = new LandingHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LandingHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel topHeaderPane = new JPanel();
		topHeaderPane.setBounds(0, 0, 784, 32);
		contentPane.add(topHeaderPane);
		topHeaderPane.setBackground(SystemColor.controlHighlight);
		topHeaderPane.setLayout(null);
		
		JLabel label = new JLabel("2019/03/09");
		label.setBounds(718, 11, 56, 14);
		topHeaderPane.add(label);
		
		JPanel trailPane = new JPanel();
		trailPane.setBounds(0, 529, 784, 32);
		contentPane.add(trailPane);
		trailPane.setBackground(new Color(0, 0, 128));
		trailPane.setLayout(null);
		
		JLabel label_1 = new JLabel("Version 0.1");
		label_1.setBounds(705, 11, 69, 14);
		label_1.setForeground(Color.WHITE);
		trailPane.add(label_1);
		
		JPanel centerPane = new JPanel();
		centerPane.setBounds(0, 33, 784, 496);
		contentPane.add(centerPane);
		centerPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 331, 474);
		centerPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCif = new JButton("CIF");
		btnCif.setBounds(10, 23, 89, 23);
		panel.add(btnCif);
		
		JButton btnLiability = new JButton("Liability");
		btnLiability.setBounds(123, 23, 89, 23);
		panel.add(btnLiability);
		
		JButton btnFacility = new JButton("Facility");
		btnFacility.setBounds(232, 23, 89, 23);
		panel.add(btnFacility);
		
		JButton btnAccnt = new JButton("Loan Booking");
		btnAccnt.setBounds(112, 74, 100, 32);
		panel.add(btnAccnt);
		
		JButton btnDmndsb = new JButton("Loan Booking");
		btnDmndsb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDmndsb.setBounds(112, 139, 100, 32);
		panel.add(btnDmndsb);
		
		JButton btnRollover = new JButton("Rollover");
		btnRollover.setBounds(112, 198, 100, 32);
		panel.add(btnRollover);
		
		JButton btnPymnt = new JButton("Payment");
		btnPymnt.setBounds(112, 261, 100, 32);
		panel.add(btnPymnt);
	}
}
