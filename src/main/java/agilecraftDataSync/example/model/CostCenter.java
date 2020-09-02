package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CostCenter {
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("RegionID")
    private String RegionID;
    @JsonProperty("Owner")
    private String Owner;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("Region")
    private String Region;
    @JsonProperty("ID")
    private Integer ID;
    @JsonProperty("OwnerID")
    private String OwnerID;

    private String Identifier;
    @Override
    public String toString() {
        return "CostCenter [Name=" + Name + ", RegionID=" + RegionID + ", Owner=" + Owner + ", Description="
                + Description + ", Region=" + Region + ", ID=" + ID + ", OwnerID=" + OwnerID + ", Identifier="
                + Identifier + "]";
    }

}
