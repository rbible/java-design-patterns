package com.iluwatar.abstractfactory.infc;

/**
 * 
 * The factory interface.
 * 
 */
public interface IKingdomFactory {

	ICastle createCastle();

	IKing createKing();

	IArmy createArmy();

}
