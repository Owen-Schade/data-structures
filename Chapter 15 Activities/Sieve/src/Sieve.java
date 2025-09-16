import java.util.*;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        Set<Integer> nums = new TreeSet<>();
        Set<Integer> primes = new TreeSet<>();
        for (int i = 2; i<=n; i++){
            nums.add(i);
        }
        int it = 2;
        while(it*it<=n){
            int mult = 2;
            while(it*mult<=n){
                nums.remove(it*mult);
                mult++;
            }
            primes.add(it);
            nums.remove(it);
            it = Collections.min(nums);
        }
        primes.addAll(nums);
        System.out.println(primes);






    }
}
