package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import objects.Member;
import objects.Team;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login1 extends JFrame {

	public JPanel contentPane;
	public JTextField txfdID;
	public JPasswordField txfdPasswd;
	public JButton btLogin;
	public JButton btChangepasswd;
	public JPanel jp;
	public JLabel lblNewLabel;
	public JLayeredPane layeredPane;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Login1() {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("src/imgs/1Login/Login1.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, i.getIconWidth(), i.getIconHeight()+30);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jp = new JPanel();
		jp.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.setLayout(null);
		
		lblNewLabel = new JLabel(i);
		lblNewLabel.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.add(lblNewLabel);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		setLayeredPane(layeredPane);
       
		txfdPasswd = new JPasswordField();
		txfdPasswd.setBounds(432, 457, 210, 27);
		txfdPasswd.setColumns(10);

		btChangepasswd = new JButton("");
		btChangepasswd.setContentAreaFilled(false);
		btChangepasswd.setBounds(437, 562, 123, 29);

		btLogin = new JButton("");
		btLogin.setBounds(435, 518, 123, 29);
		btLogin.setContentAreaFilled(false);
		btLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				objects.Team team=new Team(txfdID.getText());
				if (team.checkPasswdByDB(txfdPasswd.getText())) {
					System.out.println("登陆成功");
				}else {
					System.out.println("登录失败");
				}
			}
		});
		

		txfdID = new JTextField();
		txfdID.setBounds(432, 400, 210, 27);
		txfdID.setColumns(10); 
		
		layeredPane.add(txfdPasswd, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdID, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btLogin, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btChangepasswd, JLayeredPane.MODAL_LAYER);
		

		setVisible(true);
	}
}
