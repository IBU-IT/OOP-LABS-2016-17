package ba.edu.ibu.oop.week5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GUI {

	private JFrame frmLabs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmLabs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static int getNumberOfDevisors(int num,int length){
		int counter=0;
		for(int i=1;i<length/2;i++){
			if(num%i==0 && i*i!=num)
				counter++;
		}
		return counter;
	}
	
	private void initialize() {
		frmLabs = new JFrame();
		frmLabs.setResizable(false);
		frmLabs.setTitle("Lab 5");
		frmLabs.setBounds(100, 100, 783, 478);
		frmLabs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLabs.getContentPane().setLayout(null);
		
		JPanel week1 = new JPanel();
		week1.setBounds(21, 36, 207, 290);
		frmLabs.getContentPane().add(week1);
		week1.setLayout(null);
		
		JButton InputOutput = new JButton("Input/Output");
		InputOutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InputOutput inputOutput=new InputOutput();
				inputOutput.setVisible(true);
			}
		});
		InputOutput.setBounds(21, 26, 164, 31);
		week1.add(InputOutput);
		
		JButton btnExchangeRates = new JButton("Exchange Rates");
		btnExchangeRates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExchnageRates exch=new ExchnageRates();
				exch.setVisible(true);
			}
		});
		btnExchangeRates.setBounds(21, 78, 164, 31);
		week1.add(btnExchangeRates);
		
		JButton btnDivisible = new JButton("Divisible");
		btnDivisible.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Divisiblility div=new Divisiblility();
				div.setVisible(true);
			}
		});
		btnDivisible.setBounds(21, 130, 164, 31);
		week1.add(btnDivisible);
		
		JButton btnPositiveNegativeZero = new JButton("Positive \r\nNegative Zero");
		btnPositiveNegativeZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PositiveNegativeZero pos=new PositiveNegativeZero();
				pos.setVisible(true);
			}
		});
		btnPositiveNegativeZero.setBounds(21, 179, 164, 31);
		week1.add(btnPositiveNegativeZero);
		
		JButton btnNumberOfPositive = new JButton("Number of positive");
		btnNumberOfPositive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumberOfPositiveNegativeZero num=new NumberOfPositiveNegativeZero();
				num.setVisible(true);
			}
		});
		btnNumberOfPositive.setBounds(21, 232, 164, 31);
		week1.add(btnNumberOfPositive);
		
		JPanel week3 = new JPanel();
		week3.setBounds(519, 36, 223, 380);
		frmLabs.getContentPane().add(week3);
		week3.setLayout(null);
		
		JButton btnPrimeNumbers = new JButton("Prime Numbers");
		btnPrimeNumbers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrimeNumbers numbers=new PrimeNumbers();
				numbers.setVisible(true);
			}
		});
		btnPrimeNumbers.setBounds(21, 22, 181, 31);
		week3.add(btnPrimeNumbers);
		
		JButton btnTriangle = new JButton("Triangle");
		btnTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Figures figures=new Figures();
				figures.setVisible(true);
			}
		});
		btnTriangle.setBounds(21, 74, 181, 31);
		week3.add(btnTriangle);
		
		JButton btnNumberTriangle = new JButton("Number triangle");
		btnNumberTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				for(int i=1;i<=5;i++){
					for(int j=1;j<=i;j++){
						msg+=i+"";
					}
					msg+="\n";
				}
				JOptionPane.showMessageDialog(frmLabs, msg);
			}
		});
		btnNumberTriangle.setBounds(21, 121, 181, 31);
		week3.add(btnNumberTriangle);
		
		JButton btnReverseNumbers = new JButton("Reverse Numbers");
		btnReverseNumbers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReverseNumbers numbers=new ReverseNumbers();
				numbers.setVisible(true);
						
						
			}
		});
		btnReverseNumbers.setBounds(21, 171, 181, 31);
		week3.add(btnReverseNumbers);
		
		JButton btnNumberOfDivisors = new JButton("Number of divisors");
		btnNumberOfDivisors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int max=0;
				int length=10000;
				int counter=1;
				for(int i=1;i<length;i++){
					if(max<getNumberOfDevisors(i, length)){
						max=getNumberOfDevisors(i, length);
						counter=i;
					}
				}
				String msg="Number with most devisors is "+counter+" with "+(max+1)+" devisors.";
				JOptionPane.showMessageDialog(frmLabs, msg);
			}
		});
		btnNumberOfDivisors.setBounds(21, 220, 181, 31);
		week3.add(btnNumberOfDivisors);
		
		JButton btnDrawingFigures = new JButton("Drawing Figures");
		btnDrawingFigures.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrawFigures drawFigures=new DrawFigures();
				drawFigures.setVisible(true);
			}
		});
		btnDrawingFigures.setBounds(21, 273, 181, 31);
		week3.add(btnDrawingFigures);
		
		JButton btnAreaCalculator = new JButton("Area calculator");
		btnAreaCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AreaCalculator areaCalculator=new AreaCalculator();
				areaCalculator.setVisible(true);
			}
		});
		btnAreaCalculator.setBounds(21, 326, 181, 31);
		week3.add(btnAreaCalculator);
		
		JLabel lblWeek = new JLabel("Lab 1");
		lblWeek.setBounds(104, 21, 46, 14);
		frmLabs.getContentPane().add(lblWeek);
		
		JLabel lblWeek_1 = new JLabel("Lab 2");
		lblWeek_1.setBounds(349, 21, 46, 14);
		frmLabs.getContentPane().add(lblWeek_1);
		
		JLabel lblWeek_2 = new JLabel("Lab 3");
		lblWeek_2.setBounds(611, 21, 46, 14);
		frmLabs.getContentPane().add(lblWeek_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(258, 36, 234, 336);
		frmLabs.getContentPane().add(panel);
		
		JButton btnSimpleCalculator = new JButton("Simple Calculator");
		btnSimpleCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator calc=new Calculator();
				calc.setVisible(true);
			}
		});
		btnSimpleCalculator.setBounds(21, 26, 192, 31);
		panel.add(btnSimpleCalculator);
		
		JButton btnMonthlyInclome = new JButton("Monthly Income");
		btnMonthlyInclome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MonthlyIncome month=new MonthlyIncome();
				month.setVisible(true);
			}
		});
		btnMonthlyInclome.setBounds(21, 78, 192, 31);
		panel.add(btnMonthlyInclome);
		
		JButton btnDivisibilityBy = new JButton("Divisibility by 2");
		btnDivisibilityBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DivisibilityByTwo two=new DivisibilityByTwo();
				two.setVisible(true);
			}
		});
		btnDivisibilityBy.setBounds(21, 125, 192, 31);
		panel.add(btnDivisibilityBy);
		
		JButton btnDivisibilotyBy = new JButton("Divisibility by 2,3,6");
		btnDivisibilotyBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DivisibilityByTwoThreeSix a=new DivisibilityByTwoThreeSix();
				a.setVisible(true);
			}
		});
		btnDivisibilotyBy.setBounds(21, 175, 192, 31);
		panel.add(btnDivisibilotyBy);
		
		JButton btnFamilyAge = new JButton("Family Age");
		btnFamilyAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FamilyAge familyAge=new FamilyAge();
				familyAge.setVisible(true);
			}
		});
		btnFamilyAge.setBounds(21, 224, 192, 31);
		panel.add(btnFamilyAge);
		
		JButton btnMonthlyBudget = new JButton("Monthly Budget");
		btnMonthlyBudget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Budget budget=new Budget();
				budget.setVisible(true);
			}
		});
		btnMonthlyBudget.setBounds(21, 277, 192, 31);
		panel.add(btnMonthlyBudget);
	}
}
