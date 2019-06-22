import javax.swing.*;
public class swing{
	public static void main(String[] args){
		JFrame jf = new JFrame("Swing Example");

		JLabel jb = new JLabel("UserName");
		jb.setBounds(20,70,80,100);

		JLabel jb2 = new JLabel("password");
		jb2.setBounds(20,100,80,100);

		JTextField jt = new JTextField();
		jt.setBounds(100,70,50,50);

		JPasswordField jp = new JPasswordField();
		jp.setBounds(100,100,50,50);


		jf.add(jb);
		jf.add(jb2);
		jf.add(jt);
		jf.add(jp);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
	}
}