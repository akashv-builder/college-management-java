import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class studentlogin1 extends JFrame implements ActionListener
{       

        JLabel l1,l2,l3,l4;

        JTextField t1;
      
        JPasswordField t2;
 
        ImageIcon i,i1,i2;

        JButton b1,b2,back;

        Font f;

        public studentlogin1()
{

        setLayout(null);

        f=new Font("Comic Mans MS",Font.BOLD,30);   
 
        i2=new ImageIcon("back.gif");
        back=new JButton(i2);
        back.setBounds(0,0,149,58);
        back.addActionListener(this);     

        l1=new JLabel("USERNAME:");
        l1.setFont(f);
        l1.setBounds(600,300,500,50);
        l1.setForeground(Color.yellow);

        l2=new JLabel("PASSWORD:");
        l2.setFont(f);
        l2.setBounds(600,500,500,50);
        l2.setForeground(Color.yellow);

        t1=new JTextField(20);
        t1.setBounds(900,300,300,50);

        t2=new JPasswordField(20);
        t2.setBounds(900,500,300,50);

        b1=new JButton("LOGIN");
        b1.setFont(f);
        b1.setBounds(600,700,200,50);
        b1.addActionListener(this);

        b2=new JButton("Exit To Main");
        b2.setFont(f);
        b2.setBounds(900,700,300,50);
        b2.addActionListener(this);

        i=new ImageIcon("222.jpg");
        l3=new JLabel(i);
        l3.setBounds(0,0,1900,952);

        i1=new ImageIcon("login1.gif");
        l4=new JLabel(i1);
        l4.setBounds(650,0,500,200);


        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(l4);
        add(back);
        add(l3);
}

       public void actionPerformed(ActionEvent ae) 

{

        if(ae.getSource()==b1)

{
       

       String s1,s2;

       s1=t1.getText();
       s2=t2.getText();

       int i,j;
       
       i=s1.length();

       j=s2.length();

       
       if(i==0 || j==0)
{
       JOptionPane.showMessageDialog(null,"LOGIN UNSUCESSFULL,TEXT FEILDS CANT BE EMPTY!");

       t1.requestFocus();

}

	else
{
       try
{

      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con=DriverManager.getConnection("jdbc:odbc:project2dsn");
      Statement stmt=con.createStatement(); 
      String query="Select * from studentlogintbl where username='"+t1.getText()+"' and password='"+t2.getText()+"'";
      ResultSet rs=stmt.executeQuery(query);
      int ctr=0;
      while(rs.next())
{     ctr++;
}

     if(ctr==0)
     JOptionPane.showMessageDialog(null,"LOGIN UNSUCESSFULL,NO SUCH USER REGISTERD");

     else
{    JOptionPane.showMessageDialog(null,"LOGIN SUCESSFULL");
     studentlogin2 r=new mainmenu();
     r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     r.setSize(2000,2000);
     r.setVisible(true); 
     r.setExtendedState(JFrame.MAXIMIZED_BOTH);
     r.setTitle("Main Screen");
     this.dispose();

}


}
}
 catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e);
}



}
}



       else if(ae.getSource()==b2)
{

             screen1 ls=new screen1();
             ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

             ls.setSize(2000,2000);

             
             ls.setVisible(true);
             ls.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ls.setTitle("CHOOSE USER");
             this.dispose();
}

      
       else if(ae.getSource()==back)
{

             loginmain ls=new loginmain();
             ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

             ls.setSize(2000,2000);

             
             ls.setVisible(true);
             ls.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ls.setTitle("CHOOSE USER");
             this.dispose();
}
}


public static void main(String args[])

{

         studentlogin1 s=new studentlogin1();
         s.setSize(2000,2000);
         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("STUDENT LOGIN SCREEN");
        

}
}       


  

      