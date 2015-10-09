package com.iluwatar.poison.pill;

/**
 * Endpoint to retrieve {@link IMessage} from queue
 */
public interface IMQSubscribePoint {

	public IMessage take() throws InterruptedException;
}
