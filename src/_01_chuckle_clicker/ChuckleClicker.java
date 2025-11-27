package _01_chuckle_clicker;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("People");
	JButton button1 = new JButton("Family");
public static void main(String[] args) {
	ChuckleClicker clicker = new ChuckleClicker();
	clicker.makeButtons();
	
}
void makeButtons(){
	//JOptionPane.showMessageDialog(null, "Make Buttons");
	frame.add(panel);
	panel.add(button1);
	panel.add(button);
	frame.setVisible(true);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	button.addActionListener(this);
	button1.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//JOptionPane.showMessageDialog(null, "hi");
	if(e.getSource() == button) {
		JOptionPane.showMessageDialog(null, "Why did the computer get sick");
	}else {
		JOptionPane.showMessageDialog(null, "It got virus");
	}


}
}
