package com.example.demo.tool;

import com.example.demo.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTool {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(18, "xiaowang"));
        list.add(new Student(19, "xiaoiyu"));
        list.add(new Student(17, "xiaoli"));
        List<Student> list1 = null;
        List<Student> list2 = Optional.ofNullable(list).orElse(list1);
//        System.out.println(students);
        Optional<Object> o = Optional.ofNullable(null);
        //get  获取Optional 内部对象的值
        Optional.ofNullable(list).ifPresent(i -> System.out.println(i.get(1).getAge()));
//        System.out.println(list1.get(1));
        Student student = null;
        System.out.println(Optional.ofNullable(student).orElse(new Student()));
        System.out.println(Optional.ofNullable(student).orElseGet(() -> new Student()));
//        Optional.ofNullable(student).orElseThrow(() -> new RuntimeException("空指针异常"));
        Optional.ofNullable(list).orElseThrow(() -> new RuntimeException("孔氏抛出异常"));
        //转换值
        List<Student> xinzeng = Optional.ofNullable(list).map(i -> {
            i.add(new Student(20, "xinzeng"));
            return list;
        }).orElse(list1);
        System.out.println(xinzeng);
        System.out.println(list);
    }
}
