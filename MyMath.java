public class MyMath
{
    public static double fToC(double f)
    {
        return (double)5/9 * (f-32);
    }
    public static double cToF(double c)
    {
        return c*9/5+32;
    }
    public static double sphereVol(double radius)
    {
        return (double)4/3*Math.PI*Math.pow(radius,3);
    }
    public static double pythag(double a, double b)
    {
        return Math.hypot(a,b);
    }
}