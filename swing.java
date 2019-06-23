import javax.swing.*;
import java.awt.event.*;
public class swing{
	public static void main(String[] args){
		JFrame jf = new JFrame("Swing Example");

		JLabel jb = new JLabel("UserName");
		jb.setBounds(20,70,70,20);

		JLabel jb2 = new JLabel("password");
		jb2.setBounds(20,100,70,20);

		JTextField jt = new JTextField();
		jt.setBounds(100,70,70,20);

		JPasswordField jp = new JPasswordField();
		jp.setBounds(100,100,70,20);

		JButton j = new JButton("Login");
		j.setBounds(100,130,70,20);

		JLabel label = new JLabel();
		label.setBounds(100,160,400,40);

		jf.add(jb);
		jf.add(jb2);
		jf.add(jt);
		jf.add(jp);
		jf.add(j);
		jf.add(label);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);

		j.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e) {       
                   String data = "Username " + jt.getText();  
                   data += ", Password: "   
                   + new String(jp.getPassword());   
                   label.setText(data);          
                }  
             });
	}
}