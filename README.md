## Observer Pattern

This is an implementation of Observer pattern, also known as pub-sub pattern.

### Understanding the code

- WeatherData is the subject/publisher.
- All displays subscribe to/observer/listen for changes in state of weather.
- As soon as weather changes, WeatherData updates all its subscribers/listeners/observers that some state has changed.
- All observers on being updated of state change, `pull` the data they need from the publisher/subject

### Running the code

```
cd src/main/java
javac WeatherStation.java
java WeatherStation

```
