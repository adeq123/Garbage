package debug;


public class Factorial {
    public static void main(String[] args) {
        int n = (int) (Math.random()*10);
        int result = 1;
        System.out.println("Value of n: "+n);  
        while(n>1){
             result = result*(n);
             n=n-1;
        }
        System.out.println("Value of n!: "+result);
    }
}