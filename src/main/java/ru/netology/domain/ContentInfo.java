package ru.netology.domain;

public class ContentInfo {
    private long id;
    private String externalLink;
    private int contentType;
    private String[] linksContent;
    private String text;
    private String sign;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExternalLink() {
        return externalLink;
    }

    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public String[] getLinksContent() {
        return linksContent;
    }

    public void setLinksContent(String[] linksContent) {
        this.linksContent = linksContent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
