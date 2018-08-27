package com.crawler.config.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A MappingConfig.
 */
@Document(collection = "mapping_config")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "mapping_config")
public class MappingConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("domain")
    private String domain;

    //@Field("configGroups")
    @DBRef
    private Set<ConfigGroup> configGroups = new HashSet<>();

    // simlife-needle-entity-add-field - Simlife will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public MappingConfig domain(String domain) {
        this.domain = domain;
        return this;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Set<ConfigGroup> getConfigGroups() {
        return configGroups;
    }

    public MappingConfig configGroups(Set<ConfigGroup> configGroups) {
        this.configGroups = configGroups;
        return this;
    }

    public MappingConfig addConfigGroups(ConfigGroup configGroup) {
        this.configGroups.add(configGroup);
        return this;
    }

    public MappingConfig removeConfigGroups(ConfigGroup configGroup) {
        this.configGroups.remove(configGroup);
        return this;
    }

    public void setConfigGroups(Set<ConfigGroup> configGroups) {
        this.configGroups = configGroups;
    }
    // simlife-needle-entity-add-getters-setters - Simlife will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MappingConfig mappingConfig = (MappingConfig) o;
        if (mappingConfig.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), mappingConfig.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MappingConfig{" +
            "id=" + getId() +
            ", domain='" + getDomain() + "'" +
            "}";
    }
}
