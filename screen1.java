import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
public class screen1 extends JFrame implements ActionListener,Runnable
{


JMenuBar mbar;

JMenu home,erp,events,studentservices,aboutus;

String msg="COME,LEARN AND SERVE  ";

JMenuItem programs,achievements;
JMenuItem annualfest,sportsday,blooddonation,conferencesseminars,technicalfest;
JMenuItem overview,infrastructure,location;
JMenuItem gym,transport,workshop,cafeteria,hostelfacility,library;


JLabel slideshow,l,l1,l2,l3;
ImageIcon i3,ic,i4,i5;

String imgs[]={"college1.jpg","college3.jpg","college4.jpg","college5.jpg","college6.jpg","college7.jpg","college8.jpg","college9.jpg","college10.jpg","1.jpg","2.jpg","111.jpg","annual6.jpg","222.jpg","annual3.jpg"};
int i;

public screen1()
{
Font f=new Font("Cooper Black",Font.ITALIC,150);


getContentPane().setBackground(Color.orange);

ic=new ImageIcon("college1.jpg");


l1=new JLabel(msg);
l1.setBounds(10,0,1900,200);
l1.setForeground(Color.red);

l1.setFont(f);

Font f1=new Font("Cooper Black",Font.ITALIC,40);


i3=new ImageIcon("123.gif");
l=new JLabel(i3);
l.setBounds(1560,138,400,225);

i4=new ImageIcon("1234.gif");
l2=new JLabel(i4);
l2.setBounds(1560,268,400,425);

i5=new ImageIcon("12345.gif");
l3=new JLabel(i5);
l3.setBounds(1560,600,400,425);


add(l);
add(l1);
add(l2);
add(l3);



setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JMenuBar mbar=new JMenuBar();
mbar.setBackground(Color.blue);
setJMenuBar(mbar);

home=new JMenu("           Home          ");
home.setMnemonic('h');
home.setFont(f1);
home.setForeground(Color.yellow);
mbar.add(home);

programs=new JMenuItem("Programs",'p');
programs.addActionListener(this);
programs.setFont(f1);
home.add(programs);

achievements=new JMenuItem("Achievements",'a');
achievements.addActionListener(this);
achievements.setFont(f1);
home.add(achievements);

erp=new JMenu("            ERP           ");
erp.setFont(f1); 
erp.setForeground(Color.yellow);
erp.addActionListener(this);
erp.setMnemonic('e');
erp.addMenuListener(new MenuListener()
{public void menuSelected(MenuEvent me) 
{
         loginmain s=new loginmain();

         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("Welcome");
         dispose();
}

public void menuCanceled(MenuEvent e)
{ }
public void menuDeselected(MenuEvent e)
{ }

});
mbar.add(erp);

events=new JMenu("            Events           ");
events.setMnemonic('e');
mbar.add(events);
events.setFont(f1);
events.setForeground(Color.yellow);

annualfest=new JMenuItem("Annual Fest",'a');
annualfest.addActionListener(this);
annualfest.setFont(f1);
events.add(annualfest);

sportsday =new JMenuItem("Sports Day",'s');
sportsday.addActionListener(this);
sportsday.setFont(f1);
events.add(sportsday);

blooddonation=new JMenuItem("Blood Donation Camp",'b');
blooddonation.addActionListener(this);
blooddonation.setFont(f1);
events.add(blooddonation);

conferencesseminars=new JMenuItem("Conferences and Seminars",'c');
conferencesseminars.addActionListener(this);
conferencesseminars.setFont(f1);
events.add(conferencesseminars);

technicalfest=new JMenuItem("Technical Fest",'t');
technicalfest.addActionListener(this);
technicalfest.setFont(f1);
events.add(technicalfest);

aboutus=new JMenu("            About Us            ");
aboutus.setMnemonic('A');
aboutus.setFont(f1);
aboutus.setForeground(Color.yellow);
mbar.add(aboutus);

overview=new JMenuItem("Overview",'a');
overview.addActionListener(this);
overview.setFont(f1);
aboutus.add(overview);

infrastructure =new JMenuItem("Infrastructure",'s');
infrastructure.addActionListener(this);
infrastructure.setFont(f1);
aboutus.add(infrastructure);

location=new JMenuItem("Location",'b');
location.addActionListener(this);
location.setFont(f1);
aboutus.add(location);


studentservices=new JMenu("            Student Services           ");
studentservices.setFont(f1);
studentservices.setForeground(Color.yellow);
studentservices.setMnemonic('s');
mbar.add(studentservices);

cafeteria=new JMenuItem("Cafeteria",'c');
cafeteria.addActionListener(this);
cafeteria.setFont(f1);

studentservices.setFont(f1);
studentservices.add(cafeteria);

gym =new JMenuItem("Gym",'g');
gym.addActionListener(this);
gym.setFont(f1);
studentservices.add(gym);

workshop=new JMenuItem("Workshop",'w');
workshop.addActionListener(this);
workshop.setFont(f1);
studentservices.add(workshop);

hostelfacility=new JMenuItem("Hostel Facility",'h');
hostelfacility.addActionListener(this);
hostelfacility.setFont(f1);
studentservices.add(hostelfacility);

library =new JMenuItem("Library",'g');
library.addActionListener(this);
library.setFont(f1);
studentservices.add(library);

transport=new JMenuItem("Transport",'t');
transport.addActionListener(this);
transport.setFont(f1);
studentservices.add(transport);

slideshow=new JLabel(ic);
setLayout(null);
slideshow.setBounds(0,200,1580,800);
add(slideshow);

Thread t=new Thread(this);
t.start();
}

public void run()
{
while(true)
{

i=(int)(Math.random()*10);
if(i>=0 && i<=15)
{
ic=new ImageIcon(imgs[i]);
}

slideshow.setIcon(ic);
try
{
Thread.sleep(800);
}
catch(Exception e){}

msg=msg.substring(1)+""+msg.substring(0,1);
l1.setText(msg);



}
}


public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==annualfest)
{
event1 r=new event1();
 r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           r.setSize(2000,2000);
           r.setVisible(true); 
           r.setExtendedState(JFrame.MAXIMIZED_BOTH);
           r.setTitle("EVENT");

           this.dispose();
}

if(ae.getSource()==sportsday)
{
event2 r=new event2();
 r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           r.setSize(2000,2000);
           r.setVisible(true); 
           r.setExtendedState(JFrame.MAXIMIZED_BOTH);
           r.setTitle("EVENT");

           this.dispose();
}

if(ae.getSource()==blooddonation)
{
event3 r=new event3();
 r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           r.setSize(2000,2000);
           r.setVisible(true); 
           r.setExtendedState(JFrame.MAXIMIZED_BOTH);
           r.setTitle("EVENT");

           this.dispose();
}

if(ae.getSource()==conferencesseminars)
{
event5 r=new event5();
r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           r.setSize(2000,2000);
           r.setVisible(true); 
           r.setExtendedState(JFrame.MAXIMIZED_BOTH);
           r.setTitle("EVENT");

           this.dispose();
}

if(ae.getSource()==technicalfest)
{
event4 r=new event4();
r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           r.setSize(2000,2000);
           r.setVisible(true); 
           r.setExtendedState(JFrame.MAXIMIZED_BOTH);
           r.setTitle("EVENT");

           this.dispose();
}

}





public static void main(String args[])
{

         screen1 s=new screen1();

         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("Welcome");
}
}
