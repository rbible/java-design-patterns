package com.iluwatar.chain.service;

import com.iluwatar.chain.Request;
import com.iluwatar.chain.service.node.OrcCommander;
import com.iluwatar.chain.service.node.OrcOfficer;
import com.iluwatar.chain.service.node.OrcSoldier;

/**
 * 
 * Makes requests that are handled by the chain.
 * 
 */
public class OrcKing {

    AbsRequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }

}
