package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@EqualsAndHashCode
@Setter
@Getter
@Data
@Entity
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
    @Builder
    public  City(Integer id,String Name,Integer RegionID){
        this.Id=id;
        this.Name=Name;
        this.RegionID=RegionID;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@JsonProperty("cityId")
    private Integer Id;
    
   // @JsonProperty("cityName")
    @NotBlank(message = "city name should not be empty")
    private String Name;
    
   // @JsonProperty("regionId")
    private Integer RegionID;
    @JsonProperty("lastModifiedDate")
    private String lastModified;
    @JsonProperty("image")
    private String image;
    @JsonProperty("timeTracking")
    private Boolean TimeTracking;
    @ManyToOne
    @JoinTable(name = "city_region",
            joinColumns = @JoinColumn(name = "city_id"),
            inverseJoinColumns = @JoinColumn(name = "region_id"))
    public Region region;
   // @JsonProperty("regionName")
    private String regionname;

}
