package com.iluwatar.mediator.party;

import java.util.ArrayList;
import java.util.List;

import com.iluwatar.mediator.enums.EAction;
import com.iluwatar.mediator.member.IPartyMember;

/**
 * 
 * Party implementation.
 *
 */
public class PartyImpl implements IParty {

	private final List<IPartyMember> members;

	public PartyImpl() {
		members = new ArrayList<>();
	}

	@Override
	public void act(IPartyMember actor, EAction action) {
		for (IPartyMember member : members) {
			if (member != actor) {
				member.partyAction(action);
			}
		}
	}

	@Override
	public void addMember(IPartyMember member) {
		members.add(member);
		member.joinedParty(this);
	}
}
