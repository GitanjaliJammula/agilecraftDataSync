package agilecraftDataSync.example.bootstrap;

import agilecraftDataSync.example.Repositories.CityRepository;
import agilecraftDataSync.example.Repositories.RegionRepository;
import agilecraftDataSync.example.model.City;
import agilecraftDataSync.example.model.Citys;
import agilecraftDataSync.example.model.Region;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class BootstrapOracle implements ApplicationListener<ContextRefreshedEvent> {
     private final RegionRepository regionRepository;
      private final CityRepository cityRepository;

    public BootstrapOracle(RegionRepository regionRepository, CityRepository cityRepository) {
        this.regionRepository = regionRepository;
        this.cityRepository = cityRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
          // loadRegions();
           //loadCities();
    }
    public void loadRegions(){
        Region region=new Region();
        region.setCode("IN");
        region.setFlag("null");
        region.setRegion("india");
       // regionRepository.save(region);
        System.out.println("regions data loaded in bootstrap");
    }
    public void loadCities(){
        City city=new City();
        Citys citys=new Citys();
        city.setImage("nrt");
        city.setLastModified("9/4/2020");
        city.setName("narasaraopet");
        Region region=new Region();
        region.setCode("IN");
        region.setFlag("null");
        region.setRegion("india");
        regionRepository.save(region);
        city.setRegionname(region.getRegion());
        city.setRegionID(region.getID());
        city.setRegion(region);
        cityRepository.save(city);


    }
}
