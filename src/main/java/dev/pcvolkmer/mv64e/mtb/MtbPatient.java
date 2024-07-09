package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class MtbPatient {
    private Address address;
    private Date birthDate;
    private Date dateOfDeath;
    private CodingGender gender;
    private String id;
    private String insurance;

    @JsonProperty("address")
    public Address getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(Address value) { this.address = value; }

    @JsonProperty("birthDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getBirthDate() { return birthDate; }
    @JsonProperty("birthDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setBirthDate(Date value) { this.birthDate = value; }

    @JsonProperty("dateOfDeath")
    public Date getDateOfDeath() { return dateOfDeath; }
    @JsonProperty("dateOfDeath")
    public void setDateOfDeath(Date value) { this.dateOfDeath = value; }

    @JsonProperty("gender")
    public CodingGender getGender() { return gender; }
    @JsonProperty("gender")
    public void setGender(CodingGender value) { this.gender = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("insurance")
    public String getInsurance() { return insurance; }
    @JsonProperty("insurance")
    public void setInsurance(String value) { this.insurance = value; }
}
