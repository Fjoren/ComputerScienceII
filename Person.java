class Person {
    protected String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
   
    Person () {
        name = null;
        address = null;
        phoneNumber = null;
        emailAddress = null;
    }

    Person (String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString () {
        String output;
        output = "Class: " + this.getClass().getName() + "\nName: " + this.name;
        return output;
    }
}
