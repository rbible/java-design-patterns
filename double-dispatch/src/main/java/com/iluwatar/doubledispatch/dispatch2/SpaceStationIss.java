package com.iluwatar.doubledispatch.dispatch2;

import com.iluwatar.doubledispatch.dispatch1.AbsGameObject;

/**
 * 
 * Space station ISS game object
 *
 */
public class SpaceStationIss extends SpaceStationMir {

	public SpaceStationIss(int left, int top, int right, int bottom) {
		super(left, top, right, bottom);
	}

	@Override
	public void collision(AbsGameObject gameObject) {
		gameObject.collisionResolve(this);
	}
}
