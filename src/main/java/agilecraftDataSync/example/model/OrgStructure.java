package agilecraftDataSync.example.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgStructure {
    @JsonProperty("CategoryName")
    private String CategoryName;
    @JsonProperty("CategoryID")
    private Integer CategoryID;
    @JsonProperty("CompanyCode")
    private String CompanyCode;
    @JsonProperty("costCenterName")
    private String CostCenterName;
    @JsonProperty("ProductID")
    private Integer ProductID;
    @JsonProperty("OrganizationStructureName")
    private String OrganizationStructureName;
    @JsonProperty("ProductName")
    private String ProductName;
    @JsonProperty("ParentOrganizationStructureID")
    private Integer ParentOrganizationStructureID;
    @JsonProperty("CostCenterID")
    private Integer CostCenterID;
    @JsonProperty("OrganizationStructureID")
    private Integer OrganizationStructureID;
    @JsonProperty("ParentOrganizationStructureName")
    private String ParentOrganizationStructureName;


    @Override
    public String toString()
    {
        return "OrgStructure [CategoryName = "+CategoryName+", CategoryID = "+CategoryID+", CompanyCode = "+CompanyCode+", CostCenterName = "+CostCenterName+", ProductID = "+ProductID+", OrganizationStructureName = "+OrganizationStructureName+", ProductName = "+ProductName+", ParentOrganizationStructureID = "+ParentOrganizationStructureID+", CostCenterID = "+CostCenterID+", OrganizationStructureID = "+OrganizationStructureID+", ParentOrganizationStructureName = "+ParentOrganizationStructureName+"]";
    }
}
