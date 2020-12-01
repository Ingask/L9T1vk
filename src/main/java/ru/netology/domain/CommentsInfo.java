package ru.netology.domain;

public class CommentsInfo {
    private PostComment[] comments;
    private int count;
    private boolean canPost;
    private boolean groupsCanPost;

    public PostComment[] getComments() {
        return comments;
    }

    public void setComments(PostComment[] comments) {
        this.comments = comments;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }
}
