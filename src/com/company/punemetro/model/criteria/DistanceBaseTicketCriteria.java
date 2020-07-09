package com.company.punemetro.model.criteria;

import com.company.punemetro.model.Journey;
import com.company.punemetro.model.route.Station;

public class DistanceBaseTicketCriteria implements ITicketCriteria {

	private final double pricePerKilometer;
	private final Journey journey;

	public DistanceBaseTicketCriteria(final double pricePerKilometer, final Journey journey) {
		this.pricePerKilometer = pricePerKilometer;
		this.journey = journey;
	}

	@Override
	public double pricePerKilometer() {
		return pricePerKilometer;
	}

	@Override public Journey getJourney() {
		return journey;
	}

	@Override
	public double pricePerDay() {
		return 0;
	}
}
