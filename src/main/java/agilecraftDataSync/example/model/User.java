package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Date;

@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @JsonProperty("ID")
    private Integer ID;
    @JsonProperty("Email")
    private String Email;
    @JsonProperty("FirstName")
    private String FirstName;
    @JsonProperty("LastName")
    private String LastName;
    @JsonProperty("Title")
    private String Title;
    @JsonProperty("UID")
    private String UID;
    @JsonProperty("RoleID")
    private Integer RoleID;
    @JsonProperty("ExternalID")
    private String ExternalID;
    @JsonProperty("CreateDate")
    private Date CreateDate;
    @JsonProperty("TimeApproverID")
    private Integer TimeApproverID;
    @JsonProperty("HoursPerWeek")
    private String HoursPerWeek;
    @JsonProperty("HolidayCalendar")
    private Integer HolidayCalendar;
    @JsonProperty("IsTimeTracker")
    private Boolean IsTimeTracker;
    @JsonProperty("RegionID")
    private Integer RegionID;
    @JsonProperty("LastLoginDate")
    private Date LastLoginDate;
    @JsonProperty("EnterpirseHierarchy")
    private Integer EnterpirseHierarchy;
    @JsonProperty("IsUserManager")
    private Boolean IsUserManager;
    @JsonProperty("IsComplianceManager")
    private Boolean  IsComplianceManager;
    @JsonProperty("HolidayCityID")
    private Integer HolidayCityID;
    @JsonProperty("CityID")
    private Integer CityID;
    @JsonProperty("EmployeeClassification")
    private Integer EmployeeClassification;
    @JsonProperty("TimeTrackRoles")
    private TimeTrackRole[] timeTrackRoles;
    @JsonProperty("TimeTrackingStartDate")
    private String TimeTrackingStartDate;
    @JsonProperty("UserStartDate")
        private String UserStartDate;
    @JsonProperty("UserEndDate")
    private String UserEndDate;
    @JsonProperty("ManagerID")
    private Integer ManagerID;
    @JsonProperty("Notes")
    private String Notes;
    @JsonProperty("LastModified")
    private Date LastModified;
    @JsonProperty("Locked")
    private Boolean Locked;
    @JsonProperty("IncludeHours")
    private Boolean IncludeHours;
    @JsonProperty("CostCenterID")
    private Integer CostCenterID;
    @JsonProperty("ContractorManagerID")
    private Integer ContractorManagerID;
    @Override
    public String toString() {
        return "User [Email=" + Email + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Title=" + Title
                + ", RoleID=" + RoleID + ", ExternalID=" + ExternalID + ", HoursPerWeek=" + HoursPerWeek
                + ", IsTimeTracker=" + IsTimeTracker + ", RegionID=" + RegionID + ", EnterpirseHierarchy="
                + EnterpirseHierarchy + ", IsUserManager=" + IsUserManager + ", CityID=" + CityID
                + ", EmployeeClassification=" + EmployeeClassification + ", TimeTrackRoles="
                + Arrays.toString(timeTrackRoles) + ", UserStartDate=" + UserStartDate + ", ManagerID=" + ManagerID
                + ", CostCenterID=" + CostCenterID + "	, TimeApproverID=" + TimeApproverID + ", TimeTrackingStartDate="
                + TimeTrackingStartDate + ", ContractorManagerID=" + ContractorManagerID + ", IncludeHours=" + IncludeHours + "]";
    }
}
