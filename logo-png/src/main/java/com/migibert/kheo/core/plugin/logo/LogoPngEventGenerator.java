package com.migibert.kheo.core.plugin.logo;

import java.util.List;

import com.google.common.collect.Lists;
import com.migibert.kheo.core.ServerEvent;
import com.migibert.kheo.core.plugin.AbstractEventGenerator;

public class LogoPngEventGenerator extends AbstractEventGenerator<LogoPngServerProperty> {

    @Override
    public List<ServerEvent> generateSpecificEvents(List<LogoPngServerProperty> original, List<LogoPngServerProperty> discovered) {
        return Lists.newArrayList();
    }

    @Override
    public Class<LogoPngServerProperty> getPropertyClass() {
        return LogoPngServerProperty.class;
    }
}
