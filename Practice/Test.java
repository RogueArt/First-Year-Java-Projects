public class Test{
public int better (int n) {
    if (n==0) {
       return 1;
    }else{
        return -2 * better(n - 1) - 1;
    }
}
public void bestest(int n){
    if (n%3 == 1)
    {
        bestest(n-1);
        System.out.println("*");
    }
    else if (n > 1 && n % 3 == 0)
    {
        bestest (n/3);
        System.out.println("*");
    }
}}