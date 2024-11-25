class Bank {
    public int getBalance() {
        return 0;
    }
}

class BankA extends Bank {
    public int getBalance() {
        return 1000;
    }
}

class BankB extends Bank {
    public int getBalance() {
        return 1500;
    }
}

class BankC extends Bank {
    public int getBalance() {
        return 2000;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank a = new BankA();
        Bank b = new BankB();
        Bank c = new BankC();

        System.out.println("Bank A: $" + a.getBalance());
        System.out.println("Bank B: $" + b.getBalance());
        System.out.println("Bank C: $" + c.getBalance());
    }
}

