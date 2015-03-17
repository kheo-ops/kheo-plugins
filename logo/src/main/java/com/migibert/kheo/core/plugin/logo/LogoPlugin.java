package com.migibert.kheo.core.plugin.logo;

import java.util.List;

import jersey.repackaged.com.google.common.collect.Lists;

import com.migibert.kheo.core.plugin.KheoPlugin;

public class LogoPlugin implements KheoPlugin<LogoServerProperty> {

    @Override
    public LogoCommand getSshCommand() {
        return new LogoCommand();
    }

    @Override
    public LogoEventGenerator getEventGenerator() {
        return new LogoEventGenerator();
    }

    @Override
    public String getName() {
        return LogoPlugin.class.getSimpleName();
    }
    
    @Override
    public List<String> getPropertiesNames() {
        return Lists.newArrayList(LogoServerProperty.class.getSimpleName());
    }
    
    @Override
    public String getVersion() {
        return "1.0";
    }
}
