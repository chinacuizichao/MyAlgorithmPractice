package com.roger.algorithm.linkedlist;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedListEquals {

    public static void main(String[] args) {

        TestInterface object1 = new TestInterface() {
            @Override
            public String testMethod() {
                return "String1";
            }
        };
        WeakReference<TestInterface> ref = new WeakReference<>(object1);


        TestInterface object2 = new TestInterface() {
            @Override
            public String testMethod() {
                return "String2";
            }
        };
        WeakReference<TestInterface> ref2 = new WeakReference<>(object2);

//        LinkedList<WeakReference> linkedList = new LinkedList<>();
//        linkedList.add(ref);
//        linkedList.add(ref2);

        LinkedHashMap<String, WeakReference> map = new LinkedHashMap<>();
//        map.put(object1.toString(), ref);
//        map.put(object2.toString(), ref2);

        Map.Entry tail = getTail(map);
        WeakReference tailValue = (WeakReference) tail.getValue();
        TestInterface o = (TestInterface) tailValue.get();
        System.out.println(tail.getKey() + "  "+ o.testMethod());


//        iterator(map);

    }

    public static Map.Entry getTail(LinkedHashMap map) {
        Iterator<Map.Entry> iterator = map.entrySet().iterator();
        Map.Entry tail = null;
        while (iterator.hasNext()) {
            tail = iterator.next();
        }
        return tail;
    }

    public static void iterator(HashMap map) {
        Iterator<Map.Entry<String, WeakReference>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, WeakReference> next = iterator.next();
            System.out.println(next.getKey() + "  " + next.getValue());
        }
    }

}
