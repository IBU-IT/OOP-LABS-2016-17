package ba.edu.ibu.oop.week5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Divisiblility extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divisiblility frame = new Divisiblility();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Divisiblility() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 415, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterFirstNumber = new JLabel("Enter first number");
		lblEnterFirstNumber.setBounds(10, 41, 147, 14);
		contentPane.add(lblEnterFirstNumber);
		
		num1 = new JTextField();
		num1.setBounds(167, 38, 222, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		JLabel lblEnterSecondNumber = new JLabel("Enter second number");
		lblEnterSecondNumber.setBounds(10, 70, 147, 14);
		contentPane.add(lblEnterSecondNumber);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(167, 67, 222, 20);
		contentPane.add(num2);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		btnCancel.setBounds(300, 107, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int first=Integer.parseInt(num1.getText());
				int second=Integer.parseInt(num2.getText());
				if(second==0){
					JOptionPane.showMessageDialog(contentPane, "Can't divide by zero");
				}
				else if (first%second == 0){
					JOptionPane.showMessageDialog(contentPane, first+" is divisible by "+second);
				}else{
					JOptionPane.showMessageDialog(contentPane, first+" is NOT divisible by "+second);
				}
			}
		});
		btnCalculate.setBounds(167, 107, 89, 23);
		contentPane.add(btnCalculate);
	}

}
