package agilecraftDataSync.example.Controllers;

import agilecraftDataSync.example.Services.CityService;
import agilecraftDataSync.example.Services.RegionService;
import agilecraftDataSync.example.model.City;
import agilecraftDataSync.example.model.Region;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class CityController {
    private final CityService cityService;
    private final RegionService regionService;

    public CityController(CityService cityService, RegionService regionService) {
        this.cityService = cityService;
        this.regionService = regionService;
    }

    @RequestMapping({"cities","/cities"})
    public  String getCities(Model model){
        System.out.println("cities show");
        model.addAttribute("citieslist",cityService.findAll());

        return "cities/citiesShow";
    }

    @RequestMapping({"/city/{cityId}/delete"})
    public  String cityDelete(@PathVariable String cityId, Model model){
        cityService.deleteById(cityId);
        return "redirect:/cities";
    }
    @RequestMapping({"/city/{cityId}"})
    public  String cityView(@PathVariable String cityId, Model model){
        System.out.println("city view");
        model.addAttribute("onlyonecity",cityService.getById(cityId));
        return "cities/cityShow";
    }
    @RequestMapping({"/city/new"})
    public  String cityNew1( Model model){
        System.out.println("city new");
        City city=new City();
        model.addAttribute("NewCity",city);
        return "cities/citynew";
    }
    @PostMapping({"/city/new/create"})
    public  String citysave(@ModelAttribute("NewCity") City city){
        System.out.println("city saving");
        //cityService.save(city);
        System.out.println("city saving ..........");
        //Optional<Region> region=regionService.getById(regionId);
        List<Region>listRegions=regionService.findAll();
        System.out.println(listRegions.size()+"  size of regions");
        int c=0;
        for (int i=0;i<listRegions.size();i++){
            Region region=listRegions.get(i);
            System.out.println(region.getRegion()+"  get region name");
            System.out.println(city.getRegionname()+"  get region name in city");
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
            regionService.save(region);
            city.setRegion(region);
            city.setRegionID(region.getID());
        }
        System.out.println(city.getId()+"  new city  id ");
        System.out.println(city.getName()+"  new city  name ");
        System.out.println(city.getRegionname()+"  new city  region name ");

        cityService.save(city);
        System.out.println("new city saved");

        //model.addAttribute("oneregion",regionService.getById(regionId));
        return "redirect:/cities";
    }
    @RequestMapping({"/city/{cityId}/edit"})
    public  String cityNew( @PathVariable String cityId,Model model){
        System.out.println("city edit");
        Optional<City> city=cityService.getById(cityId);
        model.addAttribute("NewCity",city);
        return "cities/citynew";
    }
}
