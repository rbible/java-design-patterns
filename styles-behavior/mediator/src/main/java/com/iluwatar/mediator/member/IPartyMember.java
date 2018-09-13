package com.iluwatar.mediator.member;

import com.iluwatar.mediator.enums.EAction;
import com.iluwatar.mediator.party.IParty;

/**
 * 
 * Interface for party members interacting with Party.
 * 
 */
public interface IPartyMember {

	void joinedParty(IParty party);

	void partyAction(EAction action);

	void act(EAction action);
}
