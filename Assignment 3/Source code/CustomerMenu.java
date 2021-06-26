package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CustomerMenu extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerMenu frame = new CustomerMenu();
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
	public CustomerMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Customer");
		lblTitle.setBounds(247, 74, 151, 42);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		contentPane.add(lblTitle);
		
		JButton btnPurchase = new JButton("Purchase");
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Purchase pur = new Purchase();
				pur.setVisible(true);
				setVisible(false);
			}
		});
		btnPurchase.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		btnPurchase.setBounds(232, 345, 196, 43);
		contentPane.add(btnPurchase);
		
		JButton btnProducts = new JButton("Products");
		btnProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Products p = new Products();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnProducts.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		btnProducts.setBounds(232, 269, 196, 43);
		contentPane.add(btnProducts);
		
		JButton btnAdvertisement = new JButton("Advertisement");
		btnAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement ad = new Advertisement();
				ad.setVisible(true);
				setVisible(false);
			}
		});
		btnAdvertisement.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		btnAdvertisement.setBounds(232, 196, 196, 43);
		contentPane.add(btnAdvertisement);
		
		JButton btnCompany = new JButton("Company");
		btnCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground company = new CompanyBackground();
				company.setVisible(true);
				setVisible(false);
			}
		});
		btnCompany.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		btnCompany.setBounds(232, 127, 196, 43);
		contentPane.add(btnCompany);
		
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
		btnLogout.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
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
