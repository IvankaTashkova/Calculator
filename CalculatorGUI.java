package Calculator;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import java.awt.Font;

public class CalculatorGUI {

	private JFrame frame;
	private JTextField input;
	private JTextField result;
	private int firstNumber;
	private int secondNumber;
	private String operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
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
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"7");
				result.setText("");
				if(firstNumber == 0) {
					firstNumber = 7;
				}
				else {
					secondNumber = 7;
				}
			}
		});
		button_7.setBounds(30, 54, 50, 45);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"8");
				result.setText("");
				if(firstNumber == 0) {
					firstNumber = 8;
				}
				else {
					secondNumber = 8;
				}
			}
		});
		button_8.setBounds(92, 54, 50, 45);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"9");
				result.setText("");
				if(firstNumber == 0) {
					firstNumber = 9;
				}
				else {
					secondNumber = 9;
				}
			}
		});
		button_9.setBounds(154, 54, 50, 45);
		frame.getContentPane().add(button_9);
		
		JButton button_dot = new JButton(".");
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+".");
				result.setText("");
			}
		});
		button_dot.setBounds(30, 225, 50, 45);
		frame.getContentPane().add(button_dot);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"0");
				result.setText("");
				
			}
		});
		button_0.setBounds(92, 225, 50, 45);
		frame.getContentPane().add(button_0);
		
		JButton button_eql = new JButton("=");
		button_eql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText("");
				result.setText(Calculator.calculate(firstNumber, secondNumber, operation));
				
			}
		});
		button_eql.setBounds(154, 225, 50, 45);
		frame.getContentPane().add(button_eql);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"1");
				result.setText("");
				if(firstNumber == 0) {
					firstNumber = 1;
				}
				else {
					secondNumber = 1;
				}
			}
		});
		button_1.setBounds(30, 168, 50, 45);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"2");
				result.setText("");
				if(firstNumber == 0) {
					firstNumber = 2;
				}
				else {
					secondNumber = 2;
				}
			}
		});
		button_2.setBounds(92, 168, 50, 45);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"3");
				result.setText("");
				if(firstNumber == 0) {
					firstNumber = 3;
				}
				else {
					secondNumber = 3;
				}
			}
		});
		button_3.setBounds(154, 168, 50, 45);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"4");
				result.setText("");
				if(firstNumber == 0) {
					firstNumber = 4;
				}
				else {
					secondNumber = 4;
				}
			}
		});
		button_4.setBounds(30, 111, 50, 45);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"5");
				result.setText("");
				if(firstNumber == 0) {
					firstNumber = 5;
				}
				else {
					secondNumber = 5;
				}
			}
		});
		button_5.setBounds(92, 111, 50, 45);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"6");
				result.setText("");
				if(firstNumber == 0) {
					firstNumber = 6;
				}
				else {
					secondNumber = 6;
				}
			}
		});
		button_6.setBounds(154, 111, 50, 45);
		frame.getContentPane().add(button_6);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText("");
				result.setText("");
			}
		});
		btnDel.setBounds(216, -2, 60, 45);
		frame.getContentPane().add(btnDel);
		
		JButton button_dev = new JButton("/");
		button_dev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"/");
				result.setText("");
				operation = "/";
			}
		});
		button_dev.setBounds(216, 54, 60, 45);
		frame.getContentPane().add(button_dev);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"x");
				result.setText("");
				operation = "x";
			}
		});
		btnX.setBounds(216, 111, 60, 45);
		frame.getContentPane().add(btnX);
		
		JButton button_sub = new JButton("-");
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"-");
				result.setText("");
				operation = "-";
			}
		});
		button_sub.setBounds(216, 168, 60, 45);
		frame.getContentPane().add(button_sub);
		
		JButton button_add = new JButton("+");
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText(input.getText()+"+");
				result.setText("");
				operation = "+";
			}
		});
		button_add.setBounds(216, 225, 60, 45);
		frame.getContentPane().add(button_add);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(30, 0, 174, 42);
		frame.getContentPane().add(editorPane);
		
		input = new JTextField() {
			@Override
			public void setBorder(Border border) {
				
			}
		};
		
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setForeground(Color.BLACK);
		input.setBounds(80, -2, 124, 19);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		result = new JTextField() {
			@Override
			public void setBorder(Border border) {
				
			}
		};
		result.setFont(new Font("Dialog", Font.PLAIN, 14));
		result.setHorizontalAlignment(SwingConstants.RIGHT);
		result.setBounds(80, 23, 124, 19);
		frame.getContentPane().add(result);
		result.setColumns(10);
	}
}
