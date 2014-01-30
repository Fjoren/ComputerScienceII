class PersonTest {
    public static void main (String[] args) {
        Person person = new Person("John", "123 ABC Dr.", "(123)456-7890", "123@abc.com");
        Student student = new Student("John", "123 ABC Dr.", "(123)456-7890", "123@abc.com", "Freshman");    
        Employee employee = new Employee("John", "123 ABC Dr.", "(123)456-7890", "123@abc.com", "Scranton", 123456);    
        Faculty faculty = new Faculty("John", "123 ABC Dr.", "(123)456-7890", "123@abc.com", "Scranton", 123456, "9:00AM-5:00PM", "Senior");    
        Staff staff = new Staff("John", "123 ABC Dr.", "(123)456-7890", "123@abc.com", "Scranton", 123456, "Project Lead");    
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
