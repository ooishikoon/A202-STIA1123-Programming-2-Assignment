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
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyBackground extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground frame = new CompanyBackground();
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
	public CompanyBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Wedding By Design");
		lblWelcome.setBounds(237, 0, 271, 50);
		lblWelcome.setForeground(new Color(255, 218, 185));
		lblWelcome.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 24));
		contentPane.add(lblWelcome);
		
		JTextPane txtpnDescription = new JTextPane();
		txtpnDescription.setFont(new Font("Bradley Hand ITC", Font.BOLD, 14));
		txtpnDescription.setText("Weddings by Design is a bridal and event planning company,\r\nFounded in 2000 and locate at Penang.\r\nWe offers services that include \r\nCultural weddings, Destination weddings and Social events.");
		txtpnDescription.setBounds(167, 136, 403, 78);
		contentPane.add(txtpnDescription);
		
		JTextPane txtpnSlogan = new JTextPane();
		txtpnSlogan.setText("Slogan : Happily ever after begins here");
		txtpnSlogan.setFont(new Font("Bradley Hand ITC", Font.BOLD, 14));
		txtpnSlogan.setBounds(237, 225, 261, 32);
		contentPane.add(txtpnSlogan);
		
		JLabel lblMission = new JLabel("Mission : Connecting the right bride with the right Wedding Professional");
		lblMission.setFont(new Font("Bradley Hand ITC", Font.BOLD, 14));
		lblMission.setBounds(178, 268, 385, 25);
		contentPane.add(lblMission);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(253, 245, 230)));
		panel.setBounds(224, 304, 299, 161);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnContact = new JTextPane();
		txtpnContact.setBounds(26, 11, 250, 142);
		panel.add(txtpnContact);
		txtpnContact.setText("Contact us if you have any inquiry\r\n\r\nFax : 04-5511405 / 017-2738293\r\n\r\nMultimedia : Facebook, Instagram, Twitter\r\n@weddingbydesign\r\n\r\nWebsite : WeddingByDesign@gmail.com");
		txtpnContact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerMenu cMain = new CustomerMenu();
				cMain.setVisible(true);
				setVisible(false);
			}
		});
		btnHome.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnHome.setBounds(30, 421, 91, 32);
		contentPane.add(btnHome);
		
		JButton btnAdvertisement = new JButton("Advertisement");
		btnAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement ad = new Advertisement();
				ad.setVisible(true);
				setVisible(false);
			}
		});
		btnAdvertisement.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnAdvertisement.setBounds(566, 421, 131, 32);
		contentPane.add(btnAdvertisement);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 23, 728, 541);
		contentPane.add(lblBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\Company Background.png");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblBackground.setIcon(scaledIcon);
	}
}
