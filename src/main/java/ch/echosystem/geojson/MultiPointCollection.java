package ch.echosystem.geojson;

import java.util.ArrayList;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class MultiPointCollection extends FeatureCollection<MultiPointFeature>
	{
	public BoundingBox getBoundingBox()
		{
		final var list = new ArrayList<BoundingBox>();

		getFeatures().forEach(feature ->
			{
			list.add(feature.getGeometry().getBoundingBox());
			});
		
		return BoundingBox.of(list);
		}
	}
