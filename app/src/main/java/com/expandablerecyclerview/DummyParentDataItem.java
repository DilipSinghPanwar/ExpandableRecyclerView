package com.expandablerecyclerview;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ADMIN on 11-Sep-18.
 */

class DummyParentDataItem implements Serializable {
    private String parentName;
    private ArrayList<DummyChildDataItem> childDataItems;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public ArrayList<DummyChildDataItem> getChildDataItems() {
        return childDataItems;
    }

    public void setChildDataItems(ArrayList<DummyChildDataItem> childDataItems) {
        this.childDataItems = childDataItems;
    }
}