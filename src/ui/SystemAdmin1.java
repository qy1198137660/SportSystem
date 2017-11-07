package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Font;

public class SystemAdmin1 extends JFrame {

	private JPanel contentPane;
	public JTextField txfdNewpasswd;
	public JButton insure;
	public JPanel jp;
	public JLabel lblNewLabel;
	public JLayeredPane layeredPane;
	public JTextField txfdNewpasswd2;
	public JComboBox cbSelectTeamname;
	public JTextPane tpshowname;
	private String[]teamname= {"1","2","3"};
	private JTextField txfdID;
	private JPasswordField txfdPasswd;
	public JButton btSubmit;
	public JButton btBack;
	public JButton btExit;
	public SystemAdmin1() {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("src/imgs/2SystemAdmin/SystemAdmin1.jpg");
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
		
		insure = new JButton("");
		insure.setContentAreaFilled(false);
		insure.setBounds(438, 600, 122, 30);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 40, 27);
		btExit.setContentAreaFilled(false);

		btBack = new JButton("");
		btBack.setContentAreaFilled(false);
		btBack.setBounds(314, 687, 123, 40);
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(582, 687, 123, 40);
		
		txfdID = new JTextField();
		txfdID.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		txfdID.setBounds(452, 364, 257, 60);
		txfdID.setColumns(10);
		
		txfdPasswd = new JPasswordField();
		txfdPasswd.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		txfdPasswd.setBounds(452, 490, 257, 60);
		txfdPasswd.setColumns(10);
		
		cbSelectTeamname = new JComboBox(teamname);
		cbSelectTeamname.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		cbSelectTeamname.setBounds(442, 245, 257, 55);
		
		tpshowname = new JTextPane();
		tpshowname.setEditable(false);
		tpshowname.setBounds(875, 25, 60, 27);
		tpshowname.setBackground(new Color(132,157,154));
		
		
		layeredPane.add(insure, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbSelectTeamname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdPasswd, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdID, JLayeredPane.MODAL_LAYER);
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSubmit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btBack, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		setLayeredPane(layeredPane);
	}
}
