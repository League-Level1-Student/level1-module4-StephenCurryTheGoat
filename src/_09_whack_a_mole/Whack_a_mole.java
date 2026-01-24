package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_a_mole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random ran = new Random();
	int count = 0;
	int countOTM = 0;
	Date timeOfStart;

	void setUp() {
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.setSize(500, 500);
		drawButtons(50);
		frame.setVisible(true);
		timeOfStart = new Date();
}

	public void drawButtons(int r) {
		int randomNumber = ran.nextInt(r);

		for (int i = 0; i < r; i++) {
			JButton b = new JButton();
			b.addActionListener(this);
			panel.add(b);
			if (randomNumber == i) {
				b.setText("mole!");
			}
		}
	}

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if (pressed.getText().equals("mole!")) {
			panel.removeAll();	
			drawButtons(50);
			count++;
			
		} else {
			countOTM++;
			if(countOTM == 1) {
				speak("Good try");
			}
			if(countOTM == 2) {
				speak("oof");
			}
			if(countOTM == 3) {
				speak("oh well");
			}
			if(countOTM == 4) {
				speak("oops");
			}
			if(countOTM == 5) {
				speak("missed game");
				endGame(timeOfStart, count);
			}
			
		}
		if(count == 10) {
			endGame(timeOfStart, count);
		}

	}
}
