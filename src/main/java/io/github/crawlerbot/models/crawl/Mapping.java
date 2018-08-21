package io.github.crawlerbot.models.crawl;


import io.github.crawlerbot.domain.enumeration.DataType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Mapping.
 */

public class Mapping implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("selector")
    private String selector;

    @Field("host")
    private String host;

    @Field("config_name")
    private String configName;

    @Field("attr")
    private String attr;

    @Field("data_type")
    private DataType dataType;

    // simlife-needle-entity-add-field - Simlife will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Mapping name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelector() {
        return selector;
    }

    public Mapping selector(String selector) {
        this.selector = selector;
        return this;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getHost() {
        return host;
    }

    public Mapping host(String host) {
        this.host = host;
        return this;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getConfigName() {
        return configName;
    }

    public Mapping configName(String configName) {
        this.configName = configName;
        return this;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getAttr() {
        return attr;
    }

    public Mapping attr(String attr) {
        this.attr = attr;
        return this;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public DataType getDataType() {
        return dataType;
    }

    public Mapping dataType(DataType dataType) {
        this.dataType = dataType;
        return this;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
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
        Mapping mapping = (Mapping) o;
        if (mapping.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), mapping.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Mapping{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", selector='" + getSelector() + "'" +
            ", host='" + getHost() + "'" +
            ", configName='" + getConfigName() + "'" +
            ", attr='" + getAttr() + "'" +
            ", dataType='" + getDataType() + "'" +
            "}";
    }
}
