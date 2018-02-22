import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class register extends JFrame implements ActionListener
{
JComboBox c,d;
String gen[]={"Male","Female"};
String cou[]={"Btech","Mtech","BBA","MBA","BCom","Bsc","FashionTechnology"};
JPasswordField p1,p2;
JLabel sname,fname,course,gender,password,retypepassword,rollno;
JTextField snametxt,fnametxt,coursetxt,gendertxt,rollnotxt;
ImageIcon i,i1;
JButton back,bu;
Connection con;
Statement stm;
Font f1=new Font("Cooper Black",Font.ITALIC,15);
public register()
{

boolean Visible;
setLayout(null);

getContentPane().setBackground(Color.red);
setContentPane(new JLabel(new ImageIcon("pencil.jpg")));

c=new JComboBox(gen);
d=new JComboBox(cou);

sname=new JLabel("Name:");
fname=new JLabel("Father's Name:");
gender=new JLabel("Gender:");
course=new JLabel("Course:");
rollno=new JLabel("Roll No:");
password=new JLabel("Password:");
retypepassword=new JLabel("RetypePassword:");

sname.setBounds(200,50,200,50);
fname.setBounds(200,150,200,50);
gender.setBounds(200,250,200,50);
course.setBounds(200,350,200,50);
rollno.setBounds(700,50,200,50);
password.setBounds(700,150,200,50);
retypepassword.setBounds(700,250,200,50);

snametxt=new JTextField(20);
fnametxt=new JTextField(20);
p1=new JPasswordField(20);
//c=new JTextField(20);
//coursetxt=new JTextField(20);
rollnotxt=new JTextField(20);

rollnotxt.setBackground(new Color(0,0,220));
rollnotxt.setForeground(Color.white);
Font f=new Font("arial black",Font.BOLD,20);
rollnotxt.setFont(f);
rollnotxt.setEditable(false);
p2=new JPasswordField(20);

snametxt.setBounds(400,50,200,50);
fnametxt.setBounds(400,150,200,50);
c.setBounds(400,250,200,50);
d.setBounds(400,350,200,50);
rollnotxt.setBounds(900,50,200,50);
p2.setBounds(900,150,200,50);
p1.setBounds(900,250,200,50);

sname.setFont(f);
fname.setFont(f);
course.setFont(f);
gender.setFont(f);
password.setFont(f);
retypepassword.setFont(f);
rollno.setFont(f);

i=new ImageIcon("back.gif");
back=new JButton(i);
back.setBounds(1150,600,149,58);
back.addActionListener(this);

i1=new ImageIcon("Reg.gif");
bu=new JButton(i1);
bu.setBounds(800,380,223,44);
bu.addActionListener(this);


try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:collegedsn");
stm=con.createStatement();
String ss="SELECT MAX(rollno) from register";
ResultSet rs = stm.executeQuery(ss);
while(rs.next())
{
rollnotxt.setText(rs.getString(1));
}
}
catch (Exception e)
{
JOptionPane.showMessageDialog(null,e);
}

add(sname);
add(snametxt);
add(fname);
add(fnametxt);
add(gender);
//add(gendertxt);
add(course);
//add(coursetxt);
add(rollno);
add(rollnotxt);
add(password);
add(p2);
add(back);
add(bu);
add(c);
add(d);
add(retypepassword);
add(p1);

}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==back)
{
erp s=new erp();
Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
s.setSize(screenSize.width, screenSize.height);
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.setTitle("ERP");
//s.setSize(1200,700);
s.setVisible(true);
dispose();
}

if(ae.getSource()==bu)
{
	String y=p1.getText();
	String z=p2.getText();
	
	if(y.equals(z))
	{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:collegedsn");
stm=con.createStatement();
String ss="SELECT MAX(rollno) from register";
ResultSet rs = stm.executeQuery(ss);
while(rs.next())
{
rollnotxt.setText(rs.getString(1));
}
String query="INSERT INTO register(sname,fname,gender,course,password) values('"+snametxt.getText().trim()+"','"+fnametxt.getText().trim()+"','"+c.getSelectedItem().toString().trim()+"','"+d.getSelectedItem().toString().trim()+"','"+p2.getText().trim()+"')";
stm.executeUpdate(query);
JOptionPane.showMessageDialog(null,"registration successful!!");

erp s=new erp();
Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
s.setSize(screenSize.width, screenSize.height);
s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
s.setTitle("ERP");
//s.setSize(1200,700);
s.setVisible(true);
dispose();

}
catch (Exception e)
{
JOptionPane.showMessageDialog(null,e);
}
	}
	else
{
	JOptionPane.showMessageDialog(null,"password do not match.try again");
}
}
}


public static void main(String args[])
{
register s=new register();
Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
s.setSize(screenSize.width, screenSize.height);
s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
s.setTitle("REGISTER");
//s.setSize(1200,1200);
s.setVisible(true);
}
}















