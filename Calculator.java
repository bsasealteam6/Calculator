import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

@SuppressWarnings("unused")
public class Calculator extends JFrame implements ActionListener{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public static JTextArea TextAreaNumber;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, C,MC,MR;
    private JButton times, divide, equals, pi, sqrt, square, /*parenOpen, parenClose,*/ percent, factorial;
    private JButton power, decimal, MP,neg,MM,sin,tan,cos,csc,cot,sec,isin,icos,itan,icsc,isec,icot;
    private JButton mod, inverse,en,ep,randint,rand, pythag, sphereVol, cToF, fToC;
    private JPanel panel,panel2,panel3/*,panel4*/;
    static Boolean p;
    private GridBagConstraints c = new GridBagConstraints();
    //  private 
    private double x, y, z, M;

    String func;
    Calculator(){

        super("Calculator");
        init();
        //      this.setSize(1000,1000);
        this.pack();
        this.setVisible(true);

    }

    public static void setText(Double b){
        Functions.setText(Double.toString(b));
    }

    public static void setText(String b){
        Functions.setText((b));
    }

    public static double getNum(){
        return Functions.getNum();
    }

    public static void append(int we){

        if(Double.parseDouble(TextAreaNumber.getText())==0||p){
            Functions.setText(Integer.toString(we));
            p=false;
        }
        else{
            TextAreaNumber.append(Integer.toString(we));
        }
    }

    private void addActionListeners()
    {
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        times.addActionListener(this);
        divide.addActionListener(this);
        equals.addActionListener(this);
        pi.addActionListener(this);
        sqrt.addActionListener(this);
        square.addActionListener(this);
        //      parenOpen.addActionListener(this);
        //      parenClose.addActionListener(this);
        percent.addActionListener(this);
        factorial.addActionListener(this);
        power.addActionListener(this);
        decimal.addActionListener(this);
        C.addActionListener(this);
        MP.addActionListener(this);
        MC.addActionListener(this);
        MR.addActionListener(this);
        MM.addActionListener(this);
        neg.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        csc.addActionListener(this);
        sec.addActionListener(this);
        cot.addActionListener(this);
        isin.addActionListener(this);
        icos.addActionListener(this);
        itan.addActionListener(this);
        icsc.addActionListener(this);
        isec.addActionListener(this);
        icot.addActionListener(this);
        mod.addActionListener(this);
        inverse.addActionListener(this);
        en.addActionListener(this);
        ep.addActionListener(this);
        rand.addActionListener(this);
        randint.addActionListener(this);
        fToC.addActionListener(this);
        cToF.addActionListener(this);
        pythag.addActionListener(this);
    }

    private void initButtons()
    {
        neg=new JButton("±");
        MP=new JButton("M+");
        MC=new JButton("MC");
        MM=new JButton("M-");
        MR=new JButton("MR");
        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        seven=new JButton("7");
        eight=new JButton("8");
        nine=new JButton("9");
        zero=new JButton("0");
        plus=new JButton("+");
        minus=new JButton("-");
        times=new JButton("X");
        divide=new JButton("\u00F7");
        equals=new JButton("=");
        pi=new JButton("\u03C0");
        sqrt=new JButton("\u221Ax");
        square=new JButton("x\u00B2");
        C=new JButton("C");
        //      parenOpen=new JButton("(");
        //      parenClose=new JButton(")");
        percent=new JButton("%");
        factorial=new JButton("x!");
        power=new JButton("x\u207F");
        decimal=new JButton(".");
        sin=new JButton("sin(x)");
        cos=new JButton("cos(x)");
        tan=new JButton("tan(x)");
        csc=new JButton("csc(x)");
        sec=new JButton("sec(x)");
        cot=new JButton("cot(x)");
        isin=new JButton("sin\u207B\u00B9(x)");
        icos=new JButton("cos\u207B\u00B9(x)");
        itan=new JButton("tan\u207B\u00B9(x)");
        icsc=new JButton("csc\u207B\u00B9(x)");
        isec=new JButton("sec\u207B\u00B9(x)");
        icot=new JButton("cot\u207B\u00B9(x)");
        mod =new JButton("Mod");
        inverse=new JButton("x\u207B\u00B9");
        en=new JButton("e");
        ep=new JButton("e\u207F");
        rand=new JButton("Rand");
        randint = new JButton("RandInt");
        fToC = new JButton("\u00B0F to \u00B0C");
        cToF = new JButton("\u00B0C to \u00b0F");
        pythag = new JButton("a\u00B2 + b\u00B2");
    }

