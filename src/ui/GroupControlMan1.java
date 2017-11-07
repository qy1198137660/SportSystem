package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class GroupControlMan1 extends JFrame {

	private JPanel contentPane;
	public JButton btGroupGenerate;
	public JButton btGroupControl;
    public JPanel jp;
    public JLabel lblNewLabel;
    public JLayeredPane layeredPane;
    public JTextPane tpshowname;
    public JButton btExit;
	public  GroupControlMan1() {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\4teamcontrol\\controlman.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, i.getIconWidth(), i.getIconHeight()+30);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		jp = new JPanel();
		jp.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.setLayout(null);
		
		lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\5groupcontrol\\GroupControlMan1.jpg"));
		lblNewLabel.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.add(lblNewLabel);
		//btSetpasswd.setFocusPainted(false);
		//btSetpasswd.setBorderPainted(false);
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 40, 27);
		btExit.setContentAreaFilled(false);
		
		btGroupControl = new JButton("");
		btGroupControl.setContentAreaFilled(false);
		btGroupControl.setBounds(355, 311, 260, 59);
		//btSetAthleteNum.setFocusPainted(false);
		//btSetAthleteNum.setBorderPainted(false);
		
		btGroupGenerate = new JButton("");
		btGroupGenerate.setContentAreaFilled(false);
		btGroupGenerate.setBounds(355, 395, 260, 59);
		//btSetRacetype.setFocusPainted(false);
		//btSetRacetype.setBorderPainted(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		tpshowname = new JTextPane();
		tpshowname.setText("zhang");
		tpshowname.setEditable(false);
		tpshowname.setBounds(887, 25, 62, 27);
		tpshowname.setBackground(new Color(132,157,154));
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btGroupControl, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btGroupGenerate, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		setLayeredPane(layeredPane);
	}
}
