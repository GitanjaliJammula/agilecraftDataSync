package agilecraftDataSync.example.Controllers.v1;

import agilecraftDataSync.example.Services.CityService;
import agilecraftDataSync.example.model.City;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(CityControllerAPI.BASE_URL)
public class CityControllerAPI {
    public static final String BASE_URL = "/api/v1/cities";

    private final CityService cityService;

    public CityControllerAPI(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<City> getallCities(){

        return (cityService.findAll());
    }
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Optional<City> getCustomerById(@PathVariable String id){

        return cityService.getById((id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public City createNewCustomer(@RequestBody City city){
        return cityService.save(city);
    }


    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@PathVariable String id){
        cityService.deleteById(id);
    }
    @PutMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public City updateCustomer(@PathVariable String id, @RequestBody City city){

       // city.setId(Integer.parseInt(id));
        return cityService.put(id,city);
    }

    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public City patchCustomer(@PathVariable String id, @RequestBody City city){
        return cityService.patchCity(id, city);
    }
}
