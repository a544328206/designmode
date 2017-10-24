package com.larry.designmode.mlms.demo2;

public class StopCommand implements Command {

	private AudioPlayer myAudio;
    
    public StopCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }

	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myAudio.stop();
	}

}
