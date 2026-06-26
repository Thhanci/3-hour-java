package l14.homework;

abstract class BaseMode implements Mode {

    // 通用实现：Home 键回到主界面
    @Override
    public void home() {
        System.out.println("回到主界面");
    }

    // 通用实现：锁屏键锁屏
    @Override
    public void lock() {
        System.out.println("锁屏");
    }

    // 音量 + 和音量 - 留给子类定制
    @Override
    public abstract void volumeUp();

    @Override
    public abstract void volumeDown();
}