    private void setColors()
    {
        one.setBackground(Color.red);
        two.setBackground(Color.red);
        three.setBackground(Color.red);
        four.setBackground(Color.red);
        five.setBackground(Color.red);
        six.setBackground(Color.red);
        seven.setBackground(Color.red);
        eight.setBackground(Color.red);
        nine.setBackground(Color.red);
        zero.setBackground(Color.red);
        plus.setBackground(Color.red);
        minus.setBackground(Color.red);
        times.setBackground(Color.red);
        divide.setBackground(Color.red);
        equals.setBackground(Color.red);
        pi.setBackground(Color.red);
        sqrt.setBackground(Color.red);
        square.setBackground(Color.red);
        percent.setBackground(Color.red);
        factorial.setBackground(Color.red);
        power.setBackground(Color.red);
        decimal.setBackground(Color.red);
        C.setBackground(Color.red);
        MP.setBackground(Color.red);
        MC.setBackground(Color.red);
        MR.setBackground(Color.red);
        MM.setBackground(Color.red);
        neg.setBackground(Color.red);
        panel.setBackground(Color.BLACK);
        panel2.setBackground(Color.BLACK);
    }

    private void setupPanels()
    {
        //Adds the buttons in a layout to the panel for the Number display
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        panel2.add(TextAreaNumber, c);
        //Adds the buttons in a layout to the panel for the controls 
        c.gridwidth = 1;
        c.gridy=0;
        c.gridx=0;
        panel.add(MC);
        c.gridy=0;
        c.gridx=1;
        panel.add(MP);
        c.gridx=2;
        panel.add(MM);
        c.gridx=3;
        panel.add(MR);

        c.gridy=1;
        c.gridx=0;
        panel.add(C,c);
        c.gridx=1;
        c.gridy=1;
        panel.add(neg,c);
        c.gridx=2;
        panel.add(divide,c);
        c.gridx=3;
        panel.add(times,c);
        c.gridx = 0;
        c.gridy=2;
        panel.add(one, c);

        c.gridx = 1;
        //c.gridy = 2;
        panel.add(two, c);

        c.gridx = 2;
        //      c.gridy = 2;
        panel.add(three, c);

        c.gridx = 3;
        panel.add(plus, c);

        c.gridx = 0;
        c.gridy = 3;
        panel.add(four, c);

        c.gridx=1;
        panel.add(five,c);

        c.gridx=2;
        panel.add(six,c);

        c.gridx=3;
        panel.add(minus,c);

        c.gridy=4;
        c.gridx=0;
        panel.add(seven,c);

        c.gridx=1;
        panel.add(eight,c);

        c.gridx=2;
        panel.add(nine ,c);

        c.gridx=0;
        c.gridy=5;
        c.gridwidth=2;
        panel.add(zero,c);

        c.gridwidth=1;

        c.gridx=2;
        panel.add(decimal,c);

        c.gridheight=2;
        c.gridx=3;
        c.gridy=4;
        panel.add(equals,c);

        c.gridheight=1;
        c.gridx=0;
        c.gridy=6;
        panel.add(factorial,c);

        c.gridx=1;
        panel.add(pi,c);

        c.gridx=2;
        panel.add(square,c);

        c.gridx=3;
        panel.add(power,c);

        c.gridy=7;
        c.gridx=0;
        c.gridwidth=2;
        panel.add(sin,c);
        c.gridx=2;
        panel.add(csc,c);
        c.gridy=8;
        c.gridx=0;
        panel.add(cos,c);
        c.gridx=2;
        panel.add(sec,c);
        c.gridy=9;
        c.gridx=0;
        panel.add(tan,c);
        c.gridx=2;
        panel.add(cot,c);
        c.gridy=10;
        c.gridx=0;
        panel.add(isin,c);
        c.gridx=2;
        panel.add(icsc,c);
        c.gridy=11;
        c.gridx=0;
        panel.add(icos,c);
        c.gridx=2;
        panel.add(isec,c);
        c.gridy=12;
        c.gridx=0;
        panel.add(itan,c);
        c.gridx=2;
        panel.add(icot,c);
        c.gridwidth=1;
        c.gridx=0;
        c.gridy=13;
        panel.add(mod,c);
        c.gridx=1;
        panel.add(sqrt,c);
        c.gridx=2;
        panel.add(inverse,c);
        c.gridx=3;
        panel.add(en,c);
        c.gridy=14;
        c.gridx=0;
        panel.add(ep,c);
        c.gridx=1;
        panel.add(rand,c);
        c.gridx=2;
        c.gridwidth=2;
        panel.add(randint,c);
        c.gridy = 15;
        c.gridx=0;
        panel.add(cToF,c);
        c.gridx=2;
        panel.add(fToC,c);
        c.gridy=16;
        c.gridx=0;
        panel.add(pythag);
    }

