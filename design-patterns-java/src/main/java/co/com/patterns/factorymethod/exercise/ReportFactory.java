package co.com.patterns.factorymethod.exercise;

public abstract class ReportFactory {
    abstract IReport createReport();

    void generateReport() {
        IReport report = createReport();
        report.generateReport();
    }
}
