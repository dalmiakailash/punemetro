package com.company.punemetro.model.criteria;

import com.company.punemetro.model.route.Station;
import com.company.punemetro.model.ticket.TicketType;

public class CreiteriaFactory {

	public static ITicketCriteria createCriteria(final TicketType ticketType, final Station from, final Station to){
		switch (ticketType){
			case GENERAL:
			case SENIORS:
		}
		return null;
	}

}
