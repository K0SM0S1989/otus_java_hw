package ru.learn_java;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList(args));
        try{
            Preconditions.checkArgument(!strings.isEmpty(), "List do not be empty");
            strings.forEach(System.out::println);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}