package agilecraftDataSync.example.Repositories;

import agilecraftDataSync.example.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {

}
