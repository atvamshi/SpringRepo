package org.springdata.learn.springjpadatalearn.Generics;

/**
 * Project: learn-spring-parent
 * Package: org.springdata.learn.springjpadatalearn.Generics
 * <p>
 * User: vthalapu
 * Date: 1/17/18
 * Time: 8:04 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestGenerics {


    public <T> T testingGenerics(T t){
        if(t instanceof Integer)
            System.out.println("T is a Integer -> "+t);
        if(t instanceof String)
            System.out.println("T is a String -> "+t);
        if(t instanceof Character)
            System.out.println("T is a Character -> "+t);

        return t;
    }


    public static  void main(String...args){
        System.out.println(new TestGenerics().testingGenerics(10));
        System.out.println(new TestGenerics().testingGenerics("Hello Vamsi"));
        System.out.println(new TestGenerics().testingGenerics('C'));
        System.out.println(new TestGenerics().testingGenerics(new String("New Object")));

    }

}
