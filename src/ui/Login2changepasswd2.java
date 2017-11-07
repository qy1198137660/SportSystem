package ui;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login2changepasswd2 extends JFrame{
	public JPanel contentPane;
	public JPasswordField txfdNewpasswd;
	public JButton insure;
	public JPanel jp;
	public JLabel lblNewLabel;
	public JLayeredPane layeredPane;
	public JPasswordField txfdNewpasswd2;
	public Login2changepasswd2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("src/imgs/1Login/Login2changepasswd2.jpg");
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
		
		txfdNewpasswd2 = new JPasswordField();
		txfdNewpasswd2.setColumns(10);
		txfdNewpasswd2.setBounds(447, 404, 290, 27);
		
		txfdNewpasswd = new JPasswordField();
		txfdNewpasswd.setBounds(446, 356, 290, 27);
		txfdNewpasswd.setColumns(10); 
				
		insure = new JButton("");
		insure.setBounds(439, 471, 123, 29);
		insure.setContentAreaFilled(false);
		
		layeredPane.add(txfdNewpasswd, JLayeredPane.MODAL_LAYER);
		layeredPane.add(insure, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdNewpasswd2, JLayeredPane.MODAL_LAYER);
		setVisible(true);
	}
}
