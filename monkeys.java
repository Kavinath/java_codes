import java.util.*;
public class monkeys
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int no_of_monkeys = obj.nextInt();
        int ban = obj.nextInt();
        int pea = obj.nextInt();
        int no_of_banana = obj.nextInt();
        int no_of_peanuts = obj.nextInt();

        if(ban != 0 && pea !=0)
        {
            int res = no_of_banana/ ban;
            int res1 = no_of_peanuts / pea;
            int eatenbanana = no_of_monkeys - res;
            int eatenpeanut = eatenbanana - res1;
            System.out.println(eatenpeanut);
        }

       
    }
}