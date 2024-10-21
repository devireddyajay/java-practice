import java.util.Scanner;
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
// assigning variables
        int v1=sc.nextInt();

        int v2=sc.nextInt();
//this says how many times we need to run loop
        int count=sc.nextInt();
        System.out.println(v1);
        System.out.println(v2);

        for(int a=0;a<count;a++){
            //result variable stores v1 and v2
            int result =v1+v2;
            //print result
            System.out.println("series is"+result);
            //updated v2 value  is assigned to v1
            v1=v2;
            //v2 store the result
            v2=result;
        }
    }
}
