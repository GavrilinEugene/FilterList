package com.epam.javauniversity.filterlist;

import org.junit.Assert;
import org.junit.Test;
import com.epam.javauniversity.predicate.Predicate;

import java.util.ArrayList;
import java.util.List;

public class FilterListTest {

    @Test
    public void filterTestPredicateIsMoreFifty() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(1);
        list.add(5);
        list.add(101);

        List<Integer> resList = new ArrayList<Integer>();
        resList.add(100);
        resList.add(101);

        Assert.assertEquals(ListFilter.filter(list, new Predicate<Integer>() {
            @Override
            public boolean satisfies(Integer item) {
                return item >= 50;
            }
        }), resList);
    }

    @Test
    public void filterTestPredicateIsEven() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(84);
        list.add(5);
        list.add(105);

        List<Integer> resList = new ArrayList<Integer>();
        resList.add(100);
        resList.add(84);

        Assert.assertEquals(ListFilter.filter(list, new Predicate<Integer>() {
            @Override
            public boolean satisfies(Integer item) {
                return item % 2 == 0;
            }
        }), resList);
    }
}