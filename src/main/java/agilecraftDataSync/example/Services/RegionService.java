package agilecraftDataSync.example.Services;

import agilecraftDataSync.example.model.Region;

import java.util.List;
import java.util.Optional;

public interface RegionService {
    List<Region>findAll();
      void deleteById(String id);
      Optional<Region> getById(String id);
      void save(Region region);
}
