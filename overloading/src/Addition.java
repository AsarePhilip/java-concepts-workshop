/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {

    public void add(int a, int b){
        System.out.printf("Sum of a and b is %d\n", a+b);
    }
    
    public void add(int a, int b, int c){
        System.out.printf("Sum of a and b is %d\n", a+b+c);
    }

    public void add(int a, int b, float c){
        System.out.printf("Sum of a and b is %f\n", a+b+c);
    }
}

