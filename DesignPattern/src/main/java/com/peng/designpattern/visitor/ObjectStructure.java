package com.peng.designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 访问者模式，聚合一个元素（人）的集合,以便去管理这些元素
 */
public class ObjectStructure {
    private List<Person> persons = new LinkedList<Person>();

    /**
     * 将人添加到list中
     */
    public void attach(Person person) {
        persons.add(person);
    }

    /**
     * 将人从list中移除
     */
    public void disach(Person person) {
        persons.remove(person);
    }

    /**
     * 显示测评结果
     */
    public void display(Action action) {
        persons.forEach( person -> {
            person.accept(action);
        });
    }
}
