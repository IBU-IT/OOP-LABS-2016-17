package ba.edu.ibu.oop.week5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaCalculator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaCalculator frame = new AreaCalculator();
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
	public AreaCalculator() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 309, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Rectangle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int height=Integer.parseInt(JOptionPane.showInputDialog(contentPane,"Enter height: "));
				int width=Integer.parseInt(JOptionPane.showInputDialog(contentPane,"Enter width: "));
				String msg="Area= "+(height*width)+";\nPerimeter= "+(2*(height+width))+";";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnNewButton.setBounds(10, 25, 120, 59);
		contentPane.add(btnNewButton);
		
		JButton btnTriangle = new JButton("Triangle");
		btnTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int height=Integer.parseInt(JOptionPane.showInputDialog(contentPane,"Enter height: "));
				int width=Integer.parseInt(JOptionPane.showInputDialog(contentPane,"Enter width: "));
				double hip=Math.sqrt((height*height)+(width*width));
				String msg="Hypotenuse= "+hip+";\nArea= "+((height*width)/2)+";\nPerimeter= "+(height+width+hip)+";";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnTriangle.setBounds(140, 25, 120, 59);
		contentPane.add(btnTriangle);
		
		JButton btnCircle = new JButton("Circle");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int diameter=Integer.parseInt(JOptionPane.showInputDialog(contentPane,"Enter diameter: "));
				String msg="Area= "+(Math.PI*diameter)+";\nPerimeter= "+((2*Math.PI*(diameter/2)))+";";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnCircle.setBounds(10, 92, 120, 59);
		contentPane.add(btnCircle);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Geometry class ends. See you later");
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		btnQuit.setBounds(140, 92, 120, 59);
		contentPane.add(btnQuit);
	}
}
