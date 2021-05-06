package serrtp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*; 
import javax.swing.ImageIcon; 
import javax.swing.JLabel; 
import javax.swing.table.DefaultTableModel;
public class management {
    
     private static ImageIcon kk(String p,String d)
    {
    java.net.URL im= management.class.getResource(p);
    if(im!=null)
        {
        return new ImageIcon(im,d);
        }
    else
        {return null;
        
        }}
    
    public static void main(String[]args){
    JFrame f=new JFrame("LOGIN PAGE");
    JLabel l=new JLabel("                      WELCOME TO KEBELE MANAGEMENT SYSTEM");
    JPanel p=new JPanel();
    Font ff=new Font("Century",Font.BOLD,30);
    l.setForeground(Color.red);
    l.setFont(ff);
    p.add(l);
    JLabel l1=new JLabel("PLEASE ENTER THE PASSWORD IN ORDER TO BE IN ADMIN PAGE");
    l1.setBackground(Color.MAGENTA);
    Font fff=new Font("Century",Font.ROMAN_BASELINE,20);
    l1.setFont(fff);
    JPanel p1=new JPanel();
    p1.add(l1);
    p.add(p1);
     
    
    JLabel l2=new JLabel("PASSWORD");
    l2.setBackground(Color.black);
    final JPasswordField pf=new JPasswordField(20);
    JPanel p2=new JPanel();
    p2.add(l2);p2.add(pf);
    JButton b=new JButton("LOGIN");
    b.setBackground(Color.GREEN);
    JPanel p3=new JPanel();
    p3.add(b);
    p.add(p2);
    p.add(p3);
   // p.add(p22);
   ImageIcon i=kk("welcome.jpg","li");
   JLabel li=new JLabel(i);
   li.setSize(1000, 1000);
   f.add(li,BorderLayout.CENTER);
    f.add(p,BorderLayout.NORTH);
    p.setLayout(new GridLayout(4,1));
    f.setLayout(new GridLayout(2,1));
     f.setSize(700, 500);
     f.setLocation(400,100);
    f.setVisible(true);
    
    class acl implements ActionListener{
            public void actionPerformed(ActionEvent e) {
               
                String password,pw="1234",null1="";
                password=pf.getText();
                if(password.equals(pw)){
                    pf.setText(null);
                
    JFrame fa=new JFrame("ADMIN PAGE");
    JLabel la=new JLabel("WELCOME TO THE ADMIN PAGE");
     Font ff=new Font("Century",Font.ITALIC,20);
    la.setForeground(Color.MAGENTA);
    la.setFont(ff);
    
    JPanel pa0=new JPanel();
    pa0.add(la);
    
    
    JButton b0=new JButton("CREATING NEW IDENTIFICATION CARD");
    b0.setBackground(Color.white);
     JButton ba1=new JButton(" CREATING NEW CERTIFICATE CARD");
     ba1.setBackground(Color.white);
     
    JPanel pa1=new JPanel();
    pa1.add(b0); pa1.add(ba1);
    
   JButton ba2=new JButton("RENTING HOUSES");
   ba2.setBackground(Color.white);
   JButton ba3=new JButton("TAX COLLECTION");
   ba3.setBackground(Color.WHITE);
    JPanel pa2=new JPanel();
    pa2.add(ba2); pa2.add(ba3);
    
    JButton ba4=new JButton("SEARCHING DWELLER");
    ba4.setBackground(Color.WHITE);
    JButton ba5=new JButton("DELETING A RECORD OF DWELLER");
    ba5.setBackground(Color.white);
    JPanel pa4=new JPanel();
    pa4.add(ba4);pa4.add(ba5);
    
    JButton ba6=new JButton("UPDATE A RECORD OF DWELLER");
    ba6.setBackground(Color.white);
    JButton ba7=new JButton("LIST OF TAX PAYERS");
    ba7.setBackground(Color.white);
    
    JPanel pa5=new JPanel();
    pa5.add(ba6);pa5.add(ba7);

    JPanel p0=new JPanel();
    p0.add(pa0);
    p0.add(pa1);
    p0.add(pa2);
    p0.add(pa4);
    p0.add(pa5);
    
    fa.add(p0);
    p0.setLayout(new GridLayout(5,1));
    ImageIcon i=kk("admin.jpg","li");
    JLabel li=new JLabel(i);
    li.setSize(1000, 1000);
    fa.add(li,BorderLayout.CENTER); 
    fa.setLayout(new GridLayout(1,1));
    fa.setLocation(400, 100);
    fa.setSize(800, 400);
    fa.setVisible(true);
    
     b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
           JButton R=new JButton("REGISTER");
            R.setForeground(Color.blue);
           JButton R1=new JButton("EXIT");
            R1.setForeground(Color.red);
           JButton R2=new JButton("VIEW");
            R2.setForeground(Color.yellow);
            R2.setBackground(Color.red);
           JButton R3=new JButton("CLEAR");
            R3.setForeground(Color.orange);
            R2.setBackground(Color.blue);
           JPanel pr=new JPanel();
            pr.add(R);pr.add(R2);pr.add(R1);pr.add(R3);
          
            
           
    JFrame fb=new JFrame("");
    JLabel lb0=new JLabel("IDENTIFICATION FORM");
    Font ff=new Font("Century",Font.BOLD,20);
    lb0.setForeground(Color.blue);
    lb0.setFont(ff);
    JPanel pb=new JPanel();
    pb.add(lb0);
    
    JLabel lb1=new JLabel("FIRST NAME :");
    final JTextField tfb=new JTextField(20);
   
    
    JLabel lb2=new JLabel("MIDDLE NAME :");
    final JTextField tfb1=new JTextField(20);
    
    
    JLabel lb3=new JLabel("LAST NAME :");
    final JTextField tfb2=new JTextField(20);
    
     JLabel lb33=new JLabel("ID NUMBER :");
    final JTextField tfb22=new JTextField(20);
    
    JLabel lb4=new JLabel("MOTHER NAME :");
    final JTextField tfb3=new JTextField(20);
   
    
    JLabel lb5=new JLabel("BIRTH DATE :");
    final JTextField tfb4=new JTextField(20);
  
    
    JLabel lb6=new JLabel("BIRTH PLACE :");
    final JTextField tfb5=new JTextField(20);
   
    
    JLabel lb7=new JLabel("HOUSE NUMBER :");
    final JTextField tfb6=new JTextField(20);
  
    
    JLabel lb8=new JLabel("PHONE NUMBER :");
    final JTextField tfb7=new JTextField(20);
   
    
    JLabel lb9=new JLabel("OCCUPATION :");
    final JTextField tfb8=new JTextField(20);
  
    JLabel lb99=new JLabel("MARITIAL STATUS :");
    final JTextField tfb88=new JTextField(20);
    
    JLabel lb10=new JLabel("REPRESNTER FOR EMERGENCY :");
    final JTextField tfb9=new JTextField(20);
   
    JLabel lb11=new JLabel("WOREDA :");
    final JTextField tfb10=new JTextField(20);
    
    JLabel lbZ=new JLabel("ZONE :");
    final JTextField tfZ=new JTextField(20);
    
    JLabel lK=new JLabel("KELEL :");
    final JTextField tfK=new JTextField(20);
    
    JLabel lbC=new JLabel("CITY :");
    final JTextField tfC=new JTextField(20);
   
    JLabel lb12=new JLabel("REGISTRATION DATE :");
    final JTextField tfb11=new JTextField(20);
   
    JLabel lb13=new JLabel("ADMIN NAME :");
    final JTextField tfb12=new JTextField(20);
  
    JPanel pbbb=new JPanel();
    JPanel pb0=new JPanel();
    JPanel pb1=new JPanel();
    JPanel pb2=new JPanel();
    JPanel pb3=new JPanel();
    JPanel pb4=new JPanel();
    JPanel pb5=new JPanel();
    
    final String nul="";
    
       final DefaultTableModel mo=new DefaultTableModel();
       JTable ta=new JTable(mo); 
        ta.setPreferredSize(new Dimension(1400,300));
        JScrollPane pane=new JScrollPane(ta); 
        
        mo.addColumn("FNAME");
        mo.addColumn("MNAME");
        mo.addColumn("LNAME");
        mo.addColumn("ID");
        mo.addColumn("MOTHER NAME");
        mo.addColumn("BDATE");
        mo.addColumn("BPLACE");
        mo.addColumn("HONUM");
        mo.addColumn("PO NUM");
        mo.addColumn("OCCUP");
        mo.addColumn("MART STAT");
        mo.addColumn("EMERG REP");
        mo.addColumn("WOREDA");
        mo.addColumn("REG DATE");
        mo.addColumn("ADMIN NAME");
        mo.addColumn("ZONE");
        mo.addColumn("KELEL");
        mo.addColumn("CITY");
     
    pb0.add(lb1);pb0.add(tfb);pb0.add(lb2);pb0.add(tfb1);pb0.add(lb3);pb0.add(tfb2);pb1.add(lb33);pb1.add(tfb22);pb1.add(lb4);pb1.add(tfb3);pb1.add(lb5);pb1.add(tfb4);pb2.add(lb6);pb2.add(tfb5);pb2.add(lb7);pb2.add(tfb6);pb2.add(lb8);pb2.add(tfb7);pb3.add(lb9);pb3.add(tfb8);;pb3.add(lb99);;pb3.add(tfb88);pb3.add(lb10);pb3.add(tfb9);pb4.add(lb11);pb4.add(tfb10);pb5.add(lbZ);pb5.add(tfZ);pb5.add(lK);pb5.add(tfK);pb5.add(lbC);pb5.add(tfC);pb4.add(lb12);pb4.add(tfb11);pb4.add(lb13);pb4.add(tfb12);
   pbbb.add(pb); pbbb.add(pb0);pbbb.add(pb1);pbbb.add(pb2);pbbb.add(pb3);pbbb.add(pb4);pbbb.add(pb5);pbbb.add(pr);
 
   pbbb.setLayout(new GridLayout(8,1));
    fb.setLayout(new GridLayout(2,1));
    fb.add(pbbb,BorderLayout.CENTER);
    fb.add(pane);
    fb.setSize(1000, 400);
    fb.setLocation(200, 200);
    fb.setVisible(true);
    
    
     R.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(tfb22.getText().equals(nul)){
                
                JOptionPane.showMessageDialog(null, "ID CAN NOT BE EMPTY !");
                }
             try{
            	 Class.forName("com.mysql.jdbc.Driver");
                 Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/setp","root","");
              Statement s=c.createStatement();
              String q="insert into register(fname,mname,lname,id,mothername,bdate,bplace,honum,pnum,occup,marstat,repemrg,woreda,regdate,adminname,zone,kelel,city) values('"+tfb.getText()+"','"+tfb1.getText()+"','"+tfb2.getText()+"','"+tfb22.getText()+"','"+tfb3.getText()+"','"+tfb4.getText()+"','"+tfb5.getText()+"','"+tfb6.getText()+"','"+tfb7.getText()+"','"+tfb8.getText()+"','"+tfb88.getText()+"','"+tfb9.getText()+"','"+tfb10.getText()+"','"+tfb11.getText()+"','"+tfb12.getText()+"','"+tfZ.getText()+"','"+tfK.getText()+"','"+tfC.getText()+"')";
              //String q="insert into register(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) values('"+tfb.getText()+"','"+tfb1.getText()+"','"+tfb2.getText()+"','"+tfb22.getText()+"','"+tfb3.getText()+"','"+tfb4.getText()+"','"+tfb5.getText()+"','"+tfb6.getText()+"','"+tfb7.getText()+"','"+tfb8.getText()+"','"+tfb88.getText()+"','"+tfb9.getText()+"','"+tfb10.getText()+"','"+tfb11.getText()+"','"+tfb12.getText()+"','"+tfZ.getText()+"','"+tfK.getText()+"','"+tfC.getText()+"')";
              int r=s.executeUpdate(q);
              if(r>0){
                JOptionPane.showMessageDialog(null, "REGISTRATION SUCCESSFUL!!!");
              }
              else{
              JOptionPane.showMessageDialog(null, "REGISTRATION UNSUCCESSFUL!!!");
              }
             }catch(Exception h){}
                
            
            }});
   
    
     R1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            }});
               
          R2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        
         mo.addRow(new Object[]{tfb.getText(),tfb1.getText(),tfb2.getText(),tfb22.getText(),tfb3.getText(),tfb4.getText(),tfb5.getText(),tfb6.getText(),tfb7.getText(),tfb8.getText(),tfb88.getText(),tfb9.getText(),tfb10.getText(),tfb11.getText(),tfb12.getText(),tfZ.getText(),tfK.getText(),tfC.getText()});
            }});
          
           R3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            tfb.setText(null);tfb1.setText(null);tfb2.setText(null);tfb22.setText(null);tfb3.setText(null);tfb4.setText(null);tfb5.setText(null);tfb6.setText(null);tfb7.setText(null);tfb8.setText(null);tfb88.setText(null);tfb9.setText(null);tfb10.setText(null);tfb11.setText(null);tfb12.setText(null);tfZ.setText(null);tfK.setText(null);tfC.setText(null);
            
            
            }});
    }
             
});
    
    
     
  ba1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
              JFrame f=new JFrame("CERTFICATE");
              JPanel p=new JPanel();
              JButton b1=new JButton("BIRTH CERTIFICATE");
              JButton b2=new JButton("WEDDING CERTIFICATE");
              ImageIcon i=kk("certificatt.PNG","li");
              JLabel li=new JLabel(i);
              li.setSize(1000, 500);
              p.add(b1);p.add(b2); p.add(li,BorderLayout.CENTER);
              f.add(p,BorderLayout.CENTER);
              f.setLayout(new GridLayout(1,1));
              f.setSize(700,500);
              f.setLocation(200,200);
              f.setVisible(true);
              
       b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {  
            
            JFrame fc=new JFrame("BIRTH");
           JButton R00=new JButton("REGISTER");
            R00.setForeground(Color.ORANGE);
           JButton R11=new JButton("EXIT");
            R11.setForeground(Color.red);
           JButton R22=new JButton("VIEW");
            R22.setForeground(Color.BLUE);
           JButton R33=new JButton("CLEAR");
            R33.setForeground(Color.MAGENTA);
           JPanel pr=new JPanel();
            pr.add(R00);pr.add(R22);pr.add(R11);pr.add(R33);
           
    JLabel lc=new JLabel(" BIRTH CERTIFICATE FORM");
    Font ff=new Font("Century",Font.BOLD,25);
    lc.setForeground(Color.PINK);
    lc.setFont(ff);
    
    JPanel pc=new JPanel();
    pc.add(lc);
    
    JLabel lc1=new JLabel("CHILD NAME :");
    final JTextField tfc=new JTextField(20);
    
    
    JLabel lc1c=new JLabel("CHILD's GENDER :");
    final JTextField tfcc=new JTextField(20);
    
    
    JLabel lc2=new JLabel("CHILD's FATHER NAME :");
    final JTextField tfc1=new JTextField(20);
    
    
    JLabel lc3=new JLabel("CHILD's MOTHER NAME :");
    final JTextField tfc2=new JTextField(20);
   
    
    JLabel lc4=new JLabel("WEIGHT IN KG :");
    final JTextField tfc3=new JTextField(20);
    
    
    JLabel lc5=new JLabel("BIRTH PLACE :");
    final JTextField tfc4=new JTextField(20);
    
    
    
    JLabel lc6=new JLabel("HOSPITAL OF BIRTH :");
    final JTextField tfc5=new JTextField(20);
   
    
    JLabel lc7=new JLabel("YEAR OF BIRTH :");
    final JTextField tfc6=new JTextField(20);
   

    JPanel pc00=new JPanel();
    JPanel pc0=new JPanel();
    JPanel pc1=new JPanel();
    JPanel pc2=new JPanel();
    
       
         final DefaultTableModel mo=new DefaultTableModel();
         JTable ta=new JTable(mo); 
         ta.setPreferredSize(new Dimension(1600,500));
         JScrollPane pane=new JScrollPane(ta); 
    
         
        mo.addColumn("CHLDFANAME");
        mo.addColumn("GENDER");
        mo.addColumn("CHLDFANAME");
        mo.addColumn("CHLDMONAME");
        mo.addColumn("WEIGHT");
        mo.addColumn("BPLACE");
        mo.addColumn("HOSPITALOFBR");
        mo.addColumn("YEARBIRTH");
    
    pc0.add(lc1);pc0.add(tfc);pc0.add(lc1c);pc0.add(tfcc);pc0.add(lc2);pc0.add(tfc1);pc1.add(lc3);pc1.add(tfc2);pc1.add(lc4);pc1.add(tfc3);pc1.add(lc5);pc1.add(tfc4);pc2.add(lc6);pc2.add(tfc5);pc2.add(lc7);pc2.add(tfc6);
    pc00.add(pc); pc00.add(pc0);pc00.add(pc1);pc00.add(pc2);pc00.add(pr);
    
    ImageIcon i=kk("birth.jpg","li");
     JLabel li=new JLabel(i);
     li.setSize(1000, 1000);
    fc.add(li,BorderLayout.CENTER);   
    fc.add(pc00);
    pc00.setLayout(new GridLayout(5,1));
    fc.add(pane); 
    fc.setLayout(new GridLayout(3,1));
    fc.setSize(1000, 400);
    fc.setLocation(200, 200);
    fc.setVisible(true);
    
    
     R00.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             try{
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");
               Statement s=c.createStatement();
              String q1="insert into birthform values('"+tfc.getText()+"','"+tfcc.getText()+"','"+tfc1.getText()+"','"+tfc2.getText()+"','"+tfc3.getText()+"','"+tfc4.getText()+"','"+tfc5.getText()+"','"+tfc6.getText()+"')";
              int r=s.executeUpdate(q1);
              if(r>0){
              JOptionPane.showMessageDialog(null, "REGISTRATION SUCCESFUL!");
              }else{JOptionPane.showMessageDialog(null, "REGISTRATION UNSUCCESFUL");}
              
              s.close();
              c.close();
             
             }
             catch(Exception a){}
   
    
            }});
     
       R00.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        
         mo.addRow(new Object[]{tfc.getText(),tfcc.getText(),tfc1.getText(),tfc2.getText(),tfc3.getText(),tfc4.getText(),tfc5.getText(),tfc6.getText()});
            }});

     
        R11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            }});
     
     
          R22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        
         mo.addRow(new Object[]{tfc.getText(),tfcc.getText(),tfc1.getText(),tfc2.getText(),tfc3.getText(),tfc4.getText(),tfc5.getText(),tfc6.getText()});
            }});

          
          
           R33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            tfc.setText(null);tfcc.setText(null);tfc1.setText(null);tfc2.setText(null);tfc3.setText(null);tfc4.setText(null);tfc5.setText(null);tfc6.setText(null);          
            }});
                   
  }} 
          
  );
       b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
            
            JFrame f=new JFrame("WEDDING");
            JLabel l2=new JLabel("THIS IS WEDDING CERTEFICATE FORM");
            l2.setBackground(Color.MAGENTA);
             Font fff=new Font("Century",Font.ROMAN_BASELINE,20);
            l2.setFont(fff);
            l2.setForeground(Color.BLACK);
        
              JLabel l2a=new JLabel("BRIDEGROOM'S FULL NAME:");
              final JTextField f2a=new JTextField(15);
              JLabel l3a=new JLabel("BRIDEGROOM'S ID:");
              final JTextField f3a=new JTextField(15);
              JLabel l4a=new JLabel("BRIDE'S FULL NAME:");
              final JTextField f4a=new JTextField(15);
              JLabel l5a=new JLabel("BRIDE'S ID:");
              final JTextField f5a=new JTextField(15);
              JLabel l6a=new JLabel("BRIDE'S FATHER FULL NAME:");
              final JTextField f6a=new JTextField(15);
              JLabel l7a=new JLabel("BRIDE'S FATHER ID:");
              final JTextField f7a=new JTextField(15);
              JLabel l8a=new JLabel("BRIDE'S MOTHER FULL NAME:");
              final JTextField f8a=new JTextField(15);
              JLabel l9a=new JLabel("BRIDE'S MOTHER ID:");
              final JTextField f9a=new JTextField(15);
              JLabel l6aa=new JLabel("BRIDEGROOM's FATHER FULL NAME:");
              final JTextField f6aa=new JTextField(15);
              JLabel l7aa=new JLabel("BRIDEGROOM's FATHER ID:");
              final JTextField f7aa=new JTextField(15);
              JLabel l8aa=new JLabel("BRIDEGROOM's MOTHER FULL NAME:");
              final JTextField f8aa=new JTextField(15);
              JLabel l9aa=new JLabel("BRIDEGROOM's MOTHER ID:");
              final JTextField tf9aa=new JTextField(15);
              JLabel laa=new JLabel("WEDDING TESTIMONY1 full NAME:");
              final JTextField faa=new JTextField(15);
              JLabel l0a=new JLabel("WEDDING TESTIMONY1 ID");
              final JTextField f0a=new JTextField(15);
              JLabel l1a=new JLabel("WEDDING TESTIMONY2 full NAME:");
              final JTextField f1a=new JTextField(15);
              JLabel la1=new JLabel("WEDDING TESTIMONY2 ID");
              final JTextField fa1=new JTextField(15);
              JLabel la2=new JLabel("WEDDING TESTIMONY3 NAME:");
              final JTextField fa2=new JTextField(15);
              JLabel la3=new JLabel("WEDDING TESTIMONY3 ID");
              final JTextField fa3=new JTextField(15);
              JLabel la33=new JLabel("CERTIFICATE NUMBER");
              final JTextField fa33=new JTextField(15);
             
             JLabel la4=new JLabel("APPROVED BY:");
             final JTextField fa4=new JTextField(15);
             JLabel la5=new JLabel("DATE:");
             final JTextField fa5=new JTextField(15);
             JButton ba6=new JButton("APPROVE");
             ba6.setForeground(Color.GREEN);
             JButton ba7=new JButton("CLEAR");
             ba7.setForeground(Color.red);
             JButton ba8=new JButton("VIEW");
             ba8.setBackground(Color.cyan);
             
             
             
            
