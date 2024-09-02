
//**finding prime no using Sieve of Eratosthenes

public class Lecture24 {
    public static void main(String[] args) {
        int n = 40;
        int cnt = 0;
        boolean[] prime = new boolean[n + 1]; 
        for (int i = 0; i <prime.length; i++) {
            prime[i] = true;
         
        }
        prime[0] = false;
        prime[1]=false;
        for (int i = 2; i < prime.length; i++) {
            if (prime[i])
         {
cnt++;
for (int j = i * 2; j < prime.length; j = j + i)
                    prime[j] = false;
            }

        }
        System.out.println(cnt);

    }

}
