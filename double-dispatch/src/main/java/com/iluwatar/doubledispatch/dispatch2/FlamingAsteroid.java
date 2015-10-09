package com.iluwatar.doubledispatch.dispatch2;

import com.iluwatar.doubledispatch.dispatch1.AbsGameObject;
import com.iluwatar.doubledispatch.dispatch1.Meteoroid;

/**
 * 
 * Flaming asteroid game object
 *
 */
public class FlamingAsteroid extends Meteoroid {

	public FlamingAsteroid(int left, int top, int right, int bottom) {
		super(left, top, right, bottom);
		setOnFire(true);
	}

	@Override
	public void collision(AbsGameObject gameObject) {
		gameObject.collisionResolve(this);
	}
}
