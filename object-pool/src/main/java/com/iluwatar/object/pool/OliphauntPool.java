package com.iluwatar.object.pool;

/**
 * 
 * Oliphaunt object pool
 *
 */
public class OliphauntPool extends AbsObjectPool<Oliphaunt> {

	@Override
	protected Oliphaunt create() {
		return new Oliphaunt();
	}
}
