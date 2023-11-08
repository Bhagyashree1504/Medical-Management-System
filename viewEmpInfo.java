package medicalstoremanagement;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class viewEmpInfo extends JFrame implements ActionListener{
	JTable table;	
	DB conn = new DB();
	JButton d;
	
	viewEmpInfo(String str){
	// TODO Auto-generated constructor stub
	
//		d = new JButton ("UPDATE EMPLOYEE");
//		 d.setBounds(300, 300, 200, 40);
//	    d.setBackground(Color.black);
//	    d.setForeground(Color.WHITE);
//	    add(d);
//	    d.addActionListener(this);
//		
		
		
        table = new JTable();
System.out.println(" View Employees Information");

 try {
	 JTable jt=new JTable(); 
	    jt.setBounds(100,250,1000,520);          
	    JScrollPane sp=new JScrollPane(jt);    
	    add(sp); 
	    
	    //setsize first 1170 set the table size for left to right and 
	    //second 1170 set the table size for down to up
	    setSize(1170,1170);    
	   setVisible(true); 
	    //System.out.println("table displayed");		 
	 String query ="select * from empdetails";
	    //System.out.println("table query run");
	 ResultSet rs= conn.s.executeQuery(query);
	// System.out.println("execute Query");
	 ResultSetMetaData rsmd=rs.getMetaData();
	// System.out.println("Result SetMeta Data");
	 DefaultTableModel model = (DefaultTableModel) jt.getModel();
	 //System.out.println("Default Table Model");
	 int col = rsmd.getColumnCount();
     String[]cloname = new String [col];
    // System.out.println("string excute");
     for (int i = 0; i<col; i++) 
    cloname[i]=rsmd.getColumnName(i+1);
     model.setColumnIdentifiers(cloname);
     String emp_id,emp_name,gender,jobtype,salary;
    // System.out.println("froloop ended");
     while(rs.next()) {
    	 emp_id=rs.getString(1);
    	 emp_name =rs.getString(2);
    	 gender=rs.getString(3);
    	 jobtype=rs.getString(4);
    	 salary=rs.getString(5);
    	 
   	  String row[]= {emp_id,emp_name,gender,jobtype,salary};
   	 model.addRow(row);
     //System.out.println("while loop ended");
	 }
	 getContentPane().setBackground(Color.gray);
	 setLayout(null);
	 //setsize change the template size
	 setSize(1170,540);
	 //setlocation change the template up and down
	 setLocation(350,200);
	 setVisible(true);      
}
catch (Exception er){
	System.err.println(er);
	}
}		
      public static void main(String[] args) {
     new viewEmpInfo(null);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
//		if(e.getSource()==d)
//		{
//			new updateempdetails("");
//		}
	}
}


