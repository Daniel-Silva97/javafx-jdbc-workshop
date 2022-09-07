package com.projetojavafx.javafxjdbcworkshop.model.services;

import com.projetojavafx.javafxjdbcworkshop.model.dao.DaoFactory;
import com.projetojavafx.javafxjdbcworkshop.model.dao.DepartmentDao;
import com.projetojavafx.javafxjdbcworkshop.model.entities.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
    }

    public void remove(Department obj) {
        dao.deleteById(obj.getId());
    }
}
