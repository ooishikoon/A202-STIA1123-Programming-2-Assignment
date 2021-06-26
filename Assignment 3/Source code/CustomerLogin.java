package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerLogin extends JFrame {

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
					CustomerLogin frame = new CustomerLogin();
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
	public CustomerLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Welcome Customer");
		lblTitle.setForeground(new Color(255, 228, 225));
		lblTitle.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		lblTitle.setBounds(124, 11, 312, 42);
		contentPane.add(lblTitle);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUsername.setBounds(155, 132, 93, 29);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(155, 201, 93, 29);
		contentPane.add(lblPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldUsername.setBounds(155, 161, 281, 29);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passwordField.setBounds(155, 230, 281, 29);
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
		chckbxShowPassword.setBounds(155, 266, 125, 23);
		contentPane.add(chckbxShowPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldUsername.getText().equals("mickey") && passwordField.getText().equals("mickey123")) {
					JOptionPane.showMessageDialog(null, "Login Successful.", "Welcome", JOptionPane.INFORMATION_MESSAGE);	
					CustomerMenu cMain = new CustomerMenu();
					cMain.setVisible(true);
					setVisible(false);
				}
				else 
					JOptionPane.showMessageDialog(null, "Incorrect username or password. \nPlease enter again.", "Login Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnLogin.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnLogin.setBounds(103, 325, 89, 31);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnReset.setBounds(235, 325, 89, 31);
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
		btnHome.setBounds(365, 325, 93, 31);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel = new JLabel(">>No account? Click here to create one");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "You are going to register your member", "Registration", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Registration register = new Registration();
					register.setVisible(true);
					setVisible(false);
				}
			}
		});
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(176, 391, 233, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 613, 453);
		contentPane.add(lblBackground);
		lblBackground.setIcon(new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\customer login background.jpg"));
	}
}
