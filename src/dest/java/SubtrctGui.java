package assignment;


import javax.swing.JOptionPane;

public class SubtrctGui {

	public static void main(String[] args) {
		for(int i=0;;i++){
			//Scanner input= new Scanner(System.in);
			int number1 = (int)(Math.random() * 100);
			int number2 = (int)(Math.random() * 100);
			
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;}
			//JOptionPane.showMessageDialog(null,"What is " + number1 + " - " + number2 + "? ");
				
		// System.out.println("What is " + number1 + " - " + number2 + "? ");
		 String answerString = JOptionPane.showInputDialog("What is " + number1 + " - " + number2 + "? ");
		 Double answer= Double.parseDouble(answerString);
		 
		 if (number1 - number2 ==  answer) JOptionPane.showMessageDialog(null,"উত্তর সঠিক");
		
		 else
		 //System.out.println("উত্তর ভুল \n" + number1 + " - " + number2 + " উত্তর হবে  " + (number1 - number2));
		 JOptionPane.showMessageDialog(null,"উত্তর ভুল \n" + number1 + " - " + number2 + " উত্তর হবে  " + (number1 - number2));


	}
		}
	}