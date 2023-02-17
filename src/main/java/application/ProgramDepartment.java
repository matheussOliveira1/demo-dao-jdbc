package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class ProgramDepartment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao depDao = DaoFactory.createDepartmentDao();


        System.out.println("=== Teste 1: Department, insert ===");
        Department dep = new Department(null, "Books");
        depDao.insert(dep);
        System.out.println("Insert complete!");

        System.out.println("=== Teste 2: Department, update ===");
        Department updateDep = new Department(6, "Food");
        updateDep.setName("Technology");
        depDao.update(updateDep);
        System.out.println("Update complete!");

        System.out.println("=== Teste 3: Department, deleteById ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        depDao.deleteById(id);
        System.out.println("Delete complete!");

        System.out.println("=== Teste 4: Department, findALl ===");
        List<Department> listAll = depDao.findAll();
        for (Department obj : listAll) {
            System.out.println(obj);
        }

        sc.close();

    }

}
