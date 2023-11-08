package medicalstoremanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class commanpage extends JFrame implements ActionListener{
JButton a,b,c,d;
JLabel z;
	
commanpage(){
		setLayout(null);
		
		getContentPane().setBackground(Color.white);
		
		 a = new JButton ("ADD DATA");
		 a.setBounds(250, 300, 100, 40);
	    a.setBackground(Color.black);
	    a.setForeground(Color.WHITE);
	    add(a);
	    a.addActionListener(this);
	    
		 b = new JButton ("VIEW DATA");
		 b.setBounds(450, 300, 100, 40);
	    b.setBackground(Color.black);
	    b.setForeground(Color.WHITE);
	    add(b);
	    b.addActionListener(this);
//	    
//	    c = new JButton ("UPDATE DATA");
//		 c.setBounds(250, 400, 150, 40);
//	    c.setBackground(Color.black);
//	    c.setForeground(Color.WHITE);
//	    add(c);
//	    c.addActionListener(this);
//	    
//	    d = new JButton ("REMOVE DATA");
//		 d.setBounds(450, 400, 150, 40);
//	    d.setBackground(Color.black);
//	    d.setForeground(Color.WHITE);
//	    add(d);
//	    d.addActionListener(this);
	    
	     z =new JLabel("WELCOME");
	    z.setBounds(350,50 ,200 ,150 );
	    z.setFont(new Font("Serif",Font.BOLD,20));
	    z.setBackground(Color.black);
	    z.setForeground(Color.black);
	    add(z);
	   
	    
	    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Camera Roll/add data.jpeg"));
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon (i2);
		JLabel image=new JLabel (i3);
		add(image);
		image.setBounds(225,150,150,190);
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Camera Roll/view data.jpeg"));
		Image i5=i4.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon (i5);
		JLabel image1=new JLabel (i6);
		add(image1);
		image1.setBounds(425,150,150,190);
		
		  ImageIcon i7 =new ImageIcon(ClassLoader.getSystemResource("New folder/background.jpg"));
		    Image  i8= i7.getImage().getScaledInstance(800,800,Image.SCALE_AREA_AVERAGING);
			ImageIcon i9= new ImageIcon(i8);
			JLabel image2 = new JLabel(i9);
			image2.setBounds(0,0,800,540);
			add(image2);

		
		 
		 setBounds(350,200,850,540);
		setVisible(true);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource()==a) {
		setVisible(false);
		 new mainpage();
	}
	
    if(e.getSource()==b) {
    	setVisible(false);
    	new showdata();
	}
    
//    if(e.getSource()==c) {
//		 new updates();
//	}
//    
//    if(e.getSource()==d) {
//		 new remove();
//	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new commanpage();
	}
}

