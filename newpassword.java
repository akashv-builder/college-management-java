import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class newpassword extends JFrame implements ActionListener
{
JLabel c,d,e,f,g;
JTextField a,p,s,r;
JButton b1,b2,b3,b4;
ImageIcon i;
public newpassword()
{
boolean Visible;
setLayout(null);

Font f1=new Font("Comic Mans MS",Font.BOLD,50);
Font f2=new Font("Comic Mans MS",Font.BOLD,100);
Font f3=new Font("Comic Mans MS",Font.BOLD,30);

getContentPane().setBackground(Color.blue);

e=new JLabel("CHANGE PASSWORD");
e.setFont(f2);
e.setForeground(Color.red);


c=new JLabel("USERNAME:");
c.setFont(f1);
d=new JLabel("OLD PASSWORD:");
d.setFont(f1);
f=new JLabel("NEW PASSWORD:");
f.setFont(f1);
g=new JLabel("RETYPE PASSWORD:");
g.setFont(f1);

e.setBounds(380,0,1500,100);
c.setBounds(400,200,600,50);
d.setBounds(400,300,600,50);
f.setBounds(400,400,600,50);
g.setBounds(400,500,600,50);

a=new JTextField(20);
p=new JTextField(20);
s=new JTextField(20);
r=new JTextField(20);

a.setBounds(1000,200,400,50);
p.setBounds(1000,300,400,50);
s.setBounds(1000,400,400,50);
r.setBounds(1000,500,400,50);

i=new ImageIcon("back.gif");
b1=new JButton(i);
b1.setBounds(0,0,149,58);
b1.addActionListener(this);

b2=new JButton("SAVE CHANGES");
b2.setBounds(500,700,300,100);
b2.setForeground(Color.red);
b2.addActionListener(this);
b2.setFont(f3);

b3=new JButton("CANCEL");
b3.setBounds(850,700,200,100);
b3.setForeground(Color.red);
b3.addActionListener(this);
b3.setFont(f3);

b4=new JButton("CLEAR");
b4.setBounds(1100,700,200,100);
b4.addActionListener(this);
b4.setForeground(Color.red);
b4.setFont(f3);


add(e);
add(c);
add(a);
add(d);
add(p);
add(f);
add(s);
add(g);
add(r);
add(b1);
add(b2);
add(b3);
add(b4);

}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
             studentlogin2 ls=new studentlogin2();
             ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             ls.setSize(2000,2000);
             ls.setVisible(true);
             ls.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ls.setTitle("CHOOSE USER");
             this.dispose();
}

if(ae.getSource()==b3)
{
             studentlogin2 ls=new studentlogin2();
             ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             ls.setSize(2000,2000);
             ls.setVisible(true);
             ls.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ls.setTitle("CHOOSE USER");
             this.dispose();
}
if(ae.getSource()==b2)
{
String q,w,y,z;
q=a.getText();
w=p.getText();
y=s.getText();
z=r.getText();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
Statement stm=con.createStatement();
String query="update tablelogin set password='"+y+"' where username='"+q+"'and password='"+w+"'";
int X=stm.executeUpdate(query);

JOptionPane.showMessageDialog(null,"1 record updated");
}
catch (Exception e)
{
System.out.println("Error:"+e);
}

}


if(ae.getSource()==b4)
{
a.setText("");
p.setText("");
s.setText("");
r.setText("");


}
}

public static void main(String args[])
{
newpassword ls=new newpassword();
             ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             ls.setSize(2000,2000);
             ls.setVisible(true);
             ls.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ls.setTitle("Update Password");
             
}
}