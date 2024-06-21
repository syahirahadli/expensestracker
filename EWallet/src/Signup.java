import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

public class Signup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelLeft;
	private JPanel panelRight;
	private JLabel Logo;
	private JLabel lblSignupTitle;
	private JLabel lblUsername;
	private JTextField txtUsername;
	private JLabel lblPassword;
	private JTextField txtPassword;
	private JButton btnSignup;
	private JLabel lblSignup;
	private JButton btnLogin;
	private JLabel lblFullname;
	private JTextField txtFullname;
	private JLabel lblConfirmPassword;
	private JPasswordField txtConfirmPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setTitle("Sign Up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelLeft = new JPanel();
		panelLeft.setBounds(0, 0, 340, 501);
		contentPane.add(panelLeft);
		panelLeft.setLayout(null);
		
		Logo = new JLabel("");
		Logo.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EWallet\\resources\\LogoEdited.png"));
		Logo.setBounds(0, 0, 340, 501);
		panelLeft.add(Logo);
		
		panelRight = new JPanel();
		panelRight.setBounds(336, 0, 331, 501);
		contentPane.add(panelRight);
		panelRight.setLayout(null);
		
		lblSignupTitle = new JLabel("Sign Up");
		lblSignupTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignupTitle.setForeground(new Color(50, 102, 102));
		lblSignupTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblSignupTitle.setBounds(114, 44, 108, 41);
		panelRight.add(lblSignupTitle);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblUsername.setBounds(36, 167, 96, 14);
		panelRight.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(36, 192, 250, 20);
		panelRight.add(txtUsername);
		txtUsername.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblPassword.setBounds(36, 223, 96, 14);
		panelRight.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(36, 248, 250, 20);
		panelRight.add(txtPassword);
		txtPassword.setColumns(10);
		
		btnSignup = new JButton("Sign Up");
		btnSignup.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					FileOutputStream file = new FileOutputStream("data.txt");
					PrintWriter buffer = new PrintWriter(file);
					
					buffer.println("Full name: " + txtFullname.getText());
					buffer.println("Username:" + txtUsername.getText());
					if (txtPassword.getText().equals(txtConfirmPassword.getText())) {
						buffer.println("Password:" + txtPassword.getText());
					}
					
					buffer.close();
					file.close();
					JOptionPane.showMessageDialog(Signup.this, "Registration Completed! Thank you.");
					
					Login loginFrame = new Login();
					loginFrame.setVisible(true);
					dispose();  // Close the sign-up frame
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSignup.setBackground(new Color(51, 153, 153));
		btnSignup.setBounds(36, 336, 89, 23);
		panelRight.add(btnSignup);
		
		lblSignup = new JLabel("I have account");
		lblSignup.setBounds(36, 382, 132, 14);
		panelRight.add(lblSignup);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login loginFrame = new Login();
                loginFrame.setVisible(true);
                dispose();  // Close the sign-up frame
			}
		});
		btnLogin.setBounds(197, 378, 89, 23);
		panelRight.add(btnLogin);
		
		lblFullname = new JLabel("Full Name");
		lblFullname.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblFullname.setBounds(36, 111, 96, 14);
		panelRight.add(lblFullname);
		
		txtFullname = new JTextField();
		txtFullname.setBounds(36, 136, 250, 20);
		panelRight.add(txtFullname);
		txtFullname.setColumns(10);
		
		lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblConfirmPassword.setBounds(36, 279, 132, 14);
		panelRight.add(lblConfirmPassword);
		
		txtConfirmPassword = new JPasswordField();
		txtConfirmPassword.setBounds(36, 304, 250, 20);
		panelRight.add(txtConfirmPassword);
	}
}
