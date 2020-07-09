package com.company.punemetro.model.ticket;

import com.company.punemetro.model.route.Station;

public class DistancedTicket implements ITicket {

	private final float cost;
	private final Station from;
	private final Station to;

	public DistancedTicket(final float cost, final Station from, final Station to) {
		this.cost = cost;
		this.from = from;
		this.to = to;
	}

	@Override
	public void printTicket() {
		System.out.println("From:"+from);
		System.out.println("To:"+to);
		System.out.println("Total Cost:"+cost);
	}
}
