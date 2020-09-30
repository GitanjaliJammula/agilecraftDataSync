package agilecraftDataSync.example;

import agilecraftDataSync.example.Repositories.CityRepository;
import agilecraftDataSync.example.Repositories.RegionRepository;
import agilecraftDataSync.example.Services.CityService;
import agilecraftDataSync.example.Services.CityServiceImpl;
import agilecraftDataSync.example.model.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CityServiceImplTest {
    CityService cityService;
    CityServiceImpl cityServiceimpl;
    CityRepository cityRepository;
    RegionRepository regionRepository;
    @BeforeEach
    void  setUp(){
         cityServiceimpl=new CityServiceImpl(cityRepository, regionRepository);
         City city= new City();
         city.setId(2);
         cityServiceimpl.save(city);
    }
    @Test
    void findAll(){
            List<City>cities=cityRepository.findAll();
            //cities.size()==1
    }

}
