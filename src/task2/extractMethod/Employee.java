package task2.extractMethod;

public class Employee {
    public String name;
    public double baseSalary;
    public int overtimeHours;
    public double bonusPercentage;
    public double taxRate;

    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public int getOvertimeHours(){
        return overtimeHours;
    }
    public double getBonusPercentage(){
        return bonusPercentage;
    }
    public double getTaxRate(){
        return taxRate;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public void setOvertimeHours(int overtimeHours){
        this.overtimeHours = overtimeHours;
    }
    public void setBonusPercentage(double bonusPercentage){
        this.bonusPercentage = bonusPercentage;
    }
    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }

    public void printEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("- Base Salary: $" + baseSalary);
        System.out.println("- Overtime Hours: " + overtimeHours);
        System.out.println("- Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("- Tax Rate: " + taxRate + "%");
    }

}
