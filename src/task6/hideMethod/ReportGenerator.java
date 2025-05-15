package task6.hideMethod;

public class ReportGenerator {
    public void generateReport() {
        System.out.println("Generating report...");
        formatReport();
    }

    private void formatReport() {
        System.out.println("Formatting report...");
    }
}
