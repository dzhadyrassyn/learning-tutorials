package dzhadyrassyn.coding.challenges.designpatterns.tutorials.chapter02.observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherData);
        weatherData.setMeasurements(10f, 12f, 15f);
        weatherData.setMeasurements(20.2f, 15.4f, 14.4f);
        weatherData.setMeasurements(10f, 13.3f, 110.5f);

        weatherData.removeObserver(phoneDisplay);

        weatherData.setMeasurements(10f, 12f, 15f);
        weatherData.setMeasurements(10f, 12f, 15f);
        weatherData.setMeasurements(10f, 12f, 15f);
        weatherData.setMeasurements(10f, 12f, 15f);
    }
}
