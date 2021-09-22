package ch.echosystem.geojson;

import java.util.List;

public final class BoundingBox
	{
	private float minX = Float.MAX_VALUE;
	private float minY = Float.MAX_VALUE;

	public float getMinX()
		{
		return minX;
		}

	public void setMinX(final float minX)
		{
		this.minX = minX;
		}

	public float getMinY()
		{
		return minY;
		}
	
	public void setMinY(final float minY)
		{
		this.minY = minY;
		}

	public void update(final float minX, final float minY)
		{
		if (minX < this.minX)
			{
			this.minX = minX;
			}
		
		if (minY < this.minY)
			{
			this.minY = minY;
			}
		}
	
	public static BoundingBox of(final List<BoundingBox> boundingBoxes)
		{
		final var bbox = new BoundingBox();

		boundingBoxes.forEach(boundingBox ->
			{
			
			});
		
		return bbox;
		}
	}
