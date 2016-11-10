package ba.edu.ibu.oop.week5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ba.edu.ibu.oop.week4.Figures;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrawFigures extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawFigures frame = new DrawFigures();
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
	public DrawFigures() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 382, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Rectangle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int height=Integer.parseInt(JOptionPane.showInputDialog(contentPane,"Enter height: "));
				int width=Integer.parseInt(JOptionPane.showInputDialog(contentPane,"Enter width: "));
				String msg=drawRectangle(height,width);
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnNewButton.setBounds(44, 30, 137, 56);
		contentPane.add(btnNewButton);
		
		JButton btnDiamond = new JButton("Diamond");
		btnDiamond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int height=Integer.parseInt(JOptionPane.showInputDialog(contentPane,"Enter dimension: "));
				JOptionPane.showMessageDialog(contentPane, drawDiamond(height));
			}
		});
		btnDiamond.setBounds(191, 30, 137, 56);
		contentPane.add(btnDiamond);
		
		JButton btnTriangle = new JButton("Triangle");
		btnTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dim=Integer.parseInt(JOptionPane.showInputDialog(contentPane,"Enter dimension: "));
				JOptionPane.showMessageDialog(contentPane, drawTriangle(dim));
			}
		});
		btnTriangle.setBounds(44, 97, 137, 56);
		contentPane.add(btnTriangle);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		btnClose.setBounds(191, 97, 137, 56);
		contentPane.add(btnClose);
	}
	public String drawRectangle(int height,int width) {
		String msg="";
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || i == height)
					msg+="-";
				else if (j == 1 || j == width)
					msg+="|";
				else
					msg+=" ";
			}
			msg+="\n";
		}
		return msg;
	}
	public String drawDiamond(int dimension) {
		String msg="";
		for (int i = 1; i <= dimension; i++) {
			for (int j = dimension; j >= i; j--) {
				msg+=" ";
			}
			for (int m = 1; m <= i; m++) {
				msg+=" *";
			}
			msg+="\n";
		}
		for (int i = 1; i <= dimension; i++) {
			for (int j = 1; j <= i; j++) {
				msg+=" ";
			}
			for (int m = dimension; m >= i; m--) {
				msg+=" *";
			}
			msg+="\n";
		}
		return msg;
	}
	public String drawTriangle(int dim) {
		String msg="";
		for (int i = 1; i <= dim; i++) {
			for (int j = dim; j >= i; j--) {
				msg+=" ";
			}
			for (int m = 1; m <= i; m++) {
				msg+=" *";
			}
			msg+="\n";
		}
		return msg;
	}

}
