package io.github.crawlerbot.models.crawl;


import io.github.crawlerbot.domain.enumeration.DestinationSystem;
import io.github.crawlerbot.domain.enumeration.PostType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

/**
 * A ScrapeChannel.
 */
@Document(collection = "scrape_channel")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "scrape_channel")
public class ScrapeChannel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("allow_external_url")
    private Boolean allowExternalUrl;

    @Field("archive_level")
    private Integer archiveLevel;

    @Field("total_level")
    private Integer totalLevel;

    @Field("destination")
    private DestinationSystem destination;

    @Field("url")
    private String url;

    @Field("post_type")
    private PostType postType;

    // simlife-needle-entity-add-field - Simlife will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean isAllowExternalUrl() {
        return allowExternalUrl;
    }

    public ScrapeChannel allowExternalUrl(Boolean allowExternalUrl) {
        this.allowExternalUrl = allowExternalUrl;
        return this;
    }

    public void setAllowExternalUrl(Boolean allowExternalUrl) {
        this.allowExternalUrl = allowExternalUrl;
    }

    public Integer getArchiveLevel() {
        return archiveLevel;
    }

    public ScrapeChannel archiveLevel(Integer archiveLevel) {
        this.archiveLevel = archiveLevel;
        return this;
    }

    public void setArchiveLevel(Integer archiveLevel) {
        this.archiveLevel = archiveLevel;
    }

    public Integer getTotalLevel() {
        return totalLevel;
    }

    public ScrapeChannel totalLevel(Integer totalLevel) {
        this.totalLevel = totalLevel;
        return this;
    }

    public void setTotalLevel(Integer totalLevel) {
        this.totalLevel = totalLevel;
    }

    public DestinationSystem getDestination() {
        return destination;
    }

    public ScrapeChannel destination(DestinationSystem destination) {
        this.destination = destination;
        return this;
    }

    public void setDestination(DestinationSystem destination) {
        this.destination = destination;
    }

    public String getUrl() {
        return url;
    }

    public ScrapeChannel url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PostType getPostType() {
        return postType;
    }

    public ScrapeChannel postType(PostType postType) {
        this.postType = postType;
        return this;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
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
        ScrapeChannel scrapeChannel = (ScrapeChannel) o;
        if (scrapeChannel.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), scrapeChannel.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ScrapeChannel{" +
            "id=" + getId() +
            ", allowExternalUrl='" + isAllowExternalUrl() + "'" +
            ", archiveLevel=" + getArchiveLevel() +
            ", totalLevel=" + getTotalLevel() +
            ", destination='" + getDestination() + "'" +
            ", url='" + getUrl() + "'" +
            ", postType='" + getPostType() + "'" +
            "}";
    }
}
