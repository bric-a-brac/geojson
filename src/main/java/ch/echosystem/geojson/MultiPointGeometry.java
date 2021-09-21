package ch.echosystem.geojson;
import java.util.List;

public final class MultiPointGeometry extends AbstractGeometry<List<float[]>>
    {
    public BoundingBox getBoundingBox()
        {
        final var bbox = new BoundingBox();

        getCoordinates().forEach(coordinate ->
            {
            bbox.update(coordinate[0], coordinate[1]);
            });

        return bbox;
        }
    }
