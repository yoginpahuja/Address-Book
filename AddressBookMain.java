import java.util.*;

class AddressBookMain{

    public static HashMap<String,AddressBook> contactDetail = new HashMap<String,AddressBook>();
    // Taking Input for New User
    public static void InputForAddressBook(Scanner scn,Integer cnt){
        System.out.println("Enter Your First Name: ");
        String firstName = scn.next();
        System.out.println("Enter Your Last Name: ");
        String lastName = scn.next();
        System.out.println("Enter Your Address: ");
        String address = scn.next();
        System.out.println("Enter Your City: ");
        String city = scn.next();
        System.out.println("Enter Your Zip Code: ");
        Integer zip = scn.nextInt();
        System.out.println("Enter Your Phone Number: ");
        String phone = scn.next();
        System.out.println("Enter Your Email: ");
        String email = scn.next();
        AddressBook contact = new AddressBook(cnt, firstName, lastName, address, city, zip, phone, email);

        contactDetail.put(firstName+lastName, contact);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner scn = new Scanner( System.in);
        Integer operation;
        Integer cnt = 1;
        while(true){
            System.out.println("Enter Integer for Different operations");
            System.out.println("1 : for Adding new Detail");
            System.out.println("0 : for Exit");
            operation = scn.nextInt();
            if(operation == 0){
                break;
            }else if(operation == 1){
                InputForAddressBook(scn,cnt);
                cnt++;
            }
        }

        for( String keys: contactDetail.keySet()){
            contactDetail.get(keys).displayInformation();
        }

        scn.close();
    }

}