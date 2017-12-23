package com.shadow.entity;

//权限表
public class AuthorizationEntity {
    private int anthor_id;//权限ID
    private int parentAuthor_id;//   父权限
    private String authorname;//    权限名称
    private String description;//    权限描述


    public AuthorizationEntity(int anthor_id, int parentAuthor_id, String authorname, String description) {
        this.anthor_id = anthor_id;
        this.parentAuthor_id = parentAuthor_id;
        this.authorname = authorname;
        this.description = description;
    }

    public AuthorizationEntity() {
    }

    @Override
    public String toString() {
        return "authorization{" +
                "anthor_id=" + anthor_id +
                ", parentAuthor_id=" + parentAuthor_id +
                ", authorname='" + authorname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getAnthor_id() {
        return anthor_id;
    }

    public void setAnthor_id(int anthor_id) {
        this.anthor_id = anthor_id;
    }

    public int getParentAuthor_id() {
        return parentAuthor_id;
    }

    public void setParentAuthor_id(int parentAuthor_id) {
        this.parentAuthor_id = parentAuthor_id;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
