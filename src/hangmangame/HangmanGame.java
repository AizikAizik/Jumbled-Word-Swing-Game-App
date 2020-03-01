/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Isaac Ogunleye
 */
public class HangmanGame {
    
    public static void play() {
  try {
   String name = "file:\\C:\\Users\\Isaac Ogunleye\\Documents\\NetBeansProjects\\HangmanGame\\src\\hangmangame\\drake.wav";
   File file = new File(name+".wav");
   Clip clip = AudioSystem.getClip();
   clip.open(AudioSystem.getAudioInputStream(file));
   clip.start();
   Thread.sleep(clip.getMicrosecondLength());
  } catch (Exception e) {
   System.err.println(e.getMessage());
  }
 }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        play();
        HomePage home = new HomePage();
        
    }
    
}
