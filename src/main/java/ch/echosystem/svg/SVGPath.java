package ch.echosystem.svg;

import ch.echosystem.geojson.MultiPointGeometry;

public class SVGPath
    {
    public static SVGPath of(final MultiPointGeometry geometry)
        {
        geometry.getBoundingBox();
        
        return new SVGPath();
        }
    }
