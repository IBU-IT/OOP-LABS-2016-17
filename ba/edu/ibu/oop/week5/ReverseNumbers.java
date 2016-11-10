package ba.edu.ibu.oop.week5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseNumbers extends JFrame {

	private JPanel contentPane;
	private JTextField inp;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseNumbers frame = new ReverseNumbers();
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
	public ReverseNumbers() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 292, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterNumber = new JLabel("Enter number");
		lblEnterNumber.setBounds(22, 42, 82, 14);
		contentPane.add(lblEnterNumber);
		
		inp = new JTextField();
		inp.setBounds(114, 39, 131, 20);
		contentPane.add(inp);
		inp.setColumns(10);
		
		JLabel lblReverseNumber = new JLabel("Reverse number");
		lblReverseNumber.setBounds(22, 81, 82, 14);
		contentPane.add(lblReverseNumber);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBounds(114, 78, 131, 20);
		contentPane.add(result);
		result.setColumns(10);
		
		JButton btnReverse = new JButton("Reverse");
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reverse=0;
				int enteredNumber = Integer.parseInt(inp.getText());
				int number=enteredNumber;
				while (number != 0) {
					reverse = reverse * 10;
					reverse = reverse + number % 10;
					number = number / 10;
				}
				result.setText(reverse+"");
			}
		});
		btnReverse.setBounds(156, 137, 89, 23);
		contentPane.add(btnReverse);
	}

}
