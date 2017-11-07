package ui;

/*参看JTableButton和JTableButtonRenderer类*/

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
import javax.swing.table.TableCellRenderer;

import java.awt.Color;

public class GroupControlMan2 extends JFrame {

	private JPanel contentPane;
	public JTextField txfdNewpasswd;
	public JPanel jp;
	public JLabel lblNewLabel;
	public JLayeredPane layeredPane;
	public JTextField txfdNewpasswd2;
	public JTextPane tpshowname;
	public JButton btSubmit;
	public JButton btExit;
	private JTable table;
	private JTable table1;
	private String[]s= {"身份","姓名","编号"};
	private Object[][]p= {
			{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""}
	};
	private String[]s1= {"身份","姓名","编号"};
	private Object[][]p1= {
			{"","",""}
	};
	public DefaultTableModel model;
	public DefaultTableModel model1;
    public JButton btUpload;
    public JComboBox cbAddInfo;
    public JScrollPane scrollPane;
    public JScrollPane scrollPane1;
    private TableCellRenderer defaultRenderer;
	public GroupControlMan2() {
		setResizable(false);
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\5groupcontrol\\GroupControlMan2.jpg");
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
				
				JComboBox cbGroupNumber = new JComboBox();
				cbGroupNumber.setBackground(new Color(238,237,232));
				cbGroupNumber.setBounds(411, 164, 146, 34);
				cbGroupNumber.addItem("001");
				cbGroupNumber.addItem("002");
				
				btUpload = new JButton("");
				btUpload.setBounds(178, 686, 151, 57);
				btUpload.setContentAreaFilled(false);
				
				scrollPane = new JScrollPane();
				scrollPane.setBounds(498, 300, 382, 289);
				
				model = new DefaultTableModel(p,s);
				table = new JTable(new JTableButtonModel());
				defaultRenderer = table.getDefaultRenderer(JButton.class);
				table.setDefaultRenderer(JButton.class, new JTableButtonRenderer(
				 defaultRenderer));
				 table.addMouseListener(new JTableButtonMouseListener(table));
				table.setFont(new Font("宋体", Font.PLAIN, 25));
			
				table.setRowHeight(34);
				scrollPane.setViewportView(table);
				
				scrollPane1 = new JScrollPane();
				scrollPane1.setBounds(119, 300, 382, 289);
				
				
				model1 = new DefaultTableModel(p1,s1);
				table1 = new JTable(new JTableButtonModel1());
				defaultRenderer = table1.getDefaultRenderer(JButton.class);
				table1.setDefaultRenderer(JButton.class, new JTableButtonRenderer(
				 defaultRenderer));
				 table1.addMouseListener(new JTableButtonMouseListener(table));
				table1.setFont(new Font("宋体", Font.PLAIN, 25));
			
				table1.setRowHeight(35);
				scrollPane1.setViewportView(table1);scrollPane1.getViewport().setBackground(new Color(240, 240, 240));
				
		btExit = new JButton("");
		btExit.setBounds(940, 25, 54, 32);
		btExit.setContentAreaFilled(false);
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(663, 686, 146, 57);
		
		tpshowname = new JTextPane();
		tpshowname.setText("zang");
		tpshowname.setEditable(false);
		tpshowname.setBounds(875, 25, 60, 27);
		tpshowname.setBackground(new Color(132,157,154));
		
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSubmit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(scrollPane, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btUpload, JLayeredPane.MODAL_LAYER);
		layeredPane.add(scrollPane1, JLayeredPane.MODAL_LAYER);
		layeredPane.add(cbGroupNumber, JLayeredPane.MODAL_LAYER);
		setLayeredPane(layeredPane);
	}
}
