package medicalstoremanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class updateempdetails extends JFrame implements ActionListener {
	
	JLabel a,b,c,d,e,f;
	  JButton z;
	  JTextField ab,ac,ae,af;
	  JComboBox ad;
	  String emp_id;

	updateempdetails(String emp_id) {
		this.emp_id=emp_id;
		// TODO Auto-generated constructor stub
		setLayout(null);
		
		 getContentPane().setBackground(Color.white);
		 
	         
			// label 1
			
			 a =new JLabel("Employee Id  :- ");
			a.setFont(new Font("serif",Font.BOLD,25) );
			  a.setForeground(Color.black);
			  a.setBounds(100,100,200,100);
			  add(a);
			  
			// label 2
			  
			   b = new JLabel("Employee name :- ");
			  b.setFont(new Font("serif",Font.BOLD,25));
			  b.setForeground(Color.black);
			  b.setBounds(100, 150, 200, 100);
			  add(b);
			  
			 // label 3
			  
			
			
			   c = new JLabel("Gender :- ");
			  c.setFont(new Font("serif",Font.BOLD,25));
			  c.setForeground(Color.black);
			  c.setBounds(100, 200, 200, 100);
			  add(c);
			 
			 // label 4
			  
			   d = new JLabel("Job Type  :- ");
			  d.setFont(new Font("serif",Font.BOLD,25));
			  d.setForeground(Color.black);
			  d.setBounds(100, 250, 200, 100);
			  add(d);
			 
			  //label 5
			  
			  
			   e = new JLabel("Salary   :- ");
			  e.setFont(new Font("serif",Font.BOLD,25));
			  e.setForeground(Color.black);
			  e.setBounds(100, 300, 200, 100); 
			  add(e);
			  
			  
			   f =new JLabel("Update Employee Details");
			  f.setFont(new Font ("serif",Font.BOLD,25));
			  f.setForeground(Color.black);
			  f.setBounds(300,10,300,100);
			  add(f);
			  
			   z = new JButton ("UPDATE");
			  z.setFont(new Font("serif",Font.BOLD,20));
			  z.setBounds(350, 380, 200, 40);
			  z.setForeground(Color.black);
			  z.setBackground(Color.gray);
			  add(z);
			  z.addActionListener(this);
			 
			  
			  
			 
			 //field 1 
			  
			  JLabel a =new JLabel();
			  a.setBounds(300, 145, 100, 20);
	          add(a);	 
	          
	       // field 2
			  
	          JLabel b = new JLabel();
	          b.setBounds(300, 190, 200, 20);
			  add(b);
			  
			// field 3  
			  
			  String str[]= {"Male","Female"};
			  JLabel c = new JLabel();
			  c.setBounds(300, 240, 100, 20);
			  add(c);

			  
			
			// field 4
			  
			   ae = new JTextField();
			  ae.setBounds(300, 290, 100, 20);
			  add(ae);
		 

			   af = new JTextField();
			  af.setBounds(300, 340, 100, 20);
			  add(af);
		 
			  ImageIcon abc =new ImageIcon(ClassLoader.getSystemResource("New folder/background.jpg"));
			    Image  i4= abc.getImage().getScaledInstance(800,800,Image.SCALE_AREA_AVERAGING);
				ImageIcon i5= new ImageIcon(i4);
				JLabel image1 = new JLabel(i5);
				image1.setBounds(0,0,800,540);
				add(image1);
		 
		 

		 setBounds(350,200,850,540);
			setVisible(true);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		 new updateempdetails("");
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
	try {
				
				String emp_id = ab.getText();
				String emp_name = ac.getText();
				String gender = (String)ad.getSelectedItem();
				String jobtype = ae.getText();
				String salary = af.getText();
				
				String query="insert into empdetails values('"+emp_id+"','"+emp_name+"','"+gender+"','"+jobtype+"','"+salary+"');";
				
				DB conn = new DB();

				boolean rs = conn.s.execute(query);
				
				System.out.print(rs);
				
				if(rs==false) {
					setVisible(false);
					JOptionPane.showMessageDialog(null, "Congrats 💐 details entered Successfully");
					 new mainpage();
					
				}
				else
				{
					setVisible(false);
					 new mainpage();
				}
				
			}catch(Exception e1){
				e1.printStackTrace();
			}	
		}
	}



