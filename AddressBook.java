public class AddressBook {
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private Integer zipcode;
    private String phoneNumber;
    private String email;

    public AddressBook(Integer id, String firstName, String lastName, String address, String city, Integer zipcode, String phoneNumber, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void displayInformation(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.firstName + " "+ this.lastName);
        System.out.println("Address: " + this.address + ", "+ this.city);
        System.out.println("zipcode: " + this.zipcode );
        System.out.println("Phone No.: " + this.phoneNumber );
        System.out.println("Email: " + this.email );
    }

}