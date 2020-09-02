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
public class ReleaseVehicleStatus {

    @JsonProperty("Name")
    private String Name;
    @JsonProperty("ID")
    private String ID;
    @Override
    public String toString()
    {
        return "ReleaseVehicleStatus [Name = "+Name+", ID = "+ID+"]";
    }
}
