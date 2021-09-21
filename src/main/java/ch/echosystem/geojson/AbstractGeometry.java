package ch.echosystem.geojson;

public abstract class AbstractGeometry<T> extends AbstractGeoJson implements Geometry<T>
    {
    private T coordinates;

    @Override
    public final T getCoordinates()
        {
        return coordinates;
        }
    }
