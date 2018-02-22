import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class loginmain extends JFrame implements ActionListener,Runnable
{

Boolean visible;
JLabel word;
JButton StudentLogin,EmployeeLogin,newuser,Login,back,Exit;
ImageIcon i1,i2,i5,i6,i7,i8;
String text="LOGIN FOR CURRENT EMPLOYEES ONLY,PLEASE ENTER YOUR 6 DIGIT EMPLOYEE ID AND YOUR PASSWORD,IN CASE YOU ARE NOT ABEL TO LOGIN CONTACT THE ADMINISTRATOR.";
public loginmain()
{
setLayout(null);
getContentPane().setBackground(Color.yellow);

i1=new ImageIcon("newuser.png");
newuser=new JButton(i1);
newuser.setBounds(0,90,2000,435);





i5=new ImageIcon("studentlogin.png");
StudentLogin=new JButton(i5);
StudentLogin.setBounds(0,525,1000,500);
StudentLogin.addActionListener(this);


i6=new ImageIcon("employeelogin.png");
EmployeeLogin=new JButton(i6);
EmployeeLogin.setBounds(1000,525,1000,500);
EmployeeLogin.addActionListener(this);

Font f=new Font("Comic Mans MS",Font.BOLD,30);
word=new JLabel(text);
word.setBounds(130,10,1800,40);
word.setForeground(Color.red);
word.setFont(f);

i7=new ImageIcon("exit1.gif");
Exit=new JButton(i7);
Exit.setBounds(1775,0,145,57);
Exit.addActionListener(this);
Exit.setBackground(Color.red);

i8=new ImageIcon("back.gif");
back=new JButton(i8);
back.setBounds(0,0,149,58);
back.addActionListener(this);


add(newuser);
add(StudentLogin);
add(EmployeeLogin);
add(back);
add(Exit);
add(word);
Thread t=new Thread(this);
t.start();
}

public void run()
{
while(true)
{
try
{
Thread.sleep(600);
}
catch(Exception e){}

text=text.substring(1)+""+text.substring(0,1);
word.setText(text);

}
}


public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==back)
{        screen1 s=new screen1();

         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("AFTER WELCOME");
         this.dispose();
}
if(ae.getSource()==StudentLogin)
{
studentlogin1 b=new studentlogin1();

b.setTitle("Enterprise Resource Planning");
b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
b.setExtendedState(JFrame.MAXIMIZED_BOTH);
b.setVisible(true);
this.dispose();
}

if(ae.getSource()==newuser)
{
try
{
register s=new register();
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:collegedsn");
Statement stm=con.createStatement();
String ss="SELECT MAX(rollno) from register";
ResultSet rs = stm.executeQuery(ss);
while(rs.next())
{
int i=rs.getInt(1);
i++;
s.rollnotxt.setText(Integer.toString(i));
}

Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
s.setSize(screenSize.width, screenSize.height);
s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
s.setTitle("ABOUT");
//s.setSize(1200,1200);
s.setVisible(true);
dispose();
}
catch (Exception e)
{
JOptionPane.showMessageDialog(null,e);
}

}

if(ae.getSource()==Exit)
{
System.exit(0);
}

if(ae.getSource()==EmployeeLogin)
{
employeelogin s=new employeelogin();
s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
s.setVisible(true);
s.setExtendedState(JFrame.MAXIMIZED_BOTH);
s.setTitle("Student Login");
this.dispose();
}
}


public static void main(String args[])
{
loginmain s=new loginmain();
s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
s.setVisible(true);
s.setExtendedState(JFrame.MAXIMIZED_BOTH);
s.setTitle("ERP");
s.setVisible(true);
}
}