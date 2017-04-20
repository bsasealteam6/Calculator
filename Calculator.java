//Listeners to listen for button presses
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Actual GUI elements
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.UIManager;

//Allows GUI to be colored
import java.awt.Color;
import javax.swing.plaf.ColorUIResource;

//Allows me to control where button go
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

//Utilities
import java.util.LinkedList;

@SuppressWarnings("unused")
public class Calculator extends JFrame implements ActionListener{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
//    private UIManager manager = new UIManager();
    public JTextArea textAreaNumber;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, clearNum,clearMemory,recallMemory;
    private JButton times, divide, equals, pi, sqrt, square, /*parenOpen, parenClose,*/ percent, factorial;
    private JButton power, decimal, MP,neg,subtractMemory,sin,tan,cos,csc,cot,sec,iSin,iCos,iTan,iCsc,iSec,iCot;
    private JButton mod, inverse,en,ep,randInt,rand, pythag, sphereVol, cToF, fToC;
    private JPanel panel,panel2,panel3/*,panel4*/;
    public Boolean clear;
    private GridBagConstraints gridBag = new GridBagConstraints();
    //  private 
    private double myNum1, myNum2, myAnswer, myNumMemory;

    String func;
    Calculator(){

        super("Calculator");
        init();
        //      this.setSize(1000,1000);
        this.pack();
        this.setVisible(true);

    }

