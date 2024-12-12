package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    login(){
        getContentPane().setBackground(Color.BLACK);
        //newlinecode
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("photo2.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,700,550);
        add(image);

        JLabel heading = new JLabel("Embark on a Quiz Odyssey ");
        heading.setBounds(745,40,300,65);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        heading.setForeground(Color.MAGENTA);
        add(heading);
        //newlinecode

        JLabel name = new JLabel("Enter your name ");
        name.setBounds(800,120,200,45);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        name.setForeground(Color.GREEN);
        add(name);

         tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.PLAIN,30));
        tfname.setBackground(Color.BLACK);
        tfname.setForeground(Color.white);
        add(tfname);

         rules=new JButton("Rules");
        rules.setBounds(735,270,140,30);
        rules.setBackground(Color.BLACK);
        rules.setForeground(new Color(30,144,255));
        rules.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        rules.addActionListener(this);
        add(rules);

         back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(30,144,255));
        back.setBounds(915,270,140,30);
        back.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        back.addActionListener(this);
        add(back);






        setSize(1100,500);
        setLocation(200,150);
        setVisible(true);

    }
    public  void actionPerformed(ActionEvent ae){
          if (ae.getSource()==rules){
              String name=tfname.getText();
              setVisible(false);
              new Rules(name);
          } else if (ae.getSource()==back) {
              setVisible(false);
          }
    }
    public static void main(String[] args) {
        new login();

    }}

