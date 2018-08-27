package com.crawler.config.domain;

import com.crawler.config.domain.enumeration.ActionType;
import com.crawler.config.domain.enumeration.GetContent;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Action.
 */
@Document(collection = "action")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "action")
public class Action implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("url")
    private String url;

    @Field("domain")
    private String domain;

    @Field("level")
    private Integer level;

    @Field("selector")
    private String selector;

    @Field("action")
    private ActionType action;

    @Field("get_content")
    private GetContent getContent;

    @Field("total_actions")
    private Integer totalActions;

    // simlife-needle-entity-add-field - Simlife will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public Action url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDomain() {
        return domain;
    }

    public Action domain(String domain) {
        this.domain = domain;
        return this;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getLevel() {
        return level;
    }

    public Action level(Integer level) {
        this.level = level;
        return this;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getSelector() {
        return selector;
    }

    public Action selector(String selector) {
        this.selector = selector;
        return this;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public ActionType getAction() {
        return action;
    }

    public Action action(ActionType action) {
        this.action = action;
        return this;
    }

    public void setAction(ActionType action) {
        this.action = action;
    }

    public GetContent getGetContent() {
        return getContent;
    }

    public Action getContent(GetContent getContent) {
        this.getContent = getContent;
        return this;
    }

    public void setGetContent(GetContent getContent) {
        this.getContent = getContent;
    }

    public Integer getTotalActions() {
        return totalActions;
    }

    public Action totalActions(Integer totalActions) {
        this.totalActions = totalActions;
        return this;
    }

    public void setTotalActions(Integer totalActions) {
        this.totalActions = totalActions;
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
        Action action = (Action) o;
        if (action.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), action.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Action{" +
            "id=" + getId() +
            ", url='" + getUrl() + "'" +
            ", domain='" + getDomain() + "'" +
            ", level='" + getLevel() + "'" +
            ", selector='" + getSelector() + "'" +
            ", action='" + getAction() + "'" +
            ", getContent='" + getGetContent() + "'" +
            ", totalActions=" + getTotalActions() +
            "}";
    }
}
