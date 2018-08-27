package com.crawler.config.domain;

import com.crawler.config.domain.enumeration.ResultType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A ConfigGroup.
 */
@Document(collection = "config_group")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "config_group")
public class ConfigGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("current_level")
    private Integer currentLevel;

    @Field("name")
    private String name;

    @Field("host")
    private String host;

    @Field("expect_result_type")
    private ResultType expectResultType;

    //@Field("mappings")
    @DBRef
    private Set<Mapping> mappings = new HashSet<>();

    // simlife-needle-entity-add-field - Simlife will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCurrentLevel() {
        return currentLevel;
    }

    public ConfigGroup currentLevel(Integer currentLevel) {
        this.currentLevel = currentLevel;
        return this;
    }

    public void setCurrentLevel(Integer currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getName() {
        return name;
    }

    public ConfigGroup name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public ConfigGroup host(String host) {
        this.host = host;
        return this;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ResultType getExpectResultType() {
        return expectResultType;
    }

    public ConfigGroup expectResultType(ResultType expectResultType) {
        this.expectResultType = expectResultType;
        return this;
    }

    public void setExpectResultType(ResultType expectResultType) {
        this.expectResultType = expectResultType;
    }

    public Set<Mapping> getMappings() {
        return mappings;
    }

    public ConfigGroup mappings(Set<Mapping> mappings) {
        this.mappings = mappings;
        return this;
    }

    public ConfigGroup addMappings(Mapping mapping) {
        this.mappings.add(mapping);
        return this;
    }

    public ConfigGroup removeMappings(Mapping mapping) {
        this.mappings.remove(mapping);
        return this;
    }

    public void setMappings(Set<Mapping> mappings) {
        this.mappings = mappings;
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
        ConfigGroup configGroup = (ConfigGroup) o;
        if (configGroup.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), configGroup.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ConfigGroup{" +
            "id=" + getId() +
            ", currentLevel=" + getCurrentLevel() +
            ", name='" + getName() + "'" +
            ", host='" + getHost() + "'" +
            ", expectResultType='" + getExpectResultType() + "'" +
            "}";
    }
}
