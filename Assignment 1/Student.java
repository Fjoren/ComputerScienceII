class Student extends Person {
    private final String CLASS_STATUS;

    Student () { 
        CLASS_STATUS = null;
    }

    Student (String name, String address, String phoneNumber, String emailAddress, String CLASS_STATUS) {
        super(name,address,phoneNumber,emailAddress);
        this.CLASS_STATUS = CLASS_STATUS;
    }

}
