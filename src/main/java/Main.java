import java.io.IOException;
import ch.echosystem.geojson.FeatureCollection;

public class Main
    {
    public static void main(String[] args) throws IOException
        {
        //final var collection = FeatureCollection.fromFile("../bus-sierrois-opendata/bus-sierrois/stops.geojson", PointFeature.class);
        final var collection = FeatureCollection.pointsFromFile("../bus-sierrois-opendata/bus-sierrois/stops.geojson");

        System.out.println(collection.getType());

        collection.getFeatures().forEach(feature ->
            {
            System.out.println(feature.getGeometry().getType());
            });
        }
    }
