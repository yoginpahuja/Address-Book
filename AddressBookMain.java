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

        contactDetail.put(firstName, contact);
    }

    // UC3 - Edit functionality
    public static void editFunction(Scanner scn){
        System.out.println("Enter first name of the person: ");
        String name = scn.next();
        contactDetail.get(name).displayInformation();
        Integer condition;
        while (true) {
            System.out.println("Write the key for that you want to edit");
            System.out.println("1: For editing address");
            System.out.println("2: For editing city");
            System.out.println("3: For editing zipcode");
            System.out.println("4: For editing phone");
            System.out.println("5: For editing email");
            System.out.println("0: For Exit");
            condition = scn.nextInt();
            if(condition == 0){break;}
            else if(condition == 1){
                System.out.println("Enter new address");
                String address = scn.next();
                contactDetail.get(name).editAddress(address);
            }
            else if(condition == 2){
                System.out.println("Enter new city");
                String city = scn.next();
                contactDetail.get(name).editCity(city);
            }
            else if(condition == 3){
                System.out.println("Enter new zipcode");
                Integer zip = scn.nextInt();
                contactDetail.get(name).editZipCode(zip);
            }
            else if(condition == 4){
                System.out.println("Enter new phone");
                String phone = scn.next();
                contactDetail.get(name).editPhoneNo(phone);
            }
            else if(condition == 5){
                System.out.println("Enter new email");
                String email = scn.next();
                contactDetail.get(name).editEmail(email);;
            }else{
                System.out.println("you have entered wrong key");
            }
        }
    }

    // UC4 - Delete Functionality
    public static void deleteFunction(Scanner scn){
        System.out.println("Enter first name of the person: ");
        String name = scn.next();
        contactDetail.remove(name);
        System.out.println("Deleted Successfuly");
    }

    public static void diplayAllContact(){
        for( String keys: contactDetail.keySet()){
            contactDetail.get(keys).displayInformation();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner scn = new Scanner( System.in);
        Integer operation;
        Integer cnt = 1;
        while(true){
            System.out.println("Enter Integer for Different operations");
            System.out.println("1 : for Adding new Detail");
            System.out.println("2 : for edit existing Detail");
            System.out.println("3 : for delete existing Detail");
            System.out.println("4: for diplay all contact information");
            System.out.println("0 : for Exit");
            operation = scn.nextInt();
            if(operation == 0){
                break;
            }else if(operation == 1){
                InputForAddressBook(scn,cnt);
                cnt++;
            }else if(operation == 2){
                editFunction(scn);
            }else if(operation == 3){
                deleteFunction(scn);
            }else if(operation == 4){
                diplayAllContact();
            }else{
                System.out.println("you have entered wrong key");
            }
        }

        scn.close();
    }

}