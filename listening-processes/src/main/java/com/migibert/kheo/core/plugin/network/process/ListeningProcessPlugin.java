package com.migibert.kheo.core.plugin.network.process;

import com.migibert.kheo.core.plugin.KheoPlugin;

public class ListeningProcessPlugin implements KheoPlugin<ListeningProcessServerProperty> {

    @Override
    public ListeningProcessCommand getSshCommand() {
        return new ListeningProcessCommand();
    }

    @Override
    public ListeningProcessEventGenerator getEventGenerator() {
        return new ListeningProcessEventGenerator();
    }

    @Override
    public String getName() {
        return ListeningProcessPlugin.class.getSimpleName();
    }

    @Override
    public String getPropertyName() {
        return ListeningProcessServerProperty.class.getSimpleName();
    }
    
    @Override
    public String getVersion() {
        return "1.0";
    }
}
