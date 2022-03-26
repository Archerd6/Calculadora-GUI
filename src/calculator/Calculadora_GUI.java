package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora_GUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_GUI window = new Calculadora_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 276, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 242, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_B = new JButton("B");
		btn_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_B.setBounds(10, 124, 52, 44);
		frame.getContentPane().add(btn_B);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_7.getText();
				textField.setText(number);
			}
		});
		btn_7.setBounds(10, 179, 52, 44);
		frame.getContentPane().add(btn_7);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setBounds(10, 234, 52, 44);
		frame.getContentPane().add(btn_4);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setBounds(10, 289, 52, 44);
		frame.getContentPane().add(btn_1);
		
		JButton btn_C = new JButton("C");
		btn_C.setBounds(72, 124, 52, 44);
		frame.getContentPane().add(btn_C);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setBounds(72, 179, 52, 44);
		frame.getContentPane().add(btn_8);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setBounds(72, 234, 52, 44);
		frame.getContentPane().add(btn_5);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setBounds(72, 289, 52, 44);
		frame.getContentPane().add(btn_2);
		
		JButton btn_00 = new JButton("00");
		btn_00.setBounds(134, 124, 52, 44);
		frame.getContentPane().add(btn_00);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setBounds(134, 179, 52, 44);
		frame.getContentPane().add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setBounds(134, 234, 52, 44);
		frame.getContentPane().add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_3.getText();
				textField.setText(number);
			}
		});
		btn_3.setBounds(134, 289, 52, 44);
		frame.getContentPane().add(btn_3);
		
		JButton btn_mas = new JButton("+");
		btn_mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				first=Double.parseDouble(textField.getText());
//				textField.setText("");
//				operation="+";
			}
		});
		btn_mas.setBounds(196, 124, 52, 44);
		frame.getContentPane().add(btn_mas);
		
		JButton btn_menos = new JButton("-");
		btn_menos.setBounds(196, 179, 52, 44);
		frame.getContentPane().add(btn_menos);
		
		JButton btn_por = new JButton("*");
		btn_por.setBounds(196, 234, 52, 44);
		frame.getContentPane().add(btn_por);
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				first=Double.parseDouble(textField.getText());
//				textField.setText("");
//				operation="/";
			}
		});
		btn_divide.setBounds(196, 289, 52, 44);
		frame.getContentPane().add(btn_divide);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setBounds(10, 344, 52, 44);
		frame.getContentPane().add(btn_0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.setBounds(72, 344, 52, 44);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_igual = new JButton("=");
		btn_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String answer;
//				second=Double.parseDouble(textField.getText());
//				if(operation=="+")
//				{
//					result=first+second;
//					answer=String.format("%.2f", result);
//					textField.setText(answer);
//				}
			}
		});
		btn_igual.setBounds(134, 344, 52, 44);
		frame.getContentPane().add(btn_igual);
		
		JButton btn_percent = new JButton("%");
		btn_percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				first=Double.parseDouble(textField.getText());
//				textField.setText("");
//				operation="%";
			}
		});
		btn_percent.setBounds(196, 344, 52, 44);
		frame.getContentPane().add(btn_percent);
	}
}
