package io.github.crawlerbot.models.crawl;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A SiteAction.
 */

public class SiteAction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("domain")
    private String domain;


    private Set<Action> actions = new HashSet<>();

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

    public SiteAction domain(String domain) {
        this.domain = domain;
        return this;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Set<Action> getActions() {
        return actions;
    }

    public SiteAction actions(Set<Action> actions) {
        this.actions = actions;
        return this;
    }

    public SiteAction addActions(Action action) {
        this.actions.add(action);
        return this;
    }

    public SiteAction removeActions(Action action) {
        this.actions.remove(action);
        return this;
    }

    public void setActions(Set<Action> actions) {
        this.actions = actions;
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
        SiteAction siteAction = (SiteAction) o;
        if (siteAction.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), siteAction.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SiteAction{" +
            "id=" + getId() +
            ", domain='" + getDomain() + "'" +
            "}";
    }
}
