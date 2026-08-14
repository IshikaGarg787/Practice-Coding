import java.util.*;
public class soldier_and_bananas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        int n= sc.nextInt();
        int w= sc.nextInt();

        int req = 0;
        for(int i=1; i<=w; i++){
            req += k*i;
        }
        if(req > n){
            System.out.println(req - n);
        }
        else{
            System.out.println(0);
        }
    }
}