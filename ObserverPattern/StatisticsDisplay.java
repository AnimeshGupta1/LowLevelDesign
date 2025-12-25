public class StatisticsDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
    
     public void display() {
        System.out.println(temperature + " F degrees and" + humidity + " % humidity STATS");
    }

}
