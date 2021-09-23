package ch.echosystem.geojson;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class TestPointCollection
	{
	@Test
	public void testFromFile() throws IOException
		{
		final var collection = GeoJson.loadPoints("FeatureCollectionPoint.geojson");

		assertNotNull(collection);
		}
	}
