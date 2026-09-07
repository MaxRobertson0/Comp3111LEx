package Lab1;

public class MyLibrary {
    public static int Power(int base, int exponent) {
        if(exponent == 1){
            return base*exponent;
        }else return base * Power(base, exponent-1);
    }

    public static int factorial(int n) {
        if(n == 1) return 1;
        else{
            return n*factorial(n-1);
        }
    }
}
