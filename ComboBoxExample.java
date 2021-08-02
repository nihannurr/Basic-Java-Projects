package comboboxexample;
import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample {
    
    ComboBoxExample(){
        JFrame f = new JFrame("Combobox Ex");
        
        JLabel label = new JLabel();
        label.setSize(400,100);
        
        JButton b = new JButton("show");
        b.setBounds(200,100,75,20);
        
        String language[] = {"C","C#","C++","Java"};
        
        JComboBox cb = new JComboBox(language);
        
        cb.setBounds(50,100,90,20);
        
        f.add(label); f.add(b); f.add(cb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data = "Language selected:" + 
                        cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
           
    }
    
    public static void main(String[] args) {
        new ComboBoxExample();
    }
    
}
