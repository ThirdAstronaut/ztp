import java.util.List;

public class Main {

    public static void main(String... args) throws CloneNotSupportedException {
        Algorithm structure = new Algorithm();

        List<School> schools = structure.fillStructureOtherWay(1, 10, 10);

        List<School> clonedSchoolCloneMethod = structure.cloneMethod(schools);
        List<School> clonedSchoolLibrary = structure.cloneUsingLibrary(schools);
        List<School> clonedSchoolGson = structure.cloneGson(schools);


        structure.testCloning(schools, clonedSchoolCloneMethod, clonedSchoolLibrary, clonedSchoolGson);

//        List<School> schools = structure.fillStructure(100, 9, 90);

//        System.out.println(schools.size() + " school size");
//        System.out.println(schools.get(0).getDepartments().size() + " departments size");
//        System.out.println(schools.get(0).getDepartments().get(8).getStudents().size() + " students size");

    }
}
