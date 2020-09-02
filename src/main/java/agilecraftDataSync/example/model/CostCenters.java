package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CostCenters {
    @JsonProperty("TotalResults")
    private String TotalResults;
    @JsonProperty("Results")
    private CostCenter[] costCenters;

    @Override
    public String toString()
    {
        return "Costcenters [TotalResults = "+TotalResults+", Results = "+costCenters+"]";
    }
}


