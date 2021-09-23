import java.io.IOException;

import ch.echosystem.geojson.GeoJson;

public class Main
	{
	public static void main(String[] args) throws IOException
		{
		final var collection = GeoJson.loadPoints("../bus-sierrois-opendata/bus-sierrois/stops.geojson");

		System.out.println(collection.getType());

		collection.getFeatures().forEach(feature ->
			{
			System.out.print(feature.getGeometry().getType());
			System.out.print(": ");
			System.out.print(feature.getGeometry().getCoordinates()[0]);
			System.out.print(", ");
			System.out.print(feature.getGeometry().getCoordinates()[1]);
			System.out.print(" - ");
			//System.out.println(feature.getProperties().getOrDefault("name", "(sans nom)"));
			System.out.println(feature.getName());
			});
		}
	}
