package ch.echosystem.geojson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public final class FeatureCollection<T extends Feature<?>> extends AbstractGeoJson
    {
    private List<T> features;

    public final List<T> getFeatures()
        {
        return features;
        }

    @SuppressWarnings("unchecked")
    public static <T extends Feature<?>> FeatureCollection<T> fromFile(final Path path, final Class<T> classOfT) throws IOException
        {
        final var json = Files.readString(path);
        
        final var type = TypeToken.getParameterized(FeatureCollection.class, classOfT).getType();

        return (FeatureCollection<T>) new Gson().fromJson(json, type);
        }
    
    public static <T extends Feature<?>> FeatureCollection<T> fromFile(final String path, final Class<T> classOfT) throws IOException
        {
        return fromFile(Paths.get(path), classOfT);
        }

    public static FeatureCollection<PointFeature> pointsFromFile(final Path path) throws IOException
        {
        return fromFile(path, PointFeature.class);
        }

    public static FeatureCollection<PointFeature> pointsFromFile(final String path) throws IOException
        {
        return pointsFromFile(Paths.get(path));
        }
    }
