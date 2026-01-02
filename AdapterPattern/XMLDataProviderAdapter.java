package AdapterPattern;

public class XMLDataProviderAdapter implements IReports{
    XMLDataProvider xmlDataProvider;

    XMLDataProviderAdapter(XMLDataProvider xmlDataProvider) {
        this.xmlDataProvider = xmlDataProvider;
    }

    public String getJsonData(String data) {
        // 1. Get XML from the adaptee
        String xml = xmlDataProvider.getXMLData(data);

        // 2. Naïvely parse out <name> and <id> values
        int startName = xml.indexOf("<name>") + 6;
        int endName   = xml.indexOf("</name>");
        String name   = xml.substring(startName, endName);

        int startId = xml.indexOf("<id>") + 4;
        int endId   = xml.indexOf("</id>");
        String id    = xml.substring(startId, endId);

        // 3. Build and return JSON
        return "{\"name\":\"" + name + "\", \"id\":" + id + "}";
    }
}
