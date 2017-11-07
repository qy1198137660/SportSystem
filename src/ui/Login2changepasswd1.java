package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login2changepasswd1 extends JFrame {

	 public JPanel contentPane;
	 public JTextField textField_1;
	 public JTextField textField_2;
	 public JButton button;
	 public JButton button_1;
	 public JTextField txfdEXid;
	 public JPasswordField txfdEXpasswd;
     public JPanel jp;
	public Login2changepasswd1() {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		ImageIcon i2 = new ImageIcon("src/imgs/1Login/Login2changepasswd1.jpg");
		setBounds(0, 0, i2.getIconWidth(), i2.getIconHeight()+30);

		jp = new JPanel();
		jp.setBounds(0, 0, i2.getIconWidth(), i2.getIconHeight());
		jp.setLayout(null);
		JLabel lblNewLabel = new JLabel(i2);
		lblNewLabel.setBounds(0, 0, i2.getIconWidth(), i2.getIconHeight());
		jp.add(lblNewLabel);
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.add(jp);
		
		JButton txfd = new JButton("");
		txfd.setBounds(439, 457, 125, 36);
		txfd.setContentAreaFilled(false);
		
		txfdEXid = new JTextField();
		txfdEXid.setBounds(448, 347, 290, 29);
	
		txfdEXid.setColumns(10);
		
		txfdEXpasswd = new JPasswordField();
		txfdEXpasswd.setBounds(448, 394, 290, 29);
		txfdEXpasswd.setColumns(10);
		setLayeredPane(layeredPane);
		layeredPane.add(txfdEXid, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdEXpasswd, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfd, JLayeredPane.MODAL_LAYER);
		setVisible(true);
	}
}
