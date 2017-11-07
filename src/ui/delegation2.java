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
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

public class delegation2 extends JFrame {

	private JPanel contentPane;
    public JPanel jp;
    public JLabel lblNewLabel;
    public JLayeredPane layeredPane;
    public JTextPane tpshowname;
    public JButton btExit;
    public JButton btSubmit;
	public JButton btBack;
	private String[]s1= {"身份","姓名","身份证","电话","性别"};
	private Object[][]p1= {
			{"","","","",""}
	};
	private String[]s= {"姓名","身份证","年龄","组别","比赛项目"};
	private Object[][]p= {
			{"","","","",""}
	};
	public DefaultTableModel model1;
	public DefaultTableModel model;
	private JTable table_1;
	private JTable table;
	private JScrollPane scrollPane ;
	private JScrollPane scrollPane_1 ;
	private JButton btUpload;
	public delegation2() {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\3delegation\\delegation2.jpg");
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
		btBack.setBounds(309, 712, 154, 46);
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(617, 712, 183, 46);
		
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 53, 27);
		btExit.setContentAreaFilled(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		btUpload = new JButton("");
		btUpload.setContentAreaFilled(false);
		btUpload.setBounds(131, 712, 154, 46);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 410, 930, 300);
		model=new DefaultTableModel(p,s);
		table=new JTable(model);
		table.setFont(new Font("宋体", Font.PLAIN, 25));
		table.setRowHeight(50);
		table.getTableHeader().setFont(new Font("宋体", Font.PLAIN, 25));
		scrollPane.setViewportView(table);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(35, 92, 930, 315);
		model1=new DefaultTableModel(p1,s1);
		table_1 = new JTable(model1);
		table_1.setFont(new Font("宋体", Font.PLAIN, 25));
		table_1.setRowHeight(50);
		table_1.getTableHeader().setFont(new Font("宋体", Font.PLAIN, 25));
		scrollPane_1.setViewportView(table_1);
		
		tpshowname = new JTextPane();
		tpshowname.setEditable(false);
		tpshowname.setBounds(875, 25, 60, 27);
		tpshowname.setBackground(new Color(132,157,154));
		
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSubmit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btBack, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btUpload, JLayeredPane.MODAL_LAYER);
		layeredPane.add(scrollPane_1, JLayeredPane.MODAL_LAYER);
		layeredPane.add(scrollPane, JLayeredPane.MODAL_LAYER);
	
		setLayeredPane(layeredPane);
	}
}
