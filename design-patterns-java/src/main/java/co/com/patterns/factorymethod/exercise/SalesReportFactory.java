package co.com.patterns.factorymethod.exercise;

public class SalesReportFactory extends ReportFactory {
    @Override
    IReport createReport() {
        return new SalesIReportImpl();
    }
}
