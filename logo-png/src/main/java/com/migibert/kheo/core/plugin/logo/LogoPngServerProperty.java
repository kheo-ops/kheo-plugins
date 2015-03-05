package com.migibert.kheo.core.plugin.logo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.migibert.kheo.core.plugin.KheoType;
import com.migibert.kheo.core.plugin.ServerProperty;

public class LogoPngServerProperty extends ServerProperty {

    @JsonProperty
    public String encodedImage;

    @Override
    public KheoType getKheoType() {
        return KheoType.PNG;
    }

    @Override
    public String getKey() {
        return "logo";
    }
}
