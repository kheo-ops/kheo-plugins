package com.kheo.plugins.network.interfaces;

import java.util.List;

import org.assertj.core.util.Lists;

import com.migibert.kheo.core.plugin.KheoPlugin;

public class NetworkInterfacePlugin implements KheoPlugin<NetworkInterfaceServerProperty> {

    @Override
    public NetworkInterfaceCommand getSshCommand() {
        return new NetworkInterfaceCommand();
    }

    @Override
    public NetworkInterfaceEventGenerator getEventGenerator() {
        return new NetworkInterfaceEventGenerator();
    }

    @Override
    public String getName() {
        return NetworkInterfacePlugin.class.getSimpleName();
    }

    @Override
    public List<String> getPropertiesNames() {
        return Lists.newArrayList(NetworkInterfaceServerProperty.class.getSimpleName());
    }
    
    @Override
    public String getVersion() {
        return "1.0";
    }
}
