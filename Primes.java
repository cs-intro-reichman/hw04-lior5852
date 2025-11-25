public class Primes {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        if (n < 2) {
            System.out.println("Prime numbers up to " + n + ":");
            System.out.println("There are 0 primes between 2 and " + n + " (0% are primes)");
            return;
        }

        boolean[] isPrime = new boolean[n + 1];

        int i = 2;
        while (i <= n) {
            isPrime[i] = true;
            i++;
        }

        int p = 2;
        while (p * p <= n) {

            if (isPrime[p]) {
                int k = p * p;
                while (k <= n) {
                    isPrime[k] = false;
                    k = k + p;
                }
            }

            p++;
        }
        System.out.println("Prime numbers up to " + n + ":");

        int count = 0;
        int x = 2;
        while (x <= n) {
            if (isPrime[x]) {
                System.out.println(x);
                count++;
            }
            x++;
        }

        int percent = (count * 100) / n;

        System.out.println("There are " + count + " primes between 2 and " 
                           + n + " (" + percent + "% are primes)");
    }
}
