import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class studentlogin2 extends JFrame implements ActionListener
{
JLabel l,head;
ImageIcon i1,i2,i3,i4,i5;
JButton changepassword,about,attendence,academics,signout;
Font f1=new Font("Cooper Black",Font.ITALIC,80);

public studentlogin2()
{
getContentPane().setBackground(Color.orange);
setLayout(null);

i1=new ImageIcon("profile.png");
l=new JLabel(i1);
l.setBounds(650,120,600,600);


head=new JLabel("STUDENT PROFILE");
head.setFont(f1);
head.setForeground(Color.blue);
head.setBounds(520,0,900,100);


i2=new ImageIcon("attendence.png");
attendence=new JButton(i2);
attendence.setBounds(150,150,300,200);
attendence.setBackground(Color.red);
attendence.addActionListener(this);

i3=new ImageIcon("academics.png");
academics=new JButton(i3);
academics.setBounds(1400,150,300,200);
academics.setBackground(Color.black);
academics.addActionListener(this);

i4=new ImageIcon("studentabout.jpg");
about=new JButton(i4);
about.setBounds(150,450,300,200);
about.setBackground(Color.white);
about.addActionListener(this);

i5=new ImageIcon("changepassword.jpg");
changepassword=new JButton(i5);
changepassword.setBounds(1400,450,300,200);
changepassword.setBackground(Color.white);
changepassword.addActionListener(this);

signout=new JButton("Sign Out");
signout.setBounds(700,720,500,200);
signout.setBackground(Color.yellow);
signout.setForeground(Color.red);
signout.setFont(f1);
signout.addActionListener(this);

add(head);
add(l);
add(attendence);
add(academics);
add(about);
add(changepassword);
add(signout);
}


public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==changepassword)
{
newpassword s=new newpassword();
s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
s.setVisible(true);
s.setExtendedState(JFrame.MAXIMIZED_BOTH);
s.setTitle("New Password");
s.setVisible(true);
this.dispose();
}

if(ae.getSource()==signout)
{
studentlogin1 s=new studentlogin1();
s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
s.setVisible(true);
s.setExtendedState(JFrame.MAXIMIZED_BOTH);
s.setTitle("New Password");
s.setVisible(true);
this.dispose();
}

if(ae.getSource()==academics)
{
academics s=new academics();
s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
s.setVisible(true);
s.setExtendedState(JFrame.MAXIMIZED_BOTH);
s.setTitle("Academics");
s.setVisible(true);
this.dispose();
}
}


public static void main(String args[])
{
studentlogin2 s=new studentlogin2();
s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
s.setVisible(true);
s.setExtendedState(JFrame.MAXIMIZED_BOTH);
s.setTitle("Student");
s.setVisible(true);
}
}






