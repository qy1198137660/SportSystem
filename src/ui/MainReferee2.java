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

public class MainReferee2 extends JFrame {

	private JPanel contentPane;
    public JPanel jp;
    public JLabel lblNewLabel;
    public JLayeredPane layeredPane;
    public JTextPane tpshowname;
    public JButton btExit;
    public JButton btSubmit;
	public JButton btBack;
	public DefaultTableModel model1;
	public DefaultTableModel model;
	private JTextField txfdPScore;
	private JTextField txfdDScore;
	public MainReferee2()  {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\4teamcontrol\\controlman12.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, i.getIconWidth(), i.getIconHeight()+30);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		jp = new JPanel();
		jp.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.setLayout(null);
		
		lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\6referee\\mainReferee2.jpg"));
		lblNewLabel.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
		jp.add(lblNewLabel);
		
		btBack = new JButton("");
		btBack.setContentAreaFilled(false);
		btBack.setBounds(257, 661, 146, 57);
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(608, 661, 130, 64);
		
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 53, 27);
		btExit.setContentAreaFilled(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		JTextPane txfdScore = new JTextPane();
		txfdScore.setEditable(false);
		txfdScore.setBounds(388, 507, 218, 53);
	
		
		txfdDScore = new JTextField();
		txfdDScore.setBounds(384, 193, 226, 55);
	
		txfdPScore = new JTextField();
		txfdPScore.setBounds(384, 348, 226, 55);

		JTextPane txpName = new JTextPane();
		txpName.setFont(new Font("宋体", Font.PLAIN, 25));
		txpName.setText("\u5C0F\u7EA2");
		txpName.setBackground(new Color(237, 238, 232));
		txpName.setEditable(false);
		txpName.setBounds(257, 104, 119, 37);
		
		JTextPane txpGroupNum = new JTextPane();
		txpGroupNum.setFont(new Font("宋体", Font.PLAIN, 25));
		txpGroupNum.setText("001");
		txpGroupNum.setBackground(new Color(237, 238, 232));
		txpGroupNum.setEditable(false);
		txpGroupNum.setBounds(518, 104, 75, 37);
		
		JTextPane txpGroupOrder = new JTextPane();
		txpGroupOrder.setText("\u5973\u5B50\u8DF3\u9A6C");
		txpGroupOrder.setFont(new Font("宋体", Font.PLAIN, 25));
		txpGroupOrder.setBackground(new Color(237, 238, 232));
		txpGroupOrder.setEditable(false);
		txpGroupOrder.setBounds(790, 104, 111, 37);
		
		
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
		layeredPane.add(txpName, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpGroupNum, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txpGroupOrder, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdPScore, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdDScore, JLayeredPane.MODAL_LAYER);
		layeredPane.add(txfdPScore, JLayeredPane.MODAL_LAYER);
		
		setLayeredPane(layeredPane);
	}
}
