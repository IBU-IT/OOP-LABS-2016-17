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

public class MonthlyIncome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonthlyIncome frame = new MonthlyIncome();
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
	public MonthlyIncome() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 368, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatIsYour = new JLabel("What is your monthly income:");
		lblWhatIsYour.setBounds(10, 28, 175, 14);
		contentPane.add(lblWhatIsYour);
		
		textField = new JTextField();
		textField.setBounds(195, 25, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		btnClose.setBounds(253, 75, 89, 23);
		contentPane.add(btnClose);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int income=Integer.parseInt(textField.getText());
				String msg="This family is ";
				if (income <= 1000)
					msg+="VERY POOR";
				else if (income > 1000 && income <= 2000)
					msg+="POOR";
				else if (income > 2000 && income <= 3000)
					msg+="NORMAL";
				else if (income > 3000 && income <= 4000)
					msg+="RICH";
				else if (income > 4000)
					msg+="VERY RICH";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnSubmit.setBounds(135, 75, 89, 23);
		contentPane.add(btnSubmit);
	}

}
