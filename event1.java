import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.sql.*;
public class event1 extends JFrame implements ActionListener,Runnable
{
JLabel l1,l2,l3,l4,l5,l6,l7,l9,word,head;

String text="Students participated in various events such as dance competition, play and drama in College Annual Function.";

Font f=new Font("Ravie",Font.ITALIC,100);
Font f1=new Font("Forte",Font.ITALIC,130);

ImageIcon img1,img2,img3,img4,img5,img6,img7,i8,img9;

JButton back;

public event1()
{
setLayout(null);

getContentPane().setBackground(Color.pink);
img1=new ImageIcon("fest1.gif");

l1=new JLabel(img1);
l1.setBounds(0,350,350,350);


img2=new ImageIcon("fest2.gif");
l2=new JLabel(img2);
l2.setBounds(1560,602,360,450);


img3=new ImageIcon("fest3.gif");
l3=new JLabel(img3);
l3.setBounds(0,700,350,350);


img4=new ImageIcon("fest4.gif");
l4=new JLabel(img4);
l4.setBounds(1560,0,360,350);

img5=new ImageIcon("fest5.gif");
l5=new JLabel(img5);
l5.setBounds(1560,270,360,400);


img6=new ImageIcon("fest6.gif");
l6=new JLabel(img6);
l6.setBounds(0,0,350,350);

img7=new ImageIcon("festvideo.gif");
l7=new JLabel(img7);
l7.setBounds(750,400,400,425);


img9=new ImageIcon("fest9.jpg");
l9=new JLabel(img9);
l9.setBounds(230,650,1500,500);

head=new JLabel("ANNUAL FEST");
head.setFont(f1);
head.setForeground(Color.red);
head.setBounds(530,0,950,210);

word=new JLabel(text);
word.setFont(f);
word.setBounds(350,250,1300,250);


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
add(l9);
add(word);
add(head);
add(back);

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
event1 r=new event1();
r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
r.setSize(2000,2000);
r.setVisible(true); 
r.setExtendedState(JFrame.MAXIMIZED_BOTH);
r.setTitle("ANNUAL FEST");

}
}