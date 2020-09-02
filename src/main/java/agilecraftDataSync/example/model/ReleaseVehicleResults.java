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
public class ReleaseVehicleResults {
    private String Self;
    @JsonProperty("TotalResults")
    private String TotalResults;
    @JsonProperty("Results")
    private ReleaseVehicle[] ReleaseVehicles;
    @Override
    public String toString()
    {
        return "ReleaseVehicleResults [TotalResults = "+TotalResults+", Results = "+ReleaseVehicles+"]";
    }
}
