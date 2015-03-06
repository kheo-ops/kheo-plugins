package com.migibert.kheo.core.plugin.logo;

import com.migibert.kheo.core.plugin.KheoPlugin;

public class LogoPngPlugin implements KheoPlugin<LogoPngServerProperty> {

    @Override
    public LogoPngCommand getSshCommand() {
        return new LogoPngCommand();
    }

    @Override
    public LogoPngEventGenerator getEventGenerator() {
        return new LogoPngEventGenerator();
    }

    @Override
    public String getName() {
        return LogoPngPlugin.class.getSimpleName();
    }

    @Override
    public String getPropertyName() {
        return LogoPngServerProperty.class.getSimpleName();
    }
    
    @Override
    public String getVersion() {
        return "1.0";
    }
}
