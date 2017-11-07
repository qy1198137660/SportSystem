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
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class SystemAdmin2 extends JFrame {

	private JPanel contentPane;
    public JPanel jp;
    public JLabel lblNewLabel;
    public JLayeredPane layeredPane;
    public JTextPane tpshowname;
    public JButton btExit;
    public JButton btSubmit;
	public JButton btBack;
	private JTextField txfdSetAges;
	private JTextField txfdSetAges1;
	private JTextField txfdSetFemale;
	private JTextField txfdSetFemale1;
	private JTextField txfdSetMale;
	private JTextField txfdSetMale1;
	private JTextField txfdMaxNumber;
	private JTextField txfdAthleteNumber;
	private JTextField txfdGroupNumber;
	public SystemAdmin2() {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("src/imgs/2SystemAdmin/SystemAdmin2.jpg");
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
		btBack.setBounds(253, 687, 123, 40);
		
		btSubmit = new JButton("");
		btSubmit.setContentAreaFilled(false);
		btSubmit.setBounds(582, 687, 123, 40);
		
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 40, 27);
		btExit.setContentAreaFilled(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		txfdSetAges = new JTextField();
		txfdSetAges.setBounds(385, 142, 115, 39);
		jp.add(txfdSetAges);
		txfdSetAges.setColumns(10);
		
		txfdSetAges1 = new JTextField();
		txfdSetAges1.setBounds(526, 142, 115, 39);
		jp.add(txfdSetAges1);
		txfdSetAges1.setColumns(10);
		
		txfdSetFemale = new JTextField();
		txfdSetFemale.setBounds(422, 217, 115, 39);
		jp.add(txfdSetFemale);
		txfdSetFemale.setColumns(10);
		
		txfdSetFemale1 = new JTextField();
		txfdSetFemale1.setColumns(10);
		txfdSetFemale1.setBounds(552, 217, 115, 39);
		jp.add(txfdSetFemale1);
		
		txfdSetMale = new JTextField();
		txfdSetMale.setColumns(10);
		txfdSetMale.setBounds(422, 303, 115, 39);
		jp.add(txfdSetMale);
		
		txfdSetMale1 = new JTextField();
		txfdSetMale1.setColumns(10);
		txfdSetMale1.setBounds(552, 303, 115, 39);
		jp.add(txfdSetMale1);
		
		txfdMaxNumber = new JTextField();
		txfdMaxNumber.setColumns(10);
		txfdMaxNumber.setBounds(655, 392, 115, 39);
		jp.add(txfdMaxNumber);
		
		txfdAthleteNumber = new JTextField();
		txfdAthleteNumber.setColumns(10);
		txfdAthleteNumber.setBounds(443, 478, 115, 39);
		jp.add(txfdAthleteNumber);
		
		txfdGroupNumber = new JTextField();
		txfdGroupNumber.setColumns(10);
		txfdGroupNumber.setBounds(443, 565, 115, 39);
		jp.add(txfdGroupNumber);
		
		
		tpshowname = new JTextPane();
		tpshowname.setEditable(false);
		tpshowname.setBounds(875, 25, 60, 27);
		tpshowname.setBackground(new Color(132,157,154));
		
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSubmit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btBack, JLayeredPane.MODAL_LAYER);
		
		setLayeredPane(layeredPane);
	}

}
