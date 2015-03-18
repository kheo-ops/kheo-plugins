package com.migibert.kheo.core.plugin.os;

import java.util.List;

import jersey.repackaged.com.google.common.collect.Lists;

import com.migibert.kheo.core.plugin.KheoPlugin;

public class OsPlugin implements KheoPlugin<OsServerProperty> {

    @Override
    public OsCommand getSshCommand() {
        return new OsCommand();
    }

    @Override
    public OsEventGenerator getEventGenerator() {
        return new OsEventGenerator();
    }

    @Override
    public String getName() {
        return OsPlugin.class.getSimpleName();
    }

    @Override
    public List<String> getPropertiesNames() {
        return Lists.newArrayList(OsServerProperty.class.getSimpleName());
    }
    
    @Override
    public String getVersion() {
        return "1.0";
    }
}
