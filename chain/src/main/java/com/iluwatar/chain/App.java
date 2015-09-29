package com.iluwatar.chain;

import com.iluwatar.chain.service.ERequestType;
import com.iluwatar.chain.service.OrcKing;

/**
 * 
 * Chain of Responsibility organizes request handlers (RequestHandler) into a
 * chain where each handler has a chance to act on the request on its turn. In
 * this example the king (OrcKing) makes requests and the military orcs
 * (OrcCommander, OrcOfficer, OrcSoldier) form the handler chain.
 * 
 */
public class App {

    public static void main(String[] args) {

        OrcKing king = new OrcKing();
        king.makeRequest(new Request(ERequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(ERequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(ERequestType.COLLECT_TAX, "collect tax"));
    }
}