JPanel pb=new JPanel();JPanel pb1=new JPanel(); JPanel pb2=new JPanel();  JPanel pb3=new JPanel(); JPanel pb4=new JPanel();
JPanel pb5=new JPanel();JPanel pb6=new JPanel();JPanel pb7=new JPanel();JPanel pb8=new JPanel(); JPanel pb9=new JPanel();JPanel pb10=new JPanel();JPanel pb11=new JPanel(); JPanel pb12=new JPanel();        
  pb.add(l2); pb1.add(l2a);pb1.add(f2a);pb1.add(l3a); pb1.add(f3a); pb2.add(l4a);pb2.add(f4a); pb2.add(l5a); pb2.add(f5a); pb3.add(l6a);      
  pb3.add(f6a);pb10.add(l6aa);pb10.add(f6aa);pb10.add(l7aa);pb10.add(f7aa);pb11.add(l8aa);pb11.add(f8aa);pb11.add(l9aa);pb11.add(tf9aa);pb3.add(l7a);pb3.add(f7a);pb4.add(l8a);pb4.add(f8a); pb4.add(l9a);pb4.add(f9a);pb5.add(laa);pb5.add(faa); pb5.add(l0a);                  
  pb5.add(f0a); pb6.add(l1a);pb6.add(f1a);pb6.add(la1); pb6.add(fa1);  pb7.add(la2); pb7.add(fa2);pb7.add(la3);pb7.add(fa3);pb12.add(la33);pb12.add(fa33);
  pb8.add(la4);pb8.add(fa4);pb8.add(la5);pb8.add(fa5);pb9.add(ba6);pb9.add(ba7);pb9.add(ba8);            
  JPanel pp=new JPanel();
  pp.add(pb); pp.add(pb1); pp.add(pb2); pp.add(pb3); pp.add(pb3);pp.add(pb10);pp.add(pb11);
  pp.add(pb4); pp.add(pb5); pp.add(pb6); pp.add(pb7);pp.add(pb12);pp.add(pb8);pp.add(pb9);
  pp.setLayout(new GridLayout(15,1));
     ImageIcon i=kk("wedding.jpg","li");
     JLabel li=new JLabel(i);
     li.setSize(200, 200);
     f.add(li,BorderLayout.CENTER); 
     f.setLayout(new GridLayout(2,1));
     f.add(pp);
     f.setSize(1000, 700);
     f.setLocation(200, 200);
     f.setVisible(true);
             
          ba6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
            
            try{
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");
                /*
              Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebele","root","abraham");
              */
              Statement s=c.createStatement();
              String q1="insert into wedding values('"+f2a.getText()+"','"+f3a.getText()+"','"+f4a.getText()+"','"+f5a.getText()+"','"+f6a.getText()+"','"+f7a.getText()+"','"+f8a.getText()+"','"+f9a.getText()+"','"+f6aa.getText()+"','"+f7aa.getText()+"','"+f8aa.getText()+"','"+tf9aa.getText()+"','"+faa.getText()+"','"+f0a.getText()+"','"+f1a.getText()+"','"+fa1.getText()+"','"+fa2.getText()+"','"+fa3.getText()+"','"+fa33.getText()+"','"+fa4.getText()+"','"+fa5.getText()+"')";
              int r=s.executeUpdate(q1);
              if(r>0){
              JOptionPane.showMessageDialog(null, "REGISTRATION SUCCESFUL!");
              }else{JOptionPane.showMessageDialog(null, "REGISTRATION UNSUCCESFUL");}
              
              s.close();
              c.close();
             
             }
             catch(Exception a){}
         
            }});
          ba8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            JFrame f=new JFrame("");
            JPanel pviw=new JPanel();
             DefaultTableModel mo=new DefaultTableModel();
            JTable ta=new JTable(mo); 
             ta.setPreferredSize(new Dimension(1600,500));
             JScrollPane pane=new JScrollPane(ta); 
            f.add(pane);
            f.setSize(1000,400);
            f.setLocation(200,200);
            f.setVisible(true);
       
        mo.addColumn("husbandname");
        mo.addColumn("husbandid");
        mo.addColumn("wifename");
        mo.addColumn("wifeid ");
        mo.addColumn("wife_fathname");
        mo.addColumn("wife_fatherid");
        mo.addColumn("wife_momname");
        mo.addColumn("wife_momid ");
        mo.addColumn("husband_fatname");
        mo.addColumn("husband_fathid");
        mo.addColumn("husband_momname");
        mo.addColumn("husband_momid");
        mo.addColumn("tsm1_name");
        mo.addColumn("tsm1_id");
        mo.addColumn("tsm2_name");
        mo.addColumn("tsm2_id");
        mo.addColumn("tsm3_name");
        mo.addColumn("tsm3_id");
        mo.addColumn("cert_num");
        mo.addColumn("approver");
        mo.addColumn("datte");
         try{
             Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");
               /* 
              Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebele","root","abraham");
             */ Statement s=c.createStatement();
              String q1="select*from wedding";
             ResultSet r=s.executeQuery(q1);
            
             while( r.next()){
                 
              String h=r.getString("husbandname");
              String id=r.getString("husbandid");
              String w=r.getString("wifename");
              String wid=r.getString("wifeid");
              String wf=r.getString("wife_fathname");
              String wfid=r.getString("wife_fatherid");
              String wmn=r.getString("wife_momname");
              String wmid=r.getString("wife_momid");
              String hfn=r.getString("husband_fatname");
              String hfid=r.getString("husband_fathid");
              String hmn=r.getString("husband_momname");
              String hmid=r.getString("husband_momid");
              String tst1n=r.getString("tsm1_name");
              String tst1id=r.getString("tsm1_id");
              String tst2n=r.getString("tsm2_name");
              String tst2id=r.getString("tsm2_id");
              String tst3n=r.getString("tsm3_name");
              String tst3id=r.getString("tsm3_id");
              String certnm=r.getString("cert_num");
              String approv=r.getString("approver");
              String date=r.getString("datte");
                
                mo.addRow(new Object[]{h,id,w,wid,wf,wfid,wmn,wmid,hfn,hfid,hmn,hmid,tst1n,tst1id,tst2n,tst2id,tst3n,tst3id,certnm,approv,date});
                 }
                     
             s.close();
             c.close();
        
         }catch(Exception b){}  
                
       }});
         
               ba7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            f2a.setText(null);f3a.setText(null);f4a.setText(null);f5a.setText(null);f6a.setText(null);f7a.setText(null);f8a.setText(null);f9a.setText(null);f6aa.setText(null);f7aa.setText(null);f8aa.setText(null);tf9aa.setText(null);faa.setText(null);f0a.setText(null);f1a.setText(null);fa1.setText(null);fa2.setText(null);fa3.setText(null);fa33.setText(null);fa4.setText(null);fa5.setText(null);        
      
            }});
   
           }});
            
             }});       
    
     
  ba2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JButton bd=new JButton("APPROVE");
                bd.setForeground(Color.YELLOW);
                bd.setBackground(Color.red);
                 JButton bd1=new JButton("CLEAR");
                 bd1.setForeground(Color.MAGENTA);
                 bd1.setBackground(Color.blue);
                  JButton bd2=new JButton("VIEW");
                   bd2.setForeground(Color.red);
                   bd2.setBackground(Color.MAGENTA);
                 JPanel pdd=new JPanel();
                 pdd.add(bd);pdd.add(bd1);pdd.add(bd2);
                JFrame fd=new JFrame("RENT");
                JLabel ld=new JLabel("FOLLOW THE RENTING PROCEDURE AND FILL THE FORM");
                Font ff=new Font("Century",Font.BOLD,20);
                ld.setForeground(Color.blue);
                ld.setFont(ff);
                JPanel pd=new JPanel();
                pd.add(ld);
                
                JLabel ld1=new JLabel("LESSEE's FULLNAME:");
                final JTextField tfd=new JTextField(20); 
            
                JLabel ld2=new JLabel("LESSEE's ERLIEAR ADDRESS:");
                final JTextField tfd1=new JTextField(20); 
                
                JLabel ld3=new JLabel("LESSEE's ID NUMBER:");
                final JTextField tfd2=new JTextField(20); 
                
                JLabel ld4=new JLabel("NUMBER OF DWELLERS UNDER LESSEE's NAME:");
                final JTextField tfd3=new JTextField(20); 
                
                 JLabel ld5=new JLabel("LESSEE's JOB:");
                final JTextField tfd41=new JTextField(20); 
                
                 JLabel ld6=new JLabel("LESSEE's GENDER:");
                final JTextField tfd5=new JTextField(20); 
                
                JLabel ld7=new JLabel("LESSEE's BIRTHDATE(i.e mm/dd/yy:");
                final JTextField tfd6=new JTextField(20); 
               
                
                JLabel ld8=new JLabel("RENTAL HOUSE ADDRESS:");
                final JTextField tfd7=new JTextField(20); 
               
                
                JLabel ld9=new JLabel("HOUSE NUMBER OF RENTAL HOUSE:");
                final JTextField tfd8=new JTextField(20); 
              
                
                JLabel ld10=new JLabel("AERIAL SIZE OF THE HOUSE TO BE RENTED IN METERSQUARE:");
                final JTextField tfd9=new JTextField(20); 
                
                
                JLabel ld11=new JLabel("RENTAL PRICE IN BIRR:");
                final JTextField tfd10=new JTextField(20); 
                
                
                JLabel ld12=new JLabel("ADMIN NAME:");
                final JTextField tfd11=new JTextField(20); 
              
                
                JLabel ld13=new JLabel("DATE OF APPROVAL(i.e mm/dd/yy):");
                final JTextField tfd12=new JTextField(20); 
              
                
                JPanel pd00=new JPanel();
                JPanel pd0=new JPanel();
                JPanel pd1=new JPanel();
                JPanel pd2=new JPanel();
                JPanel pd3=new JPanel();
                JPanel pd4=new JPanel();
                pd0.add(ld1);pd0.add(tfd);pd0.add(ld2);pd0.add(tfd1);pd0.add(ld3);pd0.add(tfd2);pd1.add(ld4);pd1.add(tfd3);pd1.add(ld5);pd1.add(tfd41);pd1.add(ld6);pd1.add(tfd5);pd2.add(ld7);pd2.add(tfd6);pd2.add(ld8);pd2.add(tfd7);pd2.add(ld9);pd2.add(tfd8);pd3.add(ld10);pd3.add(tfd9);pd3.add(ld11);pd3.add(tfd10);pd3.add(ld12);pd3.add(tfd11);pd4.add(ld13);pd4.add(tfd12);
                pd00.add(pd);pd00.add(pd0);pd00.add(pd1);pd00.add(pd2);pd00.add(pd3);pd00.add(pd4);pd00.add(pdd);
                pd00.setLayout(new GridLayout(7,1));
                fd.setLayout(new GridLayout(1,1));
                fd.add(pd00);
                fd.setSize(1000,400);
                fd.setLocation(200,200);
                fd.setVisible(true);
                
                       
         bd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try{
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");
                    /*
               Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebele","root","abraham");
              */Statement s=c.createStatement();
              String q1="insert into rent(lesfullname,lesprevaddress,lesid,dwellerunderles,lesjob,lesgender,lesBOD,renthomaddress,renthomnum,renthomsize,rentprice,adminname,approvdate) values('"+tfd.getText()+"','"+tfd1.getText() +"','"+tfd2.getText()+"','"+tfd3.getText()+"','"+tfd41.getText()+"','"+tfd5.getText()+"','"+tfd6.getText()+"','"+tfd7.getText()+"','"+tfd8.getText()+"','"+tfd9.getText()+"','"+tfd10.getText()+"','"+tfd11.getText()+"','"+tfd12.getText()+"')";
           
              int r=s.executeUpdate(q1);
              if(r>0){
                JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESFUL");
                }else{
                JOptionPane.showMessageDialog(null, "TRANSACTION UNSUCCESFUL CHECK YOUR INPUT");
                    }
                s.close();
                c.close();
                
                }
                catch(Exception b){}
            }});
                
         bd1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                 tfd.setText(null);tfd1.setText(null);tfd2.setText(null);tfd3.setText(null);tfd41.setText(null);tfd5.setText(null);tfd6.setText(null);tfd7.setText(null);tfd8.setText(null);tfd9.setText(null);tfd10.setText(null);tfd11.setText(null);tfd12.setText(null);
                
            }}); 
                
         bd2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
                JFrame f=new JFrame("");
            JPanel pviw=new JPanel();
             DefaultTableModel mo=new DefaultTableModel();
            JTable ta=new JTable(mo); 
             ta.setPreferredSize(new Dimension(1600,500));
             JScrollPane pane=new JScrollPane(ta); 
            f.add(pane);
            f.setSize(1000,400);
            f.setLocation(200,200);
            f.setVisible(true);
       
        mo.addColumn("Lesname");
        mo.addColumn("Lesprevaddr");
        mo.addColumn("id");
        mo.addColumn("dwelnum ");
        mo.addColumn("Lesjob");
        mo.addColumn("Lesgender");
        mo.addColumn("lesBOD");
        mo.addColumn("homeaddres ");
        mo.addColumn("homnum");
        mo.addColumn("homesize");
        mo.addColumn("rentprice");
        mo.addColumn("adminname");
        mo.addColumn("approvdate");
        
         try{
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");
              /*  
              Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebele","root","abraham");
              */Statement s=c.createStatement();
              String q1="select*from rent";
             ResultSet r=s.executeQuery(q1);
            
             while( r.next()){
                 
              String name=r.getString("lesfullname");
              String prevaddr=r.getString("lesprevaddress");
              String id=r.getString("lesid");
              String dwellerunder=r.getString("dwellerunderles");
              String lesjob=r.getString("lesjob");
              String lesgender=r.getString("lesgender");
              String bod=r.getString("lesBOD");
              String homaddr=r.getString("renthomaddress");
              String renthonum=r.getString("renthomnum");
              String renthosize=r.getString("renthomsize");
              String price=r.getString("rentprice");
              String adname=r.getString("adminname");
              String date=r.getString("approvdate");
        
                 mo.addRow(new Object[]{name,prevaddr,id,dwellerunder,lesjob,lesgender,bod,homaddr,renthonum,renthosize,price,adname,date});
                 }
                     
             s.close();
             c.close();
        
         }catch(Exception b){}  
              
            }});
           
            }
  }
  );
  
   ba3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            JButton bf=new JButton("APPROVE");
            bf.setForeground(Color.magenta);
            bf.setBackground(Color.BLUE);
            JButton bf1=new JButton("CLEAR");
             bf1.setForeground(Color.PINK);
            bf1.setBackground(Color.GRAY);
            JButton bf2=new JButton("EXIT");
             bf2.setForeground(Color.RED);
            bf2.setBackground(Color.darkGray);
            JPanel pf00=new JPanel();
            pf00.add(bf);pf00.add(bf1);pf00.add(bf2);
            JFrame ff=new JFrame("page 6");
                JLabel lf=new JLabel("PAYING MY TAX IS MY PRIDE");
                Font ff1=new Font("Century",Font.BOLD,20);
                lf.setForeground(Color.red);
                lf.setFont(ff1);
                JPanel pf=new JPanel();
                pf.add(lf);
            
                JLabel lf1=new JLabel("PAYER FULL NAME:");
                final JTextField tf1=new JTextField(20); 
                JPanel pf1=new JPanel();
                pf1.add(lf1);pf1.add(tf1);
                
                JLabel lff=new JLabel("PAYER ID NUMBER:");
                final JTextField tff1=new JTextField(20); 
                JPanel pff1=new JPanel();
                pff1.add(lff);pff1.add(tff1);
                
                JLabel lff1=new JLabel("PAYER TIN NUMBER:");
                final JTextField tff11=new JTextField(20); 
                JPanel pff11=new JPanel();
                pff11.add(lff1);pff11.add(tff11);
                
                JLabel lfe=new JLabel("PAYER ADDRESSE:");
                final JTextField tfe1=new JTextField(20); 
                JPanel pfe1=new JPanel();
                pfe1.add(lfe);pfe1.add(tfe1);
                
                JLabel lf2=new JLabel("FIELD OF OCCUPATION:");
                final JTextField tf2=new JTextField(20); 
                JPanel pf2=new JPanel();
                pf2.add(lf2);pf2.add(tf2);
                
                JLabel lf3=new JLabel("TAX LEVEL(A or B or C or D:");
                final JTextField tf3=new JTextField(20); 
                JPanel pf3=new JPanel();
                pf3.add(lf3);pf3.add(tf3);
                
                JLabel lf4=new JLabel("AMOUNT PAID IN BIRR:");
                final JTextField tf4=new JTextField(20); 
                JPanel pf4=new JPanel();
                pf4.add(lf4);pf4.add(tf4);
                
              JLabel lf5=new JLabel("NAME OF CASHIER IN POSITION:");
                final JTextField tf5=new JTextField(20); 
                JPanel pf5=new JPanel();
                pf5.add(lf5);pf5.add(tf5);
                
                JLabel lf6=new JLabel("DATE:");
                final JTextField tf6=new JTextField(20); 
                JPanel pf6=new JPanel();
                pf6.add(lf6);pf6.add(tf6);
                
                JPanel pf0=new JPanel();
                pf0.add(pf);pf0.add(pf1);pf0.add(pff1);pf0.add(pff11);pf0.add(pfe1);pf0.add(pf2);pf0.add(pf3);pf0.add(pf4);pf0.add(pf5);pf0.add(pf6);pf0.add(pf00);
               
                 ImageIcon i=kk("tax.jpg","li");
                 JLabel li=new JLabel(i);
                 li.setSize(1000, 1000);
                 ff.add(li,BorderLayout.CENTER);
                 ff.add(pf0);
                pf0.setLayout(new GridLayout(12,1));
                ff.setLayout(new GridLayout(2,1));
                ff.setSize(1000, 400);
                ff.setLocation(200, 200);
                ff.setVisible(true);
            
                bf.addActionListener(new ActionListener(){
                  
      public void actionPerformed(ActionEvent e) {
                       try{
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");   
               Statement s=c.createStatement();
              String q1="insert into taxform values('"+tf1.getText()+"','"+tff1.getText()+"','"+tff11.getText()+"','"+tfe1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"','"+tf6.getText()+"')";
              int r=s.executeUpdate(q1);
               if(r>0){
                JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESFUL");
                }else{
                JOptionPane.showMessageDialog(null, "TRANSACTION UNSUCCESFUL CHECK YOUR INPUT");
                    }
              s.close();
              c.close();
                    
                    
                }
               catch(Exception d){}
                    }});
                    
                    
                   bf1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
                tf1.setText(null);tff1.setText(null);tff11.setText(null);tfe1.setText(null);tf2.setText(null);tf3.setText(null);tf4.setText(null);tf5.setText(null);tf6.setText(null);
                
            }});
                  bf2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {  
                System.exit(0);
            }});
                
            
   }      
   }
   );
  
   ba4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JFrame fg=new JFrame("page 7");
                JLabel lg=new JLabel("THIS ENGINE SEARCHES A DWELLER FROM THE DATABASE.......");
                JLabel lg1=new JLabel("!!!!YOU NEED TO KNOW THE ID NUMBER.PLEASE FILL THE ID NUMBER ASKED BELOW");
                Font ff1=new Font("Century",Font.BOLD,15);
                Font ff2=new Font("Century",Font.BOLD,12);
                lg.setForeground(Color.MAGENTA);
                lg.setFont(ff1);
                lg1.setForeground(Color.red);
                lg1.setFont(ff2);
                JPanel pg=new JPanel();
                pg.add(lg);
                JPanel pgg=new JPanel();
                pgg.add(lg1);
                
                
                JLabel lg2=new JLabel("ID NUMBER :");
                final JTextField tfg=new JTextField(20);
                JButton bg=new JButton("SEARCH DWELLER");
                 JButton bgc=new JButton("CLEAR");
                JButton bge=new JButton("EXIT");
                 bgc.setForeground(Color.DARK_GRAY);
                bge.setForeground(Color.red);
                bg.setForeground(Color.blue);
                bg.setBackground(Color.magenta);
                JPanel pg1=new JPanel();
                pg1.add(lg2);pg1.add(tfg);pg1.add(bg);pg1.add(bge);pg1.add(bgc);
                
                 JLabel lg3=new JLabel("FIRST NAME :");
                 final JTextField tfg1=new JTextField(20);
                 
                  JLabel lg4=new JLabel("MIDDLE NAME :");
                 final JTextField tfg2=new JTextField(20);
                 
                  JLabel lg5=new JLabel("LAST NAME :");
                 final JTextField tfg3=new JTextField(20);
                
                  JLabel lg6=new JLabel("BIRTH PLACE :");
                 final JTextField tfg4=new JTextField(20);
                 
                  JLabel lg7=new JLabel("HOUSE NUMBER :");
                 final JTextField tfg5=new JTextField(20);
                
                  JLabel lg8=new JLabel("PHONE  NUMBER :");
                 final JTextField tfg6=new JTextField(20);
                 
                 JLabel lgm=new JLabel("MARITAL STATUS :");
                 final JTextField tfgm=new JTextField(20);
                
                  JLabel lg9=new JLabel("OCCUPATION :");
                 final JTextField tfg7=new JTextField(20);
                
                 JLabel lg10=new JLabel("WOREDA :");
                 final JTextField tfg8=new JTextField(20);
                 
                
                
                 JPanel pg2=new JPanel();
                 JPanel pg3=new JPanel();
                 JPanel pg4=new JPanel();
                 pg2.add(lg3);pg2.add(tfg1);pg2.add(lg4);pg2.add(tfg2);pg2.add(lg5);pg2.add(tfg3);pg3.add(lg6);pg3.add(tfg4);pg3.add(lg7);pg3.add(tfg5);pg3.add(lg8);pg3.add(tfg6);pg4.add(lg9);pg4.add(tfg7);pg4.add(lg10);pg4.add(tfg8);pg4.add(lgm);pg4.add(tfgm);
                JPanel pg0=new JPanel();
                pg0.add(pg); pg0.add(pgg);pg0.add(pg1); pg0.add(pg2);pg0.add(pg3);pg0.add(pg4);
                fg.add(pg0);
                pg0.setLayout(new GridLayout(6,1));
                
                 
                ImageIcon i=kk("search.jpg","li");
                JLabel li=new JLabel(i);
                li.setSize(500, 500);
                fg.add(li,BorderLayout.NORTH);
                fg.setLayout(new GridLayout(2,1));
                fg.setSize(1000, 400);
                fg.setLocation(200, 200);
                fg.setVisible(true);
              
                bg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try{
                    
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");
                    /*
                Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebele","root","abraham");
              */Statement s=c.createStatement();
              String q1="select fname,mname,lname,bplace,honum,pnum,occup,woreda,marstat from idform where id='"+tfg.getText()+"'";
             ResultSet r=s.executeQuery(q1);
             while( r.next()){
              String fnn=r.getString("fname");
              String mnn=r.getString("mname");
              String lnn=r.getString("lname");
              String bpla=r.getString("bplace");
              String hnum=r.getString("honum");
              String phone=r.getString("pnum");
              String job=r.getString("occup");
              String wored=r.getString("woreda");
              String mar=r.getString("marstat");
              
              
              tfg1.setText(fnn);
              tfg2.setText(mnn);
              tfg3.setText(lnn);
              tfg4.setText(bpla);
              tfg5.setText(hnum);
              tfg6.setText(phone);
              tfg7.setText(job);
              tfg8.setText(wored);
              tfgm.setText(mar);
             
              s.close();
              c.close();
             }
                
                
                }catch(Exception b){}
            }});
               bge.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            
            }});
                bgc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            tfg.setText(null);tfg1.setText(null);tfg2.setText(null);tfg3.setText(null);tfg4.setText(null);tfg5.setText(null);tfg6.setText(null);tfg7.setText(null);tfg8.setText(null);
      
            }});
                
                
    }});
   
   
    ba5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             JFrame fh=new JFrame("DELETE");
              JLabel lh=new JLabel("THIS ENGINE DELETES DWELLER FROM THE DATABASE......");
                JLabel lh1=new JLabel("PLEASE FILL THE ID NUMBER OF DWELLER TO BE DELETED");
                Font ff1=new Font("Century",Font.ITALIC,20);
                Font ff2=new Font("Century",Font.ITALIC,15);
                lh.setForeground(Color.blue);
                lh.setFont(ff1);
                lh1.setForeground(Color.red);
                lh1.setFont(ff2);
                JPanel ph=new JPanel();
                ph.add(lh);
                JPanel phh=new JPanel();
                phh.add(lh1);
                
                JLabel lh2=new JLabel("ID NUMBER :");
                final JTextField tfh=new JTextField(15);
                JButton bh=new JButton("VIEW DWELLER");
                final JButton bhh=new JButton("CLEAR");
                bh.setForeground(Color.blue);
                bh.setBackground(Color.ORANGE);
                bhh.setBackground(Color.red);
                
                JPanel ph1=new JPanel();
                ph1.add(lh2);ph1.add(tfh);ph1.add(bh);ph1.add(bhh);
                
                
                
                   final JButton fbg=new JButton("DELETE");
                   fbg.setForeground(Color.red);
                   fbg.setBackground(Color.CYAN);
                JLabel lbg1=new JLabel("FIRST NAME :");
                 final JTextField tfbg1=new JTextField(15);
                 
                  JLabel lbg2=new JLabel("MIDDLE NAME :");
                 final JTextField tfbg2=new JTextField(15);
                 
                  JLabel lbg3=new JLabel("LAST NAME :");
                 final JTextField tfbg3=new JTextField(15);
                 
                  JLabel lbg4=new JLabel("PHONE :");
                 final JTextField tfbg4=new JTextField(15);
                
                      JPanel pbh0=new JPanel();
                 JPanel pbh=new JPanel();
                 JPanel pbh1=new JPanel();
                 pbh.add(lbg1);pbh.add(tfbg1);pbh.add(lbg2);pbh.add(tfbg2);pbh.add(lbg3);pbh.add(tfbg3);pbh.add(lbg4);pbh.add(tfbg4);pbh.add(fbg);
                 
                 pbh0.add(pbh); pbh0.add(pbh1);
                
              
                JPanel ph0=new JPanel();
                ph0.add(ph);ph0.add(phh);ph0.add(ph1);ph0.add(pbh0);
                
                fh.add(ph0); 
                ph0.setLayout(new GridLayout(4,1));
                 ImageIcon i=kk("delete.jpg","li");
                 JLabel li=new JLabel(i);
                li.setSize(500, 500);
                fh.add(li,BorderLayout.NORTH);
                fh.setLayout(new GridLayout(2,1));
                fh.setSize(1100,400);
                fh.setLocation(200, 200);
                fh.setVisible(true);     
                
               bh.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                     try{
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");     
               /* Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebele","root","abraham");
              */Statement s=c.createStatement();
              String q1="select fname,mname,lname,pnum from idform where id='"+tfh.getText()+"'";
             ResultSet r=s.executeQuery(q1);
             while( r.next()){
              String fnn=r.getString("fname");
              String mnn=r.getString("mname");
              String lnn=r.getString("lname");
              String phone=r.getString("pnum");
             
             tfbg1.setText(fnn);
             tfbg2.setText(mnn);
             tfbg3.setText(lnn);
             tfbg4.setText(phone);
             
             s.close();
             c.close();
             
             }
                     }catch(Exception b){}
                     
                     bhh.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e) { 
                  
                  tfh.setText(null);tfbg1.setText(null);tfbg2.setText(null);tfbg3.setText(null);tfbg4.setText(null);
                  
                  
                  }});
                     
                     fbg.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e) { 
                
                 try{
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");     
               /* Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebele","root","abraham");
             */ Statement s=c.createStatement();
              String q1="delete from idform where id='"+tfh.getText()+"'";
             int r=s.executeUpdate(q1);
             if(r>0){
             JOptionPane.showMessageDialog(null, "RECORD DELETED SUCCESFULLY");
             }else{JOptionPane.showMessageDialog(null, "FAILED TO DELETE");}
                 
                 }catch(Exception c){}
                               
            }
            });

}});
       
    }
            
    } );
    
     ba6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            
                JFrame fh=new JFrame("UPDATION");
              JLabel lh=new JLabel("THIS ENGINE  UPDATES DWELLER STATUS");
                JLabel lh1=new JLabel("!!FILL THE ID NUMBER");
                Font ff1=new Font("Century",Font.ITALIC,17);
                Font ff2=new Font("Century",Font.ITALIC,13);
                lh.setForeground(Color.blue);
                lh.setFont(ff1);
                lh1.setForeground(Color.red);
                lh1.setFont(ff2);
                JPanel ph=new JPanel();
                ph.add(lh);
                JPanel phh=new JPanel();
                phh.add(lh1);
       
                JLabel lh2=new JLabel("ID NUMBER :");
                final JTextField tfh=new JTextField(20);
                JButton bh=new JButton("VIEW DWELLER");
                bh.setForeground(Color.blue);
                bh.setBackground(Color.orange);
                
                JPanel ph1=new JPanel();
                ph1.add(lh2);ph1.add(tfh);ph1.add(bh);
                
                final JButton fbg=new JButton("UPDATE");
                   fbg.setForeground(Color.MAGENTA);
                   fbg.setBackground(Color.GREEN);
                   
                   JButton fbg1=new JButton("CLEAR");
                   fbg1.setForeground(Color.LIGHT_GRAY);
                   fbg1.setBackground(Color.blue);
                   
                 JLabel lbg1=new JLabel("FIRST NAME :");
                 final JTextField tfbg1=new JTextField(20);
                 
                 JLabel lbg2=new JLabel("MIDDLE NAME :");
                 final JTextField tfbg2=new JTextField(20);
                 
                 JLabel lbg3=new JLabel("LAST NAME :");
                 final JTextField tfbg3=new JTextField(20);
                
                 JLabel lbg4=new JLabel("MOTHER NAME :");
                 final JTextField tfbg4=new JTextField(20);
   
    
                 JLabel lbg5=new JLabel("BIRTH DATE :");
                 final JTextField tfbg5=new JTextField(20);
   
    
                 JLabel lbg6=new JLabel("BIRTH PLACE :");
                 final JTextField tfbg6=new JTextField(20);
   
    
                 JLabel lbg7=new JLabel("HOUSE NUMBER :");
                 final JTextField tfbg7=new JTextField(20);
  
    
                 JLabel lbg8=new JLabel("PHONE NUMBER :");
                 final JTextField tfbg8=new JTextField(20);
   
     
                 JLabel lbg9=new JLabel("OCCUPATION :");
                 final JTextField tfbg9=new JTextField(20);
  
                 JLabel lbg10=new JLabel("MARITIAL STATUS :");
                 final JTextField tfbg10=new JTextField(20);
    
                 JLabel lbg11=new JLabel("REPRESNTER FOR EMERGENCY :");
                 final JTextField tfbg11=new JTextField(20);
   
    
                 JLabel lbg12=new JLabel("WOREDA :");
                 final JTextField tfbg12=new JTextField(20);
   
                 
                 
                 JPanel pbh0=new JPanel();
                 JPanel pbh=new JPanel();
                 JPanel pbh1=new JPanel();
                 JPanel pbh2=new JPanel();
                 JPanel pbh3=new JPanel();
                 JPanel pbb=new JPanel();
                 pbh.add(lbg1);pbh.add(tfbg1);pbh.add(lbg2);pbh.add(tfbg2);pbh.add(lbg3);pbh.add(tfbg3);pbh1.add(lbg4);pbh1.add(tfbg4);pbh1.add(lbg5);pbh1.add(tfbg5);pbh1.add(lbg6);pbh1.add(tfbg6);pbh2.add(lbg7);pbh2.add(tfbg7);pbh2.add(lbg8);pbh2.add(tfbg8);pbh2.add(lbg9);pbh2.add(tfbg9);pbh3.add(lbg10);pbh3.add(tfbg10);pbh3.add(lbg11);pbh3.add(tfbg11);pbh3.add(lbg12);pbh3.add(tfbg12);
                 
              
                 pbb.add(fbg);pbb.add(fbg1);
                 
                JPanel ph0=new JPanel();
                ph0.add(ph);ph0.add(phh);ph0.add(ph1);ph0.add(pbh);ph0.add(pbh1);ph0.add(pbh2);ph0.add(pbh3);ph0.add(pbb);
                
                fh.add(ph0); 
                ph0.setLayout(new GridLayout(8,1));
                fh.setLayout(new GridLayout(1,1));
                fh.setSize(1000, 400);
                fh.setLocation(200, 200);
                fh.setVisible(true);     
                
               bh.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                     try{
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");      
              /*Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebele","root","abraham");
              */Statement s=c.createStatement();
              String q1="select fname,mname,lname,mothername,bdate,bplace,honum,pnum,occup,marstat,repemrg,woreda from idform where id='"+tfh.getText()+"'";
              ResultSet r=s.executeQuery(q1);
                 while( r.next()){
              String fnn=r.getString("fname");
              String mnn=r.getString("mname");
              String lnn=r.getString("lname");
              String mom=r.getString("mothername");
              String bdate=r.getString("bdate");
              String bplace=r.getString("bplace");
              String honum=r.getString("honum");
              String phone=r.getString("pnum");
              String job=r.getString("occup");
              String marstat=r.getString("marstat");
              String rep=r.getString("repemrg");
              String woreda=r.getString("woreda");
             
             tfbg1.setText(fnn);
             tfbg2.setText(mnn);
             tfbg3.setText(lnn);
             tfbg4.setText(mom);
             tfbg5.setText(bdate);
             tfbg6.setText(bplace);
             tfbg7.setText(honum);
             tfbg8.setText(phone);
             tfbg9.setText(job);
             tfbg10.setText(marstat);
             tfbg11.setText(rep);
             tfbg12.setText(woreda);
             s.close();
             c.close();
             
             }
                     }catch(Exception b){}
                     
                     fbg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
                
                 try{
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");     
              /*  Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebele","root","abraham");
              */Statement s=c.createStatement();
              String q1="update idform set fname='"+tfbg1.getText()+"',mname='"+tfbg2.getText()+"',lname='"+tfbg3.getText()+"',mothername='"+tfbg4.getText()+"',bdate='"+tfbg5.getText()+"',bplace='"+tfbg6.getText()+"',honum='"+tfbg7.getText()+"',pnum='"+tfbg8.getText()+"',occup='"+tfbg9.getText()+"',marstat='"+tfbg10.getText()+"',repemrg='"+tfbg11.getText()+"',woreda='"+tfbg12.getText()+"'where id='"+tfh.getText()+"'";
             int r=s.executeUpdate(q1);
             if(r>0){
             JOptionPane.showMessageDialog(null, "UPDATE SUCCESFUL");
             }else{}
                 
                 }catch(Exception c){JOptionPane.showMessageDialog(null, "UPDATE UNSUCCESFUL");}
            }});
                     
             
  }});
                  fbg.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) { 
           tfh.setText(null); tfbg1.setText(null);tfbg2.setText(null);tfbg3.setText(null);tfbg4.setText(null);tfbg5.setText(null);tfbg6.setText(null);tfbg7.setText(null);tfbg8.setText(null);tfbg9.setText(null);tfbg10.setText(null);tfbg11.setText(null);tfbg12.setText(null);
            
            }});
                  fbg1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
            
             tfh.setText(null); tfbg1.setText(null);tfbg2.setText(null);tfbg3.setText(null);tfbg4.setText(null);tfbg5.setText(null);tfbg6.setText(null);tfbg7.setText(null);tfbg8.setText(null);tfbg9.setText(null);tfbg10.setText(null);tfbg11.setText(null);tfbg12.setText(null);
            
            }});
                
}});
    
      ba7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             JFrame f=new JFrame("LIST OF TAX PAYERS");
            JPanel pviw=new JPanel();
            DefaultTableModel mo=new DefaultTableModel();
            JTable ta=new JTable(mo); 
            ta.setPreferredSize(new Dimension(1900,500));
            JScrollPane pane=new JScrollPane(ta); 
            f.add(pane);
            f.setSize(600,600);
            f.setLocation(400, 100);
            f.setVisible(true);
      
        mo.addColumn("pyrname");
        mo.addColumn("pyrid");
        mo.addColumn("tinnum");
        mo.addColumn("pyraddr");
        mo.addColumn("pyroccup");
        mo.addColumn("txlvl");
        mo.addColumn("txprice");
        mo.addColumn("cashier");
        mo.addColumn("date");
           
       
         try{
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/KEBELE","ATSE","0000");     
           /*   Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebele","root","abraham");
              */Statement s=c.createStatement();
              String q1="select*from taxform";
             ResultSet r=s.executeQuery(q1);
            
             while( r.next()){
                 
              String pyrn=r.getString("pyrname");
              String id=r.getString("pyrid");
              String tin=r.getString("tinnum");
              String add=r.getString("pyraddr");
              String job=r.getString("pyroccup");
              String lvl=r.getString("taxlvl");
              String price=r.getString("taxprice");
              String cashier=r.getString("cashier");
              String date=r.getString("date");
             
                mo.addRow(new Object[]{pyrn,id,tin,add,job,lvl,price,cashier,date});
                 }
                     
             s.close();
             c.close();
        
         }catch(Exception b){}  
          
            
            }
      });
  
    }else if(password.equals(null1)){
        
     JOptionPane.showMessageDialog(null, "PASSWORD CAN NOT BE EMPTY");
    }       
                else
                {
                JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
                pf.setText(null);
                
                }
      
    } 
                }
   
    b.addActionListener(new acl());
}}
