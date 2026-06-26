package l14.homework;

class MusicMode extends BaseMode {

    private int volume = 50;  // 当前音量（0-100）

    @Override
    public void volumeUp() {
        if (volume < 100) {
            volume += 10;
            System.out.println("音乐模式：音量 +，当前音量：" + volume);
        } else {
            System.out.println("音乐模式：已经是最大音量！");
        }
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume -= 10;
            System.out.println("音乐模式：音量 -，当前音量：" + volume);
        } else {
            System.out.println("音乐模式：已经是最小音量！");
        }
    }
}