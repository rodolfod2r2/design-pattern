package org.framework.rodolfo.freire.git.design.pattern.mvc;

import org.framework.rodolfo.freire.git.design.pattern.mvc.controller.StudentController;
import org.framework.rodolfo.freire.git.design.pattern.mvc.model.Student;
import org.framework.rodolfo.freire.git.design.pattern.mvc.view.StudentView;

public class MVCDemo {

    public static void main(String[] args) {

        new StudentController(
                new Student("Rodolfo", "+5583988761253"),
                new StudentView()
        ).updateView();

    }

}
