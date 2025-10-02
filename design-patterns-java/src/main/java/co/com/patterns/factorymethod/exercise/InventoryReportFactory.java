package co.com.patterns.factorymethod.exercise;

public class InventoryReportFactory extends ReportFactory {
    @Override
    IReport createReport() {
        return new InventoryIReportImpl();
    }
}
