package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

public class SystemAdmin12 extends JFrame {

	private JPanel contentPane;
	public JTextField txfdNewpasswd;
	public JPanel jp;
	public JLabel lblNewLabel;
	public JLayeredPane layeredPane;
	public JTextField txfdNewpasswd2;
	public JTextPane tpshowname;
	public JButton btSubmit;
	public JButton btBack;
	public JButton btExit;
	private JTable table;
	private JScrollPane scrollPane1;
	private String[]tableHeader ;
	private Object[][]tabledata ;
	public SystemAdmin12() {
		setResizable(false);
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\2SystemAdmin\\SystemAdmin1-2.jpg");
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
		lblNewLabel.setToolTipText("aDADA");
		lblNewLabel.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.add(lblNewLabel);
		//jp.add(scrollPane1);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		scrollPane1 = new JScrollPane();
		scrollPane1.setToolTipText("qingshuru");
		scrollPane1.setLocation(225, 196);
		scrollPane1.setSize(545, 406);
		
		tableHeader=new String[] {"", "", ""};
		tabledata=new Object[][] {{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""}};
		table = new JTable(tabledata,tableHeader);
		table.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		table.setBounds(230, 196, 555, 406);
		table.setRowHeight(50);
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 40, 27);
		btExit.setContentAreaFilled(false);

		btBack = new JButton("");
		btBack.setContentAreaFilled(false);
		btBack.setBounds(314, 687, 123, 40);
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(582, 687, 180, 40);
		
		tpshowname = new JTextPane();
		tpshowname.setEditable(false);
		tpshowname.setBounds(875, 25, 60, 27);tpshowname.setBackground(new Color(132,157,154));
		scrollPane1.setViewportView(table);
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSubmit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btBack, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		//layeredPane.add(table, JLayeredPane.MODAL_LAYER);
		layeredPane.add(scrollPane1, JLayeredPane.MODAL_LAYER);

		setLayeredPane(layeredPane);
	}
}
