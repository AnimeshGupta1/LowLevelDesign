package AdapterPattern;

public class Client {
    public void getReport(IReports report, String RawData) {
        System.out.println("Processed JSON: " + report.getJsonData(RawData));
    }
}
