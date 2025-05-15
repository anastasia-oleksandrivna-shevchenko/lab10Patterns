package task2.extractMethod;

public class SalaryCalculator {

    public double calculateSalary(Employee employee) {
        double baseSalary = employee.getBaseSalary();
        double totalSalary = calculateBaseWithOvertime(employee, baseSalary);
        totalSalary += calculateBonus(baseSalary, employee.getBonusPercentage());
        double netSalary = calculateNetSalary(totalSalary, employee.getTaxRate());
        return netSalary;
    }

    private double calculateBaseWithOvertime(Employee employee, double baseSalary) {
        int overtimeHours = employee.getOvertimeHours();
        if (overtimeHours > 0) {
            double overtimePay = overtimeHours * baseSalary * 1.5;
            return baseSalary + overtimePay;
        }
        return baseSalary;
    }

    private double calculateBonus(double baseSalary, double bonusPercentage) {
        return baseSalary * bonusPercentage / 100;
    }

    private double calculateNetSalary(double totalSalary, double taxRate) {
        double taxAmount = totalSalary * taxRate / 100;
        return totalSalary - taxAmount;
    }

    // Інші методи класу...
}
