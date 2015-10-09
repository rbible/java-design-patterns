package com.iluwatar.poison.pill;

/**
 * Endpoint to publish {@link IMessage} to queue
 */
public interface IMQPublishPoint {

	public void put(IMessage msg) throws InterruptedException;
}
