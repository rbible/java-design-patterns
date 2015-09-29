package com.iluwatar.chain;

import com.iluwatar.chain.service.ERequestType;

public class Request {

    private String requestDescription;
    private ERequestType requestType;

    public Request(ERequestType requestType, String requestDescription) {
        this.setRequestType(requestType);
        this.setRequestDescription(requestDescription);
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public ERequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(ERequestType requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
