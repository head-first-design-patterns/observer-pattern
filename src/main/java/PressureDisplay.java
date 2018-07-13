public class PressureDisplay implements Observer {
    private WeatherData weatherData;

    public PressureDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void update() {
        double updatedPressure =  weatherData.GetPressure();

        System.out.println("Current Pressure is " + updatedPressure);
    }
}
