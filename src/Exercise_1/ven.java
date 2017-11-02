
package Exercise_1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.awt.ActiveEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class ven extends JFrame {
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	private JPasswordField pwfield;
	
	public ven(){
		super("Welcome to Venkat Java Soft_Ware");
		setLayout(new FlowLayout());
		
		field1 =new JTextField(10);
		add(field1);
		
		field2 = new JTextField("Enter Some Text Here...");
		add(field2);
		
		field3 = new JTextField("You Can't Edit This...");
		field3.setEditable(false);
		add(field3);
		
		pwfield = new JPasswordField("My Password");
		add(pwfield);
		
		thehandler handler= new thehandler();
		field1.addActionListener(handler);
		field2.addActionListener(handler);
		field3.addActionListener(handler);
		pwfield.addActionListener(handler);
		
		
	}

	private class thehandler implements ActionListener{
		public void actionPerformed(ActionEvent MyEvent ){
			String MyText =" ";
		if (MyEvent.getSource()==field1){
			//System.out.println("USER NAME");
			MyText = String.format("You Typed : %s", MyEvent.getActionCommand());
		}else if (MyEvent.getSource()==field2){
			//System.out.println("ENTER FULL NAME");
			MyText = String.format("You Typed : %s", MyEvent.getActionCommand());
		}else if (MyEvent.getSource()==field3){
			MyText = String.format("You Typed : %s", MyEvent.getActionCommand());
		}else if (MyEvent.getSource()==pwfield){
			MyText = String.format("Your Password is : %s", MyEvent.getActionCommand());
		}
		
		JOptionPane.showMessageDialog(null, MyText);
		
		}
	
	}
}
