package com.company.punemetro.database;

import com.company.punemetro.model.route.EnumRouteType;
import com.company.punemetro.model.route.Route;
import com.company.punemetro.model.route.Station;

import java.util.LinkedList;
import java.util.List;

public final class RouteDatabase {

	private final List<Route> routes = new LinkedList<Route>() {{
		add(new Route(EnumRouteType.YELLOW, new Station("Kharadi"), new Station("Yerwada"), 7));
		add(new Route(EnumRouteType.YELLOW, new Station("Yerwada"), new Station("Khadki"), 10));
		add(new Route(EnumRouteType.YELLOW, new Station("Khadki"), new Station("Aundh"), 15));
		add(new Route(EnumRouteType.YELLOW, new Station("Aundh"), new Station("Hinjewadi"), 20));
	}};

	public RouteDatabase() {
		System.out.println(routes);
	}

	public float fetchDistance(final Station start, final Station end) {
		if (start.equals(end)) {
			return 0;
		}
		float distance = 0;
		boolean possibleRouteFound = false;
		boolean downStream = false;
		boolean startFound = false;
		boolean endFound = false;
		for (Route route : routes) {
			if (!possibleRouteFound) {
				if (route.getStart().getName().equals(start.getName())) {
					possibleRouteFound = true;
				} else if (route.getStart().getName().equals(end.getName())) {
					possibleRouteFound = true;
					downStream = true;
				} else if (route.getEnd().getName().equals(end.getName()) && route.getStart()
						.getName()
						.equals(start.getName())) {
					possibleRouteFound = true;
				}
			}
			if (possibleRouteFound) {
				if (downStream) {
					endFound = endFound || route.getStart().equals(end);
					startFound = startFound || route.getEnd().equals(start);
				} else {
					endFound = endFound || route.getEnd().equals(end);
					startFound = startFound || route.getStart().equals(start);
				}
				if (startFound || endFound) {
					distance += route.getDistance();
				}
				if (endFound && startFound) {
					break;
				}
			}
		}
		return (startFound && endFound) ? distance : -1f;
	}

	public static void main(String[] args) {
		final RouteDatabase routeDatabase = new RouteDatabase();
		System.out.println("Aundh----Kharadi = " + routeDatabase.fetchDistance(new Station("Aundh"),
				new Station("Kharadi")));
		System.out.println("Hinjewadi----Kharadi = " + routeDatabase.fetchDistance(new Station("Hinjewadi"),
				new Station("Kharadi")));
		System.out.println("Kharadi----Yerwada = " + routeDatabase.fetchDistance(new Station("Kharadi"),
				new Station("Yerwada")));
		System.out.println("Hinjewadi----Yerwada = " + routeDatabase.fetchDistance(new Station("Hinjewadi"),
				new Station("Yerwada")));
		System.out.println("Yerwada----Aundh = " + routeDatabase.fetchDistance(new Station("Yerwada"),
				new Station("Aundh")));
		System.out.println("Aundh----Yerwada = " + routeDatabase.fetchDistance(new Station("Aundh"),
				new Station("Yerwada")));
		System.out.println("Hinjewadi----NotFound = " + routeDatabase.fetchDistance(new Station("Hinjewadi"),
				new Station("NotFound")));
	}

}
