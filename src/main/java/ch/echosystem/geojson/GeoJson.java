package ch.echosystem.geojson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.google.gson.Gson;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class GeoJson
	{
	private static final Gson GSON = new Gson();

	/**
	 * @since 0.1.0
	 */
	public static PointCollection loadPoints(final Path path) throws IOException
		{
		return GSON.fromJson(Files.readString(path), PointCollection.class);
		}
	
	/**
	 * @since 0.1.0
	 */
	public static PointCollection loadPoints(final String path) throws IOException
		{
		return loadPoints(Paths.get(path));
		}
	
	/**
	 * @since 0.1.0
	 */
	public static MultiPointCollection loadMultiPoints(final Path path) throws IOException
		{
		return GSON.fromJson(Files.readString(path), MultiPointCollection.class);
		}
	}
