package com.iluwatar.mediator;

import com.iluwatar.mediator.enums.EAction;
import com.iluwatar.mediator.member.Hobbit;
import com.iluwatar.mediator.member.Hunter;
import com.iluwatar.mediator.member.Rogue;
import com.iluwatar.mediator.member.Wizard;
import com.iluwatar.mediator.party.IParty;
import com.iluwatar.mediator.party.PartyImpl;

/**
 * 
 * Mediator encapsulates how a set of objects (PartyMember) interact. Instead of
 * referring to each other directly they use a mediator (Party) interface.
 * 
 */
public class App {

	public static void main(String[] args) {

		// create party and members
		IParty party = new PartyImpl();
		Hobbit hobbit = new Hobbit();
		Wizard wizard = new Wizard();
		Rogue rogue = new Rogue();
		Hunter hunter = new Hunter();

		// add party members
		party.addMember(hobbit);
		party.addMember(wizard);
		party.addMember(rogue);
		party.addMember(hunter);

		// perform actions -> the other party members
		// are notified by the party
		hobbit.act(EAction.ENEMY);
		wizard.act(EAction.TALE);
		rogue.act(EAction.GOLD);
		hunter.act(EAction.HUNT);
	}
}
