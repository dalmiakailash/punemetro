package com.company.punemetro.model.route;

public class Route {

	private final EnumRouteType routeType;

	private final Station start;

	private final Station end;

	private final float distance;

	public Route(
			final EnumRouteType routeType, final Station start, final Station end, final float distance) {
		this.routeType = routeType;
		this.start = start;
		this.end = end;
		this.distance = distance;
	}

	public Station getStart() {
		return start;
	}

	public Station getEnd() {
		return end;
	}

	public EnumRouteType getRouteType() {
		return routeType;
	}

	public float getDistance() {
		return distance;
	}

	@Override public String toString() {
		return start.getName() + "-----"+distance+"-----" + end.getName() ;
	}
}
