package dest.java;
import javax.swing.JOptionPane;
public class welcome {
	public static void main(String[] args){
		//System.out.println("compiled\nanother line\nsomething similar to c");
		//System.out.println("hello");
		//JOptionPane.showMessageDialog(null, "Compiled");
		//JOptionPane.showMessageDialog(null, Info, Err, JOptionPane.INFORMATION_MESSAGE);
		double radius,area;
		radius=20;
		area=radius*radius*3.1416;
		System.out.println("The area is="+area);
		JOptionPane.showMessageDialog(null, "The area is"+area,
				"message ", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
