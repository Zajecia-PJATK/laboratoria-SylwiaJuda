class Account{
    private String ID, Name;
    private int Balance;

    public Account(String ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    public Account(String ID, String Name, int Balance) {
        this.ID = ID;
        this.Name = Name;
        this.Balance = Balance;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getBalance() {
        return Balance;
    }
    public void credit(int amount){
        this.Balance += amount;
    }
    public void debit(int amount){
        if (amount <= Balance){
            this.Balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account[" +
                "id=" + ID + 
                ",name=" + Name + 
                ",balance=" + Balance +
                ']';
    }
}
