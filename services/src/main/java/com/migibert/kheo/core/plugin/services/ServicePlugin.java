package com.migibert.kheo.core.plugin.services;

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
    public String getPropertyName() {
        return ServiceServerProperty.class.getSimpleName();
    }

}
