import java.util.ArrayList;

public class ListOfEmployess {
    String firstname,secondname,email,period,phonenumber,salary;

    public ListOfEmployess(String firstname, String secondname, String email, String period, String phonenumber, String salary) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.email = email;
        this.period = period;
        this.phonenumber = phonenumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ListOfEmployess{" +
                "fname='" + firstname + '\'' +
                ", sname='" + secondname + '\'' +
                ", email='" + email + '\'' +
                ", period='" + period + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<ListOfEmployess>Employees;
        Employees=new ArrayList<>();

        ListOfEmployess emp1=new ListOfEmployess("john","kamua","John@kamua.com","2 years","0799023766","100000");
        ListOfEmployess emp2=new ListOfEmployess("allan","mwaura","Allan@mwaura.com","1 year","01199093556","95000");
        ListOfEmployess emp3=new ListOfEmployess("ben","Mweni","Ben@mweni.com","2 years","0790023458","50000");
        ListOfEmployess emp4=new ListOfEmployess("Josephp","moura","hosephp@mura.com","10 months","0796023356","67000");
        ListOfEmployess emp5=new ListOfEmployess("James","mugambi","James@mugambi.com","2 years","05599521256","230000");
        ListOfEmployess emp6=new ListOfEmployess("Charlse","mwaniki","charles@mwaniki.com","1 years 8 months","0769028956","840000");
        ListOfEmployess emp7=new ListOfEmployess("kevin","kena","kevin@kena.com","1.5 years","01199824556","70000");
        ListOfEmployess emp8=new ListOfEmployess("Jay","jael","jayj@ael.com","5 months","01156423456","40000");
        ListOfEmployess emp9=new ListOfEmployess("Daniel","tato","danie@ltato.com","8 months","0701023456","60000");
        ListOfEmployess emp10=new ListOfEmployess("Purity","Rachel","purity@rachels.com","2 months","0179023459","20000");

        Employees.add(emp1);
        Employees.add(emp2);
        Employees.add(emp3);
        Employees.add(emp4);
        Employees.add(emp5);
        Employees.add(emp6);
        Employees.add(emp7);
        Employees.add(emp8);
        Employees.add(emp9);
        Employees.add(emp10);

        System.out.println(Employees.toString());
    }
}
