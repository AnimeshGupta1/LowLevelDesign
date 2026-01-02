package AdapterPattern;

public class AdapterPattern {
    public static void main(String[] args) {
        XMLDataProvider xmlDataProvider = new XMLDataProvider();
        IReports adapter = new XMLDataProviderAdapter(xmlDataProvider);
        String rawData = "Alice:42";
        Client client = new Client();
        client.getReport(adapter, rawData);

    }
}
