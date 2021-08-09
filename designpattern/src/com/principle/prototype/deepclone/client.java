package com.principle.prototype.deepclone;

public class client {
    public static void main(String[] args) throws Exception{
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "abc";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("aaa","bbb");

//        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
//        System.out.println(
//                deepProtoType.name+" "+deepProtoType.deepCloneableTarget.toString()+" "+
//                deepProtoType.deepCloneableTarget.hashCode());
//        System.out.println(
//                deepProtoType1.name+" "+deepProtoType1.deepCloneableTarget.toString()+" "+
//                        deepProtoType1.deepCloneableTarget.hashCode());

        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(
                deepProtoType.name+" "+deepProtoType.deepCloneableTarget.toString()+" "+
                        deepProtoType.deepCloneableTarget.hashCode());
        System.out.println(
                deepProtoType1.name+" "+deepProtoType1.deepCloneableTarget.toString()+" "+
                        deepProtoType1.deepCloneableTarget.hashCode());


    }
}
