package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Regions {
    @JsonProperty("Name")
    private String totalResults;
    @JsonProperty("Results")
    private Region[] regions;
    @Override
    public String toString()
    {
        return "RegionResults [TotalResults = "+totalResults+", Results = "+regions+"]";
    }
}
