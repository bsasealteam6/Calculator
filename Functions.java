import java.util.Random;

public class Functions {
    public static Random random = new Random();
    public static void print(String x){
        System.out.println(x);
    }

    public static void print(int x){
        System.out.println(x);
    }

    public static void print(float x){
        System.out.println(x);
    }

    public static void print(double y) {
        System.out.println(y);
    }

    public static double pow(double x, double y){
        return (double) Math.pow(x, y);

    }

    public static double fact(double x){
        double t=(double) 1;
        if(x==t){
            return (double)x;
        }
        else{
            double y=(x*fact(x-t));
            return (double)y;
        }
    }

    public static double sqrt(double x){
        return (double) Math.sqrt(x);
    }

    public static double toDouble(String y)
    {
        double x;
        x=Double.parseDouble(y);
        return x;
    }

    public static double getNum(){
        //try {
        double y=Functions.toDouble(Calculator.TextAreaNumber.getText());
        Calculator.setText(0.0);
        Calculator.TextAreaNumber.update (Calculator.TextAreaNumber.getGraphics());
        return y;
        //}
    }

    /**
     * Method solve
     *
     * @param func The function to be ran
     * @param x The first value
     * @param y The second value
     * @return The result of the math
     */
    public static double solve(String func,double x, double y) {
        // TODO Auto-generated method stub
        //      random.setSeed(15);
        switch (func){
            case "plus":
            return x+y;
            case "times":
            return x*y;
            case "fact":
            return fact(x);
            case "divide":
            return x/y;
            case "minus":
            return x-y;
            case "pow":
            return pow(x,y);
            case "sin":
            return Math.sin(Math.toRadians(x));
            case "cos":
            return Math.cos(Math.toRadians(x));
            case "tan":
            return Math.tan(Math.toRadians(x));
            case "mod":
            return (x % y);
            case "sqrt":
            return sqrt(x);
            case "rand":
            return random.nextDouble();
            case "randint":
            return random.nextInt();
            case "cToF":
            return MyMath.cToF(x);
            case "fToC":
            return MyMath.fToC(x);
            case "pythag":
            return MyMath.pythag(x,y);
        }
        return y;
    }

    public static void setText(String b){

        Calculator.TextAreaNumber.setText(b);
        Calculator.TextAreaNumber.update(Calculator.TextAreaNumber.getGraphics());
    }
}
