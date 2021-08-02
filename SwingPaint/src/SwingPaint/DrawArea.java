
package SwingPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComponent;

public class DrawArea extends JComponent{
    private Image image;
    private Graphics2D g2;
    private int currentX, currentY, oldX, oldY;
    
    public DrawArea(){
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                oldX = e.getX();//saving coordinates x,y when mouse is pressed
                oldY = e.getY();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
                currentX = e.getX();
                currentY = e.getY();
                if(g2 != null){
                    g2.drawLine(oldX, oldY, currentX, currentY);
                    repaint();
                    oldX = currentX;
                    oldY = currentY;
                }     
            }
        });
    }
    
    protected void paintComponent(Graphics g){
        
        if(image == null){//image to draw null-->create
            image = createImage(getSize().width, getSize().height);
            g2 = (Graphics2D) image.getGraphics();
            g2.setStroke(new BasicStroke(5));
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            clear();//doing draw area white
        }
        g.drawImage(image, 0, 0, null);
    }
    
    //methods
    public void clear(){
        g2.setPaint(Color.white);
        g2.fillRect(0, 0, getSize().width, getSize().height);
        g2.setPaint(Color.black);
        repaint();
    }
    public void circle(){
        g2.setStroke(new BasicStroke(8));
        g2.setColor(Color.black);
        g2.drawOval(100, 400, 240, 240);
        
    }
    public void rectangle(){
        g2.setStroke(new BasicStroke(8));
        g2.setColor(Color.black);
        g2.drawRect(380, 450, 240, 140);
    }
    public void black(){
        g2.setPaint(Color.black);
    }
    public void blue(){
        g2.setPaint(Color.blue);
    }
    public void red(){
        g2.setPaint(Color.red);
    }
    public void green(){
        g2.setPaint(Color.green);
    }
    public void magenta(){
        g2.setPaint(Color.magenta);
    }
    
}