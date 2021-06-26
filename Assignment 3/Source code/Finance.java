package Assignment3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	DefaultTableModel model;
	Double netIncome, totalIncome, totalExpenses;
	private JTextField textFieldYear;
	private JTextField textFieldPIC;
	private JLabel passyear;
	//private String totSalary;
	private double totSalary;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {}
	
	public Finance(double totalSalary) {	//transfer data (total salary) from class Employee to calculate total expenses
	//public Finance(String totalSalary) {
		this.totSalary = totalSalary;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 554);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		menuBar.add(mnMenu);
		
		JMenuItem home = new JMenuItem("Home");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu aMain = new AdminMenu();
				aMain.setVisible(true);
				setVisible(false);
			}
		});
		home.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnMenu.add(home);
		
		JMenuItem employee = new JMenuItem("Employee");
		employee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee emp = new Employee();
				emp.setVisible(true);
				setVisible(false);
			}
		});
		employee.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnMenu.add(employee);
		
		JMenuItem finance = new JMenuItem("Finance");
		finance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance f = new Finance();
				f.setVisible(true);
				setVisible(false);
			}
		});
		finance.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnMenu.add(finance);
		
		JMenuItem marketing = new JMenuItem("Marketing");
		marketing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marketing m = new Marketing();
				m.setVisible(true);
				setVisible(false);
			}
		});
		marketing.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnMenu.add(marketing);
		
		JSeparator separator = new JSeparator();
		mnMenu.add(separator);
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Exit", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mnMenu.add(exit);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		menuBar.add(mnAbout);
		
		JMenuItem company = new JMenuItem("Company");
		company.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground c = new CompanyBackground();
				c.setVisible(true);
				setVisible(false);
				
			}
		});
		company.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnAbout.add(company);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 852, 60);
		panel.setBackground(new Color(240, 230, 140));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(165, 42, 42)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("Finance Management");
		lblTitle.setBounds(241, 11, 376, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(165, 42, 42)));
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(10, 62, 852, 85);
		contentPane.add(panel_2);
		
		textFieldYear = new JTextField();
		textFieldYear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldYear.setColumns(10);
		textFieldYear.setBounds(91, 19, 119, 21);
		panel_2.add(textFieldYear);
		
		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"Select", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBoxMonth.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBoxMonth.setBounds(91, 51, 119, 21);
		panel_2.add(comboBoxMonth);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMonth.setBounds(21, 51, 60, 21);
		panel_2.add(lblMonth);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblYear.setBounds(21, 19, 60, 21);
		panel_2.add(lblYear);
		
		JLabel lblPersonIncharge = new JLabel("Person incharge");
		lblPersonIncharge.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPersonIncharge.setBounds(520, 16, 141, 27);
		panel_2.add(lblPersonIncharge);
		
		textFieldPIC = new JTextField();
		textFieldPIC.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldPIC.setColumns(10);
		textFieldPIC.setBounds(671, 19, 160, 21);
		panel_2.add(textFieldPIC);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(165, 42, 42)));
		panel_2_1.setBackground(new Color(240, 230, 140));
		panel_2_1.setBounds(10, 140, 852, 341);
		contentPane.add(panel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new MatteBorder(5, 0, 5, 0, (Color) new Color(165, 42, 42)));
		panel_2_1_1.setBackground(new Color(240, 230, 140));
		panel_2_1_1.setBounds(252, 0, 350, 52);
		panel_2_1.add(panel_2_1_1);
		
		JLabel lblFinanceReport = new JLabel("Finance Report");
		lblFinanceReport.setBounds(68, 11, 234, 31);
		panel_2_1_1.add(lblFinanceReport);
		lblFinanceReport.setForeground(Color.BLACK);
		lblFinanceReport.setFont(new Font("Lucida Calligraphy", Font.BOLD, 26));
		
		JLabel lblYear1 = new JLabel("Year");
		lblYear1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblYear1.setBounds(634, 46, 60, 21);
		panel_2_1.add(lblYear1);
		
		JLabel lblMonth1 = new JLabel("Month");
		lblMonth1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMonth1.setBounds(634, 75, 60, 21);
		panel_2_1.add(lblMonth1);
		
		passyear = new JLabel("");
		passyear.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passyear.setBounds(716, 46, 111, 21);
		panel_2_1.add(passyear);
		
		JLabel passmonth = new JLabel("");
		passmonth.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passmonth.setBounds(716, 75, 111, 21);
		panel_2_1.add(passmonth);
		
		JLabel lblSales = new JLabel("Sales");
		lblSales.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSales.setBounds(27, 108, 60, 21);
		panel_2_1.add(lblSales);
		
		JLabel lblSponsorship = new JLabel("Sponsorship");
		lblSponsorship.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSponsorship.setBounds(27, 137, 84, 21);
		panel_2_1.add(lblSponsorship);
		
		JLabel passsales = new JLabel("");
		passsales.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passsales.setBounds(169, 108, 111, 21);
		panel_2_1.add(passsales);
		
		JLabel passsponsorship = new JLabel("");
		passsponsorship.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passsponsorship.setBounds(169, 137, 111, 21);
		panel_2_1.add(passsponsorship);
		
		JLabel rm1 = new JLabel("RM");
		rm1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rm1.setBounds(122, 108, 30, 21);
		panel_2_1.add(rm1);
		
		JLabel rm2 = new JLabel("RM");
		rm2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rm2.setBounds(122, 137, 30, 21);
		panel_2_1.add(rm2);
		
		JLabel lblWages = new JLabel("Wages");
		lblWages.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWages.setBounds(322, 108, 60, 21);
		panel_2_1.add(lblWages);
		
		JLabel lblUtility = new JLabel("Utility");
		lblUtility.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblUtility.setBounds(322, 137, 84, 21);
		panel_2_1.add(lblUtility);
		
		JLabel rm3 = new JLabel("RM");
		rm3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rm3.setBounds(417, 108, 30, 21);
		panel_2_1.add(rm3);
		
		JLabel rm4 = new JLabel("RM");
		rm4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rm4.setBounds(417, 137, 30, 21);
		panel_2_1.add(rm4);
		
		JLabel passwages = new JLabel("");
		passwages.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passwages.setBounds(464, 108, 111, 21);
		panel_2_1.add(passwages);
		
		JLabel passutility = new JLabel("");
		passutility.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passutility.setBounds(464, 137, 111, 21);
		panel_2_1.add(passutility);
		
		JLabel lblTotalSales = new JLabel("Total Sales");
		lblTotalSales.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTotalSales.setBounds(27, 194, 91, 21);
		panel_2_1.add(lblTotalSales);
		
		JLabel rm5 = new JLabel("RM");
		rm5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		rm5.setBounds(122, 194, 40, 21);
		panel_2_1.add(rm5);
		
		JLabel totalsales = new JLabel("");
		totalsales.setFont(new Font("Times New Roman", Font.BOLD, 18));
		totalsales.setBounds(169, 194, 111, 21);
		panel_2_1.add(totalsales);
		
		JLabel lblTotalExpenses = new JLabel("Total Expenses");
		lblTotalExpenses.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTotalExpenses.setBounds(290, 194, 123, 21);
		panel_2_1.add(lblTotalExpenses);
		
		JLabel rm6 = new JLabel("RM");
		rm6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		rm6.setBounds(417, 194, 40, 21);
		panel_2_1.add(rm6);
		
		JLabel totalexpenses = new JLabel("");
		totalexpenses.setFont(new Font("Times New Roman", Font.BOLD, 18));
		totalexpenses.setBounds(464, 194, 111, 21);
		panel_2_1.add(totalexpenses);
		
		JLabel lblNetIncome = new JLabel("Net Income");
		lblNetIncome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNetIncome.setBounds(584, 194, 111, 21);
		panel_2_1.add(lblNetIncome);
		
		JLabel rm6_1 = new JLabel("RM");
		rm6_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		rm6_1.setBounds(697, 194, 40, 21);
		panel_2_1.add(rm6_1);
		
		JLabel netincome = new JLabel("");
		netincome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		netincome.setBounds(747, 194, 95, 21);
		panel_2_1.add(netincome);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_2_1_1_1.setBackground(new Color(240, 230, 140));
		panel_2_1_1_1.setBounds(584, 239, 243, 42);
		panel_2_1.add(panel_2_1_1_1);
		
		JLabel passPIC = new JLabel("");
		passPIC.setFont(new Font("Times New Roman", Font.BOLD, 18));
		passPIC.setBounds(584, 292, 243, 21);
		panel_2_1.add(passPIC);
		
		JButton btnGenerate = new JButton("Generate report");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s = comboBoxMonth.getSelectedItem().toString();
				
				//double totSalary1 = Double.parseDouble(totalSalary);
				double sales = 38271.59;
				double sponsor = 23749.11;
				double utility = 8746.39;
				
				double tIncome = sales + sponsor;
				double tExpenses = utility + totSalary;
				double nIncome = tIncome - tExpenses;
				
				String sales1 = Double.toString(sales);
				String sponsor1 = Double.toString(sponsor);
				String utility1 = Double.toString(utility);
				//String totSalary2 = Double.toString(totSalary1);
				String totalIncome = Double.toString(tIncome);
				String totalExpenses = Double.toString(tExpenses);
				String netIncome = Double.toString(nIncome);
				String totSalary1 = Double.toString(totalSalary);
				
				passyear.setText(textFieldYear.getText());
				passmonth.setText(s);
				passPIC.setText(textFieldPIC.getText());
				passsales.setText(sales1);
				passsponsorship.setText(sponsor1);
				//passwages.setText(totSalary2);
				passutility.setText(utility1);
				totalsales.setText(totalIncome);
				totalexpenses.setText(totalExpenses);
				netincome.setText(netIncome);
				passwages.setText(totSalary1);
				
			}
		});
		btnGenerate.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnGenerate.setBounds(671, 51, 160, 23);
		panel_2.add(btnGenerate);
		model = new DefaultTableModel();
		Object[] column = {"Year", "Month", "Sales", "Sponsor", "Utility", "Wages", "Total Income(RM)", "Total Expenses(RM)", "Net Income(RM)"};
		final Object[] row = new Object[8];
		model.setColumnIdentifiers(column);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 872, 489);
		contentPane.add(lblBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\admin option.jpg");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblBackground.setIcon(scaledIcon);
	}
}
