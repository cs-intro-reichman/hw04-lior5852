public class Primes {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        System.out.println("Prime numbers up to " + n + ":");

        if (n < 2) {
            System.out.println("There are 0 primes between 2 and " + n + " (0% are primes)");
            return;
        }

        boolean[] isPrime = new boolean[n + 1];

        // initialize
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // sieve
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int k = p * p; k <= n; k += p) {
                    isPrime[k] = false;
                }
            }
        }

        int count = 0;

        // print primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }

        // percentage (floor)
        int percent = (count * 100) / n;

        System.out.println("There are " + count + " primes between 2 and " + n +
                           " (" + percent + "% are primes)");
    }
}
