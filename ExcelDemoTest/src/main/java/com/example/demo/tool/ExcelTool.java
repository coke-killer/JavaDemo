package com.example.demo.tool;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExcelTool {
    public static void main(String[] args) {
        EasyExcelUtil easyExcelUtil = new EasyExcelUtil();
        String excelFilePath = "C:\\Users\\于冬月\\Desktop\\导出数据.xls";
        //无注解的模式，动态添加表头
        List<Device> devices1 = mongoDBDaoImpl.selectDevices("14", "20", "1");
        List<Device> devices2 = mongoDBDaoImpl.selectDevices("15", "20", "1");
        List<Device> devices3 = mongoDBDaoImpl.selectDevices("16", "20", "1");
        List<Device> devices4 = mongoDBDaoImpl.selectDevices("14", "20", "2");
        List<Device> devices5 = mongoDBDaoImpl.selectDevices("15", "20", "2");
        List<Device> devices6 = mongoDBDaoImpl.selectDevices("5", "20", "2");
        List<List<Device>> lists = new ArrayList<>();
        lists.add(devices1);
        lists.add(devices2);
        lists.add(devices3);
        lists.add(devices4);
        lists.add(devices5);
        lists.add(devices6);
        List<List<String>> head1 = new ArrayList<List<String>>();
        List<String> headCoulumn1 = new ArrayList<String>();
        List<String> headCoulumn2 = new ArrayList<String>();
        List<String> headCoulumn3 = new ArrayList<String>();
        List<String> headCoulumn4 = new ArrayList<String>();
        List<String> headCoulumn5 = new ArrayList<String>();
        List<String> headCoulumn6 = new ArrayList<String>();
        headCoulumn1.add("第1列");
        headCoulumn2.add("第2列");
        headCoulumn3.add("第3列");
        headCoulumn4.add("第4列");
        headCoulumn5.add("第5列");
        headCoulumn6.add("第6列");
        head1.add(headCoulumn1);
        head1.add(headCoulumn2);
        head1.add(headCoulumn3);
        head1.add(headCoulumn4);
        head1.add(headCoulumn5);
        head1.add(headCoulumn6);
        List<Device> devices7 = mongoDBDaoImpl.selectDevices("4", "20", "1");
        List<Device> devices8 = mongoDBDaoImpl.selectDevices("5", "20", "1");
        List<Device> devices10 = mongoDBDaoImpl.selectDevices("4", "20", "2");
        List<Device> devices11 = mongoDBDaoImpl.selectDevices("5", "20", "2");
        List<List<Device>> lists2 = new ArrayList<>();
        lists2.add(devices7);
        lists2.add(devices8);
        lists2.add(devices10);
        lists2.add(devices11);
        List<List<String>> head2 = new ArrayList<List<String>>();
        List<String> headCoulumn7 = new ArrayList<String>();
        List<String> headCoulumn8 = new ArrayList<String>();
        List<String> headCoulumn10 = new ArrayList<String>();
        List<String> headCoulumn11 = new ArrayList<String>();
        headCoulumn7.add("第1列");
        headCoulumn8.add("第2列");
        headCoulumn10.add("第4列");
        headCoulumn11.add("第5列");
        head2.add(headCoulumn7);
        head2.add(headCoulumn8);
        head2.add(headCoulumn10);
        head2.add(headCoulumn11);
//开始的地方
        OutputStream out = new FileOutputStream(excelFilePath);
        ExcelWriter writer = EasyExcelFactory.getWriter(out);
        // 动态添加表头，适用一些表头动态变化的场景
        Sheet sheet1 = new Sheet(1, 0);
        sheet1.setSheetName("第一个sheet");
        // 创建一个表格，用于 Sheet 中使用
        Table table1 = new Table(1);
        // 无注解的模式，动态添加表头
        table1.setHead(head1);
        // 写数据
        writer.write1(new ArrayList<>(), sheet1, table1);
        // 动态添加表头，适用一些表头动态变化的场景
        Sheet sheet2 = new Sheet(2, 0);
        sheet2.setSheetName("第2个sheet");
        //创建一个表格，用于 Sheet 中使用
        Table table2 = new Table(2);
        // 无注解的模式，动态添加表头
        table2.setHead(head2);
        writer.write1(new ArrayList<>(), sheet2, table2);
        int x = 0;
//        int y = 0;
        Table tableX = new Table(1);
        sheet1.setStartRow(x);

        writer.write1(this.getRows(lists), sheet1, tableX);

        /*while (x < 1000) {
            System.out.println("x = " + x);
            Table tableX = new Table(1);
            sheet1.setStartRow(x);
            List<List<Object>> rows = new ArrayList<>();

            for (int i = x; i < 1 + x; i++) {
                List<Object> row = new ArrayList<>();
                for (int j = 495; j < lists.size(); j++) {
                    int finalI = i;
                    Optional.ofNullable(lists.get(j)).map(l -> l.get(finalI)).map(Device::getValue).ifPresent(row::add);
//                    if (lists.get(j) == null) {
//                        return;
//                    }
//                    row.add(lists.get(j).get(i).getValue());
                }
                rows.add(row);
            }
            writer.write1(rows, sheet1, tableX);
            x = x + 1;
        }*/
//        while (y < devices7.size()) {
//            Table tableX2 = new Table(1);
//            sheet2.setStartRow(y);
//            List<List<Object>> rows2 = new ArrayList<>();
//            for (int i = y; i < 100 + y; i++) {
//                List<Object> row = new ArrayList<>();
//                row.add(devices7.get(i).getValue());
//                row.add(devices8.get(i).getValue());
//                row.add(devices10.get(i).getValue());
//                row.add(devices11.get(i).getValue());
//                rows2.add(row);
//            }
//            writer.write1(rows2, sheet2, tableX2);
//            y = y + 100;
//        }
        // 将上下文中的最终 outputStream 写入到指定文件中
        // 关闭流
        writer.write1(this.getRows(lists2), sheet2, table2);
        writer.finish();
        out.close();
    }

    List<List<Object>> getRows(List<List<Device>> lists) {
        ImmutableList.Builder temp = ImmutableList.<List<Object>>builder();
        IntStream.range(0, 1000).forEach(index -> {
            // column
            if (lists.stream().map(e -> e.size() > index ? e.get(index) : null).allMatch(Objects::isNull)) {
                return;
            } else {
                temp.add(lists.stream().map(col -> ImmutableList.builder().add(
                        Optional.ofNullable(col.size() > index ? col.get(index) : null).map(Device::getValue).orElse("")).build()).collect(Collectors.toList()));
            }

        });

        return temp.build();
    }
}
}
