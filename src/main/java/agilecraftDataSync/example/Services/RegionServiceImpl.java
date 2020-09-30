package agilecraftDataSync.example.Services;

import agilecraftDataSync.example.Repositories.RegionRepository;
import agilecraftDataSync.example.model.City;
import agilecraftDataSync.example.model.Region;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionServiceImpl implements RegionService {
    private final RegionRepository regionRepository ;

    public RegionServiceImpl(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }


    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
       // return null;
    }

    @Override
    public void deleteById(String id) {
        regionRepository.deleteById(Integer.valueOf(id));
    }

    @Override
    public Optional<Region> getById(String id) {
        return regionRepository.findById(Integer.valueOf(id));
    }

    @Override
    public City save(Region region) {
        regionRepository.save(region);
        return null;
    }

    @Override
    public Region put(String id, Region region) {
        region.setID(Integer.parseInt(id));
        regionRepository.save(region);
        return  region;
    }

    @Override
    public Region patchRegion(String id, Region region) {
        Region region1=regionRepository.findById(Integer.parseInt(id)).get();
        if(region.getRegion()!=null){
            region1.setRegion(region.getRegion());
        }
        if(region.getCode()!=null){
            region1.setCode(region.getCode());
        }
        if(region.getFlag()!=null){
            region1.setFlag(region.getFlag());
        }
        regionRepository.save(region1);
        return  region1;
    }

}
