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

public class Budget extends JFrame {

	private JPanel contentPane;
	private JTextField father_income;
	private JTextField mother_income;
	private JTextField other_income;
	private JTextField rental_expenses;
	private JTextField bill_expences;
	private JTextField kitchen;
	private JTextField other_expences;
	private JTextField num_members;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Budget frame = new Budget();
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
	public static void drawFirstFigure() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void drawSecondFigure() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void drawThirdFigure() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void drawFourthFigure() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public Budget() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 531, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Income of the father");
		lblNewLabel.setBounds(22, 27, 136, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIncomeOfThe = new JLabel("Income of the mother");
		lblIncomeOfThe.setBounds(22, 52, 136, 14);
		contentPane.add(lblIncomeOfThe);
		
		JLabel lblOtherIncome = new JLabel("Other income");
		lblOtherIncome.setBounds(22, 77, 136, 14);
		contentPane.add(lblOtherIncome);
		
		JLabel lblRentelExpenses = new JLabel("Rental expenses");
		lblRentelExpenses.setBounds(22, 102, 136, 14);
		contentPane.add(lblRentelExpenses);
		
		JLabel lblBillsExpenses = new JLabel("Bills expenses");
		lblBillsExpenses.setBounds(22, 127, 136, 14);
		contentPane.add(lblBillsExpenses);
		
		JLabel lblKitchenExpenses = new JLabel("Kitchen expenses");
		lblKitchenExpenses.setBounds(22, 152, 136, 14);
		contentPane.add(lblKitchenExpenses);
		
		JLabel lblOtherExpenses = new JLabel("Other expenses");
		lblOtherExpenses.setBounds(22, 177, 136, 14);
		contentPane.add(lblOtherExpenses);
		
		JLabel lblNumberOfPeople = new JLabel("Number of people in family");
		lblNumberOfPeople.setBounds(22, 202, 136, 14);
		contentPane.add(lblNumberOfPeople);
		
		father_income = new JTextField();
		father_income.setBounds(168, 24, 319, 20);
		contentPane.add(father_income);
		father_income.setColumns(10);
		
		mother_income = new JTextField();
		mother_income.setColumns(10);
		mother_income.setBounds(168, 49, 319, 20);
		contentPane.add(mother_income);
		
		other_income = new JTextField();
		other_income.setColumns(10);
		other_income.setBounds(168, 74, 319, 20);
		contentPane.add(other_income);
		
		rental_expenses = new JTextField();
		rental_expenses.setColumns(10);
		rental_expenses.setBounds(168, 99, 319, 20);
		contentPane.add(rental_expenses);
		
		bill_expences = new JTextField();
		bill_expences.setColumns(10);
		bill_expences.setBounds(168, 124, 319, 20);
		contentPane.add(bill_expences);
		
		kitchen = new JTextField();
		kitchen.setColumns(10);
		kitchen.setBounds(168, 149, 319, 20);
		contentPane.add(kitchen);
		
		other_expences = new JTextField();
		other_expences.setColumns(10);
		other_expences.setBounds(168, 174, 319, 20);
		contentPane.add(other_expences);
		
		num_members = new JTextField();
		num_members.setColumns(10);
		num_members.setBounds(168, 199, 319, 20);
		contentPane.add(num_members);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		btnCancel.setBounds(398, 230, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total=0;
				total+=Integer.parseInt(father_income.getText());
				total+=Integer.parseInt(mother_income.getText());
				total+=Integer.parseInt(other_income.getText());
				total-=Integer.parseInt(rental_expenses.getText());
				total-=Integer.parseInt(bill_expences.getText());
				total-=Integer.parseInt(other_expences.getText());
				total-=Integer.parseInt(bill_expences.getText());
				total-=Integer.parseInt(kitchen.getText());
				String msg="Net income of the family is "+total;
				float per_person_income=total/Integer.parseInt(num_members.getText());
				if(total<530){
					if(total<0){
						msg+="There is a boudget deficit";
					}
					msg+="\nThis is a poor family";
				}
				else if(total<1500){
					msg+="\nThis is a middle class family\nThe income per person of this family is "+per_person_income;
					
				}
				else{
					msg+="\nThis is a rich family\nThe income per person of this family is "+per_person_income;;
				}
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnCalculate.setBounds(168, 235, 89, 23);
		contentPane.add(btnCalculate);
	}
}
