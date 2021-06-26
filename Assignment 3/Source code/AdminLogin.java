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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Welcome Admin");
		lblTitle.setForeground(new Color(25, 25, 112));
		lblTitle.setFont(new Font("Lucida Calligraphy", Font.BOLD, 24));
		lblTitle.setBounds(169, 32, 230, 42);
		contentPane.add(lblTitle);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUsername.setBounds(162, 99, 93, 29);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(160, 173, 93, 29);
		contentPane.add(lblPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldUsername.setBounds(160, 133, 281, 29);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passwordField.setBounds(160, 202, 281, 29);
		contentPane.add(passwordField);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowPassword.isSelected()){
		            passwordField.setEchoChar((char)0);
		        }else{
		            passwordField.setEchoChar('`');
		        }
			}
		});
		chckbxShowPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		chckbxShowPassword.setBounds(160, 238, 125, 23);
		contentPane.add(chckbxShowPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldUsername.getText().equals("jasley") && passwordField.getText().equals("wrs2000")) {
					JOptionPane.showMessageDialog(null, "Login Successful.", "Welcome", JOptionPane.INFORMATION_MESSAGE);	
					AdminMenu aMain = new AdminMenu();
					aMain.setVisible(true);
					setVisible(false);
				}
				else 
					JOptionPane.showMessageDialog(null, "Incorrect username or password. \nPlease enter again.", "Login Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnLogin.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnLogin.setBounds(98, 298, 89, 31);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnReset.setBounds(230, 298, 89, 31);
		contentPane.add(btnReset);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want go to menu", "Main menu", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Home mainPage = new Home();
					mainPage.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnHome.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnHome.setBounds(360, 298, 93, 31);
		contentPane.add(btnHome);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(-191, 0, 947, 554);
		contentPane.add(lblBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\admin login.jpg");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblBackground.setIcon(scaledIcon);
	}

}
