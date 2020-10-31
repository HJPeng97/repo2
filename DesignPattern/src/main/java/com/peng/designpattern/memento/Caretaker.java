package com.peng.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 该类用来管理备忘录对象（Memento）
 */
public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    /**
     * 从集合里获取第index + 1个备忘录对象
     * @param index
     * @return
     */
    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
