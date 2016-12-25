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

public class ExchnageRates extends JFrame {

	private JPanel contentPane;
	private JTextField dolar;
	private JTextField euro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExchnageRates frame = new ExchnageRates();
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
	public ExchnageRates() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 286, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter $:");
		lblNewLabel.setBounds(23, 47, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterE = new JLabel("Enter E:");
		lblEnterE.setBounds(23, 84, 46, 14);
		contentPane.add(lblEnterE);
		
		dolar = new JTextField();
		dolar.setBounds(79, 44, 159, 20);
		contentPane.add(dolar);
		dolar.setColumns(10);
		
		euro = new JTextField();
		euro.setColumns(10);
		euro.setBounds(79, 81, 159, 20);
		contentPane.add(euro);
		
		JLabel lble = new JLabel("$/E    :");
		lble.setBounds(23, 130, 46, 14);
		contentPane.add(lble);
		
		JLabel lblE = new JLabel("E/$    :");
		lblE.setBounds(23, 161, 46, 14);
		contentPane.add(lblE);
		
		final JLabel label1 = new JLabel("");
		label1.setBounds(69, 130, 169, 14);
		contentPane.add(label1);
		
		final JLabel label2 = new JLabel("");
		label2.setBounds(69, 161, 169, 14);
		contentPane.add(label2);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dol=dolar.getText();
				String eu=euro.getText();
				double dola=Double.parseDouble(dol);
				double eur=Double.parseDouble(eu);
				label1.setText(dolar.getText()+"/"+euro.getText()+"="+(dola/eur));
				label2.setText(euro.getText()+"/"+dolar.getText()+"="+(eur/dola));
			}
		});
		btnCalculate.setBounds(69, 214, 87, 23);
		contentPane.add(btnCalculate);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		btnClose.setBounds(166, 214, 77, 23);
		contentPane.add(btnClose);
	}

}
