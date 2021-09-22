package ch.echosystem.geojson;

import java.util.Map;

public interface Feature<T extends Geometry<?>>
	{
	public String getType();

	public T getGeometry();

	public Map<String, String> getProperties();
	}
