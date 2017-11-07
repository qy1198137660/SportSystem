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
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class controlman extends JFrame {

	private JPanel contentPane;
	public JButton btSetGroupTeam;
	public JButton btSetGroupControlMan;
	public JButton btInquireGroupTeam;
    public JPanel jp;
    public JLabel lblNewLabel;
    public JLayeredPane layeredPane;
    public JTextPane tpshowname;
    public JButton btExit;
    private JButton btFinalList;
    private JButton btTeamCondition;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public  controlman() {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("C:\\Users\\jnx22\\eclipse-workspace\\\u5927\u578B\u5E94\u7528\u8F6F\u4EF6\u8BBE\u8BA1\\src\\imgs\\4teamcontrol\\controlman.jpg");
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
		
		btSetGroupTeam = new JButton("");
		btSetGroupTeam.setContentAreaFilled(false);
		btSetGroupTeam.setBounds(355, 203, 260, 42);
		//btSetpasswd.setFocusPainted(false);
		//btSetpasswd.setBorderPainted(false);
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 40, 27);
		btExit.setContentAreaFilled(false);
		
		btInquireGroupTeam = new JButton("");
		btInquireGroupTeam.setContentAreaFilled(false);
		btInquireGroupTeam.setBounds(355, 284, 260, 42);
		//btSetAthleteNum.setFocusPainted(false);
		//btSetAthleteNum.setBorderPainted(false);
		
		btSetGroupControlMan = new JButton("");
		btSetGroupControlMan.setContentAreaFilled(false);
		btSetGroupControlMan.setBounds(355, 365, 260, 42);
		//btSetRacetype.setFocusPainted(false);
		//btSetRacetype.setBorderPainted(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		btFinalList = new JButton("");
		btFinalList.setContentAreaFilled(false);
		btFinalList.setBounds(353, 448, 260, 42);
		
		btTeamCondition = new JButton("");
		btTeamCondition.setContentAreaFilled(false);
		btTeamCondition.setBounds(353, 529, 260, 42);
		
		tpshowname = new JTextPane();
		tpshowname.setEditable(false);
		tpshowname.setBounds(887, 25, 62, 27);
		tpshowname.setBackground(new Color(132,157,154));

		layeredPane.add(btSetGroupTeam, JLayeredPane.MODAL_LAYER);
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btInquireGroupTeam, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSetGroupControlMan, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btTeamCondition, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btFinalList, JLayeredPane.MODAL_LAYER);
		setLayeredPane(layeredPane);
	}
}
