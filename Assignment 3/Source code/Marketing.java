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

public class Marketing extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldYear;
	private JTextField textFieldQBest;
	private JTextField textFieldBSales;
	private JTextField textFieldWSales;
	private JTable table;
	private JFrame frame;
	DefaultTableModel model;
	private JTextField textFieldQWorst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Marketing frame = new Marketing();
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
	public Marketing() {
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
		mnMenu.add(mnEmployee);
		finance.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnMenu.add(finance);
		
		JMenuItem mnMarketing = new JMenuItem("Marketing");
		mnMarketing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marketing m = new Marketing();
				m.setVisible(true);
				setVisible(false);
			}
		});
		mnMenu.add(mnMarketing);
		
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
		
		JLabel lblTitle = new JLabel("Marketing Management");
		lblTitle.setBounds(228, 11, 421, 41);
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
		lblYear.setBounds(20, 26, 60, 17);
		panel_2.add(lblYear);
		
		textFieldYear = new JTextField();
		textFieldYear.setBounds(180, 26, 99, 17);
		panel_2.add(textFieldYear);
		textFieldYear.setColumns(10);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMonth.setBounds(20, 54, 60, 17);
		panel_2.add(lblMonth);
		
		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"Select", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBoxMonth.setBounds(180, 54, 99, 19);
		panel_2.add(comboBoxMonth);
		
		JLabel lblBestSeller = new JLabel("Best selling package");
		lblBestSeller.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBestSeller.setBounds(20, 83, 137, 17);
		panel_2.add(lblBestSeller);
		
		JComboBox comboBoxBestSeller = new JComboBox();
		comboBoxBestSeller.setModel(new DefaultComboBoxModel(new String[] {"Select", "Package 1", "Package 2", "Package 3"}));
		comboBoxBestSeller.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxBestSeller.setBounds(180, 81, 99, 19);
		panel_2.add(comboBoxBestSeller);
		
		JLabel lblQBest = new JLabel("Quantity");
		lblQBest.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblQBest.setBounds(20, 114, 60, 17);
		panel_2.add(lblQBest);
		
		textFieldQBest = new JTextField();
		textFieldQBest.setColumns(10);
		textFieldQBest.setBounds(180, 114, 99, 17);
		panel_2.add(textFieldQBest);
		
		JLabel lblBSales = new JLabel("Sales");
		lblBSales.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBSales.setBounds(20, 142, 75, 17);
		panel_2.add(lblBSales);
		
		textFieldBSales = new JTextField();
		textFieldBSales.setColumns(10);
		textFieldBSales.setBounds(180, 142, 99, 17);
		panel_2.add(textFieldBSales);
		
		JLabel lblWorstSeller = new JLabel("Worst selling package");
		lblWorstSeller.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblWorstSeller.setBounds(20, 171, 150, 17);
		panel_2.add(lblWorstSeller);
		
		JComboBox comboBoxWorstSeller = new JComboBox();
		comboBoxWorstSeller.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBoxWorstSeller.setModel(new DefaultComboBoxModel(new String[] {"Select", "Package 1", "Package 2", "Package 3"}));
		comboBoxWorstSeller.setBounds(180, 171, 99, 19);
		panel_2.add(comboBoxWorstSeller);
		
		JLabel lblQWorst = new JLabel("Quantity");
		lblQWorst.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblQWorst.setBounds(20, 201, 60, 17);
		panel_2.add(lblQWorst);
		
		JLabel lblWSales = new JLabel("Sales");
		lblWSales.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblWSales.setBounds(20, 229, 60, 17);
		panel_2.add(lblWSales);
		
		textFieldWSales = new JTextField();
		textFieldWSales.setColumns(10);
		textFieldWSales.setBounds(180, 229, 99, 17);
		panel_2.add(textFieldWSales);
		
		textFieldQWorst = new JTextField();
		textFieldQWorst.setColumns(10);
		textFieldQWorst.setBounds(180, 201, 99, 17);
		panel_2.add(textFieldQWorst);
		
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
				comboBoxBestSeller.setSelectedItem(model.getValueAt(i,2).toString());
				textFieldQBest.setText(model.getValueAt(i,3).toString());
				textFieldBSales.setText(model.getValueAt(i,4).toString());
				comboBoxWorstSeller.setSelectedItem(model.getValueAt(i,5).toString());
				textFieldQWorst.setText(model.getValueAt(i,6).toString());
				textFieldWSales.setText(model.getValueAt(i,7).toString());
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		model = new DefaultTableModel();
		Object[] column = {"Year", "Month", "Best selling package", "Quantity", "Sales", "Worst selling package", "Quantity", "Sales"};
		final Object[] row = new Object[8];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldYear.getText(),
						comboBoxMonth.getSelectedItem(),
						comboBoxBestSeller.getSelectedItem(),
						textFieldQBest.getText(),
						textFieldBSales.getText(),
						comboBoxWorstSeller.getSelectedItem(),
						textFieldQWorst.getText(),
						textFieldWSales.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Record added", "Marketing Management System",
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
				comboBoxBestSeller.setSelectedIndex(0);
				textFieldQBest.setText("");
				textFieldBSales.setText("");
				comboBoxWorstSeller.setSelectedIndex(0);
				textFieldQWorst.setText("");
				textFieldWSales.setText("");
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
					model.setValueAt(textFieldYear.getText(), i, 0);
					model.setValueAt(comboBoxMonth.getSelectedItem(), i, 1);
					model.setValueAt(comboBoxBestSeller.getSelectedItem(), i, 2);
					model.setValueAt(textFieldQBest.getText(), i, 3);
					model.setValueAt(textFieldBSales.getText(), i, 4);
					model.setValueAt(comboBoxWorstSeller.getSelectedItem(), i, 5);
					model.setValueAt(textFieldQWorst.getText(), i, 6);
					model.setValueAt(textFieldWSales.getText(), i, 7);				
					JOptionPane.showMessageDialog(null, "Updated Successfully", "Marketing Management System", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first!", "Marketing Management System", JOptionPane.OK_OPTION);
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
								"Marketing Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Marketing Management System", JOptionPane.OK_OPTION);
					}
				}
				else {
					model.removeRow(table.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Deleted successfully!", "Marketing Management System", JOptionPane.INFORMATION_MESSAGE);
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
					File file = new File("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\Text file\\Marketing.txt");
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
		btnUpload.setBounds(209, 222, 115, 34);
		panel_2_1.add(btnUpload);
		
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
