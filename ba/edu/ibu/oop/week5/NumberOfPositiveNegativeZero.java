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

public class NumberOfPositiveNegativeZero extends JFrame {

	private JPanel contentPane;
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
					NumberOfPositiveNegativeZero frame = new NumberOfPositiveNegativeZero();
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
	public NumberOfPositiveNegativeZero() {
		setTitle("Number of Positive Negative and Zero");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Enter Number 1: ");
		label.setBounds(21, 27, 115, 14);
		contentPane.add(label);
		
		num1 = new JTextField();
		num1.setColumns(10);
		num1.setBounds(146, 24, 171, 20);
		contentPane.add(num1);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(146, 49, 171, 20);
		contentPane.add(num2);
		
		JLabel label_1 = new JLabel("Enter Number 2: ");
		label_1.setBounds(21, 52, 115, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Enter Number 3: ");
		label_2.setBounds(21, 77, 115, 14);
		contentPane.add(label_2);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(146, 74, 171, 20);
		contentPane.add(num3);
		
		num4 = new JTextField();
		num4.setColumns(10);
		num4.setBounds(146, 99, 171, 20);
		contentPane.add(num4);
		
		JLabel label_3 = new JLabel("Enter Number 4: ");
		label_3.setBounds(21, 102, 115, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Enter Number 5: ");
		label_4.setBounds(21, 127, 115, 14);
		contentPane.add(label_4);
		
		num5 = new JTextField();
		num5.setColumns(10);
		num5.setBounds(146, 124, 171, 20);
		contentPane.add(num5);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		btnCancel.setBounds(228, 155, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] nums=new int[5];
				nums[0]=Integer.parseInt(num1.getText());
				nums[1]=Integer.parseInt(num2.getText());
				nums[2]=Integer.parseInt(num3.getText());
				nums[3]=Integer.parseInt(num4.getText());
				nums[4]=Integer.parseInt(num5.getText());
				int pos=0;
				int neg=0;
				int zer=0;
				for(int i=0;i<nums.length;i++){
					if(nums[i]==0)
						zer++;
					else if(nums[i]>0)
						pos++;
					else
						neg++;
				}
				String msg="There "+((zer==1)?"is ":"are ")+zer+" zero value\nThere "+((neg==1)?"is ":"are ")+neg+" negative value\nThere "+((pos==1)?"is ":"are ")+pos+" positive value";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnCalculate.setBounds(100, 155, 89, 23);
		contentPane.add(btnCalculate);
	}

}
