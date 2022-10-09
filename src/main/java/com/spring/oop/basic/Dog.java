package com.spring.oop.basic;

public class Dog {
    String name;
    String kind;
    int age;
    // 필드

//    생성자(함수)
    Dog(String name, String kind){
        this.name=name;
        this.kind=kind;
    }


    void bite(String target){
        System.out.printf("%s 멍멍이는 %s를 깨물어요\n", this.name, target);
    }

    void introduce(){
        System.out.printf("내 이름은 %s고 나는 %s종이야~~\n", name, kind);
        System.out.printf("나이는 %d세란다~\n", age);
        System.out.println("================================================================");
    }
}
