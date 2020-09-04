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
public class UserFilter {
    @JsonProperty("ExternalID")
    private String ExternalID;
    public String getExternalID ()
    {
        return ExternalID;
    }

    @Override
    public String toString()
    {
        return "UserFilter [ExternalID = "+ExternalID+"]";
    }
}
