package com.pechnicki.StrategyPattern;

public abstract class PhoneCameraApp{
    private ShareBehaviour shareBehaviour;

    public abstract void edit();

    public void take(){
        System.out.println("Take a picture");
    }

    public void save(){
        System.out.println("Picture Saved");
    }

    public void setShareBehaviour(ShareBehaviour shareBehaviour){
        this.shareBehaviour = shareBehaviour;
    }

    public ShareBehaviour performShare(){
        return this.shareBehaviour.share();
    };

}