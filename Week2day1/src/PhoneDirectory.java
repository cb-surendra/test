import java.util.List;
import java.util.Map;

enum Tag{
    MOBILE, HOME, WORK;
}
public class PhoneDirectory {
    String name;
    String address;
    Map<Integer, Tag> phoneNumber;

    public PhoneDirectory(){

    }
    public PhoneDirectory(String name, String address, Map<Integer, Tag> phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public void fetchInforBasedOnName(List<PhoneDirectory> arrOfContacts, String name){
        for(PhoneDirectory p : arrOfContacts){
            if(name.contains(p.name)){
                System.out.println(p.name + " " + p.address + " " + p.phoneNumber);
            }
        }
    }
    public void fetchInfoBasesOnExactMatch(List<PhoneDirectory> arrOfContacts, String name, String address, Map<Integer, Tag> map){
        for(PhoneDirectory p : arrOfContacts){
            if( p.name.equals(name) && p.address.equals(address) && p.phoneNumber.equals(map)){
                System.out.println(p.name + " " + p.address + " " + p.phoneNumber);
            }
        }
    }
    public void fetchInfoBasedOnPhone(List<PhoneDirectory> arrOfContacts, Integer no){
        for(PhoneDirectory p : arrOfContacts){
            if( p.phoneNumber.containsKey(no) ){
                System.out.println(p.name + " " + p.address + " " + p.phoneNumber);
            }
        }
    }
}
