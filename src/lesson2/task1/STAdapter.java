package lesson2.task1;

import java.time.LocalDateTime;

public class STAdapter implements MeteoSensor {
    private SensorTemperature st;

    public STAdapter(SensorTemperature st) {
        this.st = st;
    }

    @Override
    public int getId() {
        return 2000 + st.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) st.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.of(st.year(), 1, 1, 0, 0, 0)
                .plusDays(st.day())
                .plusSeconds(st.second());
    }
}
