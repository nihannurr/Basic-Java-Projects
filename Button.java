
package button;
import java.awt.event.*;
import javax.swing.*;

/*
public class Button {
public static void main(String[] args) {

   JFrame mainWindow = new JFrame("My main window");
   mainWindow.setLayout(null);
   mainWindow.setSize(640, 480);
   
   JTextField txtField = new JTextField();
   txtField.setBounds(110, 50, 150, 20);
   
   JTextField txtField2 = new JTextField();
   txtField2.setBounds(110, 100, 150, 20);
   
   JButton button1 = new JButton("click here");
   button1.setBounds(50, 175, 95, 30);
   
   button1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    txtField.setText("Button clicked");
    }
   });
   
   JLabel label1 = new JLabel("Name: ");
   JLabel label2 = new JLabel("surname: ");
   
   label1.setBounds(50, 50, 100, 30);
   label2.setBounds(50, 100, 100, 30);
   
   mainWindow.add(label1);
   mainWindow.add(label2);
   label1.setVisible(true);
   label2.setVisible(true);
   
   
   mainWindow.add(button1);
   button1.setVisible(true);
   
   mainWindow.add(txtField);
   txtField.setVisible(true);
   
   mainWindow.add(txtField2);
   txtField2.setVisible(true);
   
   mainWindow.setVisible(true);

   
}
}*/


public class Button implements ActionListener {

    JTextField txtNumber1, txtNumber2, txtResult;
    JButton btnSum, btnSubstract;
    JLabel label1, label2;

    Button() {
        JFrame mainWindow = new JFrame("My Main Window");
        mainWindow.setLayout(null);
        mainWindow.setSize(640,480);
        
        txtNumber1 = new JTextField();
        txtNumber2 = new JTextField();
        txtResult = new JTextField();
        btnSum = new JButton("+");
        btnSubstract = new JButton("-");

        label1 = new JLabel("Num1: ");
        label2 = new JLabel("Num2: ");

        txtNumber1.setBounds(110,50,150,20);
        txtNumber2.setBounds(110,100,150,20);

        txtResult.setBounds(110,150,150,20);
        txtResult.setEditable(false);

        btnSum.setBounds(110,200,50,50);
        btnSubstract.setBounds(160,200,50,50);

        label1.setBounds(50,50,100,30);
        label2.setBounds(50,100,100,30);

        mainWindow.add(label1);
        mainWindow.add(label2);
        label1.setVisible(true);
        label2.setVisible(true);

        mainWindow.add(btnSum);
        btnSum.addActionListener(this);
        btnSum.setVisible(true);
        
        mainWindow.add(btnSubstract);
        btnSubstract.addActionListener(this);
        btnSubstract.setVisible(true);
        
        mainWindow.add(txtNumber1);
        txtNumber1.setVisible(true);
        mainWindow.add(txtNumber2);
        txtNumber2.setVisible(true);
        mainWindow.add(txtResult);
        txtResult.setVisible(true);
        
        mainWindow.setVisible(true);
    }

    public static void main(String[] args) {

        new Button();
        
    }

    public void actionPerformed(ActionEvent e) {
        
        String s1 = txtNumber1.getText();
        String s2 = txtNumber2.getText();

        //.Integer Classında fonksiyonlar.
        //parseInt Fonks:
        //Dize bağımsız değişkenini, ikinci bağımsız değişken tarafından belirtilen yarıçapta işaretli bir tam sayı olarak ayrıştırır.
        int number1 = Integer.parseInt(s1);
        int number2 = Integer.parseInt(s2);

        int result = 0;

        if (e.getSource()==btnSum) { //getSource() fonksiyonu java.util.EventObject Classından kalıtılmıştır!!
            result = number1 + number2;

        }
        else if(e.getSource()==btnSubstract) {
            result = number1 - number2;
        }

        String strResult = String.valueOf(result);

        txtResult.setText("" + strResult);

    }

}
