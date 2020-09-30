package agilecraftDataSync.example.Services;

import agilecraftDataSync.example.model.City;

import java.util.List;
import java.util.Optional;

public interface CityService {
    List<City> findAll();
    void deleteById(String id);
    Optional<City> getById(String id);
    City save(City city);
    City patchCity(String id, City city);
    City put(String id,City city);
}
