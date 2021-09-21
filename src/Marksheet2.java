import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
public class Marksheet extends Frame implements ActionListener{ 
	JFrame f;
	JLabel trollyL1,trollyL2,java,vb,oracle,php,c,obtain,total,per,grade;
	JTextField	java_tf,vb_tf,oracle_tf,php_tf,c_tf,obtain_tf,total_tf,per_tf,grade_tf;  
    JButton calc,exit,clear,about;  
    Marksheet2(){  
		f=new JFrame("Trolly Load");
		f.setBounds(0,0,1000,1000);
		
		trollyL1=new JLabel("Sindhiana Transport Co.");
		trollyL1.setBounds(140,20,250,50);
		Font font1=new Font("Old English Text MT",Font.ITALIC,25);
		trollyL1.setFont(font1);

		trollyL2=new JLabel("Marksheet");
		trollyL2.setBounds(190,40,300,50);
		Font font2=new Font("Old English Text MT",Font.ITALIC,25);
		trollyL2.setFont(font2);		
		
		java=new JLabel("Enter java marks");
		java.setBounds(10,100,200,20);
		
		vb=new JLabel("Enter vb marks");
		vb.setBounds(10,150,200,20);
		
		oracle=new JLabel("Enter oracle marks");
		oracle.setBounds(10,200,200,20);	
				
		php=new JLabel("Enter php marks");
		php.setBounds(10,250,200,20);		
		
		c=new JLabel("Enter c marks");
		c.setBounds(10,300,200,20);		
		
		obtain=new JLabel("Obtain");
		obtain.setBounds(10,350,200,20);
		
		total=new JLabel("Total");
		total.setBounds(10,400,200,20);		

		per=new JLabel("Percentage");
		per.setBounds(10,450,200,20);

		grade=new JLabel("Grade");
		grade.setBounds(10,500,200,20);
		
        java_tf=new JTextField();  
        java_tf.setBounds(200,100,200,20);
		
        vb_tf=new JTextField();  
        vb_tf.setBounds(200,150,200,20); 
			//vb_tf.setEditable(false);  
        oracle_tf=new JTextField();  
        oracle_tf.setBounds(200,200,200,20);		
			//oracle_tf.setEditable(false);  
        php_tf=new JTextField();  
        php_tf.setBounds(200,250,200,20);		
			//php_tf.setEditable(false);  
        c_tf=new JTextField();  
        c_tf.setBounds(200,300,200,20);		
			//c_tf.setEditable(false);  
        obtain_tf=new JTextField();  
        obtain_tf.setBounds(200,350,200,20);		 
			obtain_tf.setEditable(false);  

		total_tf=new JTextField();
		total_tf.setBounds(200,400,200,20);		
			total_tf.setEditable(false); 
		per_tf=new JTextField();
		per_tf.setBounds(200,450,200,20);
			per_tf.setEditable(false); 
		grade_tf=new JTextField();
		grade_tf.setBounds(200,500,200,20);
			grade_tf.setEditable(false); 
        calc=new JButton("Calculate");  
        calc.setBounds(500,325,150,20);  
		
		exit=new JButton("EXIT");
		exit.setBounds(100,600,100,40);
		
		clear=new JButton("CLEAR");
		clear.setBounds(200,600,100,40);
		
		about=new JButton("ABOUT");
		about.setBounds(300,600,100,40);
		
		calc.addActionListener(this);
		exit.addActionListener(this);
		clear.addActionListener(this);
		about.addActionListener(this);
		
		f.add(trollyL1);
		f.add(trollyL2);
		f.add(java);
		f.add(vb);
		f.add(oracle);
		f.add(php); 
		f.add(c);
		f.add(obtain);
		f.add(total);
		f.add(per);
		f.add(grade);
		f.add(java_tf);
		f.add(vb_tf);
		f.add(oracle_tf);
		f.add(php_tf);
		f.add(c_tf);
		f.add(obtain_tf);
		f.add(total_tf);
		f.add(per_tf);
		f.add(grade_tf);
		f.add(calc);
		f.add(exit);
		f.add(clear);
		f.add(about);
		
        setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true); 
		f.show();
	}
	private void clear()
	{
		java_tf.setText("");
		vb_tf.setText("");
		oracle_tf.setText("");
		php_tf.setText("");
		c_tf.setText("");
		obtain_tf.setText("");
		total_tf.setText("");
		per_tf.setText("");
		grade_tf.setText("");
	}			
             
    public void actionPerformed(ActionEvent z) {  
 
        if(calc==z.getSource()){  
		String s1=java_tf.getText();  
        int java_m=Integer.parseInt(s1);
		String s2=vb_tf.getText();
		int vb_m=Integer.parseInt(s2);
		String s3=oracle_tf.getText();  
        int oracle_m=Integer.parseInt(s3);
		String s4=php_tf.getText();  
        int php_m=Integer.parseInt(s4);
		String s5=java_tf.getText();  
        int c_m=Integer.parseInt(s5);	
		double a=java_m+vb_m+oracle_m+php_m+c_m;
			obtain_tf.setText(""+(a));
		double b=500;
			total_tf.setText(""+(b));
		double c=a*100/500;
			per_tf.setText(""+(c));
	if(c>100)
	grade_tf.setText(""+("Overflow"));
	else
		if(c>=90)
		grade_tf.setText(""+("A1"));
		else
			if(c>=80)
			grade_tf.setText(""+("A"));
			else
				if(c>=70)
				grade_tf.setText(""+("B"));
				else
					if(c>=60)
					grade_tf.setText(""+("C"));
					else
						if(c>=50)
						grade_tf.setText(""+("D"));				
						else
							if(c>=40)
							grade_tf.setText(""+("E"));
							else
								grade_tf.setText(""+("Fail"));			
			

        } 
		if(clear==z.getSource()){
			clear();
		}
		if(exit==z.getSource()){
			System.exit(0);
		}
		if(about==z.getSource()){
			JOptionPane.showMessageDialog(null,"Name: Danish Azeem \nOrganization: Muet \nContact: 03066558872");
		}				
    }  
public static void main(String[] args) {  
    new Marksheet2();  
}  
}  