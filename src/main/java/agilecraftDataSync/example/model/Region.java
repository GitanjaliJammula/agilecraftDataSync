package agilecraftDataSync.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@Data
@Entity
public class Region {
    @Id
    @GeneratedValue
    private Integer ID;

    private String Flag;
    @NotBlank(message = "region name should not be empty")
    private String Region;
    private String Code;

    @Override
    public String toString() {
        return "Region [Flag=" + Flag + ", Region=" + Region + ", ID=" + ID + ", Code=" + Code + "]";
    }
}
