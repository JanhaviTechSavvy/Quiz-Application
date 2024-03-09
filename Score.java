package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    Score (String name,int score){
        setBounds(400,150,790,550);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setVisible(true);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("picture.PNG"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel heading = new JLabel("Thank you "+name+" for playing quiz odessy");
         heading.setBounds(45,30,700,30);
         heading.setFont(new Font("Mongolian Baiti",Font.PLAIN,27));
         heading.setForeground(new Color(127,255,212));
        add( heading);

        JLabel lblscore = new JLabel("Your score is "+score);
        lblscore.setBounds(450,200,300,30);
        lblscore.setFont(new Font("Mongolian Baiti",Font.PLAIN,24));
        lblscore.setForeground(new Color(127,255,212));
        add(lblscore);


        JButton submit =new JButton("Play Again");
        submit.setBounds(450,290,150,30);
        submit.setBackground(Color.BLACK);
        submit.setFont(new Font("Mongolian Baiti",Font.PLAIN,23));
        submit.setForeground( Color.RED);
        submit.addActionListener(this);

        add(submit);


    }
    public static void main(String[] args) {
        new Score("User",0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new login();

    }
}
