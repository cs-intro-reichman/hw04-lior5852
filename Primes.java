public class Primes {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        if (n < 2) {
            System.out.println("There are 0 primes between 2 and " + n + "(0% are primes)");
            return;

        }
        
        boolean[] isprime = new boolean[n+1];
        int i = 2;
        while ( i <= n) {
            isprime[i] = true;
            i++;
        }
        int k = 2 * 2;
        while (k <=n) {
            isprime[k] = false;
            k = k + 2;
        }
        k = 3 * 3;
        while (k <=n) {
            isprime[k] = false;
            k = k + 3;
        }
        k = 5 * 5;
        while (k <=n) {
            isprime[k] = false;
            k = k + 5;
        }
        int countprime = 0;
        int x = 2;
        while (x <=n ){
            if (isprime[x]) {
                countprime ++ ; 
            }
             x ++;
        }
        int percent = ((countprime * 100)/(n-1)) ;
        System.out.println("There are " + countprime + " primes 2 between " + n + "(" + percent + "% are primes)");
    }
}