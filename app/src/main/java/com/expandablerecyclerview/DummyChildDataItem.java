package com.expandablerecyclerview;

import java.io.Serializable;

/**
 * Created by ADMIN on 11-Sep-18.
 */

class DummyChildDataItem implements Serializable {
    private String childName;

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }
}