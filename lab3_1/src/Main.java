import java.util.List;

public class Main {

    public static void main(String... args) throws CloneNotSupportedException {
        Structure structure = new Structure();

//        List<School> schools = structure.fillStructure(100, 9, 90);
        List<School> schools = structure.fillStructureOtherWay(1, 10, 10);

        List<School> clonedSchoolCloneMethod = structure.cloneMethod(schools);
        List<School> clonedSchoolLibrary = structure.cloneUsingLibrary(schools);
        List<School> clonedSchoolGson = structure.cloneGson(schools);


           structure.testCloning(schools, clonedSchoolCloneMethod, clonedSchoolLibrary, clonedSchoolGson);

        //  List<School> clonedSchoolCustom = structure.cloneMethod(schools);  System.out.println(clonedSchoolCustom.get(0).getDepartments().get(0).getStudents().get(1).getName());


        //a + a * b + c
        System.out.println(schools.size() + " school size");
        System.out.println(schools.get(0).getDepartments().size() + " departments size");
        System.out.println(schools.get(0).getDepartments().get(8).getStudents().size() + " students size");

    }
}
