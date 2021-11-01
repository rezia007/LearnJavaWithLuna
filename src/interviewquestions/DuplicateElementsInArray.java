package interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        String names[] = {"Java", "Ruby", "C++", "C#", "Java"};
//1) Compare each element using 0(nXn)...worst solution.
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate Element is:" + names[i]);
                }}}
        System.out.println("*****************");
        //2) Compare each element using HashSet
        Set<String> store=new HashSet<>();
        for (String name:names){
            if(store.add(name)==false){
                System.out.println("Duplicate Element:"+name);
            }
        }
        System.out.println("*****************");
        //3) Compare each element using HashMap

    }}
