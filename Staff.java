class Staff extends Employee {
    private String title;


    Staff (String name, String address, String phoneNumber, String emailAddress, String office, double salary, String title) { 
        super(name,address,phoneNumber,emailAddress,office,salary);
        this.title = title;    
    }

}
