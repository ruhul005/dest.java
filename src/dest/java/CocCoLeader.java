package dest.java;
import javax.swing.JOptionPane;
public class CocCoLeader {

		
	

	

		public static void main(String[]args){

		String set1= "Can You Donate level 4 Dragon?";
			
		String set2="Can You Donate level 4 Pekka?";
		String set3="Can you donate level 3 golem";
		String set4="Can You Donate level max hog";
				
		String set5= "Can You donate level 2 lava?";
		String set6= "Do you have 300+ war stars?";
		String set7= "Can You donate 3 dark spell?";
		int day=0;
		int answer= JOptionPane.showConfirmDialog(null,"Put Your Answer\n"+set1);
		if(answer==JOptionPane.YES_OPTION)
			day++;
		
		
		answer= JOptionPane.showConfirmDialog(null,"Put Your Answer\n"+set2);
		if(answer==JOptionPane.YES_OPTION)
			day++;

		answer= JOptionPane.showConfirmDialog(null,"Put Your Answer\n"+set3);
		if(answer==JOptionPane.YES_OPTION)
			day++;
		
		answer= JOptionPane.showConfirmDialog(null,"Put Your Answer\n"+set4);
		if(answer==JOptionPane.YES_OPTION)
			day++;
		
		answer= JOptionPane.showConfirmDialog(null,"Put Your Answer\n"+set5);
		if(answer==JOptionPane.YES_OPTION)
			day++;
		answer= JOptionPane.showConfirmDialog(null,"Put Your Answer\n"+set6);
		if(answer==JOptionPane.YES_OPTION)
			day++;
		answer= JOptionPane.showConfirmDialog(null,"Put Your Answer\n"+set7);
		if(answer==JOptionPane.YES_OPTION)
			day++;
		
		if(day>=6)
		{
			JOptionPane.showMessageDialog(null,"You can be co leader");
		}
		else
			JOptionPane.showMessageDialog(null,"You can not be co leader");
		
	}
	}


