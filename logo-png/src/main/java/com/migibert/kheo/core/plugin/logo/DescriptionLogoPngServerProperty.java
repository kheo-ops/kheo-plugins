package com.migibert.kheo.core.plugin.logo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.migibert.kheo.core.plugin.KheoType;


public class DescriptionLogoPngServerProperty extends LogoPngServerProperty {

    @JsonProperty
    public String description;
    
    @Override
    public String getKey() {
        return description;
    }

    @Override
    public KheoType getKheoType() {
        return KheoType.JSON;
    }

}
