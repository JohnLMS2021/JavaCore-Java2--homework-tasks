package lesson7.homework;

import com.fasterxml.jackson.databind.JsonMappingException;
import lesson7.homework.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException, JsonMappingException;

}
