package com.RestfulAPI.com.RestfulAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.*;

@Entity
public class SoftwareEngineer implements List<SoftwareEngineer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String techStack;


    public SoftwareEngineer() {
    }

    public SoftwareEngineer(Integer id, String techStack, String name) {
        this.id = id;
        this.techStack = techStack;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<SoftwareEngineer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(SoftwareEngineer softwareEngineer) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends SoftwareEngineer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends SoftwareEngineer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }

    @Override
    public SoftwareEngineer get(int index) {
        return null;
    }

    @Override
    public SoftwareEngineer set(int index, SoftwareEngineer element) {
        return null;
    }

    @Override
    public void add(int index, SoftwareEngineer element) {

    }

    @Override
    public SoftwareEngineer remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<SoftwareEngineer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<SoftwareEngineer> listIterator(int index) {
        return null;
    }

    @Override
    public List<SoftwareEngineer> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
