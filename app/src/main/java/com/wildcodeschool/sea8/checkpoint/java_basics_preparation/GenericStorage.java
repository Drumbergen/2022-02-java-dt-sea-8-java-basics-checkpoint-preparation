package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements a ITPerson storage on Object base, ie. with Generics.
 */
public class GenericStorage<ITPerson> {

    // List persons = new ArrayList();
    List<ITPerson> itcrowd = new ArrayList<>();

    // public boolean storePerson(Object person) {
    //     return persons.add(person);
    // }
    public boolean storePerson(ITPerson person) {
        return itcrowd.add(person);
    }

    // public Object getLastStoredPerson() {
    //     return persons.get(persons.size()-1);
    // }
    public ITPerson getLastStoredPerson() {
        return itcrowd.get(itcrowd.size()-1);
    }

    // public Object getFirstStoredPerson() {
    //     return persons.get(0);
    // }
    public ITPerson getFirstStoredPerson() {
        return itcrowd.get(0);
    }

}
