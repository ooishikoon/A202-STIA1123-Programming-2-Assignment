package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Products extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Products frame = new Products();
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
	public Products() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Wedding Package");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		lblNewLabel.setBounds(321, 7, 338, 42);
		contentPane.add(lblNewLabel);

		
		JPanel panelPackage1 = new JPanel();
		panelPackage1.setBackground(SystemColor.info);
		panelPackage1.setBounds(21, 60, 270, 393);
		contentPane.add(panelPackage1);
		panelPackage1.setLayout(null);
		
		JLabel lblPackage1 = new JLabel("Package 1");
		lblPackage1.setForeground(new Color(240, 128, 128));
		lblPackage1.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblPackage1.setBounds(61, 22, 145, 29);
		panelPackage1.add(lblPackage1);
		
		JTextPane txtpnweddingPlanning_1 = new JTextPane();
		txtpnweddingPlanning_1.setBackground(SystemColor.info);
		txtpnweddingPlanning_1.setText("- Complete Food\r\n- Wedding planning & coordination\r\n- Wedding Cake\r\n- Photography\r\n- Videography\r\n");
		txtpnweddingPlanning_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtpnweddingPlanning_1.setBounds(43, 52, 197, 179);
		panelPackage1.add(txtpnweddingPlanning_1);
		
		JLabel lblp1 = new JLabel("New label");
		lblp1.setBounds(51, 271, 170, 111);
		panelPackage1.add(lblp1);
		ImageIcon icon1 = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\p1.jpg");
		Image img1 = icon1.getImage();
		Image imgScale1 = img1.getScaledInstance(lblp1.getWidth(), lblp1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
		lblp1.setIcon(scaledIcon1);
		
		JPanel panelPackage2 = new JPanel();
		panelPackage2.setBackground(SystemColor.info);
		panelPackage2.setBounds(303, 60, 270, 393);
		contentPane.add(panelPackage2);
		panelPackage2.setLayout(null);
		
		JLabel lblPackage2 = new JLabel("Package 2");
		lblPackage2.setForeground(new Color(240, 128, 128));
		lblPackage2.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblPackage2.setBounds(61, 21, 145, 29);
		panelPackage2.add(lblPackage2);
		
		JLabel lblp2 = new JLabel("");
		lblp2.setBounds(49, 271, 170, 111);
		panelPackage2.add(lblp2);
		ImageIcon icon2 = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\p2.jpg");
		Image img2 = icon2.getImage();
		Image imgScale2 = img2.getScaledInstance(lblp2.getWidth(), lblp2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
		lblp2.setIcon(scaledIcon2);
		
		JTextPane txtpnweddingPlanning_2 = new JTextPane();
		txtpnweddingPlanning_2.setBackground(SystemColor.info);
		txtpnweddingPlanning_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtpnweddingPlanning_2.setText("- Complete Food\r\n- Wedding planning & coordination\r\n- Wedding Cake\r\n- Master of Ceremony\r\n- Photography\r\n- Videography");
		txtpnweddingPlanning_2.setBounds(36, 49, 211, 192);
		panelPackage2.add(txtpnweddingPlanning_2);
		
		JPanel panelPackage3 = new JPanel();
		panelPackage3.setBackground(SystemColor.info);
		panelPackage3.setBounds(583, 60, 270, 393);
		contentPane.add(panelPackage3);
		panelPackage3.setLayout(null);
		
		JLabel lblp3 = new JLabel("");
		lblp3.setBounds(52, 271, 170, 111);
		panelPackage3.add(lblp3);
		ImageIcon icon3 = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\p3.jpg");
		Image img3 = icon3.getImage();
		Image imgScale3 = img3.getScaledInstance(lblp3.getWidth(), lblp3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
		lblp3.setIcon(scaledIcon3);
		
		JLabel lblPackage3 = new JLabel("Package 3");
		lblPackage3.setForeground(new Color(240, 128, 128));
		lblPackage3.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblPackage3.setBounds(52, 21, 145, 29);
		panelPackage3.add(lblPackage3);
		
		JTextPane txtpnweddingPlanning = new JTextPane();
		txtpnweddingPlanning.setBackground(SystemColor.info);
		txtpnweddingPlanning.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtpnweddingPlanning.setText("- Complete Food\r\n- Wedding planning & coordination\r\n- Wedding Cake\r\n- Master of Ceremony\r\n- Bridal Engagement\r\n- Photography\r\n- Videography\r\n- DJ");
		txtpnweddingPlanning.setBounds(32, 49, 228, 222);
		panelPackage3.add(txtpnweddingPlanning);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerMenu cMain = new CustomerMenu();
				cMain.setVisible(true);
				setVisible(false);
			}
		});
		btnHome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnHome.setBounds(21, 477, 104, 42);
		contentPane.add(btnHome);
		
		JButton btnPurchase = new JButton("Purchase");
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Purchase p = new Purchase();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnPurchase.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPurchase.setBounds(715, 477, 132, 42);
		contentPane.add(btnPurchase);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, -105, 869, 738);
		contentPane.add(lblBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\products background.jpg");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblBackground.setIcon(scaledIcon);
		
	}
}
