package medicalstoremanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;





public class login extends JFrame  implements ActionListener{
	JButton b1;
	JTextField tf1 ;
	JLabel l1;
	JLabel l2,l3;
	JPasswordField tf2;
	 login()
	 {
			
		 l3=new JLabel("WELLNESS MEDICAL ");
			l3.setBounds(200,20,550,35);
			l3.setForeground(Color.black);
			//l1.setBackground(Color.BLACK);
			l3.setFont(new Font("Serif",Font.BOLD,30));
			l3.setVisible(true);
			add(l3); 
			
			b1=new JButton("LOGIN");
			b1.setBounds(300,550,150,30);
			b1.setForeground(Color.black);
			b1.setBackground(Color.GRAY);
			b1.setFont(new Font("Serif",Font.BOLD,20));
			b1.setVisible(true);
			add(b1);
		b1.addActionListener(this);
			
		    l1=new JLabel("USERNAME : ");
			l1.setBounds(250,450,150,30);
			l1.setForeground(Color.black);
			//l1.setBackground(Color.BLACK);
			l1.setFont(new Font("Serif",Font.BOLD,20));
			l1.setVisible(true);
			add(l1);
			
			 l2=new JLabel("PASSWORD : ");
				l2.setBounds(250,500,150,30);
				l2.setForeground(Color.black);
				//l1.setBackground(Color.BLACK);
				l2.setFont(new Font("Serif",Font.BOLD,20));
				l2.setVisible(true);
				add(l2);
			
				tf1=new JTextField();
				tf1.setBounds(400,450,150,30);
				tf1.setForeground(Color.black);
				tf1.setBackground(Color.WHITE);
				tf1.setFont(new Font("Serif",Font.PLAIN,20));
				tf1.setVisible(true);
				add(tf1);
				
				 tf2=new JPasswordField();
					tf2.setBounds(400,500,150,30);
					tf2.setForeground(Color.black);
					tf2.setBackground(Color.white);
					tf2.setFont(new Font("Serif",Font.PLAIN,20));
					tf2.setVisible(true);
					add(tf2);
					
					ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/back.jpeg"));
					Image i2=i1.getImage().getScaledInstance(1170,650,Image.SCALE_DEFAULT);
					ImageIcon i3= new ImageIcon (i2);
					JLabel image=new JLabel (i3);
					add(image);
					image.setBounds(0,0,900,800);

					
					

					getContentPane().setBackground(Color.white);
					setLayout(null);
					setSize(800,700);
					setLocation(500,100);
					setVisible(true);			 
	 }
public static void main(String Args[]){
	new login();
}
@Override
public void actionPerformed(ActionEvent e) {
	
	// TODO Auto-generated method stub
	if(e.getSource()==b1)
	{
		DB ob = null;
		
			try {
				ob = new DB();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();  
			}
		String uid = tf1.getText();
		String pass = tf2.getText();
		
		String q="select * from admin where username ='"+uid+"' AND pass='"+pass+"' ";
		
		try {
			
			ResultSet r = ob.s.executeQuery(q);
			
			if(r.next()) {
			  setVisible(false);
				new commanpage();
			}else {
				JOptionPane.showMessageDialog(this, "Invalid username or password");
			}
		
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		
	
	
	
	}

}	

}
