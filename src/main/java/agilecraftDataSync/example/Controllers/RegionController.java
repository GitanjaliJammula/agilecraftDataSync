package agilecraftDataSync.example.Controllers;

import agilecraftDataSync.example.Services.RegionService;
import agilecraftDataSync.example.model.Region;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class RegionController {
    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @RequestMapping({"regions","/regions"})
    public  String getRegions(Model model){
       model.addAttribute("regionlist",regionService.findAll());
        return "regions/regionsShow";
    }
    @RequestMapping({"/region/{regionId}/delete"})
    public  String regionDelete(@PathVariable String regionId, Model model){
         regionService.deleteById(regionId);
        return "redirect:/regions";
    }
    @RequestMapping({"/region/{regionId}"})
    public  String regionView(@PathVariable String regionId, Model model){
        System.out.println("region view");
        model.addAttribute("oneregion",regionService.getById(regionId));
        return "regions/regionShow";
    }
    @RequestMapping({"/region/new"})
    public  String regionNew( Model model){
        System.out.println("region new");
        Region region=new Region();
        model.addAttribute("newregion",region);
        return "regions/regionnew";
    }
    @PostMapping({"/region/new/create"})
    public  String regionsave(@ModelAttribute("newregion") Region region){
        //System.out.println("region save");
        //Optional<Region> region=regionService.getById(regionId);
        regionService.save(region);
        //model.addAttribute("oneregion",regionService.getById(regionId));
        return "redirect:/regions";
    }
    @RequestMapping({"/region/{regionId}/edit"})
    public  String regionNew( @PathVariable String regionId,Model model){
        System.out.println("region edit");
        Optional<Region> region=regionService.getById(regionId);
        model.addAttribute("newregion",region);
        return "regions/regionnew";
    }
}
