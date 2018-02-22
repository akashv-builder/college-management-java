import java.util.*;
import java.awt.*;
import javax.swing.*;


public class splashscreen extends JFrame implements Runnable
{             
           ImageIcon i;

           ImageIcon i1=new ImageIcon("11.gif");
       
           ImageIcon i2=new ImageIcon("22.gif");
 
           ImageIcon i3=new ImageIcon("33.gif");
               

             JLabel l=new JLabel();
             JLabel l1=new JLabel();
	     JLabel l2=new JLabel();
	     JLabel l3=new JLabel();
			 
            
             
             public splashscreen()
{

             setLayout(null);
          

             i=new ImageIcon("sp.jpg");
          
             
             l.setIcon(i);
             l.setBounds(0,0,1900,952);

             l1.setIcon(i);
             l1.setBounds(0,0,1920,340);

             l2.setIcon(i);
             l2.setBounds(0,340,1920,350);

             l3.setIcon(i);
             l3.setBounds(0,680,1920,350);

             add(l1);
             add(l2);
             add(l3);
             add(l);

             Thread t=new Thread(this);
             t.start();

                     
           
             
}

            public void run()
			
{
			
            while(true)

 {           
	   
            
             try 

{            Thread.sleep(1000);

}

            
             catch(Exception e){}
			 
            
             l1.setIcon(i1);

            
            try 

{            Thread.sleep(1000);

}

            
             catch(Exception e){}

              l2.setIcon(i2);

                  
             try 

{            Thread.sleep(1000);

}

            
             catch(Exception e){}

             l3.setIcon(i3); 



             


}

}

public static void main(String args[])
{
              
             
           

            splashscreen s=new splashscreen();

             s.setSize(2000,2000);
             s.setExtendedState(JFrame.MAXIMIZED_BOTH);
             s.setTitle("SPLASH SCREEN");
             s.setVisible(true);

           

            try 

{            Thread.sleep(6000);

}

            
             catch(Exception e){}


            screen1 ls=new screen(); //afterwelcome b=new afterwelcome();

             ls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ls.setSize(2000,2000);

             
             ls.setVisible(true);
             ls.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ls.setTitle("DATE SCREEN");

             s.dispose();

}
