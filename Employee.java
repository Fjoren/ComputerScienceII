import java.util.Date;

class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired;

    Employee () {
        super();
    }

    Employee (String name, String address, String phoneNumber, String emailAddress) {
        super(name,address,phoneNumber,emailAddress);    
    }

    Employee (String name, String address, String phoneNumber, String emailAddress, String office, double salary) { 
        super(name,address,phoneNumber,emailAddress);
        this.office = office;
        this.salary = salary;
    }

    
    Employee (String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired) {
        super(name,address,phoneNumber,emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
        
}
