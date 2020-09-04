package agilecraftDataSync.example.Repositories;

import agilecraftDataSync.example.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RegionRepository extends JpaRepository<Region,Integer>{

}
