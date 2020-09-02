package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleaseVehicle {
    @JsonProperty("StoryPointsAcceptedTotal")
    private Integer StoryPointsAcceptedTotal;
    @JsonProperty("ContributingProgramsCount")
    private Integer ContributingProgramsCount;
    @JsonProperty("VehicleDate")
    private Date VehicleDate;
    @JsonProperty("StoryPointsTotal")
    private Integer StoryPointsTotal;
    @JsonProperty("PlanningIncrementID")
    private Integer PlanningIncrementID;
    @JsonProperty("VehicleName")
    private String VehicleName;
    @JsonProperty("StoriesPercentComplete")
    private Float StoriesPercentComplete;
    @JsonProperty("StoriesCount")
    private Integer StoriesCount;
    @JsonProperty("VehicleStartDate")
    private Date VehicleStartDate;
    @JsonProperty("VehicleGoLiveDate")
    private Date VehicleGoLiveDate;
    @JsonProperty("HealthID")
    private Integer HealthID;
    @JsonProperty("Features")
    private String[] Features;
    @JsonProperty("Status")
    private ReleaseVehicleStatus ReleaseVehicleStatus;
    @JsonProperty("VehicleClosedDate")
    private Date VehicleClosedDate;

    @JsonProperty("Stories")
    private String[] Stories;
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("ContributingTeamsCount")
    private Integer ContributingTeamsCount;
    @JsonProperty("OwnerID")
    private Integer OwnerID;
    @JsonProperty("DefectsCount")
    private Integer DefectsCount;
}
