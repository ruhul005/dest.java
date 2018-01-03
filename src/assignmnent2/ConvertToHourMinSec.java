package assignmnent2;
import javax.swing.JOptionPane;

public class ConvertToHourMinSec {

	public static void main(String[] args) {
		
		 //String message= "Enter MilliSeconds";
		 //JOptionPane.showMessageDialog(null, message);
		 String message= JOptionPane.showInputDialog("Enter mili seconds:");
		 long milliseconds = Long.parseLong(message);
		 
		 long tottalSeconds = milliseconds/1000;
		 long seconds=tottalSeconds%1000; 
		 long tottalMinute = seconds/60;
		 long minute = tottalMinute %60;
		 long tottalHour= minute/60;
		 
		 
		 long hour = tottalHour%60;
		 //System.out.printf("%f milliseconds is= %.2f hours %.2fminutes %.2f Seconds",milliseconds,hour,minute,seconds);
		 
		 JOptionPane.showMessageDialog(null, +milliseconds+"is"+hour+ "hours"+minute+"minute"+seconds+"Seconds" );
		 //JOptionPane.showMessageDialog(null, "%f milliseconds is= %.2f hours %.2fminutes %.2f Seconds",milliseconds,hour,minute,seconds);

	}

}
