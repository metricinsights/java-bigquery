package com.google.cloud.bigquery;

import com.google.common.base.MoreObjects;

public class Project {
    private String id;
    private String friendlyName;

    public Project(String id, String friendlyName) {
        this.id = id;
        this.friendlyName = friendlyName;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("friendlyName", friendlyName)
                .toString();
    }
}
