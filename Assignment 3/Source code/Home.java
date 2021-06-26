package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Home extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Wedding By Design");
		lblWelcome.setBounds(101, 22, 271, 50);
		lblWelcome.setForeground(new Color(255, 218, 185));
		lblWelcome.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 25));
		contentPane.add(lblWelcome);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.setBounds(187, 133, 129, 38);
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLogin cLogin = new CustomerLogin();
				cLogin.setVisible(true);
				setVisible(false);
			}
		});
		btnCustomer.setFont(new Font("Book Antiqua", Font.PLAIN, 20));
		contentPane.add(btnCustomer);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin aLogin = new AdminLogin();
				aLogin.setVisible(true);
				setVisible(false);
			}
		});
		btnAdmin.setBounds(187, 192, 129, 38);
		btnAdmin.setFont(new Font("Book Antiqua", Font.PLAIN, 20));
		contentPane.add(btnAdmin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(187, 258, 129, 33);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Wedding Rental System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Book Antiqua", Font.PLAIN, 20));
		contentPane.add(btnExit);
		
		JLabel lblTitleBackground = new JLabel();
		lblTitleBackground.setBounds(-49, 11, 608, 50);
		contentPane.add(lblTitleBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\border.png");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblTitleBackground.getWidth(), lblTitleBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblTitleBackground.setIcon(scaledIcon);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setBounds(0, 0, 509, 339);
		contentPane.add(backgroundLabel);
		backgroundLabel.setIcon(new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\main background.jpg"));
	}
}
