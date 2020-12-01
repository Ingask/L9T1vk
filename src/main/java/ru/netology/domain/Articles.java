package ru.netology.domain;

public class Articles {
    private long id;
    private String[] imageId;
    private String[] nameURL;
    private String allArticles;
    private int articleCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String[] getImageId() {
        return imageId;
    }

    public void setImageId(String[] imageId) {
        this.imageId = imageId;
    }

    public String[] getNameURL() {
        return nameURL;
    }

    public void setNameURL(String[] nameURL) {
        this.nameURL = nameURL;
    }

    public String getAllArticles() {
        return allArticles;
    }

    public void setAllArticles(String allArticles) {
        this.allArticles = allArticles;
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }
}
