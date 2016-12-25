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

public class Figures extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Figures frame = new Figures();
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
	public Figures() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 314, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("1");
		label.setBounds(36, 11, 22, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("*****");
		label_1.setBounds(26, 36, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("  ****");
		label_2.setBounds(26, 49, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("    ***");
		label_3.setBounds(26, 63, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("      **");
		label_4.setBounds(26, 74, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("        *");
		label_5.setBounds(26, 88, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("*****");
		label_6.setBounds(91, 36, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("****");
		label_7.setBounds(91, 49, 46, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("   ***");
		label_8.setBounds(82, 63, 46, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("   **");
		label_9.setBounds(82, 74, 46, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("        *");
		label_10.setBounds(68, 88, 46, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("2");
		label_11.setBounds(106, 11, 22, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("*****");
		label_12.setBounds(164, 88, 46, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("****");
		label_13.setBounds(164, 74, 46, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("    ***");
		label_14.setBounds(153, 63, 46, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("**");
		label_15.setBounds(164, 49, 46, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("        *");
		label_16.setBounds(139, 36, 46, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("3");
		label_17.setBounds(164, 11, 22, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("*****");
		label_18.setBounds(238, 88, 46, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("  ****");
		label_19.setBounds(238, 74, 46, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("    ***");
		label_20.setBounds(238, 63, 46, 14);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("      **");
		label_21.setBounds(238, 49, 46, 14);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("        *");
		label_22.setBounds(238, 36, 46, 14);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("4");
		label_23.setBounds(262, 11, 22, 14);
		contentPane.add(label_23);
		
		JLabel lblWhichFigureTo = new JLabel("Which figure to draw?");
		lblWhichFigureTo.setBounds(83, 133, 173, 14);
		contentPane.add(lblWhichFigureTo);
		
		textField = new JTextField();
		textField.setBounds(26, 158, 258, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice=Integer.parseInt(textField.getText());
				String msg="";
				switch(choice){
					case 1: msg=drawFirstFigure();
							JOptionPane.showMessageDialog(contentPane, msg);
							break;
					case 2: msg=drawSecondFigure();
							JOptionPane.showMessageDialog(contentPane, msg);
							break;
					case 3: msg=drawFourthFigure();
							JOptionPane.showMessageDialog(contentPane, msg);
							break;
					case 4: msg=drawThirdFigure();
							JOptionPane.showMessageDialog(contentPane, msg);
							break;
					default:
						JOptionPane.showMessageDialog(contentPane, "Invalid Choice!!!");
						break;
				}
			}
		});
		btnDraw.setBounds(195, 198, 89, 23);
		contentPane.add(btnDraw);
	}
	public static String drawFirstFigure() {
		String msg="";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i)
					msg+="*";
				else
					msg+=" ";
			}
			msg+="\n";
		}
		return msg;
	}

	public static String drawSecondFigure() {
		String msg="";
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				msg+="*";
			}
			msg+="\n";
		}
		return msg;
	}

	public static String drawThirdFigure() {
		String msg="";
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (j > i)
					msg+=" ";
				else
					msg+="*";
			}
			msg+="\n";
		}
		return msg;
	}

	public static String drawFourthFigure() {
		String msg="";
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				msg+="*";
			}
			msg+="\n";
		}
		return msg;
	}
}
