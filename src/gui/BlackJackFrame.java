package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.QuitListener;
import controller.ResetListener;

public class BlackJackFrame extends JFrame{

	public JMenuBar menu;
	public QuitListener quitListener = new QuitListener(this);
	public ResetListener resetListener = new ResetListener(this);
	
	public BlackJackFrame() {
		this.setTitle("Blackjack!");
		this.setSize(400, 350);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar bar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		
		JMenuItem quit = new JMenuItem("Quit");
		quit.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.KeyEvent.CTRL_MASK));
		quit.addActionListener(quitListener);
		
		JMenuItem reset = new JMenuItem("Reset");
		reset.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.KeyEvent.CTRL_MASK));
		reset.addActionListener(resetListener);
		
		file.add(reset);
		file.add(quit);
		bar.add(file);
		this.setJMenuBar(bar);
		
		this.setVisible(true);
	
	}
	
}
