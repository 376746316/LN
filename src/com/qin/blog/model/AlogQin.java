package com.qin.blog.model;

public class AlogQin {
    private Integer blogId;

    private String blogTitle;

    private Integer blogAuthorId;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public Integer getBlogAuthorId() {
        return blogAuthorId;
    }

    public void setBlogAuthorId(Integer blogAuthorId) {
        this.blogAuthorId = blogAuthorId;
    }
}