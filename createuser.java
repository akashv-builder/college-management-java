import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class createuser extends JFrame implements ActionListener
{
JLabel c,d,e,f;
JPasswordField p;
JTextField a;
JButton b2,b3;
public createuser()
{
setLayout(null);
c=new JLabel("USERNAME:");
d=new JLabel("PASSWORD:");
c.setBounds(100,100,200,50);
d.setBounds(100,200,200,50);
a=new JTextField(20);
p=new JPasswordField(20);
a.setBounds(320,100,200,50);
p.setBounds(320,200,200,50);

b2=new JButton("SAVE");
b2.setBounds(300,300,100,40);
b2.addActionListener(this);
b3=new JButton("CANCEL");
b3.setBounds(600,300,100,40);
b3.addActionListener(this);

add(c);
add(a);
add(d);
add(p);
add(b2);
add(b3);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b2)
{
String q,w;
q=a.getText();
w=p.getText();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
Statement stm=con.createStatement();
String query="insert into tablelogin(username,password) values ('"+q+"','"+w+"')";
int X=stm.executeUpdate(query);

JOptionPane.showMessageDialog(null,"1 record inserted");
}
catch (Exception e){System.out.println("Error:"+e);}

}
}
public static void main(String args[])
{
createuser j=new createuser();
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
j.setTitle("Create User");
j.setSize(1200,1200);
j.setVisible(true);
}
}