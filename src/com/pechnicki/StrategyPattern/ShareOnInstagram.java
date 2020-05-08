package com.pechnicki.StrategyPattern;

public class ShareOnInstagram extends ShareBehaviour{
    @Override
    public ShareBehaviour share(){
        System.out.println("Shared on Instagram");
        return null;
    }
}
