package com.pechnicki.strategypattern;

public class StrategyPattern{

    public static void main(String[] args) {
	    PhoneCameraApp phoneCameraApp1 = new CameraPlusApp();
		PhoneCameraApp phoneCameraApp2 = new BasicCameraApp();

		phoneCameraApp1.setShareBehaviour(new ShareOnFacebook());
		phoneCameraApp2.setShareBehaviour(new ShareOnInstagram());

	    phoneCameraApp1.take();
	    phoneCameraApp1.edit();
	    phoneCameraApp1.save();
		phoneCameraApp1.performShare();

		phoneCameraApp2.take();
		phoneCameraApp2.edit();
		phoneCameraApp2.save();
		phoneCameraApp2.performShare();
    }
}
