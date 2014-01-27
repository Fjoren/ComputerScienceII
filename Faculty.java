import java.util.Date;

class Faculty extends Employee {
    private String officeHours;
    private String rank;
    
    Faculty () {
        super();
    }

    Faculty (String name, String address, String phoneNumber, String emailAddress, String office, double salary, String officeHours, String rank) { 
        super(name,address,phoneNumber,emailAddress,office,salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    Faculty (String name, String address, String phoneNumber, String emailAddress, String office, double salary, String officeHours, String rank, Date dateHired) {
        super(name,address,phoneNumber,emailAddress,office,salary,dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
     
}
