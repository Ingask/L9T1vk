package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private String text;
    private boolean allText;
    private int date;
    private ContentInfo contentInfo;
    private long likesInfo;
    private long likeCount;
    private String signShare;
    private int shareCount;
    private String signViews;
    private long viewCount;
    private CommentsInfo commentsInfo;
    private String copyright;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String postType;
    private PostSource postSource;
    private GeoType geoType;
    private long signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean ispinned;
    private boolean markedAsAds;
    private boolean isfavorite;
    private int postponedId;

}
