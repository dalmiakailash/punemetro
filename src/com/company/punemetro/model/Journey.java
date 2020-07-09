package com.company.punemetro.model;

import com.company.punemetro.model.route.Station;

public final class Journey {

	private final Station from;
	private final Station to;

	public Journey(final Station from, final Station to) {
		this.from = from;
		this.to = to;
	}

	public Station getFrom() {
		return from;
	}

	public Station getTo() {
		return to;
	}
}
