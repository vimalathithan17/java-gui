import java.awt.*;
import java.awt.event.*;
public class FirstGraphics extends Frame
{
    public FirstGraphics(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g){
        g.drawLine(20,20,14,111);
        g.drawRect(30,30,40,50);
        g.fillRect(70,70 ,80,90);
    }
    public static void main(String[] args) {
        FirstGraphics app=new FirstGraphics();
        app.setSize(new Dimension(400,400));
        app.setTitle("First Graphics");
        app.setVisible(true);
    }
}
