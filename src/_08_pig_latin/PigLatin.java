package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import game_tools.Sound;

public class PigLatin implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton button1 = new JButton();
JButton button2 = new JButton();
JTextField english = new JTextField();
JTextField pigLatin = new JTextField();

void setUp() {
	frame.add(panel);
	panel.add(english);
	panel.add(button);
	panel.add(button1);
	panel.add(pigLatin);
	panel.add(button2);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	english.setColumns(50);
	pigLatin.setColumns(50);
	frame.setTitle("Pig Latin Translator");
	button.setText(">>");
	button1.setText("<<");
	button2.setText("speak");
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.pack();
	frame.setVisible(true);

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button) {
		 
		String en = english.getText(); 
		String text =  PigLatinTranslator.translateEnglishToPigLatin(en);
		 pigLatin.setText(text);
		}
	if(e.getSource() == button1) {
		String latin = pigLatin.getText();
		String text1 = PigLatinTranslator.translatePigLatinToEnglish(latin);
		english.setText(text1);
	}
	if(e.getSource() == button2) {
		
		
		Sound.speak(pigLatin.getText());
	}
}
}
