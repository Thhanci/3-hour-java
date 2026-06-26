package l14.homework;

class ReadingMode extends BaseMode {

    private int page = 1;  // 当前页码

    @Override
    public void volumeUp() {
        page++;
        System.out.println("阅读模式：下一页，当前第 " + page + " 页");
    }

    @Override
    public void volumeDown() {
        if (page > 1) {
            page--;
            System.out.println("阅读模式：上一页，当前第 " + page + " 页");
        } else {
            System.out.println("阅读模式：已经是第一页！");
        }
    }
}