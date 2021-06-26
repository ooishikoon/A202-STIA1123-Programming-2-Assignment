package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMenu extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	public AdminMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Admin");
		lblTitle.setBounds(266, 62, 121, 42);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		contentPane.add(lblTitle);
		
		JButton btnInventory = new JButton("Inventory");
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory inv = new Inventory();
				inv.setVisible(true);
				setVisible(false);
			}
		});
		btnInventory.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		btnInventory.setBounds(231, 133, 196, 43);
		contentPane.add(btnInventory);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee emp = new Employee();
				emp.setVisible(true);
				setVisible(false);
			}
		});
		btnEmployee.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		btnEmployee.setBounds(231, 200, 196, 43);
		contentPane.add(btnEmployee);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance f = new Finance();
				f.setVisible(true);
				setVisible(false);
			}
		});
		btnFinance.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		btnFinance.setBounds(232, 272, 196, 43);
		contentPane.add(btnFinance);
		
		JButton btnAdvertisement = new JButton("Marketing");
		btnAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marketing m = new Marketing();
				m.setVisible(true);
				setVisible(false);
			}
		});
		btnAdvertisement.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		btnAdvertisement.setBounds(233, 340, 196, 43);
		contentPane.add(btnAdvertisement);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to logout", "Logout", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Home mainPage = new Home();
					mainPage.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnLogout.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		btnLogout.setBounds(511, 411, 121, 37);
		contentPane.add(btnLogout);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, -59, 656, 653);
		contentPane.add(lblBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\admin&customer menu.jpg");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblBackground.setIcon(scaledIcon);
	}

}
