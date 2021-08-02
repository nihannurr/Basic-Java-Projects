
package SwingPaint;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingPaint {
    
    JButton clearBtn, blackBtn, blueBtn, greenBtn, redBtn, magentaBtn, circleBtn,rectangleBtn;/////
    DrawArea drawArea;
    ActionListener actionListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == clearBtn){
                drawArea.clear();
            }else if(e.getSource() == blackBtn){
                drawArea.black();
            }else if(e.getSource() == blueBtn){
                drawArea.blue();
            }else if(e.getSource() == greenBtn){
                drawArea.green();
            }else if(e.getSource() == redBtn){
                drawArea.red();
            }else if(e.getSource() == magentaBtn){
                drawArea.magenta();
            }
            else if(e.getSource() == circleBtn){
                drawArea.circle();
            }
            else if(e.getSource() == rectangleBtn){
                drawArea.rectangle();
            }
        }
    };
    
    public static void main(String[] args) {
        new SwingPaint().show();
    }
    
    public void show(){
        JFrame frame = new JFrame("Easy Paint");//creating frame
        Container content = frame.getContentPane();
        content.setLayout(new BorderLayout());
        drawArea = new DrawArea();
        content.add(drawArea, BorderLayout.CENTER);//adding content pane
        JPanel controls = new JPanel();
        
        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(actionListener);
        blackBtn = new JButton("Black");
        blackBtn.addActionListener(actionListener);
        blueBtn = new JButton("Blue");
        blueBtn.addActionListener(actionListener);
        greenBtn = new JButton("Green");
        greenBtn.addActionListener(actionListener);
        redBtn = new JButton("Red");
        redBtn.addActionListener(actionListener);
        magentaBtn = new JButton("Magenta");
        magentaBtn.addActionListener(actionListener);
        circleBtn = new JButton("Circle");
        circleBtn.addActionListener(actionListener);
        rectangleBtn = new JButton("Rectangle");
        rectangleBtn.addActionListener(actionListener);
        
        controls.add(blackBtn);
        controls.add(blueBtn);
        controls.add(redBtn);
        controls.add(greenBtn);
        controls.add(magentaBtn);
        controls.add(circleBtn);
        controls.add(rectangleBtn);
        controls.add(clearBtn);
        content.add(controls, BorderLayout.NORTH);
        
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}