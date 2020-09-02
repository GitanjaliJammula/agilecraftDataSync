package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeTrackRole {

    @JsonProperty("Name")
    private String Name;
    @JsonProperty("ID")
    private Integer ID;
    @Override
    public String toString()
    {
        return "TimeTrackRoles [Name=" + Name + ", ID=" + ID + "]";
    }
}
