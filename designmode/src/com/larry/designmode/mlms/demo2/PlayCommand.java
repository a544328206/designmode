package com.larry.designmode.mlms.demo2;

/**
 * 具体命令角色类
 * @author baorui
 *
 */
public class PlayCommand implements Command {

	private AudioPlayer myAudio;
    
    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }

    
	@Override
	public void execute() {
		// TODO Auto-generated method stub

		 myAudio.play();

		 
	}

}
