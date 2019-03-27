import com.google.gson.Gson;
import org.kamranzafar.commons.cloner.ObjectCloner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Structure {

    private int schoolsNum;
    private int departmentsNum;
    private int studentsNum;
    private int studentPerDepartment;


    public List<School> fillStructure(int schoolsNum, int classesNum, int studentsNum) {
        List<School> schools = new ArrayList<>();
        for (int i = 0; i < schoolsNum; i++) {
            int counter = 0;
            List<Department> departments = new ArrayList<>();
            for (int j = 0; j < classesNum; j++) {
                List<Student> students = new ArrayList<>();
                for (int k = 0; k < studentsNum; k++) {
                    students.add(new Student(k + "_name_" + j, k + "_lastname_" + j));
                }
                departments.add(new Department(i + "_a_" + j, students.subList(counter, counter + (studentsNum / classesNum))));
                counter += studentsNum / classesNum;
            }
            schools.add(new School("school_" + (i), departments));
        }

        setVariables(schoolsNum, classesNum, studentsNum);


        return schools;

    }

    private void setVariables(int schoolsNum, int classesNum, int studentsNum) {
        this.schoolsNum = schoolsNum;
        this.departmentsNum = classesNum;
        this.studentsNum = studentsNum;
        this.studentPerDepartment = studentsNum / classesNum;
    }

    public List<School> cloneUsingLibrary(List<School> school) {
        long start = System.currentTimeMillis();
        ObjectCloner objectCloner = new ObjectCloner();
        List<School> clonedSchools = new ArrayList<>();
        long cloneTime = 0L;
        for (School s : school) {

            long cloneStart = System.nanoTime();
            School clone = (School) objectCloner.deepClone(s);
            cloneTime += System.nanoTime() - cloneStart;

            clonedSchools.add(clone);

        }
        cloneTime /= school.size();
        reportData(new Throwable().getStackTrace()[0].getMethodName(), System.currentTimeMillis() - start, cloneTime);
        return clonedSchools;
    }



    public List<School> cloneMethod(List<School> school) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        List<School> clonedSchools = new ArrayList<>();
        long cloneTime = 0L;

        for (School s : school) {
            long cloneStart = System.nanoTime();
            School clone =  s.clone();
            cloneTime += System.nanoTime() - cloneStart;

            clonedSchools.add(clone);
        }
        cloneTime /= school.size();

        reportData(new Throwable().getStackTrace()[0].getMethodName(), System.currentTimeMillis() - start, cloneTime);
        return clonedSchools;

    }


    public List<School> cloneGson(List<School> school) {
        long start = System.currentTimeMillis();
        Gson gson = new Gson();
        List<School> clonedSchools = new ArrayList<>();
        long cloneTime = 0L;

        for (School s : school) {
            long cloneStart = System.nanoTime();
            School clone =  gson.fromJson(gson.toJson(s), School.class);
            cloneTime += System.nanoTime() - cloneStart;

            clonedSchools.add(clone);
        }
        cloneTime /= school.size();

        reportData(new Throwable().getStackTrace()[0].getMethodName(), System.currentTimeMillis() - start, cloneTime);
        return clonedSchools;
    }


    public static void reportData(String methodName, long stop, long cloneTime) {
        System.out.println(methodName + " : " + stop + ", czas wykonania metody");
        System.out.println(methodName + " : " + TimeUnit.NANOSECONDS.toMicros(cloneTime) + ", czas klonowań");
    }


    public void testCloning(List<School> schools, List<School> clonedSchoolCloneMethod, List<School> clonedSchoolLibrary, List<School> clonedSchoolGson) {

        int departmentNum = new Random().nextInt(departmentsNum);
        int studentNum = new Random().nextInt(studentPerDepartment);
        changeData(schools, departmentNum, studentNum);

     /*  for (School s : schools) {
            System.out.println("CHANGED NAME : " + s.getDepartments().get(departmentNum).getStudents().get(studentNum).getName());
            System.out.println("CHANGED SYMBOL : " + s.getDepartments().get(departmentNum).getSymbol());
            System.out.println("CHANGED SCHOOL_NAME : " + s.getName());
        }
        for (School s : clonedSchoolCloneMethod) {
            System.out.println("CLONE_METHOD NAME : " + s.getDepartments().get(departmentNum).getStudents().get(studentNum).getName());
            System.out.println("CLONE_METHOD SYMBOL : " + s.getDepartments().get(departmentNum).getSymbol());
            System.out.println("CLONE SCHOOL_NAME : " + s.getName());

        }

        for (School s : clonedSchoolLibrary) {
            System.out.println("LIBRARY NAME : " + s.getDepartments().get(departmentNum).getStudents().get(studentNum).getName());
            System.out.println("LIBRARY SYMBOL : " + s.getDepartments().get(departmentNum).getSymbol());
            System.out.println("LIBRARY SCHOOL_NAME : " + s.getName());

        }

        for (School s : clonedSchoolGson) {
            System.out.println("GSON NAME : " + s.getDepartments().get(departmentNum).getStudents().get(studentNum).getName());
            System.out.println("GSON SYMBOL : " + s.getDepartments().get(departmentNum).getSymbol());
            System.out.println("GSON SCHOOL_NAME : " + s.getName());
        }
*/
    }

    private void changeData(List<School> schools, int departmentNum, int studentNum) {
        for (School s : schools) {
            s.getDepartments().get(departmentNum).getStudents().get(studentNum).setName("CHANGED_NAME");
            s.getDepartments().get(departmentNum).setSymbol("CHANGED_SYMBOL");
            s.setName("CHANGED_SCHOOL_NAME");
        }
    }


    public List<School> fillStructureOtherWay(int schoolsNum, int classesNum, int studentsNum) {
        List<School> schools = new ArrayList<>();
        for (int i = 0; i < schoolsNum; i++) {
            List<Department> departments = new ArrayList<>();
            for (int j = 0; j < classesNum; j++) {
                List<Student> students = new ArrayList<>();
                for (int k = 0; k < studentsNum; k++) {
                    students.add(new Student(k + "_name_" + j, k + "_lastname_" + j));
                }
                departments.add(new Department(i + "_a_" + j, students));

            }
            schools.add(new School("school_" + (i), departments));
        }

        setVariables(schoolsNum, classesNum, studentsNum);


        return schools;
    }
}
