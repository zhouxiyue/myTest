package com.principle.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

    //深拷贝方法1：重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();//对基本数据类型和字符串类型的属性的克隆

        //对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }

    //深拷贝方法2：通过对象的序列化实现
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            //序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            DeepProtoType deepProtoType = (DeepProtoType) objectInputStream.readObject();
            return deepProtoType;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                objectInputStream.close();
                objectOutputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
