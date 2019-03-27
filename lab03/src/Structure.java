import org.kamranzafar.commons.cloner.ObjectCloner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Structure {

    public void fillStructure(int schoolsNum, int classesNum, int studentsNum) {

        List<School> schools = new ArrayList<>();
        for (int i = 0; i < schoolsNum; i++) {
            schools.add(new School("School" + i));
        }

        List<Class> classes = new ArrayList<>();
        for (int i = 0; i < classesNum; i++) {
            classes.add(new Class(i, "a" + i % classesNum, schools.get(new Random().nextInt(schools.size()))));
        }

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentsNum; i++) {
            students.add(new Student("aa" + i, "bb" + i, classes.get(new Random().nextInt(classes.size()))));
        }

    }

    public School cloneUsingLibrary(School school) {
        long start = System.currentTimeMillis();
        ObjectCloner objectCloner = new ObjectCloner();
        School clonedSchool = (School) objectCloner.deepClone(school);
        long stop = System.currentTimeMillis() - start;
        reportData(new Throwable()
                .getStackTrace()[0]
                .getMethodName(), stop);
        return clonedSchool;
    }


    public School customClone(School school) {
        long start = System.currentTimeMillis();

        long stop = System.currentTimeMillis() - start;
        reportData(new Throwable()
                .getStackTrace()[0]
                .getMethodName(), stop);
        return null;

    }


    public void reportData(String methodName, long stop) {
        System.out.println(methodName + " : " + stop);
    }


   /* public void test() {
        cloneUsingLibrary(x)
    }*/

}
