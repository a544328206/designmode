package com.larry.designmode.mlms.demo2;

/**
 * 
 * @author baorui
 *
 */
public class RewindCommand implements Command {

	private AudioPlayer myAudio;
    
    public RewindCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }

    
	@Override
	public void execute() {
		// TODO Auto-generated method stub

		myAudio.rewind();

		
	}

}
