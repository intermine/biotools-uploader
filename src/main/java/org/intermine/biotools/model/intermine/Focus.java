package org.intermine.biotools.model.intermine;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fg",
    "bg"
})
public class Focus {

    @JsonProperty("fg")
    private String fg;
    @JsonProperty("bg")
    private String bg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fg")
    public String getFg() {
        return fg;
    }

    @JsonProperty("fg")
    public void setFg(String fg) {
        this.fg = fg;
    }

    public Focus withFg(String fg) {
        this.fg = fg;
        return this;
    }

    @JsonProperty("bg")
    public String getBg() {
        return bg;
    }

    @JsonProperty("bg")
    public void setBg(String bg) {
        this.bg = bg;
    }

    public Focus withBg(String bg) {
        this.bg = bg;
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

    public Focus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
