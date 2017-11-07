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
import javax.swing.JCheckBox;

public class MainReferee1 extends JFrame {

	private JPanel contentPane;
    public JPanel jp;
    public JLabel lblNewLabel;
    public JLayeredPane layeredPane;
    public JTextPane tpshowname;
    public JButton btExit;
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
	public JTextPane txpName;
	public JTextPane txpNum;
	public 	JTextPane txpSport;
	private JButton btPass;
	private JButton btTrue1;
	private JButton btFalse1;
	private JButton btTrue2;
	private JButton btFalse2;
	private JButton btTrue3;
	private JButton btTrue4;
	private JButton btTrue5;
	private JButton btFalse3;
	private JButton btFalse4;
	private JButton btFalse5;
	private JTextPane txpScore1;
	private JTextPane txpScore2;
	private JTextPane txpScore3;
	private JTextPane txpScore4;
	private JTextPane txpScore5;
	public MainReferee1()  {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\4teamcontrol\\controlman2.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, i.getIconWidth(), i.getIconHeight()+30);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		jp = new JPanel();
		jp.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.setLayout(null);
		
		lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\6referee\\mainReferee1.jpg"));
		lblNewLabel.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.add(lblNewLabel);
		ImageIcon Trueimg=new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\btTRUE.PNG");
		ImageIcon Falseimg=new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\btFALSE.PNG");
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 53, 27);
		btExit.setContentAreaFilled(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		txpScore1 = new JTextPane();
		txpScore1.setFont(new Font("宋体", Font.PLAIN, 25));
		txpScore1.setEditable(false);
		txpScore1.setText("3.1");
		txpScore1.setBackground(new Color(243, 241, 228));
		txpScore1.setBounds(452, 255, 89, 39);
		
		txpScore2 = new JTextPane();
		txpScore2.setFont(new Font("宋体", Font.PLAIN, 25));
		txpScore2.setEditable(false);
		txpScore2.setText("3.1");
		txpScore2.setBackground(new Color(243, 241, 228));
		txpScore2.setBounds(452, 337, 89, 39);
	
		
		txpScore3 = new JTextPane();
		txpScore3.setFont(new Font("宋体", Font.PLAIN, 25));
		txpScore3.setEditable(false);
		txpScore3.setText("3.1");
		txpScore3.setBackground(new Color(243, 241, 228));
		txpScore3.setBounds(452, 425, 89, 39);
	
		
		txpScore4 = new JTextPane();
		txpScore4.setFont(new Font("宋体", Font.PLAIN, 25));
		txpScore4.setEditable(false);
		txpScore4.setText("3.1");
		txpScore4.setBackground(new Color(243, 241, 228));
		txpScore4.setBounds(452, 505, 89, 39);
	
		
		txpScore5 = new JTextPane();
		txpScore5.setFont(new Font("宋体", Font.PLAIN, 25));
		txpScore5.setEditable(false);
		txpScore5.setText("3.1");
		txpScore5.setBackground(new Color(243, 241, 228));
		txpScore5.setBounds(452, 591, 89, 39);
	
		
		btTrue2 = new JButton("");
		btTrue2.setBounds(687, 332, 49, 50);
		btTrue2.setIcon(Trueimg);
		
		btFalse2 = new JButton("");
		btFalse2.setBounds(764, 332, 49, 50);
		btFalse2.setIcon(Falseimg);
		
		btTrue3 = new JButton("");
		btTrue3.setBounds(687, 417, 49, 50);
		btTrue3.setIcon(Trueimg);
		
		btTrue4 = new JButton("");
		btTrue4.setBounds(687, 499, 49, 50);
		btTrue4.setIcon(Trueimg);

		
		btTrue5 = new JButton("");
		btTrue5.setBounds(687, 583, 49, 50);
		btTrue5.setIcon(Trueimg);

		
		btFalse3 = new JButton("");
		btFalse3.setBounds(764, 417, 49, 50);
		btFalse3.setIcon(Falseimg);
		
		btFalse4 = new JButton("");
		btFalse4.setBounds(764, 499, 49, 50);
		btFalse4.setIcon(Falseimg);

		
		btFalse5 = new JButton("");
		btFalse5.setBounds(764, 583, 49, 50);
		btFalse5.setIcon(Falseimg);
		
		
		btFalse1 = new JButton("");
		btFalse1.setIcon(Falseimg);
		btFalse1.setBounds(762, 247, 49, 50);
	
		
		btTrue1 = new JButton("");
		btTrue1.setIcon(Trueimg);
		btTrue1.setBounds(688, 249, 49, 50);

		
		btPass = new JButton("");
		btPass.setContentAreaFilled(false);
		btPass.setBounds(544, 693, 158, 65);
		
		txpName = new JTextPane();
		txpName.setBackground(new Color(160,175,170));
		txpName.setFont(new Font("宋体", Font.PLAIN, 25));
		txpName.setText("\u738B\u4E3D");
		txpName.setToolTipText("");
		txpName.setEditable(false);
		txpName.setBounds(256, 80, 123, 36);
		
		txpNum = new JTextPane();
		txpNum.setBackground(new Color(198,204,192));
		txpNum.setFont(new Font("宋体", Font.PLAIN, 25));
		txpNum.setText("001");
		txpNum.setEditable(false);
		txpNum.setBounds(514, 80, 114, 36);
		
		txpSport = new JTextPane();
		txpSport.setBackground(new Color(190,192,179));
		txpSport.setFont(new Font("宋体", Font.PLAIN, 25));
		txpSport.setText("\u827A\u672F\u4F53\u64CD");
		txpSport.setEditable(false);
		txpSport.setBounds(804, 80, 123, 36);
		
		
		model=new DefaultTableModel(p,s);
		model1=new DefaultTableModel(p1,s1);
		
		tpshowname = new JTextPane();
		//tpshowname.setDropMode(DropMode.ON_OR_INSERT);
		tpshowname.setText("wang");
		tpshowname.setFont(new Font("宋体", Font.PLAIN, 18));
		tpshowname.setBackground(new Color(132,157,154));
		tpshowname.setEditable(false);
		tpshowname.setBounds(882, 25, 65, 27);
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		
		btBack = new JButton("");
		btBack.setContentAreaFilled(false);
		btBack.setBounds(283, 695, 149, 63);
		layeredPane.add(btBack, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpSport, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpNum, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpName, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btPass, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btTrue1, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btFalse1, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btTrue2, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btFalse2, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btTrue3, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btFalse3, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btTrue4, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btFalse4, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btTrue5, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btFalse5, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpScore1, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpScore2, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpScore3, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpScore4, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpScore5, JLayeredPane.MODAL_LAYER);

		setLayeredPane(layeredPane);
	}
}
