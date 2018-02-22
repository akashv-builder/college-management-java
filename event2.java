import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class event2 extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,head;



Font f=new Font("Ravie",Font.ITALIC,100);
Font f1=new Font("Forte",Font.ITALIC,130);

ImageIcon img1,img2,img3,img4,img5,img6,img7,i8,img8,img9;

JButton back;

public event2()
{
setLayout(null);

getContentPane().setBackground(Color.pink);

img1=new ImageIcon("sports1.gif");
l1=new JLabel(img1);
l1.setBounds(0,0,350,350);


img2=new ImageIcon("sports2.gif");
l2=new JLabel(img2);
l2.setBounds(0,350,350,350);



img3=new ImageIcon("sports3.gif");
l3=new JLabel(img3);
l3.setBounds(0,700,350,350);


img4=new ImageIcon("sports4.gif");
l4=new JLabel(img4);
l4.setBounds(1560,0,360,350);

img5=new ImageIcon("sports5.gif");
l5=new JLabel(img5);
l5.setBounds(1560,270,360,400);


img6=new ImageIcon("sports6.gif");
l6=new JLabel(img6);
l6.setBounds(1560,602,360,450);



img7=new ImageIcon("sports7.jpg");
l7=new JLabel(img7);
l7.setBounds(205,500,1500,500);


img8=new ImageIcon("sportsvideo.gif");
l8=new JLabel(img8);
l8.setBounds(750,100,400,425);


img9=new ImageIcon("header.gif");
head=new JLabel(img9);
head.setFont(f1);
head.setForeground(Color.red);
head.setBounds(750,0,400,100);


i8=new ImageIcon("back.gif");
back=new JButton(i8);
back.setBounds(1410,0,150,60);
back.addActionListener(this);


add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(head);
add(back);

}


public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==back)
{
screen1 r=new screen1();

r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
r.setSize(2000,2000);
r.setVisible(true); 
r.setExtendedState(JFrame.MAXIMIZED_BOTH);
r.setTitle("AFTER WELCOME");
this.dispose();
}
}

public static void main(String args[])
{
event2 r=new event2();
r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
r.setSize(2000,2000);
r.setVisible(true); 
r.setExtendedState(JFrame.MAXIMIZED_BOTH);
r.setTitle("Sports");

}
}