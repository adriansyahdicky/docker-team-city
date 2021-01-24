package co.id.teamcity.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "member")
@Entity
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String uuid;

    private String name;

    private String mobile;

    private String email;

    @Column(name = "gender_id")
    private Integer genderId;

    @Column(name = "marital_id")
    private Integer maritalId;

    private String ktp;

    @Column(name = "tax_id")
    private String taxId;

    @Column(name = "home_address")
    private String homeAddress;

    @Column(name = "home_geo_id")
    private Integer homeGeoId;

    @Column(name = "date_of_birth")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

}
