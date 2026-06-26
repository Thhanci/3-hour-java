package l14.homework;

public class PhoneTest {
    public static void main(String[] args) {

        System.out.println("========== 音乐模式 ==========");
        Mode music = new MusicMode();
        music.home();
        music.volumeUp();
        music.volumeUp();
        music.volumeDown();
        music.lock();

        System.out.println();

        System.out.println("========== 阅读模式 ==========");
        Mode reading = new ReadingMode();
        reading.home();
        reading.volumeUp();
        reading.volumeUp();
        reading.volumeDown();
        reading.lock();
    }
}
