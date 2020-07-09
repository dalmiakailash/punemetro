package com.company.punemetro.model.route;

import java.util.Objects;

public class Station {

	private final String name;

	public Station(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override public String toString() {
		return "Station{" + "name='" + name + '\'' + '}';
	}

	@Override public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Station)) {
			return false;
		}
		final Station station = (Station) o;
		return Objects.equals(getName(), station.getName());
	}

	@Override public int hashCode() {
		return Objects.hash(getName());
	}
}
