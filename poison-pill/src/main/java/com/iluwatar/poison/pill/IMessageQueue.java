package com.iluwatar.poison.pill;

/**
 * Represents abstraction of channel (or pipe) that bounds {@link Producer} and {@link Consumer}
 */
public interface IMessageQueue extends IMQPublishPoint, IMQSubscribePoint {

}
