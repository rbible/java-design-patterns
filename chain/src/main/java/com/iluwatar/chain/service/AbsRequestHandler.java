package com.iluwatar.chain.service;

import com.iluwatar.chain.Request;

public abstract class AbsRequestHandler {

    private AbsRequestHandler next;

    public AbsRequestHandler(AbsRequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        System.out.println(this + " handling request \"" + req + "\"");
    }

    @Override
    public abstract String toString();
}
