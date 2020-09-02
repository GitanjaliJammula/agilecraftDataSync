package agilecraftDataSync.example.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgStructures {

    @JsonProperty("TotalResults")
    private String totalResults;

    @JsonProperty("Results")
    private OrgStructure[] orgStructures;
    @Override
    public String toString()
    {
        return "orgStructures [TotalResults = "+totalResults+", Results = "+orgStructures+"]";
    }


}

