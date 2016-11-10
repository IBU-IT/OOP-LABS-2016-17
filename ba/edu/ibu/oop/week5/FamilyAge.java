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

public class FamilyAge extends JFrame {

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
					FamilyAge frame = new FamilyAge();
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
	public FamilyAge() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 434, 222);
		contentPane.add(panel);
		
		JLabel lblEnterAgeOf = new JLabel("Enter age of the 1. member");
		lblEnterAgeOf.setBounds(21, 27, 154, 14);
		panel.add(lblEnterAgeOf);
		
		num1 = new JTextField();
		num1.setColumns(10);
		num1.setBounds(185, 24, 239, 20);
		panel.add(num1);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		button.setBounds(335, 165, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Calculate");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[] nums=new int[5];
				String msg="This family is ";
				nums[0]=Integer.parseInt(num1.getText());
				nums[1]=Integer.parseInt(num2.getText());
				nums[2]=Integer.parseInt(num3.getText());
				nums[3]=Integer.parseInt(num4.getText());
				nums[4]=Integer.parseInt(num5.getText());
				int counter=0;
				for(int i=0;i<nums.length;i++){
					counter+=nums[i];
				}
				float avg=counter/nums.length;
				if(avg<30){
					msg+="young-family";
				}
				else if(avg<50){
					msg+="middle-aged-family";
				}
				else{
					msg+="old family";
				}
				
				msg+="\nThe avarage age of this family is "+avg;
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		button_1.setBounds(185, 165, 89, 23);
		panel.add(button_1);
		
		JLabel lblEnterAgeOf_1 = new JLabel("Enter age of the 2. member");
		lblEnterAgeOf_1.setBounds(21, 52, 154, 14);
		panel.add(lblEnterAgeOf_1);
		
		JLabel lblEnterAgeOf_2 = new JLabel("Enter age of the 3. member");
		lblEnterAgeOf_2.setBounds(21, 77, 154, 14);
		panel.add(lblEnterAgeOf_2);
		
		JLabel lblEnterAgeOf_3 = new JLabel("Enter age of the 4. member");
		lblEnterAgeOf_3.setBounds(21, 102, 154, 14);
		panel.add(lblEnterAgeOf_3);
		
		JLabel lblEnterAgeOf_4 = new JLabel("Enter age of the 5. member");
		lblEnterAgeOf_4.setBounds(21, 127, 154, 14);
		panel.add(lblEnterAgeOf_4);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(185, 49, 239, 20);
		panel.add(num2);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(185, 74, 239, 20);
		panel.add(num3);
		
		num4 = new JTextField();
		num4.setColumns(10);
		num4.setBounds(185, 99, 239, 20);
		panel.add(num4);
		
		num5 = new JTextField();
		num5.setColumns(10);
		num5.setBounds(185, 124, 239, 20);
		panel.add(num5);
	}
}
