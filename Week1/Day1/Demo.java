public class Demo extends Question1
{
    public static void main(String[] args) {
        
        /*this is for the first questin day1
        Question1 q = new Question1();
        q.show();
        */

        /* this is for the second question day1
        Question2 q = new Question2();
        Integer a = Integer.valueOf( args[0] ); //takes the first argument as the first integer
        Integer b = Integer.valueOf( args[1] ); //takes the second argument as the second integer
        System.out.println(q.addTwoNumber(a,b)); //call the methods that adds up the two integer
        */
        
        /* for questin 3
        Question3 q = new Question3();
        Character ch = args[0].charAt(0);
        System.out.println(q.show(ch));
        */
        Question4 q = new Question4();
        System.out.println( q.smallestPower(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }
}