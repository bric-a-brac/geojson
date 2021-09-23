package ch.echosystem.geojson;

import java.util.List;

public class FeatureCollection<T extends Feature<?>> extends AbstractGeoJson
	{
	private List<T> features;

	public final List<T> getFeatures()
		{
		return features;
		}

	/*
	@SuppressWarnings("unchecked")
	public static <T extends Feature<?>> FeatureCollection<T> fromFile(final Path path, final Class<T> classOfT) throws IOException
		{
		final var json = Files.readString(path);
		
		final var type = TypeToken.getParameterized(FeatureCollection.class, classOfT).getType();

		return (FeatureCollection<T>) new Gson().fromJson(json, type);
		}
	*/
	}
