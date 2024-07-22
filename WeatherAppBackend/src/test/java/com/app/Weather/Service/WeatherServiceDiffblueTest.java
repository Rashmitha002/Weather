package com.app.Weather.Service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.app.Weather.Entity.Weather;
import com.app.Weather.Repo.WeatherRepo;
import com.app.Weather.WeatherServiceException;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@ContextConfiguration(classes = {WeatherService.class})
@ExtendWith(SpringExtension.class)
class WeatherServiceDiffblueTest {
    @MockBean
    private RestTemplate restTemplate;

    @MockBean
    private WeatherRepo weatherRepo;

    @Autowired
    private WeatherService weatherService;

    /**
     * Method under test: {@link WeatherService#getWeatherData(String)}
     */
    @Test
    void testGetWeatherData() throws RestClientException {
        Weather weather = new Weather();
        weather.setAddress("42 Main St");
        weather.setDays(new ArrayList<>());
        weather.setDescription("The characteristics of someone or something");
        weather.setId(1L);
        weather.setLatitude(10.0f);
        weather.setLongitude(10.0f);
        weather.setQueryCost(1);
        weather.setTimezone("UTC");
        when(restTemplate.getForObject(Mockito.<String>any(), Mockito.<Class<Weather>>any(), (Object[]) any()))
                .thenReturn(weather);

        Weather weather2 = new Weather();
        weather2.setAddress("42 Main St");
        weather2.setDays(new ArrayList<>());
        weather2.setDescription("The characteristics of someone or something");
        weather2.setId(1L);
        weather2.setLatitude(10.0f);
        weather2.setLongitude(10.0f);
        weather2.setQueryCost(1);
        weather2.setTimezone("UTC");
        when(weatherRepo.save(Mockito.<Weather>any())).thenReturn(weather2);
        Weather actualWeatherData = weatherService.getWeatherData("Oxford");
        verify(weatherRepo).save(Mockito.<Weather>any());


    }

    @Test
    void testGetWeatherData2() throws RestClientException {
        Weather weather = new Weather();
        weather.setAddress("42 Main St");
        weather.setDays(new ArrayList<>());
        weather.setDescription("The characteristics of someone or something");
        weather.setId(1L);
        weather.setLatitude(10.0f);
        weather.setLongitude(10.0f);
        weather.setQueryCost(1);
        weather.setTimezone("UTC");
        when(restTemplate.getForObject(Mockito.<String>any(), Mockito.<Class<Weather>>any(), (Object[]) any()))
                .thenReturn(weather);
        when(weatherRepo.save(Mockito.<Weather>any())).thenThrow(new WeatherServiceException("An error occurred"));
        assertThrows(WeatherServiceException.class, () -> weatherService.getWeatherData("Oxford"));
        verify(weatherRepo).save(Mockito.<Weather>any());

    }


    @Test
    void testGetHistoryData() throws RestClientException {
        Weather weather = new Weather();
        weather.setAddress("42 Main St");
        weather.setDays(new ArrayList<>());
        weather.setDescription("The characteristics of someone or something");
        weather.setId(1L);
        weather.setLatitude(10.0f);
        weather.setLongitude(10.0f);
        weather.setQueryCost(1);
        weather.setTimezone("UTC");
        when(restTemplate.getForObject(Mockito.<String>any(), Mockito.<Class<Weather>>any(), (Object[]) any()))
                .thenReturn(weather);

        Weather weather2 = new Weather();
        weather2.setAddress("42 Main St");
        weather2.setDays(new ArrayList<>());
        weather2.setDescription("The characteristics of someone or something");
        weather2.setId(1L);
        weather2.setLatitude(10.0f);
        weather2.setLongitude(10.0f);
        weather2.setQueryCost(1);
        weather2.setTimezone("UTC");
        when(weatherRepo.save(Mockito.<Weather>any())).thenReturn(weather2);
        Weather actualHistoryData = weatherService.getHistoryData("Oxford");
        verify(weatherRepo).save(Mockito.<Weather>any());

    }


    @Test
    void testGetHistoryData2() throws RestClientException {
        Weather weather = new Weather();
        weather.setAddress("42 Main St");
        weather.setDays(new ArrayList<>());
        weather.setDescription("The characteristics of someone or something");
        weather.setId(1L);
        weather.setLatitude(10.0f);
        weather.setLongitude(10.0f);
        weather.setQueryCost(1);
        weather.setTimezone("UTC");
        when(restTemplate.getForObject(Mockito.<String>any(), Mockito.<Class<Weather>>any(), (Object[]) any()))
                .thenReturn(weather);
        when(weatherRepo.save(Mockito.<Weather>any())).thenThrow(new WeatherServiceException("An error occurred"));
        assertThrows(WeatherServiceException.class, () -> weatherService.getHistoryData("Oxford"));
        verify(weatherRepo).save(Mockito.<Weather>any());

    }


    @Test
    void testGetWeatherForecast() throws RestClientException {
        Weather weather = new Weather();
        weather.setAddress("42 Main St");
        weather.setDays(new ArrayList<>());
        weather.setDescription("The characteristics of someone or something");
        weather.setId(1L);
        weather.setLatitude(10.0f);
        weather.setLongitude(10.0f);
        weather.setQueryCost(1);
        weather.setTimezone("UTC");
        when(restTemplate.getForObject(Mockito.<String>any(), Mockito.<Class<Weather>>any(), (Object[]) any()))
                .thenReturn(weather);

        Weather weather2 = new Weather();
        weather2.setAddress("42 Main St");
        weather2.setDays(new ArrayList<>());
        weather2.setDescription("The characteristics of someone or something");
        weather2.setId(1L);
        weather2.setLatitude(10.0f);
        weather2.setLongitude(10.0f);
        weather2.setQueryCost(1);
        weather2.setTimezone("UTC");
        when(weatherRepo.save(Mockito.<Weather>any())).thenReturn(weather2);
        Weather actualWeatherForecast = weatherService.getWeatherForecast("Oxford");
        verify(weatherRepo).save(Mockito.<Weather>any());

    }


    @Test
    void testGetWeatherForecast2() throws RestClientException {
        Weather weather = new Weather();
        weather.setAddress("42 Main St");
        weather.setDays(new ArrayList<>());
        weather.setDescription("The characteristics of someone or something");
        weather.setId(1L);
        weather.setLatitude(10.0f);
        weather.setLongitude(10.0f);
        weather.setQueryCost(1);
        weather.setTimezone("UTC");
        when(restTemplate.getForObject(Mockito.<String>any(), Mockito.<Class<Weather>>any(), (Object[]) any()))
                .thenReturn(weather);
        when(weatherRepo.save(Mockito.<Weather>any())).thenThrow(new WeatherServiceException("An error occurred"));
        assertThrows(WeatherServiceException.class, () -> weatherService.getWeatherForecast("Oxford"));
        verify(weatherRepo).save(Mockito.<Weather>any());

    }
}
