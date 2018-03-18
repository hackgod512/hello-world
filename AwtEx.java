import java.awt.*;
import java.awt.event.*;
public class AwtEx extends Frame {
    class A implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int n=n1+n2;
        String s3=String.valueOf(n);
        l5.setText(s3);
        }
        
    }
    class B implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int n=n1-n2;
        String s3=String.valueOf(n);
        l5.setText(s3);
        }
        
    }class C implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int n=n1*n2;
        String s3=String.valueOf(n);
        l5.setText(s3);
        }
        
    }class D implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int n=n1/n2;
        String s3=String.valueOf(n);
        l5.setText(s3);
        }
        
    }class E implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int n=n1%n2;
        String s3=String.valueOf(n);
        l5.setText(s3);
        }
        
    }
	Frame f;
	Panel p;
    Button b;
    Label l1;
    Label l2,l3,l5;
    TextField tf1;
    TextField tf2;
    Button b1,b2,b3,b4,b5;
    public AwtEx(){
    	setTitle("Myframe");
    	setLayout(null);
    	setSize(600,400);
    	setBackground(Color.WHITE);
    	setVisible(true);
    	p=new Panel();
    	p.setLayout(null);
    	p.setBackground(Color.YELLOW);
    	p.setBounds(50,50,500,260);
    	add(p);
    	l1=new Label("1st Number");
    	l1.setBounds(50,10,100,80);
    	p.add(l1);
    	tf1=new TextField();
    	tf1.setBounds(200,40,150,30);
    	p.add(tf1);
    	l2=new Label("2nd Number");
    	l2.setBounds(50,100,100,80);
    	p.add(l2);
    	tf2=new TextField();
    	tf2.setBounds(200,120,150,30);
    	p.add(tf2);
        b1=new Button("+");
        b1.setBounds(50,180,40,40);
        b1.addActionListener(new A());
        b2=new Button("-");
        b2.setBounds(150,180,40,40);
        b2.addActionListener(new B());
        b3=new Button("*");
        b3.setBounds(250,180,40,40);
        b3.addActionListener(new C());
        b4=new Button("/");
        b4.setBounds(350,180,40,40);
        b4.addActionListener(new D());
        b5=new Button("%");
        b5.setBounds(450,180,40,40);
        b5.addActionListener(new E());
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        l3=new Label("Answer      = ");
        l3.setBounds(100,310,90,80);
        l3.setForeground(Color.red);
        l5=new Label("_________");
        l5.setBounds(210,310,190,80);
        l5.setForeground(Color.red);
        add(l3);
        add(l5);
    	
    	
    	
    }
    public static void main(String args[]){
        AwtEx g1=new AwtEx();
       
    }
}
