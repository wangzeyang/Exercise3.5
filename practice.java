import javax.swing.JOptionPane;

public class practice {
	public static void main (String []args){
		
		String s1[]={"Administrator","Faculty", "Staff", "Student", "Guest"};
		String s2=(String)JOptionPane.showInputDialog(null,"select user role","s1",JOptionPane.PLAIN_MESSAGE,null,s1,s1[4]);
		JOptionPane.showMessageDialog(null, "welcome :"+s2);
	}
}