    private void init(){

        p=false; //Used to identify if need to append or replace
        M=0; //The variable that the M value is stored in

        //Makes the panels that make up the structure of the GUI

        panel=new JPanel(new GridBagLayout());
        panel2=new JPanel();
        panel3=new JPanel(new GridBagLayout());
        //      panel4=new JPanel();
        TextAreaNumber=new JTextArea(1,20);
        Functions.setText(Integer.toString(0));
        TextAreaNumber.setEditable(false);

        //Initializes Display
        initButtons();
        addActionListeners();
        //setColors();
        setupPanels();
        //Combines the panels to one panel
        c.gridwidth=1;
        c.gridx=0;
        c.gridy=1;
        panel3.add(panel,c);

        c.gridx=0;
        c.gridy=0;
        panel3.add(panel2,c);
        //Adds that panel to the JFrame
        this.add(panel3);
    }

    @Override
    //  Determines what button is pushed
    public void actionPerformed(ActionEvent e){
        if (Calculator.TextAreaNumber.getText().contains("i")){
            clearText();
        }

        if (e.getSource()==one){
            append(1);
        }
        else if (e.getSource()==two){
            append(2);
        }
        else if (e.getSource()==three){
            append(3);
        }
        else if (e.getSource()==four){
            append(4);
        }
        else if (e.getSource()==five){
            append(5);
        }
        else if (e.getSource()==six){
            append(6);
        }
        else if (e.getSource()==seven){
            append(7);
        }
        else if (e.getSource()==eight){
            append(8);
        }
        else if (e.getSource()==nine){
            append(9);
        }
        else if (e.getSource()==zero){
            append(0);
        }
        else if (e.getSource()==plus){
            x=Functions.getNum();

            func="plus";
        }
        else if (e.getSource()==minus){
            x=Functions.getNum();
            func="minus";
        }
        else if (e.getSource()==times){
            x=Functions.getNum();
            func="times";
        }
        else if (e.getSource()==divide){
            x=Functions.getNum(); 
            func="divide";
        }
        else if (e.getSource()==equals){
            y=Functions.getNum();
            setText(Functions.solve(func,x,y));
            Functions.print(Functions.solve(func,x,y));
            p=true;
        }
        else if (e.getSource()==pi){
            x=Functions.getNum();
            if (x==0){
                setText(Math.PI);
            }
            else {
                setText(Functions.solve("times",Math.PI,x));
            }
        }
        else if (e.getSource()==sqrt){
            func="sqrt";
            x=Functions.getNum();
            if (x < 0){
                setText(("i" + String.valueOf(Functions.solve(func,-x,x))));
                //Functions.print("i" + String.valueOf(Functions.solve(func,-x,x)));
                TextAreaNumber.update(TextAreaNumber.getGraphics());
            }
            else {
                setText(Functions.solve(func,x,x));
                //Functions.print(Functions.solve(func,x,x));
                TextAreaNumber.update(TextAreaNumber.getGraphics());
            }

        }
        else if (e.getSource()==square){
            func="times";
            x=Functions.getNum();
            z=Functions.solve(func,x,x);
            //             Functions.print(z);
            setText(z);
        }
        //      else if (e.getSource()==parenOpen){
        //          TextAreaNumber.append("(");
        //      }
        //      else if (e.getSource()==parenClose){
        //          TextAreaNumber.append(")");
        //      }
        else if (e.getSource()==percent){
            setText(getNum()/100);
        }
        else if (e.getSource()==factorial){
            x=Functions.getNum();
            func="fact";
            z=Functions.solve(func,x,x);
            setText(z);
        }
        else if (e.getSource()==power){
            func="pow";
            x=getNum();
        }
        else if (e.getSource()==decimal){
            TextAreaNumber.append(".");
        }
        else if (e.getSource()==C){
            clearText();
        }
        else if (e.getSource()==MP){
            M=M+getNum();
        }
        else if (e.getSource()==MM){
            M=M-getNum();
        }
        else if (e.getSource()==MR){
            setText(M);
        }
        else if (e.getSource()==MC){
            M=0;
        }
        else if (e.getSource()==neg){
            if(Double.parseDouble(TextAreaNumber.getText())%1==0){
                setText(Integer.parseInt(TextAreaNumber.getText())*(0-1));
            }
            else{
                setText(Double.parseDouble(TextAreaNumber.getText())*(0-1));
            }
        }
        else if (e.getSource()==sin){
            setText(Functions.solve("sin", getNum(), 0));
        }
        else if (e.getSource()==cos){
            setText(Functions.solve("cos",getNum(),0));
        }
        else if (e.getSource()==tan){
            setText(Functions.solve("tan", getNum(), 0));
        }
        else if (e.getSource()==cot){
            setText(Functions.solve("cot", getNum(), 0));
        }
        else if (e.getSource()==csc){
            setText(Functions.solve("csc", getNum(), 0));
        }
        else if (e.getSource()==sec){
            setText(Functions.solve("sec", getNum(), 0));
        }
        else if (e.getSource()==mod){
            x=Functions.getNum();
            func="mod";
        }
        else if (e.getSource()==inverse){
            setText(Functions.solve("pow", getNum(), -1));
        }
        else if (e.getSource()==en){
            x=Functions.getNum();
            if (x==0){
                setText(Math.E);
            }
            else {
                setText(Functions.solve("times",Math.E,x));
            }
        }
        else if (e.getSource()==ep){
            x=Functions.getNum();
            setText(Functions.solve("pow", Math.E, x));
        }
        else if (e.getSource()==rand){
            setText(Functions.solve("randint", 0, 0));
        }
        else if (e.getSource()==randint){
            setText(Functions.solve("randint", 0, 0));
        }
        else if (e.getSource()==cToF){
            x=Functions.getNum();
            func="cToF";
            setText(Functions.solve(func, x , 0));
        }
        else if (e.getSource()==fToC){
            x=Functions.getNum();
            func="fToC";
            setText(Functions.solve(func, x , 0));
        }
        else if (e.getSource() == pythag)
        {
            x=Functions.getNum();
            func="pythag";
        }
    }

    private void setText(int i) {
        // TODO Auto-generated method stub
        Functions.setText(Integer.toString(i));
    }

    private void clearText() {
        // TODO Auto-generated method stub
        Functions.setText("0");
    }
}
