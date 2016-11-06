package ba.edu.ibu.oop.week2;
import javax.swing.JOptionPane;

public class IncomeGUI {

	public static void main(String[] args) {
		for(int i = 0; i<3; i++){
			String fincome = JOptionPane.showInputDialog("What is your monthly income: ");
			int income = Integer.parseInt(fincome);
			
			if (income>=0){
			if ( income<=1000)
			{
				JOptionPane.showMessageDialog(null, "Your family is VERY POOR!");
			}
			else if (income<=2000) 
			{
				JOptionPane.showMessageDialog(null, "Your family is POOR!");
			}
			else if (income<=3000) 
			{
				JOptionPane.showMessageDialog(null, "Your family is NORMAL!");
			}
			else if (income<=4000) 
			{
				JOptionPane.showMessageDialog(null, "Your family is RICH!");
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Your family is VERY RICH!");
			}
			
		}
			else JOptionPane.showMessageDialog(null, "Invalid input");
		
		}

	}

}
