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

public class controlman3 extends JFrame {

	private JPanel contentPane;
    public JPanel jp;
    public JLabel lblNewLabel;
    public JLayeredPane layeredPane;
    public JTextPane tpshowname;
    public JButton btExit;
    public JButton btSubmit;
	public JButton btBack;
	private String[]s1= {"身份","姓名","编号","队伍"};
	private Object[][]p1= {
			{"","","","",""}
	};
	private String[]s= {"姓名","身份证","年龄","组别","比赛项目"};
	private Object[][]p= {
			{"","","",""}
	};
	public DefaultTableModel model1;
	public DefaultTableModel model;
	private JComboBox cbSex;
	private JComboBox cbAge;
	private JComboBox cbGroupOrder;
	private JComboBox cbSport;
	private JComboBox cbSetControlMan;
	public controlman3()  {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\4teamcontrol\\controlman3.jpg");
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
		btBack.setBounds(160, 679, 163, 64);
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(649, 679, 156, 64);
		
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 53, 27);
		btExit.setContentAreaFilled(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		cbSetControlMan = new JComboBox();
		cbSetControlMan.setBackground(new Color(237, 238, 232));
		cbSetControlMan.setBounds(385, 398, 218, 39);
		
		
		cbGroupOrder = new JComboBox();
		cbGroupOrder.setBackground(new Color(237, 238, 232));
		cbGroupOrder.setBounds(485, 200, 156, 39);
		
		cbAge = new JComboBox();
		cbAge.setBackground(new Color(237, 238, 232));
		cbAge.setBounds(750, 140, 156, 39);
		
		cbSex = new JComboBox();
		cbSex.setBackground(new Color(237, 238, 232));
		cbSex.setBounds(465, 140, 156, 39);
		
		cbSport = new JComboBox();
		cbSport.setBackground(new Color(237,238,232));
		cbSport.setBounds(189, 140, 156, 39);
		
		
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
		layeredPane.add(btSubmit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btBack, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbSport, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbSex, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbAge, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbGroupOrder, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbSetControlMan, JLayeredPane.MODAL_LAYER);
		
		setLayeredPane(layeredPane);
	}
}
