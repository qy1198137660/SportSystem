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

import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class controlman6 extends JFrame {

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
	private JComboBox cbSport;
	private JButton btSubmit;
	private JRadioButton rdbt1;
	private JRadioButton rdbt2;
	private JRadioButton rdbtFirstGame;
	private JRadioButton rdbtFinalGame;
	public ButtonGroup  gsex=new ButtonGroup();
	public controlman6()  {
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
		
		lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\4teamcontrol\\controlman6.jpg"));
		lblNewLabel.setText("");
		lblNewLabel.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.add(lblNewLabel);
		
		btBack = new JButton("");
		btBack.setContentAreaFilled(false);
		btBack.setBounds(163, 679, 156, 64);
		
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 53, 27);
		btExit.setContentAreaFilled(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		rdbtFirstGame = new JRadioButton("\u521D\u8D5B");
		rdbtFirstGame.setFont(new Font("宋体", Font.PLAIN, 25));
		rdbtFirstGame.setBackground(new Color(237, 238, 232));
		rdbtFirstGame.setBounds(177, 485, 89, 29);
		
		rdbtFinalGame = new JRadioButton("\u51B3\u8D5B");
		rdbtFinalGame.setFont(new Font("宋体", Font.PLAIN, 25));
		rdbtFinalGame.setBackground(new Color(237, 238, 232));
		rdbtFinalGame.setBounds(262, 485, 89, 29);
		
		gsex.add(rdbtFinalGame);
		gsex.add(rdbtFirstGame);//初赛复赛单选框
		
		rdbt2 = new JRadioButton("8-11\u5C81\u5973\u5B50\u53CC\u6760\u9879\u76EE");
		rdbt2.setFont(new Font("宋体", Font.PLAIN, 25));
		rdbt2.setBackground(new Color(237, 238, 232));
		rdbt2.setBounds(494, 231, 281, 29);
		
		rdbt1 = new JRadioButton("5-7\u5C81\u5973\u5B50\u8DF3\u9A6C\u9879\u76EE");
		rdbt1.setFont(new Font("宋体", Font.PLAIN, 25));
		rdbt1.setBackground(new Color(237, 238, 232));
		rdbt1.setBounds(245, 230, 250, 29);
		
		JRadioButton rdbtALL = new JRadioButton("\u5168\u9009");
		rdbtALL.setFont(new Font("宋体", Font.PLAIN, 25));
		rdbtALL.setBackground(new Color(237,238,232));
		rdbtALL.setBounds(166, 232, 82, 29);
		
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(646, 679, 156, 64);
		
		cbSport = new JComboBox();
		cbSport.setBackground(new Color(237,238,232));
		cbSport.setBounds(163, 140, 156, 39);
		
		
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
		layeredPane.add(btBack, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbSport, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSubmit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(rdbtALL, JLayeredPane.MODAL_LAYER);
		layeredPane.add(rdbt1, JLayeredPane.MODAL_LAYER);
		layeredPane.add(rdbt2, JLayeredPane.MODAL_LAYER);
		layeredPane.add(rdbtFirstGame, JLayeredPane.MODAL_LAYER);
		layeredPane.add(rdbtFinalGame, JLayeredPane.MODAL_LAYER);

		
		setLayeredPane(layeredPane);
	}
}
