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
public class UserSearchResponse {

    @JsonProperty("TotalResults")
    private Integer totalResults;

    @JsonProperty("Filter")
    private UserFilter filter;

    @JsonProperty("Results")
    private Employee[] results;
}
