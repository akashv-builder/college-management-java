import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class newuser extends JFrame implements ActionListener
{
JLabel namelbl,fnamelbl,addlbl,semlbl,genderlbl;
JTextField nametxt,fnametxt,addtxt,semtxt,gendertxt;
ImageIcon i;
JButton back;
Font f1=new Font("Forte",Font.ITALIC,15);
public newuser()
{

boolean Visible;
setLayout(null);

getContentPane().setBackground(Color.red);
setContentPane(new JLabel(new ImageIcon("dd.jpg")));


namelbl=new JLabel("Name:");
fnamelbl=new JLabel("Father's Name:");
addlbl=new JLabel("Address:");
semlbl=new JLabel("Semester:");
genderlbl=new JLabel("Gender:");
namelbl.setBounds(500,100,200,50);
fnamelbl.setBounds(500,200,200,50);
addlbl.setBounds(500,300,200,50);
semlbl.setBounds(500,400,200,50);
genderlbl.setBounds(500,500,200,50);
nametxt=new JTextField(20);
fnametxt=new JTextField(20);
addtxt=new JTextField(20);
semtxt=new JTextField(20);
gendertxt=new JTextField(20);
nametxt.setBounds(700,100,200,50);
fnametxt.setBounds(700,200,200,50);
addtxt.setBounds(700,300,200,50);
semtxt.setBounds(700,400,200,50);
gendertxt.setBounds(700,500,200,50);

i=new ImageIcon("back.gif");


back=new JButton(i);
back.setBounds(1200,30,149,58);
back.addActionListener(this);


add(namelbl);
add(nametxt);
add(fnamelbl);
add(fnametxt);
add(addlbl);
add(addtxt);
add(semlbl);
add(semtxt);
add(genderlbl);
add(gendertxt);
add(back);
}


public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==back)
{
screen1 j=new screen1();
Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
j.setSize(screenSize.width, screenSize.height);
//j.setSize(1200,700);
j.setVisible(true);
j.setTitle("STUDENT PROFILE");
dispose();
}
}


public static void main(String args[])
{
newuser s=new newuser();
Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
s.setSize(screenSize.width, screenSize.height);
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.setTitle("ABOUT");
//s.setSize(1200,1200);
s.setVisible(true);
}
}