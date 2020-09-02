package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeClassification {
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("Standard")
    private String Standard;
    @JsonProperty("Contractor")
    private String Contractor;
    @JsonProperty("ID")
    private Integer ID;
    @JsonProperty("LastModified")
    private String LastModified;
    @JsonProperty("IndividualRates")
    private String IndividualRates;
    @Override
    public String toString()
    {
        return "employeeclassification [Name = "+Name+", Standard = "+Standard+", Contractor = "+Contractor+", ID = "+ID+", LastModified = "+LastModified+", IndividualRates = "+IndividualRates+"]";
    }

}
