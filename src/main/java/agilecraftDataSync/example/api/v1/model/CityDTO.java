package agilecraftDataSync.example.api.v1.model;

import agilecraftDataSync.example.model.Region;
import lombok.Data;

@Data
public class CityDTO {
    private Integer Id;
    private String Name;
    private Integer RegionID;
    private String lastModified;
    private String image;
    private Boolean TimeTracking;
   // private String regionname;
    private Region region;
    private String regionname;


}
