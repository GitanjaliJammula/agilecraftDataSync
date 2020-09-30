package agilecraftDataSync.example.Controllers.v1;

import agilecraftDataSync.example.Services.CityService;
import agilecraftDataSync.example.Services.RegionService;
import agilecraftDataSync.example.model.City;
import agilecraftDataSync.example.model.Region;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(RegionControllerAPI.BASE_URL)
public class RegionControllerAPI {
    public static final String BASE_URL = "/api/v1/regions";

    private final CityService cityService;
    private final RegionService regionService;


    public RegionControllerAPI(CityService cityService, RegionService regionService) {
        this.cityService = cityService;
        this.regionService = regionService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Region> getallregions(){

        return (regionService.findAll());
    }
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Optional<Region> getCustomerById(@PathVariable String id){

        return regionService.getById((id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public City createNewCustomer(@RequestBody Region region){
        return regionService.save(region);
    }


    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@PathVariable String id){
        regionService.deleteById(id);
    }
    @PutMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Region updateRegion(@PathVariable String id, @RequestBody Region region){

        // city.setId(Integer.parseInt(id));
        return regionService.put(id,region);
    }

    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Region patchRegion(@PathVariable String id, @RequestBody Region region){
        return regionService.patchRegion(id, region);
    }
}
