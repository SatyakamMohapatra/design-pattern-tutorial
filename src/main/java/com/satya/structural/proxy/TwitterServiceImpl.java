package com.satya.structural.proxy;

public class TwitterServiceImpl implements TwitterService {
    @Override
    public String getTimeLine() {
        return "getting data from twitter timeline";
    }

    @Override
    public String postToTimeLine(String msg) {
        return "posting data to twitter time line: "+ msg;
    }
}
