package org.eclipse.edc.connector.store.sql.assetindex;

import java.util.AbstractMap;

public class SqlPropertyWrapper {
    private final boolean isPrivate;
    private final AbstractMap.SimpleImmutableEntry<String, Object> property;

    public SqlPropertyWrapper(boolean isPrivate, AbstractMap.SimpleImmutableEntry<String,Object> kvSimpleImmutableEntry) {
        this.isPrivate = isPrivate;
        this.property = kvSimpleImmutableEntry;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public AbstractMap.SimpleImmutableEntry<String, Object> getProperty() {
        return property;
    }
}
