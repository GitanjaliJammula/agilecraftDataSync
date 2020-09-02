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
public class Region {
    @JsonProperty("Flag")
    private String Flag;
    @JsonProperty("Region")
    private String Region;
    @JsonProperty("ID")
    private Integer ID;
    @JsonProperty("Code")
    private String Code;
    @Override
    public String toString() {
        return "Region [Flag=" + Flag + ", Region=" + Region + ", ID=" + ID + ", Code=" + Code + "]";
    }
}
