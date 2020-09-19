package agilecraftDataSync.example.Services;

import agilecraftDataSync.example.model.City;
import agilecraftDataSync.example.model.Region;

import java.util.List;
import java.util.Optional;

public interface RegionService {
    List<Region>findAll();
      void deleteById(String id);
      Optional<Region> getById(String id);
      City save(Region region);
      Region put(String id, Region region);
      Region patchRegion(String id,Region region);
}
