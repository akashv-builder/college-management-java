import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class academics extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6;

JTextField t1,t2,t3,t4,t5,t6;
ImageIcon i;
JButton back;

public academics()
{
boolean Visible;
setLayout(null);

        i=new ImageIcon("back.gif");
        back=new JButton(i);
        back.setBounds(0,0,149,58);
        back.addActionListener(this); 

getContentPane().setBackground(Color.green);


Font f=new Font("Comic Mans MS",Font.BOLD,50);

l1=new JLabel("SESSION 1:");
l1.setFont(f);
l1.setForeground(Color.blue);
l2=new JLabel("SESSION 2:");
l2.setFont(f);
l2.setForeground(Color.blue);
l3=new JLabel("SESSION 3:");
l3.setForeground(Color.blue);
l3.setFont(f);
l4=new JLabel("SESSION 4:");
l4.setForeground(Color.blue);
l4.setFont(f);
l5=new JLabel("SESSION 5:");
l5.setForeground(Color.blue);
l5.setFont(f);
l6=new JLabel("REMARKS:");
l6.setForeground(Color.red);
l6.setFont(f);

l1.setBounds(550,100,400,50);
l2.setBounds(550,200,400,50);
l3.setBounds(550,300,400,50);
l4.setBounds(550,400,400,50);
l5.setBounds(550,500,400,50);
l6.setBounds(550,600,400,50);

t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
t5=new JTextField(20);
t6=new JTextField(20);

t1.setBounds(900,100,300,50);
t2.setBounds(900,200,300,50);
t3.setBounds(900,300,300,50);
t4.setBounds(900,400,300,50);
t5.setBounds(900,500,300,50);
t6.setBounds(900,600,300,50);



add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(t4);
add(l5);
add(t5);
add(l6);
add(t6);
add(back);



}



public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==back)
{

             studentlogin2 ls=new studentlogin2();
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
         academics s=new academics();
         s.setSize(2000,2000);
         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("STUDENT");
}
}