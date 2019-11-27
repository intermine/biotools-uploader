package org.intermine.biotools.model.intermine;

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
    "instances",
    "statusCode",
    "executionTime"
})
public class InterMineInstances {

    @JsonProperty("instances")
    private List<Instance> instances = null;
    @JsonProperty("statusCode")
    private int statusCode;
    @JsonProperty("executionTime")
    private String executionTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("instances")
    public List<Instance> getInstances() {
        return instances;
    }

    @JsonProperty("instances")
    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    public InterMineInstances withInstances(List<Instance> instances) {
        this.instances = instances;
        return this;
    }

    @JsonProperty("statusCode")
    public int getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public InterMineInstances withStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    @JsonProperty("executionTime")
    public String getExecutionTime() {
        return executionTime;
    }

    @JsonProperty("executionTime")
    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public InterMineInstances withExecutionTime(String executionTime) {
        this.executionTime = executionTime;
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

    public InterMineInstances withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
