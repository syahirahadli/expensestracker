import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelLeft;
	private JPanel panelRight;
	private JLabel Logo;
	private JLabel lblLogin;
	private JLabel lblUsername;
	private JTextField txtUsername;
	private JLabel lblPassword;
	private JTextField txtPassword;
	private JButton btnLogin;
	private JLabel lblSignup;
	private JButton btnSignup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
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
		
		lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(new Color(50, 102, 102));
		lblLogin.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblLogin.setBounds(137, 55, 89, 41);
		panelRight.add(lblLogin);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblUsername.setBounds(36, 152, 96, 14);
		panelRight.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(36, 177, 250, 20);
		panelRight.add(txtUsername);
		txtUsername.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblPassword.setBounds(36, 208, 96, 14);
		panelRight.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(36, 233, 250, 20);
		panelRight.add(txtPassword);
		txtPassword.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = "";
				String password = "";
				FileInputStream file;
				try {
					file = new FileInputStream("data.txt");
					Scanner buffer = new Scanner(file);
					String line = new String();
					
					while (buffer.hasNext()) {
						line = buffer.nextLine();
						String [] tokens = line.split(":");
						if (tokens[0].equals("Username")) {
							username = tokens[1];
						} else if (tokens[0].equals("Password")) {
							password = tokens[1];
						}
					}
					
					if (txtUsername.getText().equals(username) && txtPassword.getText().equals(password)) {
						Dashboard dashboardFrame = new Dashboard();
						dashboardFrame.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(Login.this, "Username or password is incorrect", "Login Error", JOptionPane.ERROR_MESSAGE);
					}
					
					file.close();
					buffer.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setBackground(new Color(51, 153, 153));
		btnLogin.setBounds(36, 274, 89, 23);
		panelRight.add(btnLogin);
		
		lblSignup = new JLabel("I don't have account");
		lblSignup.setBounds(36, 382, 132, 14);
		panelRight.add(lblSignup);
		
		btnSignup = new JButton("Sign Up");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Signup signupFrame = new Signup();
                signupFrame.setVisible(true);
                dispose();  // Close the login frame

			}
		});
		btnSignup.setBounds(197, 378, 89, 23);
		panelRight.add(btnSignup);
	}
}
