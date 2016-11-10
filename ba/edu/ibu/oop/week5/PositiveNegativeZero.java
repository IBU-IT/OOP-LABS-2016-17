package ba.edu.ibu.oop.week5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PositiveNegativeZero extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JTextField num4;
	private JTextField num5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PositiveNegativeZero frame = new PositiveNegativeZero();
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
	public PositiveNegativeZero() {
		setTitle("Positive Negative Zero");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 355, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterNumber = new JLabel("Enter Number 1: ");
		lblEnterNumber.setBounds(26, 34, 115, 14);
		contentPane.add(lblEnterNumber);
		
		num1 = new JTextField();
		num1.setBounds(151, 31, 171, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		JLabel lblEnterNumber_1 = new JLabel("Enter Number 2: ");
		lblEnterNumber_1.setBounds(26, 59, 115, 14);
		contentPane.add(lblEnterNumber_1);
		
		JLabel lblEnterNumber_2 = new JLabel("Enter Number 3: ");
		lblEnterNumber_2.setBounds(26, 84, 115, 14);
		contentPane.add(lblEnterNumber_2);
		
		JLabel lblEnterNumber_3 = new JLabel("Enter Number 4: ");
		lblEnterNumber_3.setBounds(26, 109, 115, 14);
		contentPane.add(lblEnterNumber_3);
		
		JLabel lblEnterNumber_4 = new JLabel("Enter Number 5: ");
		lblEnterNumber_4.setBounds(26, 134, 115, 14);
		contentPane.add(lblEnterNumber_4);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(151, 56, 171, 20);
		contentPane.add(num2);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(151, 81, 171, 20);
		contentPane.add(num3);
		
		num4 = new JTextField();
		num4.setColumns(10);
		num4.setBounds(151, 106, 171, 20);
		contentPane.add(num4);
		
		num5 = new JTextField();
		num5.setColumns(10);
		num5.setBounds(151, 131, 171, 20);
		contentPane.add(num5);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		btnClose.setBounds(233, 179, 89, 23);
		contentPane.add(btnClose);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] nums=new int[5];
				nums[0]=Integer.parseInt(num1.getText());
				nums[1]=Integer.parseInt(num2.getText());
				nums[2]=Integer.parseInt(num3.getText());
				nums[3]=Integer.parseInt(num4.getText());
				nums[4]=Integer.parseInt(num5.getText());
				String msg="Number     Zero     Positive      Negative\n";
				for(int i=0;i<nums.length;i++){
					msg+="     "+nums[i]+"              "+(nums[i]==0?"+":"-")+"               "+(nums[i]>0?"+":"-")+"                    "+(nums[i]<0?"+":"-")+"\n";
				}
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnSubmit.setBounds(125, 179, 89, 23);
		contentPane.add(btnSubmit);
		
		
		
	}
}
