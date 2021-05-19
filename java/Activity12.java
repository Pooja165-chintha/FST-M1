package activities;


interface Multiply{
    int mul(int a, int b);
}
 
public class Activity12 {
    public static void main(String[] args) {
    	  // Lambda expression without return keyword.
    	Multiply mu=(a,b)->(a*b);
    	System.out.println(mu.mul(5, 6));
        // Lambda expression with return keyword.
    	Multiply mu2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(mu2.mul(100, 200));
    }
}
