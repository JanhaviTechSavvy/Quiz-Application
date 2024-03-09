package quiz.application;
import javax.print.MultiDocPrintService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " +  name  + " to Quiz Odessy");
        heading.setBounds(50,20,650,30);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        heading.setForeground(Color.YELLOW);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.BOLD,16));
        rules.setForeground(Color.WHITE);
        rules.setText(
                "<html>"+
                   "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                          "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                          "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                         "4. Crying is allowed but please do so quietly." + "<br><br>" +
                         "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                         "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                         "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                         "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                         "</html>"

        );
        add(rules);

        back= new JButton("Back");
        back.setBounds(250,500,150,35);
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(255,228,181));
        back.setFont(new Font("Times New Roman",Font.PLAIN,25));
        back.addActionListener(this);
        add(back);



        start = new JButton("Start");
        start.setBounds(450,500,150,35);
        start.setBackground(Color.BLACK);
        start.setForeground(new Color(255,228,181));
        start.setFont(new Font("Times New Roman",Font.PLAIN,25));
        start.addActionListener(this);
        add(start);




        setSize(950,650);
        setLocation(350,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==start){
            new Quiz(name);
       }else{
           setVisible(false);
           new login();
       }
    }



    public static void main(String[] args) {
        new Rules("User");
    }
}
