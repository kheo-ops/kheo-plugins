package com.migibert.kheo.core.plugin.os;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.migibert.kheo.core.plugin.KheoType;
import com.migibert.kheo.core.plugin.ServerProperty;

public class OsServerProperty extends ServerProperty {
	@JsonProperty
	public String name;

	@JsonProperty
	public String kernelName;

	@JsonProperty
	public String kernelRelease;

	@JsonProperty
	public String hardwarePlatform;

	public OsServerProperty() {
		this.name = "";
		this.kernelName = "";
		this.kernelRelease = "";
		this.hardwarePlatform = "";
	}
	
	@Override
	public String getKey() {
	    return this.name;
	}
	
	@Override
	public KheoType getKheoType() {
	    return KheoType.JSON;
	}
}
