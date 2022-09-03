package com.projetojavafx.javafxjdbcworkshop.model.dao;

import com.projetojavafx.javafxjdbcworkshop.db.DB;
import com.projetojavafx.javafxjdbcworkshop.model.dao.impl.DepartmentDaoJDBC;
import com.projetojavafx.javafxjdbcworkshop.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
