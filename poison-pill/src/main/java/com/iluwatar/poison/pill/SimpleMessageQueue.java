package com.iluwatar.poison.pill;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Bounded blocking queue wrapper
 */
public class SimpleMessageQueue implements IMessageQueue {

	private final BlockingQueue<IMessage> queue;

	public SimpleMessageQueue(int bound) {
		queue = new ArrayBlockingQueue<IMessage>(bound);
	}

	@Override
	public void put(IMessage msg) throws InterruptedException {
		queue.put(msg);
	}

	@Override
	public IMessage take() throws InterruptedException {
		return queue.take();
	}

}
