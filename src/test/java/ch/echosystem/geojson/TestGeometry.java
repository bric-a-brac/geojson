package ch.echosystem.geojson;

import org.junit.jupiter.api.Test;

public class TestGeometry
	{
	@Test
	public void test()
		{
		final var geometry = new Geometry<String>()
			{
			@Override
			public String getCoordinates()
				{
				return null;
				}
			};
		
		System.out.println(geometry);
		}
	}
