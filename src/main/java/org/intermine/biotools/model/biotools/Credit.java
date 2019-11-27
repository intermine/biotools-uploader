package org.intermine.biotools.model.biotools;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "email",
    "typeEntity",
    "typeRole"
})
public class Credit {

    @JsonProperty("email")
    private String email;
    @JsonProperty("typeEntity")
    private String typeEntity;
    @JsonProperty("typeRole")
    private List<String> typeRole = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Credit(String email, String typeEntity, List<String> typeRole) {
        this.email = email;
        this.typeEntity = typeEntity;
        this.typeRole = typeRole;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Credit withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("typeEntity")
    public String getTypeEntity() {
        return typeEntity;
    }

    @JsonProperty("typeEntity")
    public void setTypeEntity(String typeEntity) {
        this.typeEntity = typeEntity;
    }

    public Credit withTypeEntity(String typeEntity) {
        this.typeEntity = typeEntity;
        return this;
    }

    @JsonProperty("typeRole")
    public List<String> getTypeRole() {
        return typeRole;
    }

    @JsonProperty("typeRole")
    public void setTypeRole(List<String> typeRole) {
        this.typeRole = typeRole;
    }

    public Credit withTypeRole(List<String> typeRole) {
        this.typeRole = typeRole;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Credit withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
