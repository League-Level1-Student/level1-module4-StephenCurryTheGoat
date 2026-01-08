package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton add = new JButton("add");
	JButton multiply = new JButton("mul");
	JButton subtract = new JButton("subtract");
	JButton divide = new JButton("div");
	JTextField text = new JTextField();
	JTextField text1 = new JTextField();

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setUp();
	}

	private void setUp() {
		// TODO Auto-generated method stub
		frame.add(panel);
		panel.add(add);
		panel.add(multiply);
		panel.add(subtract);
		panel.add(divide);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.addActionListener(this);
		multiply.addActionListener(this);
		subtract.addActionListener(this);
		divide.addActionListener(this);
		panel.add(label);
		panel.add(text);
		panel.add(text1);
		text.setColumns(5);
		text1.setColumns(5);
		frame.pack();
		frame.setVisible(true);
	}

	void add() {

	}

	void multiply() {

	}

	void subtract() {

	}

	void divide() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == multiply) {
			String texter = text.getText();
			String message = text1.getText();
			double n1 = Double.parseDouble(texter);
			double n2 = Double.parseDouble(message);
			double n3 = n1 * n2;
			label.setText(String.valueOf(n3));
			frame.pack();
		}
		if (e.getSource() == add) {
			String texter = text.getText();
			String message = text1.getText();
			double n1 = Double.parseDouble(texter);
			double n2 = Double.parseDouble(message);
			double n3 = n1 + n2;
			label.setText(String.valueOf(n3));
			frame.pack();
		}
		if (e.getSource() == subtract) {
			String texter = text.getText();
			String message = text1.getText();
			double n1 = Double.parseDouble(texter);
			double n2 = Double.parseDouble(message);
			double n3 = n1 - n2;
			label.setText(String.valueOf(n3));
			frame.pack();
		}
		if (e.getSource() == divide) {
			String texter = text.getText();
			String message = text1.getText();
			double n1 = Double.parseDouble(texter);
			double n2 = Double.parseDouble(message);
			double n3 = n1 / n2;
			label.setText(String.valueOf(n3));
			frame.pack();
		}
	}
}
