package medicalstoremanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//import com.toedter.calendar.JDateChooser;

public class purchases extends JFrame implements ActionListener{
	JLabel l,l1,l2,l3,l4,l5;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JButton b1,b2,back;
//	private JDateChooser date_chooser;
	 Statement statement;
	//JDateChooser date_chooser;
	purchases()
	{

		 l=new JLabel("Add Purchase details ");
			l.setBounds(300,50,400,30);
			l.setForeground(Color.black);
			l.setFont(new Font("Serif",Font.BOLD,25));
			add(l);
		
		
		 l1=new JLabel("Purchase id      : ");
			l1.setBounds(60,120,150,30);
			l1.setForeground(Color.black);
			l1.setFont(new Font("Serif",Font.BOLD,18));
			add(l1);
			
			 tf1=new JTextField(null);
				tf1.setBounds(200,120,60,25);
				tf1.setForeground(Color.black);
				tf1.setBackground(Color.white);
				tf1.setFont(new Font("Serif",Font.PLAIN,15));
				add(tf1);
				
			
				            l3=new JLabel("Quantity           : ");
							l3.setBounds(60,170,150,30);
							l3.setForeground(Color.black);
							l3.setFont(new Font("Serif",Font.BOLD,18));
							add(l3);
							
							 l4=new JLabel("Purchase_date : ");
								l4.setBounds(60,220,150,30);
								l4.setForeground(Color.black);
								l4.setFont(new Font("Serif",Font.BOLD,18));
								add(l4);
								
								l5=new JLabel("Purchase_price: ");
								l5.setBounds(60,270,150,30);
								l5.setForeground(Color.black);
								l5.setFont(new Font("Serif",Font.BOLD,18));
								add(l5);
							
									
									 tf3=new JTextField(null);
										tf3.setBounds(200,170,150,25);
										tf3.setForeground(Color.black);
										tf3.setBackground(Color.white);
										tf3.setFont(new Font("Serif",Font.PLAIN,15));
										add(tf3);
										
										tf4=new JTextField(null);
										tf4.setBounds(200,220,150,25);
										tf4.setForeground(Color.black);
										tf4.setBackground(Color.white);
										tf4.setFont(new Font("Serif",Font.PLAIN,15));
										add(tf4);
											
											 tf5=new JTextField(null);
												tf5.setBounds(200,270,150,25);
												tf5.setForeground(Color.black);
												tf5.setBackground(Color.white);
												tf5.setFont(new Font("Serif",Font.PLAIN,15));
												add(tf5);
//					 date_chooser=new JDateChooser();
//					date_chooser.setFont(new Font("Tohoma",Font.PLAIN,20));
//					date_chooser.setBounds(200,220,150,25);
//					date_chooser.setDateFormatString("yyyy-mm-dd");
//					add(date_chooser);
//												
												b1=new JButton("Add");
												b1.setBounds(300,350,100,30);
												b1.setForeground(Color.white);
												b1.setBackground(Color.black);
												b1.setFont(new Font("Serif",Font.BOLD,20));
												b1.setVisible(true);
												add(b1);
											b1.addActionListener(this);	
											
											 back = new JButton (" BACK");
											 back.setBounds(600, 400, 100, 25);
										    back.setBackground(Color.black);
										    back.setForeground(Color.white);
										    back.addActionListener(this);
										    add(back);

										
										ImageIcon abc =new ImageIcon(ClassLoader.getSystemResource("New folder/background.jpg"));
									    Image  i4= abc.getImage().getScaledInstance(800,800,Image.SCALE_AREA_AVERAGING);
										ImageIcon i5= new ImageIcon(i4);
										JLabel image1 = new JLabel(i5);
										image1.setBounds(0,0,800,600);
										add(image1);			
												
					getContentPane().setBackground(Color.white);
					setLayout(null);
					setBounds(350,250,850,540);
	 				setVisible(true);
	 				setLocation(350,200);
					
				
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try {
			
			String pur_id = tf1.getText();
			String Quan = tf3.getText();
			String pur_date =tf4.getText ();
			String pur_price = tf5.getText();
			
			String query="insert into Purchases values('"+pur_id+"','"+Quan+"','"+pur_date+"','"+pur_price+"');";
			
			DB conn = new DB();

			boolean rs = conn.s.execute(query);
			
			
			if(rs==false) {
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Congrats 💐 details entered Successfully");
				 new mainpage();
			}
			
//			if(rs==String(pur_id))
//			{
//				setVisible(false);
//				JOptionPane.showMessageDialog(null, "Enter unique purchase id");
//				 new mainpage();
//			}
						
		}catch(Exception e1){
			e1.printStackTrace();
		}
		if(e.getSource()==back)
		{
			setVisible(false);
			 new  mainpage();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new purchases();
	}



}