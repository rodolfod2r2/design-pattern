package org.framework.rodolfo.freire.git.design.pattern.mvc.controller;

import org.framework.rodolfo.freire.git.design.pattern.mvc.model.Student;
import org.framework.rodolfo.freire.git.design.pattern.mvc.view.StudentView;

public class StudentController {

    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getPhone());
    }
}
