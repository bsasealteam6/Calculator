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
    private GridBagConstraints gridBag = new GridBagConstraints();
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

    private void setColors(Color foreground, Color background)
    {
        one.setBackground(foreground);
        two.setBackground(foreground);
        three.setBackground(foreground);
        four.setBackground(foreground);
        five.setBackground(foreground);
        six.setBackground(foreground);
        seven.setBackground(foreground);
        eight.setBackground(foreground);
        nine.setBackground(foreground);
        zero.setBackground(foreground);
        plus.setBackground(foreground);
        minus.setBackground(foreground);
        times.setBackground(foreground);
        divide.setBackground(foreground);
        equals.setBackground(foreground);
        pi.setBackground(foreground);
        sqrt.setBackground(foreground);
        square.setBackground(foreground);
        percent.setBackground(foreground);
        factorial.setBackground(foreground);
        power.setBackground(foreground);
        decimal.setBackground(foreground);
        C.setBackground(foreground);
        MP.setBackground(foreground);
        MC.setBackground(foreground);
        MR.setBackground(foreground);
        MM.setBackground(foreground);
        neg.setBackground(foreground);
        panel.setBackground(background);
        panel2.setBackground(background);
    }

    private void setupPanels()
    {
        //Adds the buttons in a layout to the panel for the Number display
        gridBag.fill = GridBagConstraints.BOTH;
        gridBag.gridx = 0;
        gridBag.gridy = 0;
        panel2.add(TextAreaNumber, gridBag);
        //Adds the buttons in a layout to the panel for the controls 
        gridBag.gridwidth = 1;
        gridBag.gridy=0;
        gridBag.gridx=0;
        panel.add(MC);
        gridBag.gridy=0;
        gridBag.gridx=1;
        panel.add(MP);
        gridBag.gridx=2;
        panel.add(MM);
        gridBag.gridx=3;
        panel.add(MR);

        gridBag.gridy=1;
        gridBag.gridx=0;
        panel.add(C,gridBag);
        gridBag.gridx=1;
        gridBag.gridy=1;
        panel.add(neg,gridBag);
        gridBag.gridx=2;
        panel.add(divide,gridBag);
        gridBag.gridx=3;
        panel.add(times,gridBag);
        gridBag.gridx = 0;
        gridBag.gridy=2;
        panel.add(one, gridBag);

        gridBag.gridx = 1;
        //gridBag.gridy = 2;
        panel.add(two, gridBag);

        gridBag.gridx = 2;
        //      gridBag.gridy = 2;
        panel.add(three, gridBag);

        gridBag.gridx = 3;
        panel.add(plus, gridBag);

        gridBag.gridx = 0;
        gridBag.gridy = 3;
        panel.add(four, gridBag);

        gridBag.gridx=1;
        panel.add(five,gridBag);

        gridBag.gridx=2;
        panel.add(six,gridBag);

        gridBag.gridx=3;
        panel.add(minus,gridBag);

        gridBag.gridy=4;
        gridBag.gridx=0;
        panel.add(seven,gridBag);

        gridBag.gridx=1;
        panel.add(eight,gridBag);

        gridBag.gridx=2;
        panel.add(nine ,gridBag);

        gridBag.gridx=0;
        gridBag.gridy=5;
        gridBag.gridwidth=2;
        panel.add(zero,gridBag);

        gridBag.gridwidth=1;

        gridBag.gridx=2;
        panel.add(decimal,gridBag);

        gridBag.gridheight=2;
        gridBag.gridx=3;
        gridBag.gridy=4;
        panel.add(equals,gridBag);

        gridBag.gridheight=1;
        gridBag.gridx=0;
        gridBag.gridy=6;
        panel.add(factorial,gridBag);

        gridBag.gridx=1;
        panel.add(pi,gridBag);

        gridBag.gridx=2;
        panel.add(square,gridBag);

        gridBag.gridx=3;
        panel.add(power,gridBag);

        gridBag.gridy=7;
        gridBag.gridx=0;
        gridBag.gridwidth=2;
        panel.add(sin,gridBag);
        gridBag.gridx=2;
        panel.add(csc,gridBag);
        gridBag.gridy=8;
        gridBag.gridx=0;
        panel.add(cos,gridBag);
        gridBag.gridx=2;
        panel.add(sec,gridBag);
        gridBag.gridy=9;
        gridBag.gridx=0;
        panel.add(tan,gridBag);
        gridBag.gridx=2;
        panel.add(cot,gridBag);
        gridBag.gridy=10;
        gridBag.gridx=0;
        panel.add(isin,gridBag);
        gridBag.gridx=2;
        panel.add(icsc,gridBag);
        gridBag.gridy=11;
        gridBag.gridx=0;
        panel.add(icos,gridBag);
        gridBag.gridx=2;
        panel.add(isec,gridBag);
        gridBag.gridy=12;
        gridBag.gridx=0;
        panel.add(itan,gridBag);
        gridBag.gridx=2;
        panel.add(icot,gridBag);
        gridBag.gridwidth=1;
        gridBag.gridx=0;
        gridBag.gridy=13;
        panel.add(mod,gridBag);
        gridBag.gridx=1;
        panel.add(sqrt,gridBag);
        gridBag.gridx=2;
        panel.add(inverse,gridBag);
        gridBag.gridx=3;
        panel.add(en,gridBag);
        gridBag.gridy=14;
        gridBag.gridx=0;
        panel.add(ep,gridBag);
        gridBag.gridx=1;
        panel.add(rand,gridBag);
        gridBag.gridx=2;
        gridBag.gridwidth=2;
        panel.add(randint,gridBag);
        gridBag.gridy = 15;
        gridBag.gridx=0;
        panel.add(cToF,gridBag);
        gridBag.gridx=2;
        panel.add(fToC,gridBag);
        gridBag.gridy=16;
        gridBag.gridx=0;
        panel.add(pythag,gridBag);
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
        setColors(Color.red, Color.BLACK);
        setupPanels();
        //Combines the panels to one panel
        gridBag.gridwidth=1;
        gridBag.gridx=0;
        gridBag.gridy=1;
        panel3.add(panel,gridBag);

        gridBag.gridx=0;
        gridBag.gridy=0;
        panel3.add(panel2,gridBag);
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
