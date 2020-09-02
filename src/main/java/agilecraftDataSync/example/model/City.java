package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@EqualsAndHashCode
@Setter
@Getter
@Data
public class City {
    @JsonProperty("ID")
    private Integer Id;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("RegionID")
    private Integer RegionID;
    @JsonProperty("LastModified")
    private String lastModified;
    @JsonProperty("Image")
    private String image;
    @JsonProperty("ApplyTimeTracking")
    private Boolean TimeTracking;

    @Override
    public String toString() {
        return "City [Id=" + Id + ", Name=" + Name + ", RegionID=" + RegionID + ", image=" + image + "]";
    }
}
