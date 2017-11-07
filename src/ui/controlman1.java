package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class controlman1 extends JFrame {

	private JPanel contentPane;
	public JTextField txfdNewpasswd;
	public JPanel jp;
	public JLabel lblNewLabel;
	public JLayeredPane layeredPane;
	public JTextField txfdNewpasswd2;
	public JTextPane tpshowname;
	public JButton btSubmit;
	public JButton btExit;
	public JButton btBack;
	private JTextField txfdAthlete2;
	private JTextField txfdAthlete1;
	private String[]s= {"姓名","身份证","组别","比赛类型"};
	private Object[][]p= {
			{"","","",""}
	};
	public DefaultTableModel model;
    public JComboBox cbAddInfo;
    private JTextField txfdAthlete3;
    private JTextField txfdAthlete5;
    private JTextField txfdAthlete6;
    private JTextField txfdAthlete7;
    private JTextField txfdAthlete4;
    private JTextField txfdAthlete8;
    private JTextField txfdGroupOrder;
    private JComboBox cbJudge;
    private JTextField txfdJudge1;
    private JTextField txfdJudge2;
    private JTextField txfdJudge3;
    private JTextField txfdJudge4;
    private JTextField txfdJudge5;
    public JComboBox cbAge;

    
	public controlman1() 
	{
		setResizable(false);
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\4teamcontrol\\controlman1.jpg");
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
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		btBack = new JButton("");
		btBack.setBounds(178, 692, 134, 45);
		btBack.setContentAreaFilled(false);
		
		JComboBox cbName = new JComboBox();
		cbName.setBounds(192, 133, 154, 33);
		
		JComboBox cbSex = new JComboBox();
		cbSex.setBounds(468, 133, 154, 33);
		
		JComboBox cbAge = new JComboBox();
		cbAge.setBounds(756, 133, 154, 33);
		
		txfdGroupOrder = new JTextField();
		txfdGroupOrder.setBounds(459, 197, 140, 27);
		txfdGroupOrder.setColumns(10);
		
		cbJudge = new JComboBox();
		cbJudge.setBounds(289, 524, 133, 27);
		
		txfdJudge1 = new JTextField();
		txfdJudge1.setBounds(524, 524, 128, 27);
		txfdJudge1.setColumns(10);
		
		txfdJudge2 = new JTextField();
		txfdJudge2.setColumns(10);
		txfdJudge2.setBounds(756, 524, 128, 27);
		
		txfdJudge3 = new JTextField();
		txfdJudge3.setColumns(10);
		txfdJudge3.setBounds(289, 611, 133, 27);
		
		txfdJudge4 = new JTextField();
		txfdJudge4.setColumns(10);
		txfdJudge4.setBounds(524, 611, 128, 27);
		
		txfdJudge5 = new JTextField();
		txfdJudge5.setColumns(10);
		txfdJudge5.setBounds(756, 611, 128, 27);
			
				txfdAthlete2 = new JTextField();
				txfdAthlete2.setBounds(290, 313, 187, 27);
				
				txfdAthlete2.setColumns(10);
				
				txfdAthlete1 = new JTextField();
				txfdAthlete1.setColumns(10);
				txfdAthlete1.setBounds(290, 248, 187, 27);
				
				txfdAthlete3 = new JTextField();
				txfdAthlete3.setColumns(10);
				txfdAthlete3.setBounds(290, 384, 187, 27);
				
				txfdAthlete5 = new JTextField();
				txfdAthlete5.setColumns(10);
				txfdAthlete5.setBounds(578, 248, 187, 27);
				
				txfdAthlete6 = new JTextField();
				txfdAthlete6.setColumns(10);
				txfdAthlete6.setBounds(578, 313, 187, 27);
				
				txfdAthlete7 = new JTextField();
				txfdAthlete7.setColumns(10);
				txfdAthlete7.setBounds(578, 384, 187, 27);
				
				txfdAthlete4 = new JTextField();
				txfdAthlete4.setColumns(10);
				txfdAthlete4.setBounds(290, 460, 187, 27);
				
				txfdAthlete8 = new JTextField();
				txfdAthlete8.setColumns(10);
				txfdAthlete8.setBounds(578, 460, 187, 27);
				
				
				model = new DefaultTableModel(p,s);
				
		btExit = new JButton("");
		btExit.setBounds(950, 25, 50, 32);
		btExit.setContentAreaFilled(false);
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(658, 686, 162, 57);
		
		tpshowname = new JTextPane();
		tpshowname.setEditable(false);tpshowname.setBackground(new Color(132,157,154));
		tpshowname.setBounds(885, 25, 58, 27);
		
		
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSubmit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdGroupOrder, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdJudge1, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdJudge2, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdJudge3, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdJudge4, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdJudge5, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbName, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbSex, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbAge, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbJudge, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdAthlete2, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdAthlete8, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdAthlete1, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdAthlete3, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdAthlete4, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdAthlete5, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdAthlete6, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdAthlete7, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btBack, JLayeredPane.MODAL_LAYER);
		setLayeredPane(layeredPane);
	}
}
