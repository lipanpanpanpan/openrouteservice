package heigit.ors.api.responses.routing;

import com.vividsolutions.jts.geom.Coordinate;
import heigit.ors.geojson.GeometryJSON;

public class PolylineGeometryResponse extends GeometryResponse {
    public PolylineGeometryResponse(Coordinate[] coordinates, boolean includeElevation) {
        super(coordinates, includeElevation);
    }

    @Override
    public Object getGeometry() {
        return GeometryJSON.toJSON(coordinates, includeElevation);
    }
}