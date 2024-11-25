class AddAmount {
    int amount = 50;

    AddAmount() {
        // No additional amount added
    }

    AddAmount(int extraAmount) {
        this.amount += extraAmount;
    }

    public void displayAmount() {
        System.out.println("Total Amount in Piggie Bank: $" + amount);
    }

    public static void main(String[] args) {
        AddAmount a1 = new AddAmount();
        AddAmount a2 = new AddAmount(100);
        a1.displayAmount();
        a2.displayAmount();
    }
}

