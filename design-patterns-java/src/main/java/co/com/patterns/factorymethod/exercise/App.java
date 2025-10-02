package co.com.patterns.factorymethod.exercise;

public class App {
    public static void main(String[] args) {
        ReportFactory reportFactory = new InventoryReportFactory();
        reportFactory.generateReport();

        ReportFactory reportFactorySale = new SalesReportFactory();
        reportFactorySale.generateReport();
    }
}
