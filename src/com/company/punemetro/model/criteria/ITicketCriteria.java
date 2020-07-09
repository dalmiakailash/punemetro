package com.company.punemetro.model.criteria;

import com.company.punemetro.model.Journey;

public interface ITicketCriteria {

	double pricePerKilometer();

	double pricePerDay();

	Journey getJourney();

}
