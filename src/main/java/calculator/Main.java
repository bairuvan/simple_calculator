/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.IOException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author bairuan
 */

public class Main extends javax.swing.JFrame {

 

    JTextField text;
    
    String button_number;

    JButton jButton1;
    
    JButton jButton2;
    
    JButton jButton3;
    
    JButton jButton4;
    
    JButton jButton5;
    
    JButton jButton6;
    
    JButton jButton7;
    
    JButton jButton8;
    
    JButton jButton9;
    
    JButton jButton0;
    
    JButton jButton_plus;
    
    JButton jButton_minus;
    
    JButton jButton_mutliply;
    
    JButton jButton_divide;
    
    JButton jButton_equals;
    
    JButton jButton_clear;
    
    String action = "beginning";
    
    int constant = 0;
    
    boolean error = false;

    public Main() throws IOException {

        InitComponent();

    }

 

    public static void main(String[] args) throws IOException {

        JFrame frame = new Main();

        frame.setVisible(true);

    }

 

    private void InitComponent() throws IOException {

        this.setSize(300, 200);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Box vbox = Box.createVerticalBox();

        Box hbox1 = Box.createHorizontalBox();
        

        text = new JTextField("");

        hbox1.add(text);

        vbox.add(hbox1);

        jButton1 = new JButton("1");

        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonActionPerformed(evt);

              
            }

        });
        
        jButton2 = new JButton("2");
        
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonActionPerformed(evt);

              
            }

        });
        
        jButton3 = new JButton("3");
        
        jButton3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonActionPerformed(evt);

              
            }

        });
        
        jButton4 = new JButton("4");
        
        jButton4.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonActionPerformed(evt);

              
            }

        });
        
        jButton5 = new JButton("5");
        
        jButton5.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonActionPerformed(evt);

              
            }

        });
        
        jButton6 = new JButton("6");
        
        jButton6.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonActionPerformed(evt);

              
            }

        });
        
        jButton7 = new JButton("7");
        
        jButton7.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonActionPerformed(evt);

              
            }

        });
        
        jButton8 = new JButton("8");
        
        jButton8.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonActionPerformed(evt);

              
            }

        });
        
        jButton9 = new JButton("9");
        
        jButton9.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonActionPerformed(evt);

              
            }

        });
        
        jButton0 = new JButton("0");
        
        jButton0.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonActionPerformed(evt);

              
            }

        });
        
        jButton_plus = new JButton("+");
        
        jButton_plus.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton_plusActionPerformed(evt);

              
            }

        });
        
        jButton_minus = new JButton("-");
        
        jButton_minus.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton_minusActionPerformed(evt);

              
            }

        });
        
        jButton_mutliply = new JButton("*");
        
        jButton_mutliply.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton_mutliplyActionPerformed(evt);

              
            }

        });
        
        jButton_divide= new JButton("/");
        
        jButton_divide.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton_divideActionPerformed(evt);

              
            }

        });
        
        jButton_equals = new JButton("=");
        
        jButton_equals.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton_equalActionPreformed(evt);

              
            }

        });
        
        jButton_clear = new JButton("C");
        
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton_clearActionPreformed(evt);

              
            }

        });
                

        Box hbox2 = Box.createHorizontalBox();

        hbox2.add(jButton1);
        
        hbox2.add(jButton2);
        
        hbox2.add(jButton3);
        
        hbox2.add(jButton_plus);

        vbox.add(hbox2);
        
        Box hbox3 = Box.createHorizontalBox();
        
        hbox3.add(jButton4);
        
        hbox3.add(jButton5);
        
        hbox3.add(jButton6);
        
        hbox3.add(jButton_minus);
        
        Box hbox4 = Box.createHorizontalBox();
        
        hbox4.add(jButton7);
        
        hbox4.add(jButton8);
        
        hbox4.add(jButton9);
        
        hbox4.add(jButton_divide);
        
        Box hbox5 = Box.createHorizontalBox();
        
        hbox5.add(jButton0);
        
        hbox5.add(jButton_clear);
                
        hbox5.add(jButton_equals);
        
        hbox5.add(jButton_mutliply);


        
        vbox.add(hbox3);
        vbox.add(hbox4);
        vbox.add(hbox5);

        this.add(vbox);

    }

 

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        button_number = evt.getActionCommand();    
        System.out.println("first value of text: " + text.getText());
        if (error){
            text.setText(button_number);
            constant = 0;
            error = false;
            action = "beginning";
        } else if (text.getText().equals("0")){
            System.out.println("inside fisrt if, text is: " + text.getText());
            text.setText(button_number);
        } else if (action.equals("+")){
                text.setText(button_number);
                action = "+_";
        } else if (action.equals("-")){
                text.setText(button_number);
                action = "-_"; 
        } else if (action.equals("*")){
                text.setText(button_number);
                action = "*_"; 
        } else if (action.equals("/")){
                text.setText(button_number);
                action = "/_";
        } else if (action.equals("=")){
                text.setText(button_number);
                action = "";
        } else{
            text.setText(text.getText() + button_number);
        }
        
        
    }
    
    private void jButton_plusActionPerformed(java.awt.event.ActionEvent evt){
        
        calculatepreviousconstant();
                
        action = "+";
    }
    
    private void jButton_minusActionPerformed(java.awt.event.ActionEvent evt){
        
        calculatepreviousconstant();
                
        action = "-";
    }
    
    private void jButton_mutliplyActionPerformed(java.awt.event.ActionEvent evt){
        
        calculatepreviousconstant();  
        
        action = "*";
    }
    
    private void jButton_divideActionPerformed(java.awt.event.ActionEvent evt){
        
        calculatepreviousconstant();
        
        action = "/";
    }
    
    private void jButton_equalActionPreformed(java.awt.event.ActionEvent evt){
        
        calculatepreviousconstant();
        
        if (! error){
            text.setText(Integer.toString(constant));
        }
        
        action = "=";
    }
    
    private void jButton_clearActionPreformed(java.awt.event.ActionEvent evt){
        
       text.setText("0");
       
       constant = 0;
       
       error = false;
               
       action = "beginning";
    }
    
    private void calculatepreviousconstant(){
        
        if (action.equals("beginning")){
                constant = Integer.parseInt(text.getText());
        } else if ((action.equals("+"))||(action.equals("+_"))){
                constant = constant + Integer.parseInt(text.getText());
        } else if ((action.equals("-"))||(action.equals("-_"))){
                constant = constant - Integer.parseInt(text.getText());
        } else if ((action.equals("*"))||(action.equals("*_"))){
                constant = constant * Integer.parseInt(text.getText());
        } else if ((action.equals("/"))||(action.equals("/_"))){
            if (text.getText().equals("0")){
                error = true;
                text.setText("error: can not divide by 0");
            } else
            constant = constant / Integer.parseInt(text.getText());
        } 
    }
}
