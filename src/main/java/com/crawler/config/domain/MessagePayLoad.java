package com.crawler.config.domain;


import com.crawler.config.domain.enumeration.*;

public class MessagePayLoad {
    private String message;
    private MessageObject messageObject;
    private MessageAction messageAction;
    private BrowserOS browserOS;
    private BrowserHost browserHost;
    private BrowserName browserName;
    private Channel inputLink;
    private CrawlLine crawlLine;

    public MessagePayLoad() {

    }

    public Channel getInputLink() {
        return inputLink;
    }

    public void setInputLink(Channel inputLink) {
        this.inputLink = inputLink;
    }

    public CrawlLine getCrawlLine() {
        return crawlLine;
    }

    public void setCrawlLine(CrawlLine crawlLine) {
        this.crawlLine = crawlLine;
    }

    public BrowserOS getBrowserOS() {
        return browserOS;
    }

    public void setBrowserOS(BrowserOS browserOS) {
        this.browserOS = browserOS;
    }

    public BrowserHost getBrowserHost() {
        return browserHost;
    }

    public BrowserName getBrowserName() {
        return browserName;
    }

    public void setBrowserName(BrowserName browserName) {
        this.browserName = browserName;
    }

    public void setBrowserHost(BrowserHost browserHost) {
        this.browserHost = browserHost;
    }

    public MessageObject getMessageObject() {
        return messageObject;
    }

    public void setMessageObject(MessageObject messageObject) {
        this.messageObject = messageObject;
    }

    public MessageAction getMessageAction() {
        return messageAction;
    }

    public void setMessageAction(MessageAction messageAction) {
        this.messageAction = messageAction;
    }

    public String getMessage() {
        return message;
    }

    public MessagePayLoad setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "MessagePayLoad{" +
            "message='" + message + '\'' +
            ", messageObject=" + messageObject +
            ", messageAction=" + messageAction +
            ", browserOS=" + browserOS +
            ", browserHost=" + browserHost +
            ", browserName=" + browserName +
            ", inputLink=" + inputLink +
            ", crawlLine=" + crawlLine +
            '}';
    }
}
