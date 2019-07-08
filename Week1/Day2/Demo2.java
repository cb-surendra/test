import java.util.Scanner;

public class Demo2
{
    public static void main(String[] args) {
        
        /*Scanner sc = new Scanner(System.in);    
        String Name;
        Integer Age;

        System.out.print("Enter ur Name : ");
        Name = sc.next();
        
        System.out.print("Enter ur Age : ");
        Age = sc.nextInt();

        System.out.println("Name : " + Name);
        System.out.println("Age : " + Age);*/

        /*
        Question1 q = new Question1();
        q.show();
        */
        
        /*
        Question 2 rotate matrix
        int len  =  (int)Math.sqrt(args.length);
        int[][] arr = new int[len][len];
        
        int cnt = 0;
        for(int i = 0; i < len; i++)
        {
            for(int j = 0; j < len; j++)
            {
                arr[i][j] = Integer.valueOf( args[cnt++]);
            }
        }
        Question2 q = new Question2();
        q.show(arr, len);
        */

        
        /*
        Day2practice1 q = new Day2practice1();
        System.out.println(q.show(args[0]));
        */

        /*
        Float p, r;
        Integer n, t;

        n = Integer.valueOf(args[0]);
        p = Float.valueOf(args[1]);
        r = Float.valueOf(args[2]);
        t = Integer.valueOf(args[3]);

        Day2practice2 q = new Day2practice2();
        System.out.println(q.findSimpleInterest(p, r, t));
        System.out.println(q.findCompoundInterest(p, r, n, t));
        */
        
        /*
        Day2practice3 q = new Day2practice3();
        System.out.println(q.findFibo( (int)Integer.valueOf(args[0])));
        */
        Day2practice4 q = new Day2practice4();
        int[] arr = new int[args.length];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)Integer.valueOf(args[i]);
        }
        q.findSmallestAndLargest(arr);
    }
}