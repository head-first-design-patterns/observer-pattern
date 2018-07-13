public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

        weatherData.RegisterObserver(temperatureDisplay);
        weatherData.RegisterObserver(pressureDisplay);

        weatherData.SetMeasurements(20.5, 1.2);
        weatherData.SetMeasurements(40.5, 1.1);

        //global warming :P
        weatherData.SetMeasurements(60.5, 1.1);
    }
}
