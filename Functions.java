import java.util.Random;

public class Functions {
    private static Random random = new Random();
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

    private static double pow(double x, double y){
        return (double) Math.pow(x, y);

    }

    private static double fact(double x){
        int val = (int)x;
        if(val==1 || val==0){
            return 1;
        }
        else if (val == -1)
        {
            return -1;
        }
        else if ( val<0)
            return (double)(x*fact(x+1));
        else{
            return (double)(x*fact(x-1));
        }
    }

    private static double sqrt(double x){
        return (double) Math.sqrt(x);
    }

    public static double toDouble(String y)
    {
        double x;
        x=Double.parseDouble(y);
        return x;
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

    
}
