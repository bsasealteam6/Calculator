import java.util.Random;

public class Functions {
    private static Random random = new Random();
    public static void print(Object obj){
        System.out.println(obj);
    }

    private static double pow(double num1, double num2){
        return (double) Math.pow(num1, num2);

    }

    private static double fact(double num){
        int val = (int)num;
        if(val==1 || val==0){
            return 1;
        }
        else if (val == -1)
        {
            return -1;
        }
        else if ( val<0)
            return (double)(num*fact(num+1));
        else{
            return (double)(num*fact(num-1));
        }
    }

    private static double sqrt(double num){
        return (double) Math.sqrt(num);
    }

    public static double toDouble(String str)
    {
        double num;
        num=Double.parseDouble(str);
        return num;
    }

    

    /**
     * Method solve
     *
     * @param func The function to be ran
     * @param num1 The first value
     * @param num2 The second value
     * @return The result of the math
     */
    public static double solve(String func,double num1, double num2) {
        switch (func){
            case "plus":
            	return num1+num2;
            case "times":
            	return num1*num2;
            case "fact":
            	return fact(num1);
            case "divide":
            	return num1/num2;
            case "minus":
            	return num1-num2;
            case "pow":
            	return pow(num1,num2);
            case "sin":
            	return Math.sin(Math.toRadians(num1));
            case "cos":
            	return Math.cos(Math.toRadians(num1));
            case "tan":
            	return Math.tan(Math.toRadians(num1));
            case "mod":
            	return (num1 % num2);
            case "sqrt":
            	return sqrt(num1);
            case "rand":
            	return random.nextDouble();
            case "randint":
            	return random.nextInt();
            case "cToF":
            	return MyMath.cToF(num1);
            case "fToC":
            	return MyMath.fToC(num1);
            case "pythag":
            	return MyMath.pythag(num1,num2);
        }
        return num2;
    }

    
}
