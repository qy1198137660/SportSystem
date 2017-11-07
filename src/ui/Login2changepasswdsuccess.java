package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Login2changepasswdsuccess extends JFrame {

	private JPanel contentPane;
    public JButton btBack;
    public JPanel jp;
    public JLabel lblNewLabel;
    public JLayeredPane layeredPane;
	public Login2changepasswdsuccess() {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("src/imgs/1Login/Login2changepasswdsuccess.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, i.getIconWidth(), i.getIconHeight()+30);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		jp = new JPanel();
		jp.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.setLayout(null);
		
		lblNewLabel = new JLabel(i);
		lblNewLabel.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.add(lblNewLabel);
		
		btBack = new JButton("");
		btBack.setContentAreaFilled(false);
		btBack.setBounds(425, 395, 140, 40);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(btBack, JLayeredPane.MODAL_LAYER);
		setLayeredPane(layeredPane);
	}

}
