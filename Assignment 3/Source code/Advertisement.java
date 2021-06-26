package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JTextPane;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertisement frame = new Advertisement();
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
	public Advertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("Wedding By Design");
		lblTitle.setBounds(136, 168, 391, 64);
		lblTitle.setForeground(new Color(240, 128, 128));
		lblTitle.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 36));
		contentPane.add(lblTitle);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(22, 537, 91, 32);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerMenu cMain = new CustomerMenu();
				cMain.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		btnHome.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(btnHome);
		
		JButton btnProducts = new JButton("Products");
		btnProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Products p = new Products();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnProducts.setBounds(504, 537, 103, 32);
		btnProducts.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(btnProducts);
		
		JLabel lblReadyToPlan = new JLabel("READY TO PLAN");
		lblReadyToPlan.setForeground(new Color(205, 92, 92));
		lblReadyToPlan.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		lblReadyToPlan.setBounds(184, 26, 276, 42);
		contentPane.add(lblReadyToPlan);
		
		JLabel lblYourBestDay = new JLabel("YOUR BEST DAY EVER?");
		lblYourBestDay.setForeground(new Color(205, 92, 92));
		lblYourBestDay.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		lblYourBestDay.setBounds(136, 65, 391, 42);
		contentPane.add(lblYourBestDay);
		
		JLabel lblComeHere = new JLabel("COME HERE!");
		lblComeHere.setForeground(new Color(205, 92, 92));
		lblComeHere.setFont(new Font("Constantia", Font.PLAIN, 42));
		lblComeHere.setBounds(183, 118, 266, 55);
		contentPane.add(lblComeHere);
		
		JLabel lblWeCanHelp = new JLabel("We can help you");
		lblWeCanHelp.setForeground(new Color(205, 92, 92));
		lblWeCanHelp.setFont(new Font("Constantia", Font.PLAIN, 20));
		lblWeCanHelp.setBounds(403, 288, 157, 32);
		contentPane.add(lblWeCanHelp);
		
		JLabel lblChooseWhereTo = new JLabel("choose where to get");
		lblChooseWhereTo.setForeground(new Color(205, 92, 92));
		lblChooseWhereTo.setFont(new Font("Constantia", Font.PLAIN, 20));
		lblChooseWhereTo.setBounds(413, 312, 217, 32);
		contentPane.add(lblChooseWhereTo);
		
		JLabel lblMarried = new JLabel("MARRIED");
		lblMarried.setForeground(new Color(255, 127, 80));
		lblMarried.setFont(new Font("Ink Free", Font.BOLD, 40));
		lblMarried.setBounds(403, 361, 204, 32);
		contentPane.add(lblMarried);
		
		JLabel lblThewhoIs = new JLabel("The \"who\" is up to you");
		lblThewhoIs.setForeground(Color.RED);
		lblThewhoIs.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 19));
		lblThewhoIs.setBounds(393, 424, 226, 42);
		contentPane.add(lblThewhoIs);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(-115, -33, 754, 690);
		contentPane.add(lblBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\advertisement.jpg");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblBackground.setIcon(scaledIcon);
	}
}
