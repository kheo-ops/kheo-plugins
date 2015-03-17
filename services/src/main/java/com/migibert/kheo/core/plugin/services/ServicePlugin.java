package com.migibert.kheo.core.plugin.services;

import java.util.List;

import org.assertj.core.util.Lists;

import com.migibert.kheo.core.plugin.KheoPlugin;

public class ServicePlugin implements KheoPlugin<ServiceServerProperty> {

    @Override
    public ServiceCommand getSshCommand() {
        return new ServiceCommand();
    }

    @Override
    public ServiceEventGenerator getEventGenerator() {
        return new ServiceEventGenerator();
    }

    @Override
    public String getName() {
        return ServicePlugin.class.getSimpleName();
    }

    @Override
    public List<String> getPropertiesNames() {
        return Lists.newArrayList(ServiceServerProperty.class.getSimpleName());
    }
    
    @Override
    public String getVersion() {
        return "1.0";
    }

}
