package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Arrays;

@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Citys {
    @JsonProperty("TotalResults")
    private Integer totalResults;

    @JsonProperty("Results")
    private City[] cities;

    @Override
    public String toString() {
        return "Citys [totalResults=" + totalResults + ", cities=" + Arrays.toString(cities) + "]";
    }


}
