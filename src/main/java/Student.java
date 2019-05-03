public class Student {
    public String firstName;
    public String lastName;
    private String cardNumber;
    private final String car="dfsdf";
    public int age;

    //constructor
    public Student() {

    }
    public Student(String firstName, String lastName, int age, String cardNumber) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.cardNumber=cardNumber;
    }
    //metod
    public  void print(){

    }

    public String getCardNumber() {
        return cardNumber;
    }
    public String getCardNumber(String cardType) {
        return cardType + ":" + cardNumber;
    }
    public Student(String firstName, String lastName, int age) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.cardNumber=cardNumber;
    }
}

