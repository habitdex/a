class Employee {
    String employeeName;
    int employeeId;
    double basicsalary;

    public void displayInfo() {
        System.out.println("Name: " + employeeName + ", ID: " + employeeId + ", Basic Salary: $" + basicsalary);
    }
}

class SalaryCalculator extends Employee {
    double hra, da, pf, grossSalary;

    public void grossCal() {
        hra = basicsalary * 0.1;
        da = basicsalary * 0.15;
        pf = basicsalary * 0.05;
        grossSalary = basicsalary + hra + da - pf;
    }

    public void showSalarySlip() {
        System.out.println("Gross Salary: $" + grossSalary);
    }

    public static void main(String[] args) {
        SalaryCalculator emp = new SalaryCalculator();
        emp.employeeName = "Mohit";
        emp.employeeId = 101;
        emp.basicsalary = 5000;
        emp.grossCal();
        emp.displayInfo();
        emp.showSalarySlip();
    }
}

