import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
 TextField tf;
 Button bAdd,bExit,bDev,bMul,bSub,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPoint,bEqu,b00,bC,bDel,bSqu;
 String st;
 double db,ans;
 char opr;
  Calculator()
 {
  Color c=new Color(200,200,200); 
   tf=new TextField(50);
   bAdd=new Button("+");
   bExit=new Button("Exit");
   bDev=new Button("/");
   bSub=new Button("-");
   bMul=new Button("*");
   bPoint=new Button(".");
   bEqu=new Button("=");
   bC=new Button("C");
   bDel=new Button("Del.");
   bSqu=new Button("x²");
   b1=new Button("1");
   b2=new Button("2");
   b3=new Button("3");
   b4=new Button("4");
   b5=new Button("5");
   b6=new Button("6");
   b7=new Button("7");
   b8=new Button("8");
   b9=new Button("9"); 
   b0=new Button("0"); 
   b00=new Button("00"); 
 Font f=new Font("Arial",Font.BOLD,13);
 Font f2=new Font("Arial",Font.BOLD,17);
 
  setLayout(null);

  tf.setBounds(40,50,270,40);

  bC.setBounds(40,105,60,40);
  bDel.setBounds(110,105,60,40);
  bSqu.setBounds(180,105,60,40);
  bExit.setBounds(250,105,60,40);
  b7.setBounds(40,160,60,40);
  b8.setBounds(110,160,60,40);
  b9.setBounds(180,160,60,40);
  bMul.setBounds(250,160,60,40);
  b4.setBounds(40,220,60,40);
  b5.setBounds(110,220,60,40);
  b6.setBounds(180,220,60,40);
  bDev.setBounds(250,220,60,40);
  b1.setBounds(40,280,60,40);
  b2.setBounds(110,280,60,40);
  b3.setBounds(180,280,60,40);
  bSub.setBounds(250,280,60,40); 
  b0.setBounds(40,340,60,40); 
  bEqu.setBounds(180,340,60,40);         
  bAdd.setBounds(250,340,60,40);
  bPoint.setBounds(110,340,60,40);
  
  
  
  
 
  
  tf.setFont(f2);
  bAdd.setFont(f2);
  bPoint.setFont(f2);
  bMul.setFont(f2);
  bDev.setFont(f2);
  bSub.setFont(f2);
  bEqu.setFont(f2);
  bSqu.setFont(f2);
  bC.setFont(f2);
  bDel.setFont(f2);
  bExit.setFont(f2);
  b1.setFont(f2);
  b2.setFont(f2);
  b3.setFont(f2);
  b4.setFont(f2);
  b5.setFont(f2);
  b6.setFont(f2);
  b7.setFont(f2);
  b8.setFont(f2);
  b9.setFont(f2);
  b0.setFont(f2);
    
  add(tf);
  add(bAdd);
  add(bPoint);
  add(bSub);
  add(bDev);
  add(bMul);
  add(b1);
  add(b2);
  add(b3);
  add(b4);
  add(b5);
  add(b6);
  add(b7);
  add(b8);
  add(b9);
  add(b0);
  add(bEqu);
  add(bC);
  add(bDel);
  add(bSqu);
  add(bExit);
  
  bAdd.addActionListener(this);
  bSub.addActionListener(this);
  bMul.addActionListener(this);
  bDev.addActionListener(this);
  bC.addActionListener(this);
  bDel.addActionListener(this);
  bPoint.addActionListener(this); 
  b0.addActionListener(this);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  b9.addActionListener(this);
  bExit.addActionListener(this);
  bEqu.addActionListener(this);
  bSqu.addActionListener(this);

   
  }
   public void actionPerformed(ActionEvent ae)
  {
    
  if(ae.getSource()==bExit)
   {
    System.exit(0);
     }
  
  if(ae.getSource()==b0)
   {
     st=tf.getText(); 
    tf.setText(st+"0");
     }
  
  if(ae.getSource()==b1)
   {
     st=tf.getText();  
    tf.setText(st+"1");
     }
	
  if(ae.getSource()==b2)
   {											
     st=tf.getText();
    tf.setText(st+"2");
     }

  if(ae.getSource()==b3)
   {
      st=tf.getText();
    tf.setText(st+"3");
     }

  if(ae.getSource()==b4)
   {
    st=tf.getText();
   tf.setText(st+"4");
     }
	 
  if(ae.getSource()==b5)
   { 
     st=tf.getText();
    tf.setText(st+"5");
     }
  
  if(ae.getSource()==b6)
   {
     st=tf.getText();
    tf.setText(st+"6");
     }
 
  if(ae.getSource()==b7)
   {
    st=tf.getText();
     tf.setText(st+"7"); 
     }

  if(ae.getSource()==b8)
   {
    st=tf.getText();
     tf.setText(st+"8");
     }

  if(ae.getSource()==b9)
   {
     st=tf.getText();
     tf.setText(st+"9");
     } 

  if(ae.getSource()==bC)
   {
    tf.setText("");
     }

  if(ae.getSource()==bDel)
   {
      st=tf.getText();
      String st2="",st3;
     int l=st.length();
     int l2=l-1,i;
    for(i=0;i<l2;i++)
      { st3=Character.toString(st.charAt(i));
        st2=st2+st3;
        }
   tf.setText(st2);
     
     }

  if(ae.getSource()==bPoint)
   {
     st=tf.getText();
     if(st.contains(".")==false)
      tf.setText(st+".");
     }

    if(ae.getSource()==bAdd)
   {  
     opr='+';
      double val2;
      st=tf.getText();
      val2=Double.parseDouble(st);
      tf.setText("");
      db=val2+db;      
     }
 
  if(ae.getSource()==bEqu)
   {
      switch(opr)
        {
          case '+':st=tf.getText();
                   double val=Double.parseDouble(st);
                   db=val+db;
                   st=Double.toString(db);
                   tf.setText(st);
                   db=0;
                   opr='\0';
                    break;             
          
          case '-':st=tf.getText();
                   val=Double.parseDouble(st);
                   db=db-val;
                   st=Double.toString(db);
                   tf.setText(st);
                    db=0;
           	    opr='\0';
                     break;
            
            case '*':st=tf.getText();
                    val=Double.parseDouble(st);
                   db=val*db;
                   st=Double.toString(db);
                   tf.setText(st);
                     db=0;
                     opr='\0';
                      break;
              
           case '/':st=tf.getText();
                    val=Double.parseDouble(st);
                   db=db/val;
                   st=Double.toString(db);
                   tf.setText(st);
                     db=0;
                     opr='\0';
                      break;
     
          case '²': val=db;
                    db=db*db;
                    st=Double.toString(db);
                    tf.setText(st);
                    db=0;
                    opr='\0';
          } 
     
     }

   if(ae.getSource()==bSub)
   {
     opr='-';
      double val;
      st=tf.getText();
      val=Double.parseDouble(st);
      tf.setText("");
   if(db==0)
      {
     db=val;
       }
   else
     {
      db=db-val;
       }
      
    }

  if(ae.getSource()==bMul)
   {
     opr='*';
      double val;
      st=tf.getText();
      val=Double.parseDouble(st);
      tf.setText("");
      if(db==0)
       { 
         db=val;
          }
     else
       {
        db=db*val;
          }
   
     }

  if(ae.getSource()==bDev)
   {
    opr='/';
      double val;
      st=tf.getText();
      val=Double.parseDouble(st);
      tf.setText("");
      if(db==0)
       {
         db=val;
          }
    else
      {
       db=db/val;
        }
     } 

   if(ae.getSource()==bSqu)
   {
     opr='²';
    st=tf.getText();
    db=Double.parseDouble(st);
    tf.setText(st+"²");
     }



   if(ae.getSource()==bExit)
   {
    st=tf.getText();
    System.exit(0);
     }

    }
 
  
public static void main(String[] args)
 {   
   Color c=new Color(200,200,200);
  Calculator cl=new Calculator();
   cl.setTitle("Simple Calculator");
  cl.setSize(350,420);
 cl.setVisible(true);  
  cl.setBackground(c);
   }
 }