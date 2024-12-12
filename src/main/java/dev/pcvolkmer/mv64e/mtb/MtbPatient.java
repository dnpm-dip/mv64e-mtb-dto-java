package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class MtbPatient {
    private Address address;
    private ValueWithUnit age;
    private Date birthDate;
    private Date dateOfDeath;
    private CodingGender gender;
    private HealthInsurance healthInsurance;
    private String id;
    private VitalStatus vitalStatus;

    @JsonProperty("address")
    public Address getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(Address value) { this.address = value; }

    @JsonProperty("age")
    public ValueWithUnit getAge() { return age; }
    @JsonProperty("age")
    public void setAge(ValueWithUnit value) { this.age = value; }

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

    @JsonProperty("healthInsurance")
    public HealthInsurance getHealthInsurance() { return healthInsurance; }
    @JsonProperty("healthInsurance")
    public void setHealthInsurance(HealthInsurance value) { this.healthInsurance = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("vitalStatus")
    public VitalStatus getVitalStatus() { return vitalStatus; }
    @JsonProperty("vitalStatus")
    public void setVitalStatus(VitalStatus value) { this.vitalStatus = value; }
}
