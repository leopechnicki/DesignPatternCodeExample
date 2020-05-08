package com.pechnicki.StrategyPattern;

public class ShareOnFacebook extends ShareBehaviour{
    @Override
    public ShareBehaviour share(){
        System.out.println("Shared on Facebook");
        return null;
    }
}
