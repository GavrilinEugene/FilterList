package com.epam.javauniversity.predicate;

public interface Predicate<T> {
    boolean satisfies(T item);
}