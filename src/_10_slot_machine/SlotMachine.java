package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton("Spin");
JLabel label = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
Random ran = new Random();
	

		void setUp() {
			frame.add(panel);
			panel.add(button);
			button.addActionListener(this);
			
			try {
				label = createLabelImage("cherry.png");
				label2 = createLabelImage("grapefruit.png");
				label3 = createLabelImage("lime.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			panel.add(label);
			panel.add(label2);
			panel.add(label3);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
		}
		private JLabel createLabelImage(String fileName) throws MalformedURLException{
	        URL imageURL = getClass().getResource(fileName);
		if (imageURL == null){
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	    

		@Override
		public void actionPerformed(ActionEvent arg) {
			// TODO Auto-generated method stub
			panel.remove(label);
			panel.remove(label2);
			panel.remove(label3);
			try {
				
				int x = ran.nextInt(3);
				if() {
				label3 = createLabelImage("cherry.png");
				label = createLabelImage("grapefruit.png");
				label2 = createLabelImage("lime.png");
				}
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			panel.add(label);
			panel.add(label2);
			panel.add(label3);

			frame.pack();
		}
		
		
}
