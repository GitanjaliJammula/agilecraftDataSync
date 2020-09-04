package agilecraftDataSync.example.Services;

import agilecraftDataSync.example.Repositories.RegionRepository;
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
    public void save(Region region) {
        regionRepository.save(region);
    }

}
