package com.peng.designpattern.prototype;

import java.io.*;

/**
 * 测试类，测试深拷贝
 * 深拷贝有两种方式实现，第一种是重写clone方法，第二种是通过序列化/反序列化的方式
 */
public class DeepCloneTest implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    private CloneTest cloneTest;

    public DeepCloneTest() {
    }

    public DeepCloneTest(String name, CloneTest cloneTest) {
        this.name = name;
        this.cloneTest = cloneTest;
    }

    /**
     * 重写此方法实现深拷贝 (要求引用类型也要重写clone方法)
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //使用父类的clone方法完成对基本数据类型的克隆
        DeepCloneTest clone = (DeepCloneTest) super.clone();
        //对引用类型进行单独处理
        //调用引用类型的克隆方法完成对引用类型的克隆
        clone.cloneTest = (CloneTest) cloneTest.clone();
        return clone;
    }

    /**
     * 通过序列化/反序列化的方式实现深拷贝
     * @return
     */
    public Object deepClone() {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        try/*(ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);
                ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bis)) */{
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (ois != null) {
                    ois.close();
                }
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCloneTest(CloneTest cloneTest) {
        this.cloneTest = cloneTest;
    }

    public CloneTest getCloneTest() {
        return cloneTest;
    }

    @Override
    public String toString() {
        return "DeepCloneTest{" +
                "name='" + name + '\'' +
                ", cloneTest=" + cloneTest +
                '}';
    }
}
