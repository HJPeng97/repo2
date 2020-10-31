package com.peng.designpattern.facade;

/**
 * 影院外观类 (外观模式)
 */
public class HomeTheaterFacade {
    //聚合各个子系统（子部件），来进行统一的管理
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    //操作分为四个步骤

    /**
     * 准备阶段
     */
    public void ready() {
        popcorn.on(); // 打开爆米花机
        popcorn.pop();
        screen.down(); // 屏幕降下来
        projector.on(); // 打开投影仪
        stereo.on(); // 打开立体声
        dvdPlayer.on(); // 打开DVD
        theaterLight.dim(); // 调暗影院灯光
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        dvdPlayer.off();
        projector.off();
        screen.up();
        stereo.off();
    }
}
