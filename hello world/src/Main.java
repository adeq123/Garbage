 class Foo {
    public static int foo(int n){
         if (n < 1){
             return 0;
         } else { 
             return 1 + foo(n / 10);
         }
     }
     public static void main(String[] args){
         System.out.println(foo(1));
         System.out.println(2%3);
     }
}