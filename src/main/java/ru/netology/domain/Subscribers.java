package ru.netology.domain;

public class Subscribers {
    private long id;
    private String imageId;
    private String nameURL;
    private String allSubscribers;
    private int subscriberCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getNameURL() {
        return nameURL;
    }

    public void setNameURL(String nameURL) {
        this.nameURL = nameURL;
    }

    public String getAllSubscribers() {
        return allSubscribers;
    }

    public void setAllSubscribers(String allSubscribers) {
        this.allSubscribers = allSubscribers;
    }

    public int getSubscriberCount() {
        return subscriberCount;
    }

    public void setSubscriberCount(int subscriberCount) {
        this.subscriberCount = subscriberCount;
    }
}
