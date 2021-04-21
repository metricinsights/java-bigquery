package com.google.cloud.bigquery;

import com.google.common.base.MoreObjects;

public class Project {
    private final String id;
    private final String friendlyName;

    public Project(String id, String friendlyName) {
        this.id = id;
        this.friendlyName = friendlyName;
    }

    public String getId() {
        return id;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("friendlyName", friendlyName)
                .toString();
    }
}
