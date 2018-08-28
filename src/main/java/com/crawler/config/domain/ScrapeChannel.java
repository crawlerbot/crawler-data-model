package com.crawler.config.domain;

import com.crawler.config.domain.enumeration.DestinationSystem;
import com.crawler.config.domain.enumeration.PostType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    @Field("target_system")
    private DestinationSystem targetSystem;

    @Field("url")
    private String url;

    @Field("post_type")
    private PostType postType;


    private Set<FetchEngine> configFetchEngines = new HashSet<>();


    private Set<Meta> metas = new HashSet<>();


    private Set<SiteAction> siteActionConfigs = new HashSet<>();


    private Set<MappingConfig> configMappings = new HashSet<>();


    private Set<FetchEngine> destinationFetchEngines = new HashSet<>();


    private Set<Meta> destinationMetas = new HashSet<>();


    private Set<SiteAction> destinationSiteConfigs = new HashSet<>();

    private Set<MappingConfig> destinationConfigMappings = new HashSet<>();

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

    public DestinationSystem getTargetSystem() {
        return targetSystem;
    }

    public ScrapeChannel targetSystem(DestinationSystem targetSystem) {
        this.targetSystem = targetSystem;
        return this;
    }

    public void setTargetSystem(DestinationSystem targetSystem) {
        this.targetSystem = targetSystem;
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

    public Set<FetchEngine> getConfigFetchEngines() {
        return configFetchEngines;
    }

    public ScrapeChannel configFetchEngines(Set<FetchEngine> fetchEngines) {
        this.configFetchEngines = fetchEngines;
        return this;
    }

    public ScrapeChannel addConfigFetchEngine(FetchEngine fetchEngine) {
        this.configFetchEngines.add(fetchEngine);
        return this;
    }

    public ScrapeChannel removeConfigFetchEngine(FetchEngine fetchEngine) {
        this.configFetchEngines.remove(fetchEngine);
        return this;
    }

    public void setConfigFetchEngines(Set<FetchEngine> fetchEngines) {
        this.configFetchEngines = fetchEngines;
    }

    public Set<Meta> getMetas() {
        return metas;
    }

    public ScrapeChannel metas(Set<Meta> metas) {
        this.metas = metas;
        return this;
    }

    public ScrapeChannel addMeta(Meta meta) {
        this.metas.add(meta);
        return this;
    }

    public ScrapeChannel removeMeta(Meta meta) {
        this.metas.remove(meta);
        return this;
    }

    public void setMetas(Set<Meta> metas) {
        this.metas = metas;
    }

    public Set<SiteAction> getSiteActionConfigs() {
        return siteActionConfigs;
    }

    public ScrapeChannel siteActionConfigs(Set<SiteAction> siteActions) {
        this.siteActionConfigs = siteActions;
        return this;
    }

    public ScrapeChannel addSiteActionConfig(SiteAction siteAction) {
        this.siteActionConfigs.add(siteAction);
        return this;
    }

    public ScrapeChannel removeSiteActionConfig(SiteAction siteAction) {
        this.siteActionConfigs.remove(siteAction);
        return this;
    }

    public void setSiteActionConfigs(Set<SiteAction> siteActions) {
        this.siteActionConfigs = siteActions;
    }

    public Set<MappingConfig> getConfigMappings() {
        return configMappings;
    }

    public ScrapeChannel configMappings(Set<MappingConfig> mappingConfigs) {
        this.configMappings = mappingConfigs;
        return this;
    }

    public ScrapeChannel addConfigMapping(MappingConfig mappingConfig) {
        this.configMappings.add(mappingConfig);
        return this;
    }

    public ScrapeChannel removeConfigMapping(MappingConfig mappingConfig) {
        this.configMappings.remove(mappingConfig);
        return this;
    }

    public void setConfigMappings(Set<MappingConfig> mappingConfigs) {
        this.configMappings = mappingConfigs;
    }

    public Set<FetchEngine> getDestinationFetchEngines() {
        return destinationFetchEngines;
    }

    public ScrapeChannel destinationFetchEngines(Set<FetchEngine> fetchEngines) {
        this.destinationFetchEngines = fetchEngines;
        return this;
    }

    public ScrapeChannel addDestinationFetchEngine(FetchEngine fetchEngine) {
        this.destinationFetchEngines.add(fetchEngine);
        return this;
    }

    public ScrapeChannel removeDestinationFetchEngine(FetchEngine fetchEngine) {
        this.destinationFetchEngines.remove(fetchEngine);
        return this;
    }

    public void setDestinationFetchEngines(Set<FetchEngine> fetchEngines) {
        this.destinationFetchEngines = fetchEngines;
    }

    public Set<Meta> getDestinationMetas() {
        return destinationMetas;
    }

    public ScrapeChannel destinationMetas(Set<Meta> metas) {
        this.destinationMetas = metas;
        return this;
    }

    public ScrapeChannel addDestinationMeta(Meta meta) {
        this.destinationMetas.add(meta);
        return this;
    }

    public ScrapeChannel removeDestinationMeta(Meta meta) {
        this.destinationMetas.remove(meta);
        return this;
    }

    public void setDestinationMetas(Set<Meta> metas) {
        this.destinationMetas = metas;
    }

    public Set<SiteAction> getDestinationSiteConfigs() {
        return destinationSiteConfigs;
    }

    public ScrapeChannel destinationSiteConfigs(Set<SiteAction> siteActions) {
        this.destinationSiteConfigs = siteActions;
        return this;
    }

    public ScrapeChannel addDestinationSiteConfig(SiteAction siteAction) {
        this.destinationSiteConfigs.add(siteAction);
        return this;
    }

    public ScrapeChannel removeDestinationSiteConfig(SiteAction siteAction) {
        this.destinationSiteConfigs.remove(siteAction);
        return this;
    }

    public void setDestinationSiteConfigs(Set<SiteAction> siteActions) {
        this.destinationSiteConfigs = siteActions;
    }

    public Set<MappingConfig> getDestinationConfigMappings() {
        return destinationConfigMappings;
    }

    public ScrapeChannel destinationConfigMappings(Set<MappingConfig> mappingConfigs) {
        this.destinationConfigMappings = mappingConfigs;
        return this;
    }

    public ScrapeChannel addDestinationConfigMapping(MappingConfig mappingConfig) {
        this.destinationConfigMappings.add(mappingConfig);
        return this;
    }

    public ScrapeChannel removeDestinationConfigMapping(MappingConfig mappingConfig) {
        this.destinationConfigMappings.remove(mappingConfig);
        return this;
    }

    public void setDestinationConfigMappings(Set<MappingConfig> mappingConfigs) {
        this.destinationConfigMappings = mappingConfigs;
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
            ", targetSystem='" + getTargetSystem() + "'" +
            ", url='" + getUrl() + "'" +
            ", postType='" + getPostType() + "'" +
            "}";
    }
}
