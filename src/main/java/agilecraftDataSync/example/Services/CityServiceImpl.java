package agilecraftDataSync.example.Services;

import agilecraftDataSync.example.Repositories.CityRepository;
import agilecraftDataSync.example.Repositories.RegionRepository;
import agilecraftDataSync.example.model.City;
import agilecraftDataSync.example.model.Region;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;
    private final RegionRepository regionRepository;

    public CityServiceImpl(CityRepository cityRepository, RegionRepository regionRepository) {
        this.cityRepository = cityRepository;
        this.regionRepository = regionRepository;
    }
    @Override
    public List<City> findAll() {
        return (List<City>) cityRepository.findAll();
        // return null;
    }

    @Override
    public void deleteById(String id) {
          cityRepository.deleteById(Integer.valueOf(id));
    }

    @Override
    public Optional<City> getById(String id) {

        return cityRepository.findById(Integer.valueOf(id));
    }

    @Override
    public City save(City city) {

        cityRepository.save(city);
        return city;
    }

    @Override
    public City patchCity(String id, City patchcity) {
        Optional<City> optionalcity = cityRepository.findById(Integer.parseInt(id));
              City city = optionalcity.get();
              if(patchcity.getRegionname() != null){
                  List<Region>listRegions=regionRepository.findAll();
                  city.setRegionname(patchcity.getRegionname());
                  int c=0;
                  for (int i=0;i<listRegions.size();i++){
                      Region region=listRegions.get(i);
                      if(region.getRegion().equals(patchcity.getRegionname())){
                          System.out.println(region.getID()+"  get region id ");
                          city.setRegionID(region.getID());
                          city.setRegion(region);
                          System.out.println(city.getRegionID()+"  get city region id ");
                          c=1;
                          break;
                      }
                  }
                  if(c==0){
                      Region region = new Region();
                      region.setRegion(city.getRegionname());
                      regionRepository.save(region);
                      city.setRegion(region);
                      city.setRegionID(region.getID());
                  }
              }
             if(patchcity.getName() != null){
                city.setName(patchcity.getName());
             }
             if(patchcity.getRegionID() != null){
               city.setRegionID(patchcity.getRegionID());
               Optional<Region> optionalRegion = regionRepository.findById(patchcity.getRegionID());
               Region region=optionalRegion.get();
               city.setRegion(region);

             }
             if(patchcity.getLastModified() != null){
                city.setLastModified(patchcity.getLastModified());
             }
             if(patchcity.getTimeTracking() != null){
                city.setTimeTracking(patchcity.getTimeTracking());
             }
             return  city;

    }

    @Override
    public City put(String id,City city) {
       // city.setId(Integer.parseInt(id));
        Optional<City> optionalcity = cityRepository.findById(Integer.parseInt(id));
        City city1 = optionalcity.get();
        if(!city.getRegionID().equals(city1.getRegionID())){
            System.out.println("region id's are different");
            if(regionRepository.findById(city.getRegionID()).isPresent()){
                city.setRegion(regionRepository.findById(city.getRegionID()).get());
                city.getRegion().setID(regionRepository.findById(city.getRegionID()).get().getID());
                city.getRegion().setRegion(regionRepository.findById(city.getRegionID()).get().getRegion());
                city.setRegionID(regionRepository.findById(city.getRegionID()).get().getID());
                cityRepository.save(city);
            }
            else{
                Region region = new Region();
                region.setID(city.getRegionID());
                regionRepository.save(region);
                city.setRegion(region);
                city.setRegionID(region.getID());
            }
        }
        if(!city.getRegionname().equals(city1.getRegionname())){
            List<Region>listRegions=regionRepository.findAll();
            //city.setRegionname(patchcity.getRegionname());
            int c=0;
            for (int i=0;i<listRegions.size();i++){
                Region region=listRegions.get(i);
                if(region.getRegion().equals(city.getRegionname())){
                    System.out.println(region.getID()+"  get region id ");
                    city.setRegionID(region.getID());
                    city.setRegion(region);
                    System.out.println(city.getRegionID()+"  get city region id ");
                    c=1;
                    break;
                }
            }
            if(c==0){
                Region region = new Region();
                region.setRegion(city.getRegionname());
                regionRepository.save(region);
                city.setRegion(region);
                city.setRegionID(region.getID());
            }
        }
        city.setId(Integer.parseInt(id));
        cityRepository.save(city);
        return city;
    }


}
