package co.com.patterns.factorymethod.exercise;

public class SalesIReportImpl implements IReport {

    @Override
    public void generateReport() {
        System.out.println("Generating Sales Report");
    }
}
