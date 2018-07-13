public class TemperatureDisplay implements Observer{
    private WeatherData weatherData;

    public TemperatureDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void update() {
        double updatedTemperature =  weatherData.GetTemperature();

        System.out.println("Current Temperature is " + updatedTemperature);
    }
}
