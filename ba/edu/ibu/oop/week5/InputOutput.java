package ba.edu.ibu.oop.week5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class InputOutput extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField gpa;
	private JTextField id;
	private JLabel lblCredits;
	private JTextField credits;
	private JButton btnNewButton;
	private JLabel lblGender;
	private JRadioButton male;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton female;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputOutput frame = new InputOutput();
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
	public InputOutput() {
		setName("frame");
		setTitle("Input Output");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 366, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(267, 234, 69, 23);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnClose);
		
		JLabel lblNameAndSurname = new JLabel("Name and Surname");
		lblNameAndSurname.setBounds(41, 55, 109, 14);
		contentPane.add(lblNameAndSurname);
		
		name = new JTextField();
		name.setBounds(160, 52, 176, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(41, 86, 109, 14);
		contentPane.add(lblAge);
		
		JLabel lblGpa = new JLabel("GPA");
		lblGpa.setBounds(41, 111, 109, 14);
		contentPane.add(lblGpa);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(41, 136, 109, 14);
		contentPane.add(lblId);
		
		age = new JTextField();
		age.setBounds(160, 83, 176, 20);
		contentPane.add(age);
		age.setColumns(10);
		
		gpa = new JTextField();
		gpa.setColumns(10);
		gpa.setBounds(160, 108, 176, 20);
		contentPane.add(gpa);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(160, 133, 176, 20);
		contentPane.add(id);
		
		lblCredits = new JLabel("Credits");
		lblCredits.setBounds(41, 161, 109, 14);
		contentPane.add(lblCredits);
		
		credits = new JTextField();
		credits.setColumns(10);
		credits.setBounds(160, 158, 176, 20);
		contentPane.add(credits);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gender;
				if(male.isSelected()){
					gender="Male";
				}else{
					gender="Female";
				}
				String msg="Name Surname: "+name.getText()+"\nGender: "+gender+"\nAge: "+age.getText()+"\nID: "+id.getText()+"\nGPA: "+gpa.getText()+"\nCredits: "+credits.getText()+"\n";
				JOptionPane.showMessageDialog(contentPane,msg);
			}
		});
		btnNewButton.setBounds(160, 234, 69, 23);
		contentPane.add(btnNewButton);
		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(41, 186, 109, 14);
		contentPane.add(lblGender);
		
		male = new JRadioButton("Male");
		male.setSelected(true);
		buttonGroup.add(male);
		male.setBounds(160, 185, 58, 23);
		contentPane.add(male);
		
		female = new JRadioButton("Female");
		buttonGroup.add(female);
		female.setBounds(227, 185, 85, 23);
		contentPane.add(female);
	}

}