    private void init(){

        clear=false; //Used to identify if need to append or replace
        myNumMemory=0; //The variable that the M value is stored in

        //Makes the panels that make up the structure of the GUI

        panel=new JPanel(new GridBagLayout());
        panel2=new JPanel();
        panel3=new JPanel(new GridBagLayout());
        //      panel4=new JPanel();
        textAreaNumber=new JTextArea(1,20);
        setText(Integer.toString(0));
        textAreaNumber.setEditable(false);

        //Initializes Display
        //setColors(Color.black);
        initButtons();
        addActionListeners();
        //setColors(Color.red, Color.BLACK);
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
 
    private void setColors(Color background)
    {
        LinkedList<Object> gradient=new LinkedList<Object>();
        gradient.add(0.3);  
        gradient.add(0.3); 
        //First color : R=2,G=208,B=206  
        gradient.add(new ColorUIResource(150,0,0));  

        //Second color : R=136,G=255,B=254  
        gradient.add(new ColorUIResource(175,0,0));  

        //Third color : R=0,G=142,B=140  
        gradient.add(new ColorUIResource(100,0,0));  
        //******************************************************  
        panel.setBackground(background);
        panel2.setBackground(background);
        this.setBackground(background);;
        //Set Button.gradient key with new value  
        UIManager.put("Button.gradient",gradient);  

    }

    public void setText(Double b){
        setText(Double.toString(b));
    }

    public double getNum(){
        //try {
        double y=Functions.toDouble(textAreaNumber.getText());
        setText(0.0);
        textAreaNumber.update (textAreaNumber.getGraphics());
        return y;
        //}
    }

    public void append(int toAppend){
        if(Double.parseDouble(textAreaNumber.getText())==0||clear){
            setText(Integer.toString(toAppend));
            clear=false;
        }
        else{
            textAreaNumber.append(Integer.toString(toAppend));
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
        clearNum.addActionListener(this);
        MP.addActionListener(this);
        clearMemory.addActionListener(this);
        recallMemory.addActionListener(this);
        subtractMemory.addActionListener(this);
        neg.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        csc.addActionListener(this);
        sec.addActionListener(this);
        cot.addActionListener(this);
        iSin.addActionListener(this);
        iCos.addActionListener(this);
        iTan.addActionListener(this);
        iCsc.addActionListener(this);
        iSec.addActionListener(this);
        iCot.addActionListener(this);
        mod.addActionListener(this);
        inverse.addActionListener(this);
        en.addActionListener(this);
        ep.addActionListener(this);
        rand.addActionListener(this);
        randInt.addActionListener(this);
        fToC.addActionListener(this);
        cToF.addActionListener(this);
        pythag.addActionListener(this);
    }

    private void initButtons()
    {
        neg=new JButton("\u00B1");
        MP=new JButton("M+");
        clearMemory=new JButton("MC");
        subtractMemory=new JButton("M-");
        recallMemory=new JButton("MR");
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
        clearNum=new JButton("C");
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
        iSin=new JButton("sin\u207B\u00B9(x)");
        iCos=new JButton("cos\u207B\u00B9(x)");
        iTan=new JButton("tan\u207B\u00B9(x)");
        iCsc=new JButton("csc\u207B\u00B9(x)");
        iSec=new JButton("sec\u207B\u00B9(x)");
        iCot=new JButton("cot\u207B\u00B9(x)");
        mod =new JButton("Mod");
        inverse=new JButton("x\u207B\u00B9");
        en=new JButton("e");
        ep=new JButton("e\u207F");
        rand=new JButton("Rand");
        randInt = new JButton("RandInt");
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
        clearNum.setBackground(foreground);
        MP.setBackground(foreground);
        clearMemory.setBackground(foreground);
        recallMemory.setBackground(foreground);
        subtractMemory.setBackground(foreground);
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
        panel2.add(textAreaNumber, gridBag);
        //Adds the buttons in a layout to the panel for the controls 
        gridBag.gridwidth = 1;
        gridBag.gridy=0;
        gridBag.gridx=0;
        panel.add(clearMemory);
        gridBag.gridy=0;
        gridBag.gridx=1;
        panel.add(MP);
        gridBag.gridx=2;
        panel.add(subtractMemory);
        gridBag.gridx=3;
        panel.add(recallMemory);

        gridBag.gridy=1;
        gridBag.gridx=0;
        panel.add(clearNum,gridBag);
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
        panel.add(iSin,gridBag);
        gridBag.gridx=2;
        panel.add(iCsc,gridBag);
        gridBag.gridy=11;
        gridBag.gridx=0;
        panel.add(iCos,gridBag);
        gridBag.gridx=2;
        panel.add(iSec,gridBag);
        gridBag.gridy=12;
        gridBag.gridx=0;
        panel.add(iTan,gridBag);
        gridBag.gridx=2;
        panel.add(iCot,gridBag);
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
        panel.add(randInt,gridBag);
        gridBag.gridy = 15;
        gridBag.gridx=0;
        panel.add(cToF,gridBag);
        gridBag.gridx=2;
        panel.add(fToC,gridBag);
        gridBag.gridy=16;
        gridBag.gridx=0;
        panel.add(pythag,gridBag);
    }

    public void setText(String b){

        textAreaNumber.setText(b);
        textAreaNumber.update(textAreaNumber.getGraphics());
    }

    public void setText(int b){

        textAreaNumber.setText(Integer.toString(b));
        textAreaNumber.update(textAreaNumber.getGraphics());
    }

    @Override
    //  Determines what button is pushed
    public void actionPerformed(ActionEvent e){
        if (textAreaNumber.getText().contains("i")){
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
            myNum1=getNum();

            func="plus";
        }
        else if (e.getSource()==minus){
            myNum1=getNum();
            func="minus";
        }
        else if (e.getSource()==times){
            myNum1=getNum();
            func="times";
        }
        else if (e.getSource()==divide){
            myNum1=getNum(); 
            func="divide";
        }
        else if (e.getSource()==equals){
            myNum2=getNum();
            setText(Functions.solve(func,myNum1,myNum2));
            Functions.print(Functions.solve(func,myNum1,myNum2));
            clear=true;
        }
        else if (e.getSource()==pi){
            myNum1=getNum();
            if (myNum1==0){
                setText(Math.PI);
            }
            else {
                setText(Functions.solve("times",Math.PI,myNum1));
            }
        }
        else if (e.getSource()==sqrt){
            func="sqrt";
            myNum1=getNum();
            if (myNum1 < 0){
                setText(("i" + String.valueOf(Functions.solve(func,-myNum1,myNum1))));
                //Functions.print("i" + String.valueOf(Functions.solve(func,-x,x)));
                textAreaNumber.update(textAreaNumber.getGraphics());
            }
            else {
                setText(Functions.solve(func,myNum1,myNum1));
                //Functions.print(Functions.solve(func,x,x));
                textAreaNumber.update(textAreaNumber.getGraphics());
            }

        }
        else if (e.getSource()==square){
            func="times";
            myNum1=getNum();
            myAnswer=Functions.solve(func,myNum1,myNum1);
            //             Functions.print(z);
            setText(myAnswer);
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
            myNum1=getNum();
            func="fact";
            myAnswer=Functions.solve(func,myNum1,myNum1);
            setText(myAnswer);
        }
        else if (e.getSource()==power){
            func="pow";
            myNum1=getNum();
        }
        else if (e.getSource()==decimal){
            textAreaNumber.append(".");
        }
        else if (e.getSource()==clearNum){
            clearText();
        }
        else if (e.getSource()==MP){
            myNumMemory=myNumMemory+getNum();
        }
        else if (e.getSource()==subtractMemory){
            myNumMemory=myNumMemory-getNum();
        }
        else if (e.getSource()==recallMemory){
            setText(myNumMemory);
        }
        else if (e.getSource()==clearMemory){
            myNumMemory=0;
        }
        else if (e.getSource()==neg){
            if(Double.parseDouble(textAreaNumber.getText())%1==0){
                setText(Integer.parseInt(textAreaNumber.getText())*(0-1));
            }
            else{
                setText(Double.parseDouble(textAreaNumber.getText())*(0-1));
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
            myNum1=getNum();
            func="mod";
        }
        else if (e.getSource()==inverse){
            setText(Functions.solve("pow", getNum(), -1));
        }
        else if (e.getSource()==en){
            myNum1=getNum();
            if (myNum1==0){
                setText(Math.E);
            }
            else {
                setText(Functions.solve("times",Math.E,myNum1));
            }
        }
        else if (e.getSource()==ep){
            myNum1=getNum();
            setText(Functions.solve("pow", Math.E, myNum1));
        }
        else if (e.getSource()==rand){
            setText(Functions.solve("randint", 0, 0));
        }
        else if (e.getSource()==randInt){
            setText(Functions.solve("randint", 0, 0));
        }
        else if (e.getSource()==cToF){
            myNum1=getNum();
            func="cToF";
            setText(Functions.solve(func, myNum1 , 0));
        }
        else if (e.getSource()==fToC){
            myNum1=getNum();
            func="fToC";
            setText(Functions.solve(func, myNum1 , 0));
        }
        else if (e.getSource() == pythag)
        {
            myNum1=getNum();
            func="pythag";
        }
    }

    private void clearText() {
        // TODO Auto-generated method stub
        setText("0");
    }
}
