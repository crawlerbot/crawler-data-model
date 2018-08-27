package com.crawler.config.domain;

import com.crawler.config.domain.enumeration.ChannelType;
import com.crawler.config.domain.enumeration.DestinationSystem;
import com.crawler.config.domain.enumeration.PostType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Meta.
 */
@Document(collection = "meta")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "meta")
public class Meta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("category")
    private String category;

    @Field("category_slug")
    private String categorySlug;

    @Field("channel_type")
    private ChannelType channelType;

    @Field("country_code")
    private String countryCode;

    @Field("language_code")
    private String languageCode;

    @Field("logo")
    private String logo;

    @Field("name")
    private String name;

    @Field("post_type")
    private PostType postType;

    @Field("ranking_country")
    private Integer rankingCountry;

    @Field("site_domain")
    private String siteDomain;

    @Field("site_url")
    private String siteUrl;

    @Field("tag")
    private String tag;

    @Field("tag_slug")
    private String tagSlug;

    @Field("target_queue_channel")
    private String targetQueueChannel;

    @Field("topic_slugs")
    private String topicSlugs;

    @Field("topics")
    private String topics;

    @Field("destination")
    private DestinationSystem destination;

    // simlife-needle-entity-add-field - Simlife will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public Meta category(String category) {
        this.category = category;
        return this;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategorySlug() {
        return categorySlug;
    }

    public Meta categorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
        return this;
    }

    public void setCategorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public Meta channelType(ChannelType channelType) {
        this.channelType = channelType;
        return this;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Meta countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public Meta languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLogo() {
        return logo;
    }

    public Meta logo(String logo) {
        this.logo = logo;
        return this;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public Meta name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostType getPostType() {
        return postType;
    }

    public Meta postType(PostType postType) {
        this.postType = postType;
        return this;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public Integer getRankingCountry() {
        return rankingCountry;
    }

    public Meta rankingCountry(Integer rankingCountry) {
        this.rankingCountry = rankingCountry;
        return this;
    }

    public void setRankingCountry(Integer rankingCountry) {
        this.rankingCountry = rankingCountry;
    }

    public String getSiteDomain() {
        return siteDomain;
    }

    public Meta siteDomain(String siteDomain) {
        this.siteDomain = siteDomain;
        return this;
    }

    public void setSiteDomain(String siteDomain) {
        this.siteDomain = siteDomain;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public Meta siteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getTag() {
        return tag;
    }

    public Meta tag(String tag) {
        this.tag = tag;
        return this;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTagSlug() {
        return tagSlug;
    }

    public Meta tagSlug(String tagSlug) {
        this.tagSlug = tagSlug;
        return this;
    }

    public void setTagSlug(String tagSlug) {
        this.tagSlug = tagSlug;
    }

    public String getTargetQueueChannel() {
        return targetQueueChannel;
    }

    public Meta targetQueueChannel(String targetQueueChannel) {
        this.targetQueueChannel = targetQueueChannel;
        return this;
    }

    public void setTargetQueueChannel(String targetQueueChannel) {
        this.targetQueueChannel = targetQueueChannel;
    }

    public String getTopicSlugs() {
        return topicSlugs;
    }

    public Meta topicSlugs(String topicSlugs) {
        this.topicSlugs = topicSlugs;
        return this;
    }

    public void setTopicSlugs(String topicSlugs) {
        this.topicSlugs = topicSlugs;
    }

    public String getTopics() {
        return topics;
    }

    public Meta topics(String topics) {
        this.topics = topics;
        return this;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public DestinationSystem getDestination() {
        return destination;
    }

    public Meta destination(DestinationSystem destination) {
        this.destination = destination;
        return this;
    }

    public void setDestination(DestinationSystem destination) {
        this.destination = destination;
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
        Meta meta = (Meta) o;
        if (meta.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), meta.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Meta{" +
            "id=" + getId() +
            ", category='" + getCategory() + "'" +
            ", categorySlug='" + getCategorySlug() + "'" +
            ", channelType='" + getChannelType() + "'" +
            ", countryCode='" + getCountryCode() + "'" +
            ", languageCode='" + getLanguageCode() + "'" +
            ", logo='" + getLogo() + "'" +
            ", name='" + getName() + "'" +
            ", postType='" + getPostType() + "'" +
            ", rankingCountry=" + getRankingCountry() +
            ", siteDomain='" + getSiteDomain() + "'" +
            ", siteUrl='" + getSiteUrl() + "'" +
            ", tag='" + getTag() + "'" +
            ", tagSlug='" + getTagSlug() + "'" +
            ", targetQueueChannel='" + getTargetQueueChannel() + "'" +
            ", topicSlugs='" + getTopicSlugs() + "'" +
            ", topics='" + getTopics() + "'" +
            ", destination='" + getDestination() + "'" +
            "}";
    }
}
