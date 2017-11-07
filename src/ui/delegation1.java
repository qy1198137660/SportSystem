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

public class delegation1 extends JFrame {

	private JPanel contentPane;
	public JTextField txfdNewpasswd;
	public JPanel jp;
	public JLabel lblNewLabel;
	public JLayeredPane layeredPane;
	public JTextField txfdNewpasswd2;
	public JTextPane tpshowname;
	public JButton btSubmit;
	public JButton btExit;
	private JTextField txfdLeader;
	private JTextField txfdDoctor;
	private JTextField txfdCoach;
	private JTextField txfdRefree;
	private JTextField txfdLeaderIdentity;
	private JTextField txfdDoctorIdentity;
	private JTextField txfdCoachIdentity;
	private JTextField txfdRefreeIdentity;
	private JTextField txfdLeaderTel;
	private JTextField txfdDoctorTel;
	private JTextField txfdCoachTel;
	private JTextField txfdRefreeTel;
	private JTable table;
	private String[]s= {"姓名","身份证","组别","比赛类型"};
	private Object[][]p= {
			{"","","",""}
	};
	public DefaultTableModel model;
    public JButton btUpload;
    public JComboBox cbAddInfo;
	public delegation1() {
		setResizable(false);
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\3delegation\\delegation1.jpg");
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
		
				
				txfdLeader = new JTextField();
				txfdLeader.setBounds(217, 164, 108, 27);
				jp.add(txfdLeader);
				txfdLeader.setColumns(10);
				
				txfdDoctor = new JTextField();
				txfdDoctor.setColumns(10);
				txfdDoctor.setBounds(217, 206, 108, 27);
				jp.add(txfdDoctor);
				
				txfdCoach = new JTextField();
				txfdCoach.setColumns(10);
				txfdCoach.setBounds(217, 255, 108, 27);
				jp.add(txfdCoach);
				
				txfdRefree = new JTextField();
				txfdRefree.setColumns(10);
				txfdRefree.setBounds(217, 297, 108, 27);
				jp.add(txfdRefree);
				
				txfdLeaderIdentity = new JTextField();
				txfdLeaderIdentity.setBounds(396, 164, 167, 27);
				jp.add(txfdLeaderIdentity);
				txfdLeaderIdentity.setColumns(10);
				
				txfdDoctorIdentity = new JTextField();
				txfdDoctorIdentity.setColumns(10);
				txfdDoctorIdentity.setBounds(396, 206, 167, 27);
				jp.add(txfdDoctorIdentity);
				
				txfdCoachIdentity = new JTextField();
				txfdCoachIdentity.setColumns(10);
				txfdCoachIdentity.setBounds(396, 255, 167, 27);
				jp.add(txfdCoachIdentity);
				
				txfdRefreeIdentity = new JTextField();
				txfdRefreeIdentity.setColumns(10);
				txfdRefreeIdentity.setBounds(396, 297, 167, 27);
				jp.add(txfdRefreeIdentity);
				
				txfdLeaderTel = new JTextField();
				txfdLeaderTel.setColumns(10);
				txfdLeaderTel.setBounds(627, 164, 167, 27);
				jp.add(txfdLeaderTel);
				
				txfdDoctorTel = new JTextField();
				txfdDoctorTel.setColumns(10);
				txfdDoctorTel.setBounds(627, 206, 167, 27);
				jp.add(txfdDoctorTel);
				
				txfdCoachTel = new JTextField();
				txfdCoachTel.setColumns(10);
				txfdCoachTel.setBounds(627, 248, 167, 27);
				jp.add(txfdCoachTel);
				
				txfdRefreeTel = new JTextField();
				txfdRefreeTel.setColumns(10);
				txfdRefreeTel.setBounds(627, 290, 167, 27);
				jp.add(txfdRefreeTel);
				
				JComboBox cbSexLeader = new JComboBox();
				cbSexLeader.setBounds(826, 164, 68, 27);
				cbSexLeader.addItem("男");
				cbSexLeader.addItem("女");
				
				JComboBox cbSexDoctor = new JComboBox();
				cbSexDoctor.setBounds(826, 206, 68, 27);
				cbSexDoctor.addItem("男");
				cbSexDoctor.addItem("女");
				
				JComboBox cbSexCoach = new JComboBox();
				cbSexCoach.setBounds(826, 248, 68, 27);
				cbSexCoach.addItem("男");
				cbSexCoach.addItem("女");
				
				JComboBox cbSexRefree = new JComboBox();
				cbSexRefree.setBounds(826, 290, 68, 27);
				cbSexRefree.addItem("男");
				cbSexRefree.addItem("女");
				
				JComboBox cbAddInfo = new JComboBox();
				cbAddInfo.setFont(new Font("华文楷体", Font.PLAIN, 23));
				cbAddInfo.setBackground(new Color(189, 183, 107));
				cbAddInfo.setBounds(45, 713, 235, 40);
				cbAddInfo.addItem("请选择添加用户身份");
				
				btUpload = new JButton("");
				btUpload.setBounds(295, 713, 140, 40);
				btUpload.setContentAreaFilled(false);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(35, 450, 932, 260);
				
				
				model = new DefaultTableModel(p,s);
				table = new JTable(model);
				table.setFont(new Font("宋体", Font.PLAIN, 25));
			
				table.setRowHeight(50);
				scrollPane.setViewportView(table);
				
		btExit = new JButton("");
		btExit.setBounds(960, 30, 40, 27);
		btExit.setContentAreaFilled(false);
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(830, 715, 130, 40);
		
		tpshowname = new JTextPane();
		tpshowname.setEditable(false);
		tpshowname.setBounds(875, 25, 60, 27);
		tpshowname.setBackground(new Color(132,157,154));
		
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSubmit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(scrollPane, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btUpload, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbAddInfo, JLayeredPane.MODAL_LAYER);
		//layeredPane.add(cbSexLeader, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbSexDoctor, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbSexLeader, JLayeredPane.MODAL_LAYER);
		//layeredPane.add(cbSexLeader, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbSexCoach, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbSexRefree, JLayeredPane.MODAL_LAYER);
		setLayeredPane(layeredPane);
	}
}
