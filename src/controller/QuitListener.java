package controller;

import gui.BlackJackFrame;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuitListener implements ActionListener {
	
	BlackJackFrame frame;
	
	public QuitListener(BlackJackFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent event) {
		quit();
	}
	
	private void quit() {
		final Frame[] frames = Frame.getFrames();
		for (int i = 0; i < frames.length; i++) {
			frames[i].dispose();
		}
	}

}
