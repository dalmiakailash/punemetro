package com.company.punemetro.model.ticket;

import java.time.Instant;

public class TimeBasedTicket implements ITicket {

	private final float cost;
	private final Instant validFrom;
	private final Instant validTill;

	public TimeBasedTicket(final float cost, final Instant validFrom, final Instant validTill) {
		this.cost = cost;
		this.validFrom = validFrom;
		this.validTill = validTill;
	}

	@Override
	public void printTicket() {
		System.out.println("Valid From:"+validFrom);
		System.out.println("Valid Till:"+validTill);
		System.out.println("Total Cost:"+cost);
	}
}
