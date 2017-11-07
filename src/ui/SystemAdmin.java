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

public class SystemAdmin extends JFrame {

	private JPanel contentPane;
	public JButton btSetpasswd;
	public JButton btSetRacetype;
	public JButton btSetAthleteNum;
    public JPanel jp;
    public JLabel lblNewLabel;
    public JLayeredPane layeredPane;
    public JTextPane tpshowname;
    public JButton btExit;
	public SystemAdmin() {
		setTitle("\u4F53\u64CD\u8D5B\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		setResizable(false);
		ImageIcon i = new ImageIcon("src/imgs/2SystemAdmin/SystemAdmin.jpg");
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
		
		btSetpasswd = new JButton("");
		btSetpasswd.setContentAreaFilled(false);
		btSetpasswd.setBounds(307, 230, 393, 60);
		//btSetpasswd.setFocusPainted(false);
		//btSetpasswd.setBorderPainted(false);
		
		btExit = new JButton("");
		btExit.setBounds(947, 25, 40, 27);
		btExit.setContentAreaFilled(false);
		
		btSetAthleteNum = new JButton("");
		btSetAthleteNum.setContentAreaFilled(false);
		btSetAthleteNum.setBounds(307, 480, 393, 60);
		//btSetAthleteNum.setFocusPainted(false);
		//btSetAthleteNum.setBorderPainted(false);
		
		btSetRacetype = new JButton("");
		btSetRacetype.setContentAreaFilled(false);
		btSetRacetype.setBounds(307, 355, 393, 60);
		//btSetRacetype.setFocusPainted(false);
		//btSetRacetype.setBorderPainted(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(jp, JLayeredPane.DEFAULT_LAYER);
		
		tpshowname = new JTextPane();
		tpshowname.setEditable(false);
		tpshowname.setBounds(875, 25, 60, 27);
		tpshowname.setBackground(new Color(132,157,154));

		layeredPane.add(btSetpasswd, JLayeredPane.MODAL_LAYER);
		layeredPane.add(tpshowname, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSetAthleteNum, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btSetRacetype, JLayeredPane.MODAL_LAYER);
		layeredPane.add(btExit, JLayeredPane.MODAL_LAYER);

		setLayeredPane(layeredPane);
	}
}
