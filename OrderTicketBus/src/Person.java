public class Person {
    // пассажир
    private int id;
    private String fullName;
    private long cardNumber;
    private long hashPass;
    private String login;
    
    public Person(int id, String fullName, long cardNumber, long hashPass, String login) {
        this.id = id;
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.hashPass = hashPass;
        this.login = login;
    }
    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public long getCardNumber() {
        return cardNumber;
    }
    public long getHashPass() {
        return hashPass;
    }
    public String getLogin() {
        return login;
    }
    public void setHashPass(long hashPass) {
        this.hashPass = hashPass;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    

}
