package dest.java;
	
import javax.swing.JOptionPane;
public class CountAvgOfthreeNumbers {

	public static void main(String[]args){
		
		
		String firstString = JOptionPane.showInputDialog(null,"Enter 1st number:");
		
		int w = Integer.parseInt(firstString);
		
		String secondString = JOptionPane.showInputDialog(null,"Enter 2nd number:",JOptionPane.QUESTION_MESSAGE);
		int second = Integer.parseInt(secondString);
		
		String thirdString = JOptionPane.showInputDialog(null,"Enter 3rd number:");
		int third = Integer.parseInt(thirdString);
		
		int average = (w+second+third)/3;
		
		String output = "The average is="+average;JOptionPane.showMessageDialog(null,output);
		
	}
}
