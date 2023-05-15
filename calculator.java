import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculator implements ActionListener {
    int O = 0;
    boolean isoperatorclicked = false;
    String oldvalue;
    JLabel displaylabel;
    JFrame jf;
    JButton sevenbutton;
    JButton eightbutton;
    JButton ninebutton;
    JButton fourbutton;
    JButton fivebutton;
    JButton sixbutton;
    JButton onebutton;
    JButton twobutton;
    JButton threebutton;
    JButton dotbutton;
    JButton zerobutton;
    JButton equalbutton;
    JButton divbutton;
    JButton mulbutton;
    JButton subbutton;
    JButton sumbutton;
    JButton clearbutton;

    public calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displaylabel = new JLabel();
        displaylabel.setBounds(30, 50, 540, 40);
        displaylabel.setBackground(Color.LIGHT_GRAY);
        displaylabel.setOpaque(true);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displaylabel.setForeground(Color.white);
        jf.add(displaylabel);

        sevenbutton = new JButton("7");
        sevenbutton.setBounds(30, 130, 80, 80);
        sevenbutton.addActionListener(this);
        jf.add(sevenbutton);
        eightbutton = new JButton("8");
        eightbutton.setBounds(130, 130, 80, 80);
        eightbutton.addActionListener(this);
        jf.add(eightbutton);
        ninebutton = new JButton("9");
        ninebutton.setBounds(230, 130, 80, 80);
        ninebutton.addActionListener(this);
        jf.add(ninebutton);
        fourbutton = new JButton("4");
        fourbutton.setBounds(30, 230, 80, 80);
        fourbutton.addActionListener(this);
        jf.add(fourbutton);
        fivebutton = new JButton("5");
        fivebutton.setBounds(130, 230, 80, 80);
        fivebutton.addActionListener(this);
        jf.add(fivebutton);
        sixbutton = new JButton("6");
        sixbutton.setBounds(230, 230, 80, 80);
        sixbutton.addActionListener(this);
        jf.add(sixbutton);
        onebutton = new JButton("1");
        onebutton.setBounds(30, 330, 80, 80);
        onebutton.addActionListener(this);
        jf.add(onebutton);
        twobutton = new JButton("2");
        twobutton.setBounds(130, 330, 80, 80);
        twobutton.addActionListener(this);
        jf.add(twobutton);
        threebutton = new JButton("3");
        threebutton.setBounds(230, 330, 80, 80);
        threebutton.addActionListener(this);
        jf.add(threebutton);
        dotbutton = new JButton(".");
        dotbutton.setBounds(30, 430, 80, 80);
        dotbutton.addActionListener(this);
        jf.add(dotbutton);
        zerobutton = new JButton("0");
        zerobutton.setBounds(130, 430, 80, 80);
        zerobutton.addActionListener(this);
        jf.add(zerobutton);
        equalbutton = new JButton("=");
        equalbutton.setBounds(230, 430, 80, 80);
        equalbutton.addActionListener(this);
        jf.add(equalbutton);
        divbutton = new JButton("/");
        divbutton.setBounds(330, 130, 80, 80);
        divbutton.addActionListener(this);
        jf.add(divbutton);
        mulbutton = new JButton("X");
        mulbutton.setBounds(330, 230, 80, 80);
        mulbutton.addActionListener(this);
        jf.add(mulbutton);
        subbutton = new JButton("-");
        subbutton.setBounds(330, 330, 80, 80);
        subbutton.addActionListener(this);
        jf.add(subbutton);
        sumbutton = new JButton("+");
        sumbutton.setBounds(330, 430, 80, 80);
        sumbutton.addActionListener(this);
        jf.add(sumbutton);
        clearbutton = new JButton("clear");
        clearbutton.setBounds(430, 430, 80, 80);
        clearbutton.addActionListener(this);
        jf.add(clearbutton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenbutton) {
            if (isoperatorclicked) {
                displaylabel.setText("7");
                isoperatorclicked = false;
            } else
                displaylabel.setText(displaylabel.getText() + "7");
        } else if (e.getSource() == eightbutton) {
            if (isoperatorclicked) {
                displaylabel.setText("8");
                isoperatorclicked = false;
            } else
                displaylabel.setText(displaylabel.getText() + "8");
        } else if (e.getSource() == ninebutton) {
            if (isoperatorclicked) {
                displaylabel.setText("9");
                isoperatorclicked = false;
            } else
                displaylabel.setText(displaylabel.getText() + "9");
        } else if (e.getSource() == fourbutton) {
            if (isoperatorclicked) {
                displaylabel.setText("4");
                isoperatorclicked = false;
            } else
                displaylabel.setText(displaylabel.getText() + "4");
        } else if (e.getSource() == fivebutton) {
            if (isoperatorclicked) {
                displaylabel.setText("5");
                isoperatorclicked = false;
            } else
                displaylabel.setText(displaylabel.getText() + "5");
        } else if (e.getSource() == sixbutton) {
            if (isoperatorclicked) {
                displaylabel.setText("6");
                isoperatorclicked = false;
            } else
                displaylabel.setText(displaylabel.getText() + "6");
        } else if (e.getSource() == onebutton) {
            if (isoperatorclicked) {
                displaylabel.setText("1");
                isoperatorclicked = false;
            } else
                displaylabel.setText(displaylabel.getText() + "1");
        } else if (e.getSource() == twobutton) {
            if (isoperatorclicked) {
                displaylabel.setText("2");
                isoperatorclicked = false;
            } else
                displaylabel.setText(displaylabel.getText() + "2");
        } else if (e.getSource() == threebutton) {
            if (isoperatorclicked) {
                displaylabel.setText("3");
                isoperatorclicked = false;
            } else
                displaylabel.setText(displaylabel.getText() + "3");
        } else if (e.getSource() == divbutton) {
            isoperatorclicked = true;
            oldvalue = displaylabel.getText();
            displaylabel.setText("");
            O = 1;
        } else if (e.getSource() == mulbutton) {
            isoperatorclicked = true;
            oldvalue = displaylabel.getText();
            displaylabel.setText("");
            O = 2;
        } else if (e.getSource() == subbutton) {
            isoperatorclicked = true;
            oldvalue = displaylabel.getText();
            displaylabel.setText("");
            O = 3;
        } else if (e.getSource() == sumbutton) {
            isoperatorclicked = true;
            oldvalue = displaylabel.getText();
            displaylabel.setText("");
            O = 4;
        } else if (e.getSource() == dotbutton) {
            displaylabel.setText(displaylabel.getText() + ".");
        } else if (e.getSource() == zerobutton) {
            displaylabel.setText(displaylabel.getText() + "0");
        } else if (e.getSource() == equalbutton) {
            String newvalue = displaylabel.getText();
            if (O == 1) {
                float oldvalueF = Float.parseFloat(oldvalue);
                float newvalueF = Float.parseFloat(newvalue);
                if (newvalueF != 0) {
                    float result = oldvalueF / newvalueF;
                    String s = Float.toString(result);
                    displaylabel.setText(s);
                } else
                    displaylabel.setText("devision by zero not possible");
            } else if (O == 2) {
                float oldvalueF = Float.parseFloat(oldvalue);
                float newvalueF = Float.parseFloat(newvalue);
                float result = oldvalueF * newvalueF;
                String s = Float.toString(result);
                displaylabel.setText(s);
            } else if (O == 3) {
                float oldvalueF = Float.parseFloat(oldvalue);
                float newvalueF = Float.parseFloat(newvalue);
                float result = oldvalueF - newvalueF;
                String s = Float.toString(result);
                displaylabel.setText(s);
            } else if (O == 4) {
                float oldvalueF = Float.parseFloat(oldvalue);
                float newvalueF = Float.parseFloat(newvalue);
                float result = oldvalueF + newvalueF;
                String s = Float.toString(result);
                displaylabel.setText(s);
            }

        } else if (e.getSource() == clearbutton) {
            displaylabel.setText("");
        }
    }

    public static void main(String args[]) {
        new calculator();
    }
}