package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeClassifications {
    @JsonProperty("TotalResults")
    private String TotalResults;
    @JsonProperty("Results")
    private EmployeeClassification[] empclasses;
    @Override
    public String toString()
    {
        return "employeeClassifications [TotalResults = "+TotalResults+", Results = "+empclasses+"]";
    }
}
