package com.example.demo.tool;

import com.example.demo.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalToolTwo {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "xiaowang"));
        list.add(new Student(2, "xiaoli"));
        list.add(new Student(3, "xiaozhang"));
        list.add(new Student(4, "xiaoliu"));
        List<Integer> collect = list.stream().map(o -> o.getAge()).filter(e -> e > 1).collect(Collectors.toList());
        System.out.println(collect);
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(5, "dawang"));
        list1.add(new Student(6, "daliu"));
        List<List<Student>> lists = new ArrayList<>();
        lists.add(list);
        lists.add(list1);
        List<Integer> integer = new ArrayList<>();
        lists.stream().map(o -> o.stream().map(i -> i.getAge())).collect(Collectors.toList()).forEach(System.out::println);
        lists.stream().map(o -> o.stream().map(i -> i.getAge()).collect(Collectors.toList())).collect(Collectors.toList()).forEach(i -> i.forEach(e -> System.out.println(e)));
        List<Student> list2 = new ArrayList();
        Stream<List<Student>> listStream = lists.stream().map(i -> {
            List<Student> list3 = new ArrayList<>();
            i.stream().forEach(e -> {
                if (e.getAge() > 2) {
                    list3.add(e);
                }
            });
            return list3;
        });
        lists.stream().forEach(i -> i.stream().forEach(e -> System.out.println(e.getAge())));
    }
}
