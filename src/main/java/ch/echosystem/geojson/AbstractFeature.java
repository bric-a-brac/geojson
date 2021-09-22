package ch.echosystem.geojson;

import java.util.Map;

public abstract class AbstractFeature<T extends Geometry<?>> extends AbstractGeoJson implements Feature<T>
	{
	private T geometry;
	private Map<String, String> properties;

	@Override
	public final T getGeometry()
		{
		return geometry;
		}

	@Override
	public final Map<String, String> getProperties()
		{
		return properties;
		}
	}
