import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import org.jdesktop.swingx.JXDatePicker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel1;
	private JPanel panelCash;
	private JScrollPane scrollPane;
	private JPanel panelExpenses;
	private JPanel panelBalance;
	private JPanel panelShopping;
	private JPanel panelFoodDrinks;
	private JPanel panelUtilities;
	private JPanel panelOthers;
	private JMenuBar menuBar;
	private JMenu menuLogout;
	private JMenuItem menuItem;
	private JTable transactionTable;
	private JLabel lblTransactions;
	private JLabel lblAddCash;
	private JLabel lblCashLabel;
	private JTextField txtCashLabel;
	private JLabel lblCashSum;
	private JTextField txtCashSum;
	private JButton btnCashSubmit;
	private JLabel lblAddExpenses;
	private JLabel lblExpensesLabel;
	private JTextField txtExpensesLabel;
	private JLabel lblExpensesSum;
	private JTextField txtExpensesSum;
	private JLabel lblExpensesCategory;
	private JRadioButton rdbtnShopping;
	private JRadioButton rdbtnFoodDrinks;
	private JRadioButton rdbtnUtilities;
	private JRadioButton rdbtnOthers;
	private JButton btnExpensesSubmit;
	private JLabel lblBalance;
	private JLabel lblKRW;
	private JLabel lblUpdatedBalance;
	private JLabel lblShoppingKRW;
	private JLabel lblFoodDrinksKRW;
	private JLabel lblUtilitiesKRW;
	private JLabel lblOthersKRW;
	private JLabel lblShopping;
	private JLabel lblFoodDrinks;
	private JLabel lblUtilities;
	private JLabel lblOthers;
	private JLabel shoppingIcon;
	private JLabel foodIcon;
	private JLabel houseIcon;
	private JLabel othersIcon;
	private JLabel balanceIcon;
	private JLabel shoppingSmallIcon;
	private JLabel foodSmallIcon;
	private JLabel houseSmallIcon;
	private JLabel othersSmallIcon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setTitle("Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 531);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(211, 211, 211));
		setJMenuBar(menuBar);
		
		menuItem = new JMenuItem("");
		menuItem.setBackground(new Color(211, 211, 211));
		menuBar.add(menuItem);
		
		menuLogout = new JMenu("Log out");
		menuLogout.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(menuLogout);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setBackground(new Color(211, 211, 211));
		panel1.setBounds(10, 0, 657, 121);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		panelBalance = new JPanel();
		panelBalance.setBackground(new Color(81, 137, 138));
		panelBalance.setBounds(1, 0, 208, 121);
		panel1.add(panelBalance);
		panelBalance.setLayout(null);
		
		lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblBalance.setForeground(new Color(255, 255, 255));
		lblBalance.setBounds(10, 26, 84, 26);
		panelBalance.add(lblBalance);
		
		lblKRW = new JLabel("₩");
		lblKRW.setHorizontalAlignment(SwingConstants.TRAILING);
		lblKRW.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKRW.setForeground(new Color(255, 255, 255));
		lblKRW.setBounds(10, 75, 58, 17);
		panelBalance.add(lblKRW);
		
		lblUpdatedBalance = new JLabel("0");
		lblUpdatedBalance.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUpdatedBalance.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUpdatedBalance.setForeground(new Color(255, 255, 255));
		lblUpdatedBalance.setBounds(137, 63, 48, 33);
		panelBalance.add(lblUpdatedBalance);
		
		balanceIcon = new JLabel("");
		balanceIcon.setForeground(Color.WHITE);
		balanceIcon.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EWallet\\resources\\money_payment_dollar_coins_cash.png"));
		balanceIcon.setBounds(150, 12, 48, 40);
		panelBalance.add(balanceIcon);
		
		panelShopping = new JPanel();
		panelShopping.setBackground(new Color(119, 136, 153));
		panelShopping.setBounds(219, 0, 101, 121);
		panel1.add(panelShopping);
		panelShopping.setLayout(null);
		
		lblShoppingKRW = new JLabel("₩");
		lblShoppingKRW.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblShoppingKRW.setHorizontalAlignment(SwingConstants.CENTER);
		lblShoppingKRW.setForeground(new Color(255, 255, 255));
		lblShoppingKRW.setBounds(26, 11, 48, 14);
		panelShopping.add(lblShoppingKRW);
		
		lblShopping = new JLabel("Shopping");
		lblShopping.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		lblShopping.setHorizontalAlignment(SwingConstants.CENTER);
		lblShopping.setForeground(new Color(255, 255, 255));
		lblShopping.setBounds(10, 38, 80, 20);
		panelShopping.add(lblShopping);
		
		shoppingIcon = new JLabel("");
		shoppingIcon.setBackground(new Color(119, 153, 153));
		shoppingIcon.setBounds(30, 63, 35, 41);
		panelShopping.add(shoppingIcon);
		shoppingIcon.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EWallet\\resources\\shopping_cart icon.png"));
		
		panelFoodDrinks = new JPanel();
		panelFoodDrinks.setBackground(new Color(119, 136, 153));
		panelFoodDrinks.setBounds(329, 0, 101, 121);
		panel1.add(panelFoodDrinks);
		panelFoodDrinks.setLayout(null);
		
		lblFoodDrinksKRW = new JLabel("₩");
		lblFoodDrinksKRW.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFoodDrinksKRW.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoodDrinksKRW.setForeground(new Color(255, 255, 255));
		lblFoodDrinksKRW.setBounds(25, 11, 48, 14);
		panelFoodDrinks.add(lblFoodDrinksKRW);
		
		lblFoodDrinks = new JLabel("Food & Drinks");
		lblFoodDrinks.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		lblFoodDrinks.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoodDrinks.setForeground(new Color(255, 255, 255));
		lblFoodDrinks.setBounds(0, 38, 101, 19);
		panelFoodDrinks.add(lblFoodDrinks);
		
		foodIcon = new JLabel("");
		foodIcon.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EWallet\\resources\\food icon.png"));
		foodIcon.setBounds(30, 68, 35, 31);
		panelFoodDrinks.add(foodIcon);
		
		panelUtilities = new JPanel();
		panelUtilities.setBackground(new Color(119, 136, 153));
		panelUtilities.setBounds(440, 0, 95, 121);
		panel1.add(panelUtilities);
		panelUtilities.setLayout(null);
		
		lblUtilitiesKRW = new JLabel("₩");
		lblUtilitiesKRW.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUtilitiesKRW.setHorizontalAlignment(SwingConstants.CENTER);
		lblUtilitiesKRW.setForeground(new Color(255, 255, 255));
		lblUtilitiesKRW.setBounds(22, 11, 48, 14);
		panelUtilities.add(lblUtilitiesKRW);
		
		lblUtilities = new JLabel("Utilities");
		lblUtilities.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		lblUtilities.setHorizontalAlignment(SwingConstants.CENTER);
		lblUtilities.setForeground(new Color(255, 255, 255));
		lblUtilities.setBounds(10, 38, 75, 20);
		panelUtilities.add(lblUtilities);
		
		houseIcon = new JLabel("");
		houseIcon.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EWallet\\resources\\house icon.png"));
		houseIcon.setBounds(30, 63, 35, 39);
		panelUtilities.add(houseIcon);
		
		panelOthers = new JPanel();
		panelOthers.setBackground(new Color(119, 136, 153));
		panelOthers.setBounds(545, 0, 102, 121);
		panel1.add(panelOthers);
		panelOthers.setLayout(null);
		
		lblOthersKRW = new JLabel("₩");
		lblOthersKRW.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOthersKRW.setHorizontalAlignment(SwingConstants.CENTER);
		lblOthersKRW.setForeground(new Color(255, 255, 255));
		lblOthersKRW.setBounds(26, 11, 48, 14);
		panelOthers.add(lblOthersKRW);
		
		lblOthers = new JLabel("Others");
		lblOthers.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		lblOthers.setHorizontalAlignment(SwingConstants.CENTER);
		lblOthers.setForeground(new Color(255, 255, 255));
		lblOthers.setBounds(10, 38, 82, 20);
		panelOthers.add(lblOthers);
		
		othersIcon = new JLabel("");
		othersIcon.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EWallet\\resources\\Other_section.png"));
		othersIcon.setBounds(33, 63, 35, 36);
		panelOthers.add(othersIcon);
		
		panelCash = new JPanel();
		panelCash.setBackground(new Color(109, 168, 169));
		panelCash.setBounds(446, 132, 221, 137);
		contentPane.add(panelCash);
		panelCash.setLayout(null);
		
		lblAddCash = new JLabel("Add Cash");
		lblAddCash.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblAddCash.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddCash.setBackground(new Color(255, 255, 255));
		lblAddCash.setForeground(new Color(0, 0, 0));
		lblAddCash.setBounds(0, 0, 221, 14);
		panelCash.add(lblAddCash);
		
		lblCashLabel = new JLabel("Label");
		lblCashLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblCashLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCashLabel.setBounds(10, 25, 48, 14);
		panelCash.add(lblCashLabel);
		
		txtCashLabel = new JTextField();
		txtCashLabel.setBounds(68, 22, 143, 20);
		panelCash.add(txtCashLabel);
		txtCashLabel.setColumns(10);
		
		lblCashSum = new JLabel("Sum");
		lblCashSum.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblCashSum.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCashSum.setBounds(10, 50, 48, 14);
		panelCash.add(lblCashSum);
		
		txtCashSum = new JTextField();
		txtCashSum.setBounds(68, 47, 143, 20);
		panelCash.add(txtCashSum);
		txtCashSum.setColumns(10);
		
		JXDatePicker cashDatePicker = new PlaceholderDatePicker("Date");
        cashDatePicker.setBounds(68, 77, 143, 20);
        panelCash.add(cashDatePicker);
        
        ButtonGroup expenseTypeGroup = new ButtonGroup();
        expenseTypeGroup.add(rdbtnShopping);
        expenseTypeGroup.add(rdbtnFoodDrinks);
        expenseTypeGroup.add(rdbtnUtilities);
        expenseTypeGroup.add(rdbtnOthers);

        // Create instances of Cash and Expenses subclasses
        Cash cashTransaction = new Cash(lblUpdatedBalance);
        Shopping shoppingTransaction = new Shopping(lblShoppingKRW);
        FoodDrinks foodDrinksTransaction = new FoodDrinks(lblFoodDrinksKRW);
        Utilities utilitiesTransaction = new Utilities(lblUtilitiesKRW);
        Others othersTransaction = new Others(lblOthersKRW);

		
		btnCashSubmit = new JButton("Submit");
		btnCashSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    String cashLabel = txtCashLabel.getText();
                    double cashAmount = Double.parseDouble(txtCashSum.getText());

                    if (!cashLabel.isEmpty() && cashAmount > 0) {
                        cashTransaction.updateAmount(cashAmount);
                        // Optionally, clear text fields after submission
                        txtCashLabel.setText("");
                        txtCashSum.setText("");
                    } else {
                        JOptionPane.showMessageDialog(Dashboard.this, "Invalid input! Please enter valid data.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Dashboard.this, "Invalid input! Please enter valid numeric data.");
                }
			}
		});
		btnCashSubmit.setBounds(68, 103, 89, 23);
		panelCash.add(btnCashSubmit);
		
		panelExpenses = new JPanel();
		panelExpenses.setBackground(new Color(109, 168, 169));
		panelExpenses.setBounds(446, 269, 221, 188);
		contentPane.add(panelExpenses);
		panelExpenses.setLayout(null);
		
		lblAddExpenses = new JLabel("Add Expenses");
		lblAddExpenses.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblAddExpenses.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddExpenses.setBounds(0, 0, 221, 14);
		panelExpenses.add(lblAddExpenses);
		
		lblExpensesLabel = new JLabel("Label");
		lblExpensesLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblExpensesLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblExpensesLabel.setBounds(10, 25, 48, 14);
		panelExpenses.add(lblExpensesLabel);
		
		txtExpensesLabel = new JTextField();
		txtExpensesLabel.setBounds(68, 22, 143, 20);
		panelExpenses.add(txtExpensesLabel);
		txtExpensesLabel.setColumns(10);
		
		lblExpensesSum = new JLabel("Sum");
		lblExpensesSum.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblExpensesSum.setHorizontalAlignment(SwingConstants.TRAILING);
		lblExpensesSum.setBounds(10, 50, 48, 14);
		panelExpenses.add(lblExpensesSum);
		
		txtExpensesSum = new JTextField();
		txtExpensesSum.setBounds(68, 47, 143, 20);
		panelExpenses.add(txtExpensesSum);
		txtExpensesSum.setColumns(10);
		
		JXDatePicker expensesDatePicker = new PlaceholderDatePicker("Date");
        expensesDatePicker.setBounds(68, 77, 143, 20);
        panelExpenses.add(expensesDatePicker);
        
		lblExpensesCategory = new JLabel("Category");
		lblExpensesCategory.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblExpensesCategory.setBounds(10, 107, 62, 20);
		panelExpenses.add(lblExpensesCategory);
		
		rdbtnShopping = new JRadioButton("");
		rdbtnShopping.setBackground(new Color(109, 168, 169));
		rdbtnShopping.setBounds(10, 134, 21, 23);
		panelExpenses.add(rdbtnShopping);
		
		rdbtnFoodDrinks = new JRadioButton("");
		rdbtnFoodDrinks.setBackground(new Color(109, 168, 169));
		rdbtnFoodDrinks.setBounds(61, 134, 21, 23);
		panelExpenses.add(rdbtnFoodDrinks);
		
		rdbtnUtilities = new JRadioButton("");
		rdbtnUtilities.setBackground(new Color(109, 168, 169));
		rdbtnUtilities.setBounds(109, 134, 21, 23);
		panelExpenses.add(rdbtnUtilities);
		
		rdbtnOthers = new JRadioButton("");
		rdbtnOthers.setBackground(new Color(109, 168, 169));
		rdbtnOthers.setBounds(157, 134, 21, 23);
		panelExpenses.add(rdbtnOthers);	
		
		btnExpensesSubmit = new JButton("Submit");
		btnExpensesSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String expenseLabel = txtExpensesLabel.getText();
		            String expensesAmountText = txtExpensesSum.getText();
		            
		            // Check if any radio button is selected
		            /*if (!rdbtnShopping.isSelected() && !rdbtnFoodDrinks.isSelected() &&
		                !rdbtnUtilities.isSelected() && !rdbtnOthers.isSelected()) {
		                JOptionPane.showMessageDialog(Dashboard.this, "Please select an expense type.");
		                return; // Exit the method without processing further
		            }*/

		            // Validate expenses amount
		            if (expensesAmountText.isEmpty()) {
		                JOptionPane.showMessageDialog(Dashboard.this, "Please enter expenses amount.");
		                return; // Exit the method without processing further
		            }

		            double expensesAmount = Double.parseDouble(expensesAmountText);
		            System.out.println("1: " + expensesAmount);

		            if (!expenseLabel.isEmpty() && expensesAmount > 0) {
		            	System.out.println("2: " + expensesAmount);
		            	// Update transaction based on selected radio button
		                if (rdbtnShopping.isSelected()) {
		                    System.out.println("Selected shopping: " + expensesAmount);
		                    shoppingTransaction.updateAmount(expensesAmount);
		                    System.out.println("3: " + expensesAmount);
		                } 
		                
		                if (rdbtnFoodDrinks.isSelected()) {
		                    System.out.println("Selected food drinks: " + expensesAmount);
		                    foodDrinksTransaction.updateAmount(expensesAmount);
		                } 
		                
		                if (rdbtnUtilities.isSelected()) {
		                    System.out.println("Selected utilities: " + expensesAmount);
		                    utilitiesTransaction.updateAmount(expensesAmount);
		                } 
		                
		                if (rdbtnOthers.isSelected()) {
		                    System.out.println("Selected others: " + expensesAmount);
		                    othersTransaction.updateAmount(expensesAmount);
		                }
		                // Optionally, clear text fields after submission
		                txtExpensesLabel.setText("");
		                txtExpensesSum.setText("");
                    } else {
                        JOptionPane.showMessageDialog(Dashboard.this, "Invalid input! Please enter valid data.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Dashboard.this, "Invalid input! Please enter valid numeric data.");
                }
			}
		});
		btnExpensesSubmit.setBounds(68, 164, 89, 23);
		panelExpenses.add(btnExpensesSubmit);
		
		shoppingSmallIcon = new JLabel("");
		shoppingSmallIcon.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EWallet\\resources\\shopping_cart small icon.png"));
		shoppingSmallIcon.setBounds(34, 138, 21, 19);
		panelExpenses.add(shoppingSmallIcon);
		
		foodSmallIcon = new JLabel("");
		foodSmallIcon.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EWallet\\resources\\food small icon.png"));
		foodSmallIcon.setBounds(84, 134, 21, 23);
		panelExpenses.add(foodSmallIcon);
		
		houseSmallIcon = new JLabel("");
		houseSmallIcon.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EWallet\\resources\\house small icon.png"));
		houseSmallIcon.setBounds(133, 134, 21, 23);
		panelExpenses.add(houseSmallIcon);
		
		othersSmallIcon = new JLabel("");
		othersSmallIcon.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EWallet\\resources\\others small icon.png"));
		othersSmallIcon.setBounds(182, 134, 27, 23);
		panelExpenses.add(othersSmallIcon);
		
		transactionTable = new JTable();
		transactionTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		transactionTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Purpose", "Category", "Sum", "Date"
                }));
		
		
		scrollPane = new JScrollPane(transactionTable);
		scrollPane.setBounds(10, 154, 426, 303);
		contentPane.add(scrollPane);
		
		lblTransactions = new JLabel("Recent Transactions");
		lblTransactions.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		lblTransactions.setBounds(10, 132, 140, 14);
		contentPane.add(lblTransactions);
		
	}
}
