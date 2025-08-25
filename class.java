public class Main
{
    /**
     * Finds the nth term's value in a fibonacci sequence.
     * @param n, the Nth term
     * @return the value of the Nth term
     */
    public static int fibonacci(int n)
    {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args)
    {
        int n = 10;
        System.out.println("Number is: " + n);
        System.out.println("Fibonacci number is: " + fibonacci(n));

    }

}
