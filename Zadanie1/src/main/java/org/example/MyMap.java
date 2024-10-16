package org.example;

import java.util.*;

public class MyMap<K, V> {
    private LinkedList<K> keys;
    private LinkedList<V> values;

    public MyMap() {
        keys = new LinkedList<>();
        values = new LinkedList<>();
    }

    public LinkedList<K> keys(){
        return keys;
    }

    public int size(){
        return keys.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public Collection<V> values(){
        return values;
    }

    public void clear(){
        keys.clear();
        values.clear();
    }

    public boolean containsKey(K key){
        return keys.contains(key);
    }

    public boolean containsValue(V value){
        return values.contains(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof MyMap<?, ?> other) {
            return size() == other.size() && keys.equals(other.keys) && values.equals(other.values);
        }
        return false;
    }

    public V get(K key){
        int i = 0;
        for(K k : keys){
            if(k.equals(key)){
                return values.get(i);
            }
            ++i;
        }
        return null;
    }

    public Set<K> keySet() {
        return new LinkedHashSet<K>(keys);
    }

    public V put(K key, V value) {
        int i = 0;
        for (K k : keys) {
            if (k.equals(key)) {
                values.set(i, value);
                return value;
            }
            ++i;
        }
        keys.add(key);
        values.add(value);
        return value;
    }

    public void putAll(MyMap<? extends K, ? extends V> m){
        keys.addAll(m.keys());
        values.addAll(m.values());
    }

    public V remove(K key){
        int i = 0;
        for(K k : keys){
            if(k.equals(key)){
                V removedValue = values.get(i);
                keys.remove(i);
                values.remove(i);
                return removedValue;
            }
            ++i;
        }
        return null;
    }

}
