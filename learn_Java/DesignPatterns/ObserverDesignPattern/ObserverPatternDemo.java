import java.util.ArrayList;
import java.util.List;

// Subject Interface (Weather Data)
interface WeatherSubject {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}

// Concrete Subject (Weather Station)
class WeatherStation implements WeatherSubject {
    private List<WeatherObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    public void setWeather(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    public float getTemperature() { return temperature; }
    public float getHumidity() { return humidity; }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}

// Observer Interface
interface WeatherObserver {
    void update(float temperature, float humidity);
}

// Concrete Observer 1: Current Conditions Display
class CurrentConditionsDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Current Conditions: Temperature = " + temperature + "°C, Humidity = " + humidity + "%");
    }
}

// Concrete Observer 2: Forecast Display
class ForecastDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Forecast: " + (temperature > 25 ? "Hot weather ahead!" : "Cool weather ahead!"));
    }
}

// Main Application
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        // Adding observers
        WeatherObserver currentDisplay = new CurrentConditionsDisplay();
        WeatherObserver forecastDisplay = new ForecastDisplay();
        
        station.addObserver(currentDisplay);
        station.addObserver(forecastDisplay);

        // Simulating weather changes
        System.out.println("🔹 Weather Update 1:");
        station.setWeather(28, 65);
        
        System.out.println("\n🔹 Weather Update 2:");
        station.setWeather(20, 80);
    }
}

