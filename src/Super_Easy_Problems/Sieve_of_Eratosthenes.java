package Super_Easy_Problems;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean [] arr = new boolean[n + 1];
        sieve(n,arr);
    }
    static void sieve(int n, boolean[] primes){

        // false in arr means number is prime.
        for (int i = 2; i*i<= n; i++) {
            if(primes[i] == false){
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i < primes.length; i++) {
            if(primes[i]==false){
                System.out.print(i + " ");
            }
        }
    }
}
