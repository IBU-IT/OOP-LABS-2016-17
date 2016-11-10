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

public class DivisibilityByTwoThreeSix extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField num4;
	private JTextField num3;
	private JTextField num8;
	private JTextField num7;
	private JTextField num6;
	private JTextField num5;
	private JTextField num9;
	private JTextField num10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibilityByTwoThreeSix frame = new DivisibilityByTwoThreeSix();
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
	public DivisibilityByTwoThreeSix() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 421, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(39, 0, 367, 379);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Enter number");
		label.setBounds(28, 36, 87, 14);
		panel.add(label);
		
		num1 = new JTextField();
		num1.setColumns(10);
		num1.setBounds(125, 33, 211, 20);
		panel.add(num1);
		
		JLabel label_1 = new JLabel("Enter number");
		label_1.setBounds(28, 66, 87, 14);
		panel.add(label_1);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(125, 63, 211, 20);
		panel.add(num2);
		
		JLabel label_2 = new JLabel("Enter number");
		label_2.setBounds(28, 124, 87, 14);
		panel.add(label_2);
		
		num4 = new JTextField();
		num4.setColumns(10);
		num4.setBounds(125, 121, 211, 20);
		panel.add(num4);
		
		JLabel label_3 = new JLabel("Enter number");
		label_3.setBounds(28, 94, 87, 14);
		panel.add(label_3);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(125, 91, 211, 20);
		panel.add(num3);
		
		JLabel label_4 = new JLabel("Enter number");
		label_4.setBounds(28, 240, 87, 14);
		panel.add(label_4);
		
		num8 = new JTextField();
		num8.setColumns(10);
		num8.setBounds(125, 237, 211, 20);
		panel.add(num8);
		
		JLabel label_5 = new JLabel("Enter number");
		label_5.setBounds(28, 210, 87, 14);
		panel.add(label_5);
		
		num7 = new JTextField();
		num7.setColumns(10);
		num7.setBounds(125, 207, 211, 20);
		panel.add(num7);
		
		JLabel label_6 = new JLabel("Enter number");
		label_6.setBounds(28, 182, 87, 14);
		panel.add(label_6);
		
		num6 = new JTextField();
		num6.setColumns(10);
		num6.setBounds(125, 179, 211, 20);
		panel.add(num6);
		
		JLabel label_7 = new JLabel("Enter number");
		label_7.setBounds(28, 152, 87, 14);
		panel.add(label_7);
		
		num5 = new JTextField();
		num5.setColumns(10);
		num5.setBounds(125, 149, 211, 20);
		panel.add(num5);
		
		JLabel label_8 = new JLabel("Enter number");
		label_8.setBounds(28, 269, 87, 14);
		panel.add(label_8);
		
		num9 = new JTextField();
		num9.setColumns(10);
		num9.setBounds(125, 266, 211, 20);
		panel.add(num9);
		
		num10 = new JTextField();
		num10.setColumns(10);
		num10.setBounds(125, 296, 211, 20);
		panel.add(num10);
		
		JLabel label_9 = new JLabel("Enter number");
		label_9.setBounds(28, 299, 87, 14);
		panel.add(label_9);
		
		JButton button = new JButton("Calculate");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				int divisibleByTwo = 0;
				int divisibleByThree = 0;
				int divisibleBySix = 0;
				int notDivisible = 0;
				for(int i=0;i<nums.length;i++){
					if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
						divisibleBySix++;
						divisibleByThree++;
						divisibleByTwo++;
					} else if (nums[i] % 3 == 0)
						divisibleByThree++;
					else if (nums[i] % 2 == 0)
						divisibleByTwo++;
					else
						notDivisible++;
				}
				String msg = divisibleByTwo + " numbers are divisible by two.\n"+divisibleByThree + " numbers are divisible by three\n"+divisibleBySix + " numbers are divisible by six\n"+notDivisible + " numbers are not divisible by two, three or six.";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		button.setBounds(247, 345, 89, 23);
		panel.add(button);
	}

}
