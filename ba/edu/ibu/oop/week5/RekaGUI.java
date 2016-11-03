package ba.edu.ibu.oop.week5;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ba.edu.ibu.oop.week2.DivisableGui;
import ba.edu.ibu.oop.week4.ReverseNumberGui;

public class RekaGUI {

	public static class DivisableListener implements ActionListener{

		private Component parent;
		
		public DivisableListener(Component c) {
			this.parent = c;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			DivisableGui.divisable(parent);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("reka");
		
		JFrame f = new JFrame("week5");
		f.setSize(500, 500);
		f.setLayout(new GridLayout(0, 3));
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(new JLabel("Week2"));
		f.add(new JLabel("Week3"));
		f.add(new JLabel("Week4"));
		
		JButton divisable = new JButton("4. Divisable");
		divisable.addActionListener(new DivisableListener(f));
		
		JButton reverse = new JButton("6. Reverse Number");
		reverse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ReverseNumberGui.main(null);
			}
		});
		f.add(divisable);
		f.add(new JButton("Bota2"));
		f.add(reverse);
		
		f.add(new JLabel());
		f.add(new JLabel());
		f.add(new JButton("Bota3x"));
		
		f.add(new Triangle());
		
		
		f.pack();
		f.setVisible(true);
	}
	
	public static class Triangle extends JPanel{
		private static final long serialVersionUID = 1L;

		@Override
		protected void paintComponent(Graphics g) {
			g.drawPolygon(new Polygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3));
		}
	}
}
