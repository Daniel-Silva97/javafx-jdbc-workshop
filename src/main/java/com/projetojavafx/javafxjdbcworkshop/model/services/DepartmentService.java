package com.projetojavafx.javafxjdbcworkshop.model.services;

import com.projetojavafx.javafxjdbcworkshop.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {
    public List<Department> findAll() {
        List<Department> list = new ArrayList<>();
        list.add(new Department(1, "Books"));
        list.add(new Department(2, "Computers"));
        list.add(new Department(3, "Electronics"));
        list.add(new Department(4, "Food"));
        return list;
    }
}
