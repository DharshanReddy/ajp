//Frame
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class FrameDemo extends Frame {

FrameDemo(String title)
{
super(title);
setSize(700,700);
setVisible(true);
setBackground(Color.CYAN);
setForeground(Color.BLUE);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}
);
}

public void paint(Graphics g)
{
g.drawLine(40, 225, 250, 180);

g.drawRect(10, 50, 60, 50);
g.fillRect(100, 50, 30, 20);

g.drawRoundRect(190, 50, 60, 50, 15, 15);
g.fillRoundRect(270, 100, 140, 100, 30, 40);

g.drawOval(200, 250, 50, 50);
g.fillOval(70, 90, 140, 100);
}

public static void main(String[] args) {
// TODO Auto-generated method stub

new FrameDemo("My First Frame");
System.out.println("This is an application");
}

}
