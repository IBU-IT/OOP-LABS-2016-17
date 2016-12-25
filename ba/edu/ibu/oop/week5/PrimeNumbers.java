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

public class PrimeNumbers extends JFrame {

	private JPanel contentPane;
	private JTextField from_p;
	private JTextField to_p;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNumbers frame = new PrimeNumbers();
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
	public PrimeNumbers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 277, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setBounds(26, 29, 46, 14);
		contentPane.add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setBounds(26, 60, 46, 14);
		contentPane.add(lblTo);
		
		from_p = new JTextField();
		from_p.setBounds(69, 26, 182, 20);
		contentPane.add(from_p);
		from_p.setColumns(10);
		
		to_p = new JTextField();
		to_p.setColumns(10);
		to_p.setBounds(69, 57, 182, 20);
		contentPane.add(to_p);
		
		JButton btnFindPrimes = new JButton("Find Primes");
		btnFindPrimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int from=Integer.parseInt(from_p.getText());
				int to=Integer.parseInt(to_p.getText());
				String msg="";
				int counter=0;
				for(int i=from;i<to;i++){
					if(isPrime(i)){
						counter++;
						if(counter%10==0){
							msg+=i+"\n";
						}
						else{
							msg+=i+" ";
						}
					}
				}
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnFindPrimes.setBounds(142, 89, 109, 41);
		contentPane.add(btnFindPrimes);
	}
	public static boolean isPrime(int number){
		if(number<=1)
			return false;
		for(int i=2;i<=number/2;i++){
			if(number % i==0)
				return false;
		}
		return true;
	}

}
