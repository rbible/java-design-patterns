package com.iluwatar.mediator.party;

import com.iluwatar.mediator.enums.EAction;
import com.iluwatar.mediator.member.IPartyMember;

/**
 * 
 * Party interface.
 * 
 */
public interface IParty {

	void addMember(IPartyMember member);

	void act(IPartyMember actor, EAction action);

}
