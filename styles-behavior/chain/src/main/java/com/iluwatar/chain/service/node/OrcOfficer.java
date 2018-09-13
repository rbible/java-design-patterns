package com.iluwatar.chain.service.node;

import com.iluwatar.chain.Request;
import com.iluwatar.chain.service.AbsRequestHandler;
import com.iluwatar.chain.service.ERequestType;

public class OrcOfficer extends AbsRequestHandler {

    public OrcOfficer(AbsRequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(ERequestType.TORTURE_PRISONER)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orc officer";
    }

}
