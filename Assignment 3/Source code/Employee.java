package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEmpID;
	private JTextField textFieldName;
	private JTextField textFieldICNo;
	private JTextField textFieldAddress;
	private JTextField textFieldPhoneNo;
	private JTextField textFieldEmail;
	private JTextField textFieldSalary;
	private JTable table;
	DefaultTableModel model;
	private JFrame frame;
	String tSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
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
		
		JMenuItem inventory = new JMenuItem("Inventory");
		inventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory inv = new Inventory();
				inv.setVisible(true);
				setVisible(false);
			}
		});
		inventory.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnMenu.add(inventory);
		
		JMenuItem finance = new JMenuItem("Finance");
		finance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance f = new Finance();
				f.setVisible(true);
				setVisible(false);
			}
		});
		
		JMenuItem mnEmployee = new JMenuItem("Employee");
		mnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee emp = new Employee();
				emp.setVisible(true);
				setVisible(false);
			}
		});
		mnEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnMenu.add(mnEmployee);
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
		
		JLabel lblTitle = new JLabel("Employee Management");
		lblTitle.setBounds(235, 11, 405, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 360, 852, 60);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(165, 42, 42)));
		panel_1.setBackground(new Color(240, 230, 140));
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 82, 303, 267);
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(165, 42, 42)));
		panel_2.setBackground(new Color(240, 230, 140));
		contentPane.add(panel_2);
		
		JLabel lblEmpID = new JLabel("Emp ID");
		lblEmpID.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmpID.setBounds(20, 26, 60, 17);
		panel_2.add(lblEmpID);
		
		textFieldEmpID = new JTextField();
		textFieldEmpID.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldEmpID.setBounds(105, 26, 174, 17);
		panel_2.add(textFieldEmpID);
		textFieldEmpID.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(20, 54, 60, 17);
		panel_2.add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldName.setColumns(10);
		textFieldName.setBounds(105, 54, 174, 17);
		panel_2.add(textFieldName);
		
		JLabel lblICNo = new JLabel("IC No");
		lblICNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblICNo.setBounds(20, 83, 60, 17);
		panel_2.add(lblICNo);
		
		textFieldICNo = new JTextField();
		textFieldICNo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldICNo.setColumns(10);
		textFieldICNo.setBounds(105, 83, 174, 17);
		panel_2.add(textFieldICNo);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAddress.setBounds(20, 114, 60, 17);
		panel_2.add(lblAddress);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(105, 114, 174, 17);
		panel_2.add(textFieldAddress);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPhoneNo.setBounds(20, 142, 75, 17);
		panel_2.add(lblPhoneNo);
		
		textFieldPhoneNo = new JTextField();
		textFieldPhoneNo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldPhoneNo.setColumns(10);
		textFieldPhoneNo.setBounds(105, 142, 174, 17);
		panel_2.add(textFieldPhoneNo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmail.setBounds(20, 171, 60, 17);
		panel_2.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(105, 171, 174, 17);
		panel_2.add(textFieldEmail);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPosition.setBounds(20, 201, 60, 17);
		panel_2.add(lblPosition);
		
		JComboBox comboBoxPosition = new JComboBox();
		comboBoxPosition.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxPosition.setModel(new DefaultComboBoxModel(new String[] {"Select", "Manager", "Human Resource", "Designer", "Decorator", "Chef", "Accountant", "Driver", "Cleaner"}));
		comboBoxPosition.setBounds(105, 199, 174, 19);
		panel_2.add(comboBoxPosition);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSalary.setBounds(20, 229, 60, 17);
		panel_2.add(lblSalary);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(105, 229, 174, 17);
		panel_2.add(textFieldSalary);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(323, 82, 539, 267);
		panel_2_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(165, 42, 42)));
		panel_2_1.setBackground(new Color(240, 230, 140));
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
				textFieldEmpID.setText(model.getValueAt(i,0).toString());
				textFieldName.setText(model.getValueAt(i,1).toString());
				textFieldICNo.setText(model.getValueAt(i,2).toString());
				textFieldAddress.setText(model.getValueAt(i,3).toString());
				textFieldPhoneNo.setText(model.getValueAt(i,4).toString());
				textFieldEmail.setText(model.getValueAt(i,5).toString());
				comboBoxPosition.setSelectedItem(model.getValueAt(i,6).toString());
				textFieldSalary.setText(model.getValueAt(i,7).toString());
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		model = new DefaultTableModel();
		Object[] column = {"Emp ID", "Name", "IC No", "Address", "Phone No", "Email", "Position", "Salary(RM)"};
		final Object[] row = new Object[8];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldEmpID.getText(),
						textFieldName.getText(),
						textFieldICNo.getText(),
						textFieldAddress.getText(),
						textFieldPhoneNo.getText(),
						textFieldEmail.getText(),
						comboBoxPosition.getSelectedItem(),
						textFieldSalary.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee record added", "Employee Management System",
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
				textFieldEmpID.setText("");
				textFieldName.setText("");
				textFieldICNo.setText("");
				textFieldAddress.setText("");
				textFieldPhoneNo.setText("");
				textFieldEmail.setText("");
				comboBoxPosition.setSelectedIndex(0);
				textFieldSalary.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.setBounds(188, 11, 122, 34);
		panel_1.add(btnReset);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i >= 0) {
					model.setValueAt(textFieldEmpID.getText(), i, 0);
					model.setValueAt(textFieldName.getText(), i, 1);
					model.setValueAt(textFieldICNo.getText(), i, 2);
					model.setValueAt(textFieldAddress.getText(), i, 3);
					model.setValueAt(textFieldPhoneNo.getText(), i, 4);
					model.setValueAt(textFieldEmail.getText(), i, 5);
					model.setValueAt(comboBoxPosition.getSelectedItem(), i, 6);
					model.setValueAt(textFieldSalary.getText(), i, 7);				
					JOptionPane.showMessageDialog(null, "Updated Successfully", "Employee Management System", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first!", "Employee Management System", JOptionPane.OK_OPTION);
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
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}
				else {
					model.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Deleted successfully!", "Employee Management System", JOptionPane.INFORMATION_MESSAGE);
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
					File file = new File("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\Text file\\Employee.txt");
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
		
		JButton btnCalSalary = new JButton("Cal Salary");
		btnCalSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double totalSalary = 0;
		        DefaultTableModel model = (DefaultTableModel) table.getModel();
		        
		     // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        String s1 = String.valueOf(model.getValueAt(i, 7));
			        
			        totalSalary += Double.parseDouble(s1);
			        //String tSalary = String.valueOf(totalSalary);
			        //totalsalary.setText(tSalary);
			    }
			    
			  int response = JOptionPane.showConfirmDialog(null, "Are you done for enter all records?", "Employee Management System", JOptionPane.YES_NO_OPTION);
			  
			  if(response == JOptionPane.YES_OPTION) {
				  int option = JOptionPane.showConfirmDialog(null, "Are you want to key in Inventory record?", "Employee Management System", JOptionPane.YES_NO_OPTION);
				  if(option == JOptionPane.YES_OPTION) {
					  Inventory inv = new Inventory();
					  inv.setVisible(true);
					  setVisible(false);
				  }
				  else {
					  try {
					  Finance f = new Finance(totalSalary);
					  f.setVisible(true);
					  setVisible(false);
					  } catch (Exception ee) {
							ee.printStackTrace();
					  }

				  }
			  }
			  else {
				  JOptionPane.showMessageDialog(null, "You may continue fill in", "Employee Management System", JOptionPane.INFORMATION_MESSAGE);
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
		
		/*JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 872, 489);
		contentPane.add(lblBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\admin option.jpg");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblBackground.setIcon(scaledIcon);*/
	}
}
