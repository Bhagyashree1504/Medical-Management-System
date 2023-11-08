package medicalstoremanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class updates extends JFrame implements ActionListener {
JLabel rj;
JButton b,c,d,m,f,g;
updates() {
	// TODO Auto-generated constructor stub
 setLayout(null);
	
	getContentPane().setBackground(Color.white);
	

	
	 rj = new JLabel("UPDATE DATA ");
	rj.setFont(new Font("serif",Font.BOLD,30) );
	  rj.setForeground(Color.black);
	rj.setBounds(270,15, 1000, 100);
	add(rj);
	
	
	
	//   1 button
	
	 b =new JButton (" Update Available Medicines");
	b.setBounds(60, 100, 200, 25);
	b.setBackground(Color.black);
	b.setForeground(Color.WHITE);
	b.addActionListener(this);
	add(b);
	
	
	//    2 button
	
     c=new JButton(" Update Payment Details");  
     
    c.setBounds(60, 150, 200, 25);
    c.setBackground(Color.black);
    c.setForeground(Color.WHITE);
    c.addActionListener(this);
    add(c);
    
    //    3 button
	
	 d = new JButton("Update Inventory Details");
    d.setBounds(60,200,200,25);
	d.setBackground(Color.black);
	d.setForeground(Color.WHITE);
	d.addActionListener(this);
	add(d);
	
	//    4 button
	
	 m= new JButton (" Update Purchase Details");
	m.setBounds(60,250,200,25);
	m.setBackground(Color.black);
	m.setForeground(Color.WHITE);
	m.addActionListener(this);
	add(m);
	
//        5 button
	
	 f =new JButton("Update Sales Details");
    f.setBounds(60, 300, 200, 25);
	f.setBackground(Color.black);
	f.setForeground(Color.WHITE);
	f.addActionListener(this);
	add(f);
	
//        6 button
	 g = new JButton (" Update Employees Details");
	 g.setBounds(60, 350, 200, 25);
    g.setBackground(Color.black);
    g.setForeground(Color.WHITE);
    g.addActionListener(this);
    add(g);
    
    
    //     insert image
    
    ImageIcon prj =new ImageIcon(ClassLoader.getSystemResource("New folder/background.jpg"));
    Image  i2= prj.getImage().getScaledInstance(800,800,Image.SCALE_AREA_AVERAGING);
	ImageIcon i3= new ImageIcon(i2);
	JLabel image = new JLabel(i3);
	image.setBounds(0,0,800,600);
	add(image);

    
    setBounds(350,200,850,540);
	setVisible(true);
	
}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getSource()==m)
	{
		new viewPurchaseDetails(null);
	}

	
	if(e.getSource()==b)
	{
		new viewmedicineInfo(null);
	}
	
	if(e.getSource()==c)
	{
		new viewPaymentDetails(null);
	}
	if(e.getSource()==d)
	{
		new viewinventoryinfo(null);
	}
	
	if(e.getSource()==f)
	{
		new viewSalesInfo(null);
	}
	if(e.getSource()==g)
	{
		new viewEmpInfo(null);
	}
		}



public static void main(String[] args) {
// TODO Auto-generated method stub
new updates();
}}