import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<String> arrayList = new ArrayList<String>();
        for(String s : args){
            arrayList.add(s);
        }

        /*
        Question1 q1 = new Question1();
        q1.mapofStringAndLength(arrayList);


        Question2 q2 = new Question2();
        q2.sortBasedOnkey(arrayList);
        */
        System.out.println("Enter number of user");
        int user;
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();

        List<PhoneDirectory> arrOfContacts = new ArrayList<PhoneDirectory>();

        while(user >= 0){
            String name;
            String add;
            int numberOfph;

            System.out.println("Enter Name : ");
            name = sc.next();

            System.out.println("Enter Address : ");
            add = sc.next();

            System.out.println("Enter How many Phone Number : ");
            numberOfph = sc.nextInt();

            Map<Integer, Tag> m = new HashMap<Integer, Tag>();
            for(int i = 0; i < numberOfph; i++){
                System.out.println("Enter phone number and Type(MOBILE, WORK and HOME : ");
                Integer moNo;
                Tag type;
                moNo = sc.nextInt();
                type = Tag.valueOf(sc.next().toUpperCase());
                m.put(moNo, type);
            }
            arrOfContacts.add(new PhoneDirectory(name, add, m));
            user--;
        }

        for(PhoneDirectory p : arrOfContacts){
            System.out.println(p.name + " " + p.address + " " + p.phoneNumber);
        }
        PhoneDirectory p = new PhoneDirectory();
        p.fetchInforBasedOnName(arrOfContacts, "abc");
    }
}
