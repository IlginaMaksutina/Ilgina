package Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Digit  extends  JFrame{
    private int myNumber;
    private JTextField UserEntry;
    private JButton Button1;
    private JLabel labelResult;
    private JLabel HelpLabel;
    private JLabel ResultHelpLabel;

    public Digit() {
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Button1.getText()=="Начать заново!")
                {
                    Button1.setText("Угадай");
                    labelResult.setText("Сначала нажми кнопку!");
                    myNumber = generateNumber();
                    UserEntry.setText("0");
                }
                else {

                    String number = UserEntry.getText();
                    if (number.matches("\\d") == true) {
                        if (labelResult.getForeground()== Color.red)
                            labelResult.setForeground(HelpLabel.getForeground());


                        if (myNumber < Integer.valueOf(number)) {
                            labelResult.setText("Загаданное число меньше");
                        } else if (myNumber > Integer.valueOf(number)) {
                            labelResult.setText("Загаданное число больше");
                        } else if (myNumber == Integer.valueOf(number)) {
                            labelResult.setText("Вы угадали!!!");
                            Button1.setText("Начать заново!");
                        }
                    }
                    else
                    {
                        labelResult.setText("Введена не цифра!");
                        labelResult.setForeground(Color.red);
                    }

                }

            }
        });
        myNumber = generateNumber();
        
        setTitle("Урок 8. Угадай задуманное число");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 300, 500, 100);
        setLayout(new GridLayout(0, 3));

        add(HelpLabel);
        add(UserEntry);
        add(Button1);
        add(ResultHelpLabel);
        add(labelResult);

        setVisible(true);

    }

    private int generateNumber()
    {
        return  10 - (int)(Math.random() * 10.0D);
    }
}
