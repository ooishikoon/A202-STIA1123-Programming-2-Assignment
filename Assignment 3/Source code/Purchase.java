package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class Purchase extends JFrame{

	private JPanel contentPane;
	private JLabel lblName;
	private JTextField textFieldName;
	private JLabel lblTotalPrice;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Purchase frame = new Purchase();
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
	public Purchase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 691);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Purchase");
		lblTitle.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		lblTitle.setBounds(10, 0, 149, 42);
		contentPane.add(lblTitle);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblName.setBounds(30, 53, 52, 31);
		contentPane.add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldName.setBounds(168, 53, 239, 31);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDate.setBounds(30, 95, 52, 31);
		contentPane.add(lblDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(168, 95, 239, 31);
		contentPane.add(dateChooser);
		
		JLabel lblPeopleCapacity = new JLabel("People capacity");
		lblPeopleCapacity.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPeopleCapacity.setBounds(30, 130, 113, 31);
		contentPane.add(lblPeopleCapacity);
		
		JRadioButton rdbtnLessthan50 = new JRadioButton("< 50 people");
		rdbtnLessthan50.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnLessthan50.setBounds(168, 136, 109, 23);
		contentPane.add(rdbtnLessthan50);
		
		JRadioButton rdbtn50to100pp = new JRadioButton("50 - 100 people");
		rdbtn50to100pp.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtn50to100pp.setBounds(308, 136, 109, 23);
		contentPane.add(rdbtn50to100pp);
		
		JRadioButton lbtnMorethan100pp = new JRadioButton("> 100 people");
		lbtnMorethan100pp.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbtnMorethan100pp.setBounds(444, 136, 109, 23);
		contentPane.add(lbtnMorethan100pp);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblLocation.setBounds(30, 172, 81, 31);
		contentPane.add(lblLocation);
		
		JComboBox comboBoxLocation = new JComboBox();
		comboBoxLocation.setModel(new DefaultComboBoxModel(new String[] {"Select", "Bayan Lepas", "Bukit Mertajam", "Butterworth", "Georgetown", "Gurney", "Simpang Ampat", "Tanjung Bungah"}));
		comboBoxLocation.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBoxLocation.setBounds(168, 173, 239, 31);
		contentPane.add(comboBoxLocation);
		
		JLabel lblPackage = new JLabel("Package");
		lblPackage.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPackage.setBounds(30, 214, 81, 31);
		contentPane.add(lblPackage);
		
		JRadioButton rdbtnPackage1 = new JRadioButton("Package 1");
		rdbtnPackage1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnPackage1.setBounds(168, 220, 109, 23);
		contentPane.add(rdbtnPackage1);
		
		JRadioButton rdbtnPackage2 = new JRadioButton("Package 2");
		rdbtnPackage2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnPackage2.setBounds(308, 220, 109, 23);
		contentPane.add(rdbtnPackage2);
		
		JRadioButton rdbtnPackage3 = new JRadioButton("Package 3");
		rdbtnPackage3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnPackage3.setBounds(444, 220, 109, 23);
		contentPane.add(rdbtnPackage3);
		
		JLabel lblHoursToRent = new JLabel("Hours to rent");
		lblHoursToRent.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblHoursToRent.setBounds(30, 256, 113, 31);
		contentPane.add(lblHoursToRent);
		
		JComboBox hours = new JComboBox();
		hours.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		hours.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		hours.setBounds(168, 262, 113, 23);
		contentPane.add(hours);
		
		JPanel panelReceipt = new JPanel();
		panelReceipt.setBackground(SystemColor.textHighlightText);
		panelReceipt.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(227, 227, 227)));
		panelReceipt.setBounds(201, 306, 496, 285);
		contentPane.add(panelReceipt);
		panelReceipt.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-110, 0, 674, 40);
		panel.setBackground(SystemColor.controlHighlight);
		panelReceipt.add(panel);
		panel.setLayout(null);
		
		JLabel lblOrderDetails = new JLabel("Order Details");
		lblOrderDetails.setBounds(260, 0, 195, 42);
		lblOrderDetails.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 26));
		panel.add(lblOrderDetails);
		
		JLabel lblOName = new JLabel("Name");
		lblOName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOName.setBounds(99, 56, 48, 20);
		panelReceipt.add(lblOName);
		
		JLabel lblpassname = new JLabel("");
		lblpassname.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblpassname.setBounds(256, 56, 197, 20);
		panelReceipt.add(lblpassname);
		
		JLabel lblODate = new JLabel("Date");
		lblODate.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblODate.setBounds(99, 89, 48, 20);
		panelReceipt.add(lblODate);
		
		JLabel lblpassdate = new JLabel("");
		lblpassdate.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblpassdate.setBounds(256, 89, 197, 20);
		panelReceipt.add(lblpassdate);
		
		JLabel lblOPeopleCapacity = new JLabel("People capacity");
		lblOPeopleCapacity.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOPeopleCapacity.setBounds(99, 120, 105, 20);
		panelReceipt.add(lblOPeopleCapacity);
		
		JLabel lblpassPpcapacity = new JLabel("");
		lblpassPpcapacity.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblpassPpcapacity.setBounds(256, 120, 197, 20);
		panelReceipt.add(lblpassPpcapacity);
		
		JLabel lblName_1_3 = new JLabel("Location");
		lblName_1_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblName_1_3.setBounds(99, 151, 58, 20);
		panelReceipt.add(lblName_1_3);
		
		JLabel lblpasslocation = new JLabel("");
		lblpasslocation.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblpasslocation.setBounds(256, 151, 197, 20);
		panelReceipt.add(lblpasslocation);
		
		JLabel lblOPackage = new JLabel("Package");
		lblOPackage.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOPackage.setBounds(99, 182, 74, 20);
		panelReceipt.add(lblOPackage);
		
		JLabel lblpasspackage = new JLabel("");
		lblpasspackage.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblpasspackage.setBounds(256, 182, 197, 20);
		panelReceipt.add(lblpasspackage);
		
		JLabel lblOhourstorent = new JLabel("Hours to rent");
		lblOhourstorent.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOhourstorent.setBounds(99, 213, 105, 20);
		panelReceipt.add(lblOhourstorent);
		
		JLabel lblpasshours = new JLabel("");
		lblpasshours.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblpasshours.setBounds(256, 213, 197, 20);
		panelReceipt.add(lblpasshours);
		
		lblTotalPrice = new JLabel("Total Price : RM");
		lblTotalPrice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTotalPrice.setBounds(251, 244, 145, 20);
		panelReceipt.add(lblTotalPrice);
		
		JLabel lblpasstprice = new JLabel("");
		lblpasstprice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblpasstprice.setBounds(389, 244, 97, 20);
		panelReceipt.add(lblpasstprice);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				
				String s1 = comboBoxLocation.getSelectedItem().toString();
				String s2 = hours.getSelectedItem().toString();
				
				//initialize people capacity
				String pp = "Less than 50 people";
				double price = 200;
				if (rdbtn50to100pp.isSelected()) {
					pp = "50 to 100 people";
					price = 400;
				}
				if(lbtnMorethan100pp.isSelected()) {
					pp = "More than 100 people";
					price = 600;
				}
				
				//initialize package
				String pack = "Package 1";
				double price1 = 500;
				if(rdbtnPackage2.isSelected()){
					pack = "Package 2";
					price1 = 1000;
				}
				if(rdbtnPackage3.isSelected()){
					pack = "Package 3";
					price1 = 1500;
				}
				
				double totalprice = price + price1;
				String s = Double.toString(totalprice);
				
				lblpassname.setText(textFieldName.getText());
				lblpassdate.setText(df.format(dateChooser.getDate()));
				lblpassPpcapacity.setText(pp);
				lblpasslocation.setText(s1);
				lblpasspackage.setText(pack);
				lblpasshours.setText(s2);
				lblpasstprice.setText(s);
			}
		});
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSubmit.setBounds(30, 308, 113, 31);
		contentPane.add(btnSubmit);
		
		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Purchase succesfully!\nThanks for choosing Wedding By Design", "Wedding Rental System", JOptionPane.INFORMATION_MESSAGE);
				CustomerMenu cMain = new CustomerMenu();
				cMain.setVisible(true);
				setVisible(false);
			}
		});
		btnCheckOut.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnCheckOut.setBounds(308, 602, 113, 31);
		contentPane.add(btnCheckOut);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to cancel", "Wedding Rental System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					CustomerMenu cMain = new CustomerMenu();
					cMain.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnCancel.setBounds(510, 602, 113, 31);
		contentPane.add(btnCancel);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 861, 693);
		contentPane.add(lblBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\purchase.jpg");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblBackground.setIcon(scaledIcon);
		
		/*JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 861, 693);
		contentPane.add(lblBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\purchase.jpg");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblBackground.setIcon(scaledIcon);*/
	}
}
