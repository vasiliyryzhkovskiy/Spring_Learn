package ru.vasiliyryzhkovskiy.springcourse;

/**
 * @author Vasiliy Ryzhkovskiy
 */
public class MusicPlayer {
    private Music music;

    /** def constructor need for spring bean musicPlayerSetterBean
     * @see  /src/main/resources/applicationContext.xml
     */
    public MusicPlayer() { }

    // для IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    // для возможности использования spring данного setter
    public void setMusic(Music music) {
        this.music = music;
        System.out.println("yes yes it is  " + MusicPlayer.class.getSimpleName()) ;
    }

    public void playMusic() {
        System.out.println("Playing : " + music.getSong());
    }

}