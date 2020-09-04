package agilecraftDataSync.example.bootstrap;

import agilecraftDataSync.example.Repositories.RegionRepository;
import agilecraftDataSync.example.model.Region;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class BootstrapOracle implements ApplicationListener<ContextRefreshedEvent> {
     private final RegionRepository regionRepository;

    public BootstrapOracle(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
           //loadRegions();
    }
    public void loadRegions(){
        Region region=new Region();
        region.setCode("IN");
        region.setFlag("null");
        region.setRegion("india");
        regionRepository.save(region);
        System.out.println("regions data loaded in bootstrap");
    }
}
