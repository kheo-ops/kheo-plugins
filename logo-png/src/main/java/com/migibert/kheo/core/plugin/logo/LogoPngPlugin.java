package com.migibert.kheo.core.plugin.logo;

import java.util.List;

import org.assertj.core.util.Lists;

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
    public List<String> getPropertiesNames() {
        return Lists.newArrayList(LogoImagePngServerProperty.class.getSimpleName(), DescriptionLogoPngServerProperty.class.getSimpleName());
    }
    
    @Override
    public String getVersion() {
        return "1.0";
    }
}
