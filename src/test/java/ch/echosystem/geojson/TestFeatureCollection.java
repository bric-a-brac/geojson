package ch.echosystem.geojson;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class TestFeatureCollection
	{
	@Test
	public void testFromFile() throws IOException
		{
		final var collection = FeatureCollection.fromFile("FeatureCollectionPoint.geojson", PointFeature.class);

		assertNotNull(collection);
		}
	}
