package ba.edu.ibu.oop.week5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField display;
	private String sign;
	private int first=0;
	private int second=0;
	private String disp="";
	private int prev;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 331, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display = new JTextField();
		display.setBounds(10, 11, 278, 36);
		contentPane.add(display);
		display.setColumns(10);
		
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disp+="7";
				display.setText(disp);
			}
		});
		num7.setBounds(10, 72, 62, 45);
		contentPane.add(num7);
		
		JButton num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disp+="8";
				display.setText(disp);
			}
		});
		num8.setBounds(82, 72, 62, 45);
		contentPane.add(num8);
		
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disp+="9";
				display.setText(disp);
			}
		});
		num9.setBounds(154, 72, 62, 45);
		contentPane.add(num9);
		
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disp+="4";
				display.setText(disp);
			}
		});
		num4.setBounds(10, 129, 62, 45);
		contentPane.add(num4);
		
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disp+="5";
				display.setText(disp);
			}
		});
		num5.setBounds(82, 128, 62, 45);
		contentPane.add(num5);
		
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disp+="6";
				display.setText(disp);
			}
		});
		num6.setBounds(154, 128, 62, 45);
		contentPane.add(num6);
		
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disp+="1";
				display.setText(disp);
			}
		});
		num1.setBounds(10, 185, 62, 45);
		contentPane.add(num1);
		
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disp+="2";
				display.setText(disp);
			}
		});
		num2.setBounds(82, 184, 62, 45);
		contentPane.add(num2);
		
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disp+="3";
				display.setText(disp);
			}
		});
		num3.setBounds(154, 184, 62, 45);
		contentPane.add(num3);
		
		JButton num0 = new JButton("0");
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(disp!=""){
					disp+="0";
					display.setText(disp);
				}
			}
		});
		num0.setBounds(10, 241, 62, 45);
		contentPane.add(num0);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Integer.parseInt(disp);
				int result=0;
				String error="";
				if(sign.compareTo("+")==0){
					result=first+second;
				}else if(sign.compareTo("-")==0){
					result=first-second;
				}else if(sign.compareTo("*")==0){
					result=first*second;
				}else if(sign.compareTo("/")==0){
					if(second==0){
						error="Can not divide by zero";
					}else{
						result=first/second;
					}
				}else{
					result=first%second;
				}
				first=(int)result;
				second=0;
				disp=result+"";
				display.setText((error=="")?result+"":error);
			}
		});
		equal.setBounds(154, 240, 62, 45);
		contentPane.add(equal);
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Integer.parseInt(disp);
				sign="/";
				display.setText(disp+"/");
				disp="";
			}
		});
		division.setBounds(226, 72, 62, 45);
		contentPane.add(division);
		
		JButton multiplication = new JButton("x");
		multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Integer.parseInt(disp);
				sign="*";
				display.setText(disp+"*");
				disp="";
			}
		});
		multiplication.setBounds(226, 129, 62, 45);
		contentPane.add(multiplication);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Integer.parseInt(disp);
				sign="-";
				display.setText(disp+"-");
				disp="";
			}
		});
		minus.setBounds(226, 185, 62, 45);
		contentPane.add(minus);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Integer.parseInt(disp);
				sign="+";
				display.setText(disp+"+");
				disp="";
			}
		});
		plus.setBounds(226, 241, 62, 45);
		contentPane.add(plus);
		
		JButton mod = new JButton("%");
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Integer.parseInt(disp);
				sign="%";
				display.setText(disp+"%");
				disp="";
			}
		});
		mod.setBounds(82, 240, 62, 45);
		contentPane.add(mod);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=0;
				second=0;
				sign="";
				disp="";
				display.setText(disp);
			}
		});
		btnC.setBounds(226, 52, 62, 18);
		contentPane.add(btnC);
	}

}
