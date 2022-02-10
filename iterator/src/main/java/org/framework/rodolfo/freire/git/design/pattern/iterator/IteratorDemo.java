package org.framework.rodolfo.freire.git.design.pattern.iterator;

import org.framework.rodolfo.freire.git.design.pattern.iterator.interfaces.Iterator;
import org.framework.rodolfo.freire.git.design.pattern.iterator.person.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Robert");
        list.add("John");
        list.add("Julie");
        list.add("Lora");

        PersonRepository personRepository = PersonRepository.getInstance();
        personRepository.setNames(list);


        for (Iterator iterator = personRepository.getIterator(); iterator.hasNext(); ) {
            System.out.println("Name : " + iterator.next());
        }

    }
}
