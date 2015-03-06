package com.migibert.kheo.core.plugin.logo;

import java.util.List;

import com.google.common.collect.Lists;
import com.migibert.kheo.core.ServerEvent;
import com.migibert.kheo.core.plugin.AbstractEventGenerator;

public class LogoEventGenerator extends AbstractEventGenerator<LogoServerProperty> {

    @Override
    public List<ServerEvent> generateSpecificEvents(List<LogoServerProperty> original, List<LogoServerProperty> discovered) {
        return Lists.newArrayList();
    }

    @Override
    public Class<LogoServerProperty> getPropertyClass() {
        return LogoServerProperty.class;
    }
}
