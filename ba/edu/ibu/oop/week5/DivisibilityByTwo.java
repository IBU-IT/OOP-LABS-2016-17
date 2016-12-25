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

public class DivisibilityByTwo extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField num4;
	private JTextField num3;
	private JTextField num8;
	private JTextField num7;
	private JTextField num6;
	private JTextField num5;
	private JLabel label_7;
	private JTextField num9;
	private JTextField num10;
	private JLabel label_8;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibilityByTwo frame = new DivisibilityByTwo();
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
	public DivisibilityByTwo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 383, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterNumber = new JLabel("Enter number");
		lblEnterNumber.setBounds(28, 36, 87, 14);
		contentPane.add(lblEnterNumber);
		
		num1 = new JTextField();
		num1.setBounds(125, 33, 211, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		JLabel label = new JLabel("Enter number");
		label.setBounds(28, 66, 87, 14);
		contentPane.add(label);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(125, 63, 211, 20);
		contentPane.add(num2);
		
		JLabel label_1 = new JLabel("Enter number");
		label_1.setBounds(28, 124, 87, 14);
		contentPane.add(label_1);
		
		num4 = new JTextField();
		num4.setColumns(10);
		num4.setBounds(125, 121, 211, 20);
		contentPane.add(num4);
		
		JLabel label_2 = new JLabel("Enter number");
		label_2.setBounds(28, 94, 87, 14);
		contentPane.add(label_2);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(125, 91, 211, 20);
		contentPane.add(num3);
		
		JLabel label_3 = new JLabel("Enter number");
		label_3.setBounds(28, 240, 87, 14);
		contentPane.add(label_3);
		
		num8 = new JTextField();
		num8.setColumns(10);
		num8.setBounds(125, 237, 211, 20);
		contentPane.add(num8);
		
		JLabel label_4 = new JLabel("Enter number");
		label_4.setBounds(28, 210, 87, 14);
		contentPane.add(label_4);
		
		num7 = new JTextField();
		num7.setColumns(10);
		num7.setBounds(125, 207, 211, 20);
		contentPane.add(num7);
		
		JLabel label_5 = new JLabel("Enter number");
		label_5.setBounds(28, 182, 87, 14);
		contentPane.add(label_5);
		
		num6 = new JTextField();
		num6.setColumns(10);
		num6.setBounds(125, 179, 211, 20);
		contentPane.add(num6);
		
		JLabel label_6 = new JLabel("Enter number");
		label_6.setBounds(28, 152, 87, 14);
		contentPane.add(label_6);
		
		num5 = new JTextField();
		num5.setColumns(10);
		num5.setBounds(125, 149, 211, 20);
		contentPane.add(num5);
		
		label_7 = new JLabel("Enter number");
		label_7.setBounds(28, 269, 87, 14);
		contentPane.add(label_7);
		
		num9 = new JTextField();
		num9.setColumns(10);
		num9.setBounds(125, 266, 211, 20);
		contentPane.add(num9);
		
		num10 = new JTextField();
		num10.setColumns(10);
		num10.setBounds(125, 296, 211, 20);
		contentPane.add(num10);
		
		label_8 = new JLabel("Enter number");
		label_8.setBounds(28, 299, 87, 14);
		contentPane.add(label_8);
		
		btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int counter=0;
				int[] nums=new int[10];
				nums[0]=Integer.parseInt(num1.getText());
				nums[1]=Integer.parseInt(num2.getText());
				nums[2]=Integer.parseInt(num3.getText());
				nums[3]=Integer.parseInt(num4.getText());
				nums[4]=Integer.parseInt(num5.getText());
				nums[5]=Integer.parseInt(num6.getText());
				nums[6]=Integer.parseInt(num7.getText());
				nums[7]=Integer.parseInt(num8.getText());
				nums[8]=Integer.parseInt(num9.getText());
				nums[9]=Integer.parseInt(num10.getText());
				for(int i=0;i<nums.length;i++){
					if(nums[i]%2==0)
						counter++;
				}
				JOptionPane.showMessageDialog(contentPane, counter+" numbers are divisible by 2");
			}
		});
		btnNewButton.setBounds(247, 345, 89, 23);
		contentPane.add(btnNewButton);
	}

}
