//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount joe = new BankAccount("Joe");
        BankAccount james = new BankAccount("James");
        System.out.println(joe.accountNumber);
        System.out.println(james.accountNumber);

        Student stud1 = new Student("Alex");
        System.out.println(stud1.name + ": " + stud1.gpa);
    }

}