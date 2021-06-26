package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

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
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class Inventory extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldYear;
	private JTextField textFieldChurch;
	private JTextField textFieldRent;
	private JTextField textFieldPersonIncharge;
	private JTable table;
	DefaultTableModel model;
	private JFrame frame;
	private JTextField textFieldBalance;
	
	int balance, qChurch, qRent;
	private JTextField textFieldSales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	
	public Inventory() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 498);
		
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
		
		JMenuItem mnInventory = new JMenuItem("Inventory");
		mnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory inv = new Inventory();
				inv.setVisible(true);
				setVisible(false);
			}
		});
		mnInventory.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnMenu.add(mnInventory);
		
		
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
		panel.setBackground(new Color(240, 230, 140));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(165, 42, 42)));
		panel.setBounds(10, 11, 852, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("Inventory Management");
		lblTitle.setBounds(225, 11, 421, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(165, 42, 42)));
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBounds(10, 360, 852, 60);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(165, 42, 42)));
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(10, 82, 303, 267);
		contentPane.add(panel_2);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblYear.setBounds(20, 11, 60, 17);
		panel_2.add(lblYear);
		
		textFieldYear = new JTextField();
		textFieldYear.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldYear.setBounds(145, 11, 134, 17);
		panel_2.add(textFieldYear);
		textFieldYear.setColumns(10);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMonth.setBounds(20, 39, 60, 17);
		panel_2.add(lblMonth);
		
		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"Select", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBoxMonth.setBounds(145, 39, 134, 19);
		panel_2.add(comboBoxMonth);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLocation.setBounds(20, 68, 137, 17);
		panel_2.add(lblLocation);
		
		JComboBox comboBoxLocation = new JComboBox();
		comboBoxLocation.setModel(new DefaultComboBoxModel(new String[] {"Select", "Bayan Lepas", "Bukit Mertajam", "Butterworth", "Georgetown", "Gurney", "Simpang Ampat", "Tanjung Bungah"}));
		comboBoxLocation.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxLocation.setBounds(145, 66, 134, 19);
		panel_2.add(comboBoxLocation);
		
		JLabel lblChurch = new JLabel("Church");
		lblChurch.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblChurch.setBounds(20, 99, 60, 17);
		panel_2.add(lblChurch);
		
		textFieldChurch = new JTextField();
		textFieldChurch.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldChurch.setColumns(10);
		textFieldChurch.setBounds(145, 99, 134, 17);
		panel_2.add(textFieldChurch);
		
		JLabel lblRent = new JLabel("Rent");
		lblRent.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblRent.setBounds(20, 127, 75, 17);
		panel_2.add(lblRent);
		
		textFieldRent = new JTextField();
		textFieldRent.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldRent.setColumns(10);
		textFieldRent.setBounds(145, 127, 134, 17);
		panel_2.add(textFieldRent);
		
		JLabel lblAvailability = new JLabel("Availability");
		lblAvailability.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAvailability.setBounds(20, 156, 150, 17);
		panel_2.add(lblAvailability);
		
		JComboBox comboBoxAvailability = new JComboBox();
		comboBoxAvailability.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxAvailability.setModel(new DefaultComboBoxModel(new String[] {"Select", "Yes", "No"}));
		comboBoxAvailability.setBounds(145, 156, 134, 19);
		panel_2.add(comboBoxAvailability);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBalance.setBounds(20, 186, 60, 17);
		panel_2.add(lblBalance);
		
		textFieldBalance = new JTextField();
		textFieldBalance.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldBalance.setColumns(10);
		textFieldBalance.setBounds(145, 186, 134, 17);
		panel_2.add(textFieldBalance);
		
		JLabel lblPersonIncharge = new JLabel("Person incharge");
		lblPersonIncharge.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPersonIncharge.setBounds(20, 214, 115, 17);
		panel_2.add(lblPersonIncharge);
		
		textFieldPersonIncharge = new JTextField();
		textFieldPersonIncharge.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldPersonIncharge.setColumns(10);
		textFieldPersonIncharge.setBounds(145, 214, 134, 17);
		panel_2.add(textFieldPersonIncharge);
		
		JLabel lblSales = new JLabel("Sales");
		lblSales.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSales.setBounds(20, 242, 60, 17);
		panel_2.add(lblSales);
		
		textFieldSales = new JTextField();
		textFieldSales.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldSales.setColumns(10);
		textFieldSales.setBounds(145, 242, 134, 17);
		panel_2.add(textFieldSales);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(165, 42, 42)));
		panel_2_1.setBackground(new Color(240, 230, 140));
		panel_2_1.setBounds(323, 82, 539, 267);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 519, 200);
		panel_2_1.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				textFieldYear.setText(model.getValueAt(i,0).toString());
				comboBoxMonth.setSelectedItem(model.getValueAt(i,1).toString());
				comboBoxLocation.setSelectedItem(model.getValueAt(i,2).toString());
				textFieldChurch.setText(model.getValueAt(i,3).toString());
				textFieldRent.setText(model.getValueAt(i,4).toString());
				comboBoxAvailability.setSelectedItem(model.getValueAt(i,5).toString());
				textFieldBalance.setText(model.getValueAt(i,6).toString());
				textFieldPersonIncharge.setText(model.getValueAt(i,7).toString());
				textFieldSales.setText(model.getValueAt(i,8).toString());
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		model = new DefaultTableModel();
		Object[] column = {"Year", "Month", "Location", "Church", "Rent", "Availability", "Balance", "Person incharge", "Sales"};
		final Object[] row = new Object[8];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qChurch = Integer.parseInt(textFieldChurch.getText());
				int qRent = Integer.parseInt(textFieldRent.getText());
				
				balance = qChurch - qRent;
		
				String s1 = String.valueOf(balance);
				
				textFieldBalance.setText(s1);
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldYear.getText(),
						comboBoxMonth.getSelectedItem(),
						comboBoxLocation.getSelectedItem(),
						textFieldChurch.getText(),
						textFieldRent.getText(),
						comboBoxAvailability.getSelectedItem(),
						textFieldBalance.getText(),
						textFieldPersonIncharge.getText(),
						textFieldSales.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Inventory record added", "Inventory Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAdd.setBounds(10, 11, 122, 34);
		panel_1.add(btnAdd);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldYear.setText("");
				comboBoxMonth.setSelectedIndex(0);
				comboBoxLocation.setSelectedIndex(0);
				textFieldChurch.setText("");
				textFieldRent.setText("");
				comboBoxAvailability.setSelectedIndex(0);
				textFieldBalance.setText("");
				textFieldPersonIncharge.setText("");
				textFieldSales.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.setBounds(188, 11, 122, 34);
		panel_1.add(btnReset);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qChurch = Integer.parseInt(textFieldChurch.getText());
				int qRent = Integer.parseInt(textFieldRent.getText());
				
				balance = qChurch - qRent;
		
				String s1 = String.valueOf(balance);
				
				textFieldBalance.setText(s1);
				
				int i = table.getSelectedRow();
				if(i >= 0) {
					model.setValueAt(textFieldYear.getText(), i, 0);
					model.setValueAt(comboBoxMonth.getSelectedItem(), i, 1);
					model.setValueAt(comboBoxLocation.getSelectedItem(), i, 2);
					model.setValueAt(textFieldChurch.getText(), i, 3);
					model.setValueAt(textFieldRent.getText(), i, 4);
					model.setValueAt(comboBoxAvailability.getSelectedItem(), i, 5);
					model.setValueAt(textFieldBalance.getText(), i, 6);
					model.setValueAt(textFieldPersonIncharge.getText(), i, 7);
					model.setValueAt(textFieldSales.getText(), i, 8);	
					JOptionPane.showMessageDialog(null, "Updated Successfully", "Inventory Management System", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first!", "Inventory Management System", JOptionPane.OK_OPTION);
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnUpdate.setBounds(361, 11, 122, 34);
		panel_1.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Inventory Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Inventory Management System", JOptionPane.OK_OPTION);
					}
				}
				else {
					model.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Deleted successfully!", "Inventory Management System", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDelete.setBounds(544, 11, 122, 34);
		panel_1.add(btnDelete);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPrint.setBounds(720, 11, 122, 34);
		panel_1.add(btnPrint);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\Text file\\Inventory.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnUpload.setBounds(414, 222, 115, 34);
		panel_2_1.add(btnUpload);
		
		JLabel lblNewSales = new JLabel("Total Sales");
		lblNewSales.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewSales.setBounds(10, 222, 91, 34);
		panel_2_1.add(lblNewSales);
		
		JLabel lblRm = new JLabel("RM");
		lblRm.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblRm.setBounds(100, 222, 30, 34);
		panel_2_1.add(lblRm);
		
		JLabel totalsales = new JLabel("");
		totalsales.setFont(new Font("Times New Roman", Font.BOLD, 18));
		totalsales.setBounds(136, 222, 119, 34);
		panel_2_1.add(totalsales);
	
		JButton btnCalSalary = new JButton("Cal Sales");
		btnCalSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double totalSales = 0;
		        DefaultTableModel model = (DefaultTableModel) table.getModel();
		        
		     // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        String s1 = String.valueOf(model.getValueAt(i, 8));
			        
			        totalSales += Double.parseDouble(s1);
			        
			        String tSales = String.valueOf(totalSales);
			        totalsales.setText(tSales);
			    }
			    
			  int response = JOptionPane.showConfirmDialog(null, "Are you done for enter all records?", "Inventory Management System", JOptionPane.YES_NO_OPTION);
			  
			  if(response == JOptionPane.YES_OPTION) {
				  AdminMenu aMain = new AdminMenu();
				  aMain.setVisible(true);
				  setVisible(false);
			  }
			  else {
				  JOptionPane.showMessageDialog(null, "You may continue fill in", "Inventory Management System", JOptionPane.INFORMATION_MESSAGE);
			  }
			}
		});
		btnCalSalary.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCalSalary.setBounds(265, 222, 125, 34);
		panel_2_1.add(btnCalSalary);
		
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
