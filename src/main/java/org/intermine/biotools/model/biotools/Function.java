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
    "operation",
    "input",
    "output"
})
public class Function {

    @JsonProperty("operation")
    private List<Operation> operation = null;
    @JsonProperty("input")
    private List<Input> input = null;
    @JsonProperty("output")
    private List<Output> output = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("operation")
    public List<Operation> getOperation() {
        return operation;
    }

    @JsonProperty("operation")
    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    public Function withOperation(List<Operation> operation) {
        this.operation = operation;
        return this;
    }

    @JsonProperty("input")
    public List<Input> getInput() {
        return input;
    }

    @JsonProperty("input")
    public void setInput(List<Input> input) {
        this.input = input;
    }

    public Function withInput(List<Input> input) {
        this.input = input;
        return this;
    }

    @JsonProperty("output")
    public List<Output> getOutput() {
        return output;
    }

    @JsonProperty("output")
    public void setOutput(List<Output> output) {
        this.output = output;
    }

    public Function withOutput(List<Output> output) {
        this.output = output;
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

    public Function withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
