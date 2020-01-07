import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class AppletDrawRect extends Applet
{
        public static void main(String[] args)
       {
           Frame RectApplet = new Frame("Draw Rectangle in Applet Window Example");
           RectApplet.setSize(450, 350);
           Applet AppletDrawRect = new AppletDrawRect();
           RectApplet.add(AppletDrawRect);
           RectApplet.setVisible(true);
           RectApplet.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {System.exit(0);} });
        }
               public void paint(Graphics g)
                   {
                         g.setColor(Color.darkGray);
                         g.drawString("Draw Rounded Corner Rectangle", 50, 40);
                         g.setFont(new Font("chs_boot",Font.PLAIN,12));
                         g.drawString("http://ecomputernotes.com - tell me what you want", 200, 205);

int optiontcd;
optiontcd=1;

Scanner s = new Scanner(System.in);
System.out.println("Number ----- press any number to continue - 1 ok - 2 to exit----- ");
optiontcd = Integer.parseInt(s.nextLine().trim());
String krkiskirket="hi";

                          //set color to Blue
                         Color darkblue = new Color(0, 0, 200);
                         g.setColor(darkblue);
                         //this will draw a Rectangle of width 50 & height 70 at (10,50)
                         //The Syntax for drawRect(int xTopLeft, int yTopLeft, int  width, int height);
                          g.drawRect(10,50,50,70);
               
                         //this will Fill Rectangle of width 50 & height 70 at (70,50)
                         //The Syntax for fillRect(int xTopLeft, int yTopLeft, int width, int height);
                         g.fillRect(70,50,50,70);
                        // If you speficy same width 50 and height 50, the drawRect method will draw a square!
                  //The Syntax for  square drawRect(int xTopLeft, int yTopLeft, int width, int height);
                          g.drawRect(130,50,50,50);
                         //this will draw a round cornered rectangle of width 50 & height 70 at (10,130)
                        //The Syntax for round cornered square drawRoundRect(int xTopLeft, int yTopLeft, int width, int height, int arcWidth, int arcHeight)
                         g.drawRoundRect(10,130,50,70,20,20);
             
                        //draw filled rounded corner rectangle
                       //The Syntax for fillRoundRect(int xTopLeft, int yTopLeft, int  width, int height, int arcWidth, int arcHeight)
                        g.fillRoundRect(70,130,50,70,20,20);
             
                      //this will draw a round cornered square
                //The Syntax for round cornered square drawRoundRect(int xTopLeft, int yTopLeft, int width, int height, int arcWidth, int arcHeight)
                     g.drawRoundRect(130,130,50,50,10,10);
int i;
i=10;
             
while (optiontcd==1) {

System.out.println("cheppu -");

try {
       //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        krkiskirket = reader.readLine(); 
  
        // Printing the read line 
        System.out.println(krkiskirket);         
     
g.drawString(krkiskirket + " - ippo ni", 220+i, 225+i);
i=i+10;

} 
catch (IOException e) {
e.printStackTrace();
}
System.out.println("Number ----- press any number to continue - 2 to exit----- ");
optiontcd = Integer.parseInt(s.nextLine().trim());

if (optiontcd==2){
	System.out.println("exit");
	System.exit(0);
}
}


}

}
