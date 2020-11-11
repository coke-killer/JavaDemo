package com.example.demo.entity;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.sum;

public class StreamEntity {
    public static void main(String[] args) throws FileNotFoundException {
        //常用创建方法
//        List<String> list = new ArrayList<String>();
//        //获取顺序流
//        Stream<String> stream = list.stream();
//        //获取并行流
//        Stream<String> stringStream = list.parallelStream();
//        //将数组转换成流
//        Integer[] integers = {};
//        Stream<Integer> stream1 = Arrays.stream(integers);
//        //使用Stream  得静态方法转换
//        Stream<Object> stream2 = Stream.of("xiaowang", 2, "xiaoli", Stream.of(1));
//        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2).limit(6);
//        stream3.forEach(System.out::println);
//        Stream<Double> stream4 = Stream.generate(() -> Math.random()).limit(2);
//        stream4.forEach(System.out::println);
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\2_10.data"));
//        Stream<String> lines = bufferedReader.lines();
//        lines.forEach(System.out::println);
//        //将字符串分隔成流
//        Pattern pattern = Pattern.compile(",");
//        Stream<String> stream5 = pattern.splitAsStream("a,b,v,c,d");
//        stream5.forEach(System.out::println);
        //流得中间操作
//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 3, 4, 5);
//        Stream<Integer> integerStream1 = integerStream.filter(s -> s > 2).distinct().limit(2);
//        integerStream1.forEach(System.out::println);
        //映射
        //map   接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成新得元素
        //flatMap 接收一个函数作为参数，将流中得每一个值转换成另一个流，然后把每个流连接成一个新的流
//        Stream<String> stringStream = Stream.of("1,2,3", "a,b,c").map(s -> s.replaceAll(",", ""));
//        stringStream.forEach(System.out::println);
//        Stream<String> abc = Stream.of("1,2,3", "a,b,c").flatMap(s -> {
//            //将每个元素转换成一个Stream
//            String[] split = s.split(",");
//            Stream<String> s2 = Arrays.stream(split);
//            return s2;
//        });
//        abc.forEach(System.out::println);
        //排序
        //sorted 自然排序，流中元素需要实现Comparable  接口
        //sorted(Comparator com)定制排序 自定义Comparator 排序器
//        List<String> list = Arrays.asList("aa", "cc", "bb");
//        list.stream().sorted().forEach(System.out::println);
//        Student student = new Student("aa", 10);
//        Student student1 = new Student("bb", 20);
//        Student student2 = new Student("bb", 30);
//        Student student3 = new Student("bb", 20);
//        List<Student> students = Arrays.asList(student, student1, student2,student3);
//        students.stream().sorted(
//                (s1, s2) -> {
//                    if (s1.getName().equals(s2.getName())) {
//                        return s1.getAge() - s2.getAge();
//                    } else {
//                        return s1.getName().compareTo(s2.getName());
//                    }
//                }
//        ).forEach(System.out::println);
//
        //peek
//        Student s1 = new Student("cc", 123);
//        Student s2 = new Student("aa", 68);
//        List<Student> asList = Arrays.asList(s1, s2);
//        asList.stream().peek(o -> o.setAge(19)).forEach(System.out::println);
        //终止操作
//        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
//        boolean b = integerList.stream().allMatch(a -> a > 1);
//        boolean b1 = integerList.stream().anyMatch(a -> a < 2);
//        boolean b2 = integerList.stream().noneMatch(a -> a > 1);
//        Integer integer = integerList.stream().findFirst().get();
//        Integer integer1 = integerList.stream().findAny().get();
//        long count = integerList.stream().count();
//        Integer integer2 = integerList.stream().max((o1, o2) -> o1.compareTo(o2)).get();
//        Integer integer3 = integerList.stream().min(Integer::compareTo).get();
//        System.out.println(b);
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(integer);
//        System.out.println(integer2);
//        System.out.println(integer1);
//        System.out.println(count);
//        System.out.println(integer3);
        //规约操作
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        System.out.println(integers.stream().reduce((x1, x2) -> x1 + x2).get());
//        System.out.println(integers.stream().reduce(10, (x1, x2) -> x1 + x2));
//        Integer r1 = integers.stream().reduce(
//                0, (x1, x2) -> {
//                    System.out.println("stream accumulator: x1:" + x1 + "x2:" + x2);
//                    return x1 - x2;
//                }, (x1, x2) -> {
//                    System.out.println("stream accumulator: x1:" + x1 + "x2:" + x2);
//                    return x1 * x2;
//                }
//        );
//        System.out.println(r1);
//        Integer r2 = integers.parallelStream().reduce(
//                0, (x1, x2) -> {
//                    System.out.println("stream accumulator: x1:" + x1 + "x2:" + x2);
//                    return x1 - x2;
//                }, (x1, x2) -> {
//                    System.out.println("stream accumulator: x1:" + x1 + "x2:" + x2);
//                    return x1 * x2;
//                }
//        );
//        System.out.println(r2);
        //收集操作
        Student t1 = new Student("aa", 03);
        Student t2 = new Student("cc", 01);
        Student t3 = new Student("uu", 05);
        List<Student> list = Arrays.asList(t1, t2, t3);
//        //转换成List，
//        List<Integer> list1 = list.stream().map(Student::getAge).collect(Collectors.toList());
//        System.out.println(list1);
//        //转换成Set
//        Set<Integer> set = list.stream().map(Student::getAge).collect(Collectors.toSet());
//        System.out.println(set);
//        //转换成map,key不能相同，否则报错
//        Map<String, Integer> map = list.stream().collect(Collectors.toMap(Student::getName, Student::getAge));
//        System.out.println(map);
//        //字符串分隔符连接
//        System.out.println(list.stream().map(Student::getName).collect(Collectors.toList()));
//        String collect = list.stream().map(Student::getName).collect(Collectors.joining(",", "", ""));
//        System.out.println(collect);
        //聚合操作
        System.out.println(list.stream().count());
        //学生总数
        System.out.println(list.stream().collect(Collectors.counting()));
        //最大年龄
        System.out.println(list.stream().map(Student::getAge).collect(Collectors.maxBy(Integer::compare)).get());
        //所有人年龄
        System.out.println(list.stream().collect(Collectors.summingInt(u -> u.getAge())));
        System.out.println(list.stream().collect(Collectors.averagingDouble(Student::getAge)));
        //带上以上所有方法
        DoubleSummaryStatistics statistics = list.stream().collect(Collectors.summarizingDouble(Student::getAge));
        System.out.println(statistics);
        System.out.println("count:" + statistics.getCount() + ",max:" + statistics.getMax() + ",sum:" + statistics.getSum() + ",average:" + statistics.getAverage());
        //分组
        Map<Integer, List<Student>> ageMap = list.stream().collect(Collectors.groupingBy(Student::getAge));
        Map<Integer, Map<String, List<Student>>> mapMap = list.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.groupingBy(Student::getName)));
        System.out.println(ageMap);
        System.out.println(mapMap);
        Map<Boolean, List<Student>> map = list.stream().collect(Collectors.partitioningBy(o -> o.getAge() > 2));
        System.out.println(map);
        //规约
        Optional<Integer> optional = list.stream().map(Student::getAge).collect(Collectors.reducing(Integer::sum));
        System.out.println(optional.get());
        System.out.println("xxxxxx");

    }
}
