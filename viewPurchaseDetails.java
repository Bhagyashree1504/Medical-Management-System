package medicalstoremanagement;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class viewPurchaseDetails extends JFrame {
	JTable table;	
	DB conn = new DB();
	
	
	viewPurchaseDetails(String str){
	// TODO Auto-generated constructor stub
	
        table = new JTable();
//System.out.println(" View purchase Information");
 try {
	 JTable jt=new JTable(); 
	    jt.setBounds(0,250,1170,520);          
	    JScrollPane sp=new JScrollPane(jt);    
	    add(sp); 
	    //setsize first 1170 set the table size for left to right and 
	    //second 1170 set the table size for down to up
	    setSize(1170,1170);    
	   setVisible(true); 
	    //System.out.println("table displayed");		 
	 String query ="select * from Purchases";
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
     String pur_id,Quan,pur_date,pur_price;
    // System.out.println("froloop ended");
     while(rs.next()) {
    	 pur_id=rs.getString(1);
    	 Quan =rs.getString(2);
    	 pur_date=rs.getString(3);
    	 pur_price=rs.getString(4);
    	 
   	  String row[]= {pur_id,Quan,pur_date,pur_price};
   	 model.addRow(row);
     //System.out.println("while loop ended");
	 }
	 getContentPane().setBackground(Color.gray);
	 setLayout(null);
	 //setsize change the template size
	 setSize(1170,650);
	 //setlocation change the template up and down
	 setLocation(200,80);
	 setVisible(true);      
}
catch (Exception er){
	System.err.println(er);
	}
}		
      public static void main(String[] args) {
     new viewPurchaseDetails(null);
}
}