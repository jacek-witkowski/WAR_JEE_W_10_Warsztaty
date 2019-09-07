package pl.coderslab.model;

import java.util.Date;

public class Solution {

    private long id;
    private long userId;
    private Date created;
    private Date updated;
    private String description;

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "id=" + id +
                ", userId=" + userId +
                ", created=" + created +
                ", updated=" + updated +
                ", description='" + description + '\'' +
                '}';
    }
}
