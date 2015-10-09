package com.iluwatar.mediator.member;

import com.iluwatar.mediator.enums.EAction;
import com.iluwatar.mediator.party.IParty;

/**
 * 
 * Abstract base class for party members.
 *
 */
public abstract class AbsPartyMemberBase implements IPartyMember {

	protected IParty party;

	@Override
	public void joinedParty(IParty party) {
		System.out.println(this + " joins the party");
		this.party = party;
	}

	@Override
	public void partyAction(EAction action) {
		System.out.println(this + " " + action.getDescription());
	}

	@Override
	public void act(EAction action) {
		if (party != null) {
			System.out.println(this + " " + action.toString());
			party.act(this, action);
		}
	}

	@Override
	public abstract String toString();

}
