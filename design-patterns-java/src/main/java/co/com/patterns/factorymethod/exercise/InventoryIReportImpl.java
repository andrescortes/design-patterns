package co.com.patterns.factorymethod.exercise;

public class InventoryIReportImpl implements IReport {
    @Override
    public void generateReport() {
        System.out.println("Generating Inventory Report");
    }
}
