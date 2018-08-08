package frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class cconv extends JApplet implements ActionListener{
    JTextField t1,t2;
    JButton b1,b2;
    JComboBox c1,c2;
    String[] currency={"US Dollar","Indian Rupee","British Pound","Euro","Canadian Dollar","Emirati Driham","Chinese Yaun"};
    public void init(){
        try{SwingUtilities.invokeAndWait(new Runnable(){
            public void run(){
                makeGUI();
             }
         });
      }catch(Exception exc){System.out.println("Error occured due to"+exc);}
   }
private void makeGUI(){
    GridBagLayout gbag=new GridBagLayout();
    GridBagConstraints gbc=new GridBagConstraints();
    setLayout(gbag);
    c1=new JComboBox(currency);
    c1.setSelectedIndex(0);
    c2=new JComboBox(currency);
    c2.setSelectedIndex(1);
    t1=new JTextField(10);
    t2=new JTextField(10);
    b1=new JButton("Convert");
    b2=new JButton("Clear");
    JLabel h=new JLabel("Currency Converter");
    JLabel l1=new JLabel("Select the Input Currency:");
    JLabel l2=new JLabel("Enter the amount:  ");
    JLabel l3=new JLabel("Select the Output Currency:");
    JLabel l4=new JLabel("Converted amount:  ");
    
    gbc.weighty=1.0;
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    gbc.anchor=GridBagConstraints.NORTH;
    gbag.setConstraints(h, gbc);
     
    gbc.anchor=GridBagConstraints.EAST;
     
    gbc.gridwidth=GridBagConstraints.RELATIVE;
    gbag.setConstraints(l1, gbc);
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    gbag.setConstraints(c1, gbc);
    gbc.gridwidth=GridBagConstraints.RELATIVE;
    gbag.setConstraints(l2, gbc);
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    gbag.setConstraints(t1, gbc);
    gbc.gridwidth=GridBagConstraints.RELATIVE;
    gbag.setConstraints(l3, gbc);
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    gbag.setConstraints(c2, gbc);
    gbc.gridwidth=GridBagConstraints.RELATIVE;
    gbag.setConstraints(l4, gbc);
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    gbag.setConstraints(t2, gbc);
    gbc.anchor=GridBagConstraints.CENTER;
    gbag.setConstraints(b1, gbc);
    gbc.gridwidth=GridBagConstraints.CENTER;
    gbag.setConstraints(b2, gbc);
     
    add(h);add(l1);add(c1);add(l2);add(t1);add(l3);add(c2);add(b1);add(l4);add(t2);add(b2);
     
    t1.addActionListener(this);
    t2.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    c1.addActionListener(this);
    c2.addActionListener(this);
    }
public void actionPerformed(ActionEvent ae){
    double a,b,c=0;
    a=Double.valueOf(t1.getText());
    try{
        if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==1){ //US Dollar to Indian Rupee
            c= a*60.335456;}
        if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==2){ //US Dollar to British Pound
            c= a*0.595194;}
        if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==3){ //US Dollar to Euro
            c= a*0.723333;}
        if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==4){ //US Dollar to Canadian Dollar
            c= a*1.099742;}
        if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==5){ //US Dollar to Emirati Driham
            c= a*3.672939;}
        if(c1.getSelectedIndex()==0 & c2.getSelectedIndex()==6){ //US Dollar to Chinese Yaun
            c= a*6.221082;}
        if(c1.getSelectedIndex()==1 & c2.getSelectedIndex()==0){ //Indian Rupee to US Dollar
            c= a*0.016574;}
        if(c1.getSelectedIndex()==1 & c2.getSelectedIndex()==2){ //Indian Rupee to British Pound
            c= a*0.009868;}
        if(c1.getSelectedIndex()==1 & c2.getSelectedIndex()==3){ //Indian Rupee to Euro
            c= a*0.011992;}
        if(c1.getSelectedIndex()==1 & c2.getSelectedIndex()==4){ //Indian Rupee to Canadian Dollar
            c= a*0.018234;}
        if(c1.getSelectedIndex()==1 & c2.getSelectedIndex()==5){ //Indian Rupee to Emirati Driham
            c= a*0.060880;}
        if(c1.getSelectedIndex()==1 & c2.getSelectedIndex()==6){ //Indian Rupee to Chinese Yaun
            c= a*0.103114;}
        if(c1.getSelectedIndex()==2 & c2.getSelectedIndex()==0){ //British Pound to US Dollar 
            c= a*1.679949;}
        if(c1.getSelectedIndex()==2 & c2.getSelectedIndex()==1){//British Pound to Indain Rupee
            c= a*101.251087;}
        if(c1.getSelectedIndex()==2 & c2.getSelectedIndex()==3){ //British Pound to Euro
            c= a*1.215237;}
        if(c1.getSelectedIndex()==2 & c2.getSelectedIndex()==4){ //British Pound to Canadian Dollar
            c= a*1.848254;}
        if(c1.getSelectedIndex()==2 & c2.getSelectedIndex()==5){ //British Pound to Emirati Driham
            c= a*6.170453;}
        if(c1.getSelectedIndex()==2 & c2.getSelectedIndex()==6){ //British Pound to Chinese Yaun
            c= a*10.449975;}
        if(c1.getSelectedIndex()==3 & c2.getSelectedIndex()==0){ //Euro to US Dollar
            c= a*1.382656;}
        if(c1.getSelectedIndex()==3 & c2.getSelectedIndex()==1){ //Euro to Indian Rupee
            c= a*83.332669;}
        if(c1.getSelectedIndex()==3 & c2.getSelectedIndex()==2){ //Euro to British Pound
            c= a*0.822930;}
        if(c1.getSelectedIndex()==3 & c2.getSelectedIndex()==4){ //Euro to Canadian Dollar
            c= a*1.52083;}
        if(c1.getSelectedIndex()==3 & c2.getSelectedIndex()==5){ //Euro to Emirati Driham
            c= a*5.078644;}
        if(c1.getSelectedIndex()==3 & c2.getSelectedIndex()==6){ //Euro to Chinese Yaun
            c= a*8.600954;}
        if(c1.getSelectedIndex()==4 & c2.getSelectedIndex()==0){ //Canadian Dollar to US Dollar
            c= a*0.909156;}
        if(c1.getSelectedIndex()==4 & c2.getSelectedIndex()==1){ //Canadian Dollar to Indian Rupee
            c= a*54.794847;}
        if(c1.getSelectedIndex()==4 & c2.getSelectedIndex()==2){ //Canadian Dollar to British Pound
            c= a*0.541034;}
        if(c1.getSelectedIndex()==4 & c2.getSelectedIndex()==3){ //Canadian Dollar to Euro
            c= a*0.657569;}
        if(c1.getSelectedIndex()==4 & c2.getSelectedIndex()==5){ //Canadian Dollar to Emirati Driham
            c= a*3.339467;}
        if(c1.getSelectedIndex()==4 & c2.getSelectedIndex()==6){ //Canadian Dollar to Chinese Yaun
            c= a*5.655489;}
        if(c1.getSelectedIndex()==5 & c2.getSelectedIndex()==0){ //Emirati Driham to US Dollar
            c= a*0.272260;}
        if(c1.getSelectedIndex()==5 & c2.getSelectedIndex()==1){ //Emirati Driham to Indian Rupee
            c= a*16.409082;}
        if(c1.getSelectedIndex()==5 & c2.getSelectedIndex()==2){ ////Emirati Driham to British Pound
            c= a*0.162022;}
        if(c1.getSelectedIndex()==5 & c2.getSelectedIndex()==3){ ////Emirati Driham to Euro
            c= a*0.196942;}
        if(c1.getSelectedIndex()==5 & c2.getSelectedIndex()==4){//Emirati Driham to Canadian Dollar
            c= a*0.299497;}
        if(c1.getSelectedIndex()==5 & c2.getSelectedIndex()==6){ //Emirati Driham to Chinese Yaun
            c= a*1.693525;}
        if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==0){ //Chinese Yaun to US Dollar
            c= a*0.160762;}
        if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==1){//Chinese Yaun to Indian Rupee
            c= a*9.689100;}
        if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==2){//Chinese Yaun to British Pound
            c= a*0.095673;}
        if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==3){//Chinese Yaun to Euro
            c= a*0.116292;}
        if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==4){//Chinese Yaun to Canadian Dollar
            c= a*0.176855;}
        if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==5){//Chinese Yaun to Emirati Driham
            c= a*0.590495;}
        t2.setText(String.valueOf(c));
        }catch(Exception x){System.out.println("Error");}
    if(ae.getSource()==b2){
        t1.setText("0000");
        t2.setText("0000");}    
   }
}