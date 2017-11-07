package ui;

import java.awt.BorderLayout;
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
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JComboBox;

public class GroupControlMan3 extends JFrame {

	private JPanel contentPane;
    public JPanel jp;
    public JLabel lblNewLabel;
    public JLayeredPane layeredPane;
    public JTextPane tpshowname;
    public JButton btExit;
    public JButton btGenerate;
	public JButton btBack;
	private String[]s1= {"名次","编号","姓名","队伍","D分","P分","评分","总得分"};
	private Object[][]p1= {
			{"","","","","","","",""}
	};
	private String[]s= {"姓名","身份证","年龄","组别","比赛项目"};
	private Object[][]p= {
			{"","","",""}
	};
	public DefaultTableModel model1;
	public DefaultTableModel model;
	private JTable table_1;
	private JScrollPane scrollPane_1 ;
	private JComboBox cbGroupNum;
	public JTextPane txpSport;
	public JTextPane txpSex;
	public 	JTextPane txpAge;
	private JButton btSubmit;
	public GroupControlMan3()  {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\5groupcontrol\\GroupControlMan3.jpg");
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
		btBack.setBounds(163, 679, 156, 64);
		
		btGenerate = new JButton("");
		btGenerate.setContentAreaFilled(false);
		btGenerate.setBounds(574, 188, 91, 27);
		
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 53, 27);
		btExit.setContentAreaFilled(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(646, 679, 156, 64);
		
		txpSport = new JTextPane();
		txpSport.setFont(new Font("宋体", Font.PLAIN, 25));
		txpSport.setText("\u827A\u672F\u4F53\u64CD");
		txpSport.setToolTipText("");
		txpSport.setEditable(false);
		txpSport.setBounds(221, 251, 129, 39);
		
		txpSex = new JTextPane();
		txpSex.setFont(new Font("宋体", Font.PLAIN, 25));
		txpSex.setText("\u5973");
		txpSex.setEditable(false);
		txpSex.setBounds(491, 249, 112, 47);
		
		txpAge = new JTextPane();
		txpAge.setFont(new Font("宋体", Font.PLAIN, 25));
		txpAge.setText("7\u5C81");
		txpAge.setEditable(false);
		txpAge.setBounds(787, 249, 91, 47);
		
		cbGroupNum = new JComboBox();
		cbGroupNum.setBackground(new Color(237,238,232));
		cbGroupNum.setBounds(384, 188, 149, 34);
		
		
		model=new DefaultTableModel(p,s);
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(122, 311, 756, 276);
		model1=new DefaultTableModel(p1,s1);
		table_1 = new JTable(model1);
		table_1.setFont(new Font("宋体", Font.PLAIN, 25));
		table_1.setRowHeight(50);
		table_1.getTableHeader().setFont(new Font("宋体", Font.PLAIN, 25));
		scrollPane_1.setViewportView(table_1);
		
		tpshowname = new JTextPane();
		//tpshowname.setDropMode(DropMode.ON_OR_INSERT);
		tpshowname.setText("wang");
		tpshowname.setFont(new Font("宋体", Font.PLAIN, 18));
		tpshowname.setBackground(new Color(132,157,154));
		tpshowname.setEditable(false);
		tpshowname.setBounds(882, 25, 65, 27);
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btGenerate, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btBack, JLayeredPane.MODAL_LAYER);
		layeredPane.add(scrollPane_1, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbGroupNum, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpAge, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpSex, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpSport, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSubmit, JLayeredPane.MODAL_LAYER);

		
		setLayeredPane(layeredPane);
	}
}
