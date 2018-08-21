package io.github.crawlerbot.models.crawl;


import io.github.crawlerbot.models.crawl.enumeration.DocType;
import io.github.crawlerbot.domain.enumeration.Engine;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

/**
 * A FetchEngine.
 */
@Document(collection = "fetch_engine")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "fetchengine")
public class FetchEngine implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("doc_type")
    private DocType docType;

    @Field("engine")
    private Engine engine;

    @Field("domain")
    private String domain;

    @Field("level")
    private Integer level;

    @Field("name")
    private String name;

    // simlife-needle-entity-add-field - Simlife will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DocType getDocType() {
        return docType;
    }

    public FetchEngine docType(DocType docType) {
        this.docType = docType;
        return this;
    }

    public void setDocType(DocType docType) {
        this.docType = docType;
    }

    public Engine getEngine() {
        return engine;
    }

    public FetchEngine engine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getDomain() {
        return domain;
    }

    public FetchEngine domain(String domain) {
        this.domain = domain;
        return this;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getLevel() {
        return level;
    }

    public FetchEngine level(Integer level) {
        this.level = level;
        return this;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public FetchEngine name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
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
        FetchEngine fetchEngine = (FetchEngine) o;
        if (fetchEngine.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), fetchEngine.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "FetchEngine{" +
            "id=" + getId() +
            ", docType='" + getDocType() + "'" +
            ", engine='" + getEngine() + "'" +
            ", domain='" + getDomain() + "'" +
            ", level=" + getLevel() +
            ", name='" + getName() + "'" +
            "}";
    }
}
