package zad1;

import zad1.Hierarchy.FormTutor;
import zad1.Hierarchy.Person;
import zad1.Hierarchy.Teacher;

public class Wyswietlacz {

    public static void main(String[] args) {
        Kontener<Person> personKontener = new Kontener<Person>();
        personKontener.getList().add(new Person("Adam", "Michalski"));
        personKontener.getList().add(new Person("Michał", "Adamski"));
        personKontener.getList().add(new Person("Jan", "Kowalski"));

        Kontener<Teacher> teacherKontener = new Kontener<Teacher>();
        teacherKontener.getList().add(new Teacher("Rafał", "Król", 1000));
        teacherKontener.getList().add(new Teacher("Kacper", "Fin", 2000));
        teacherKontener.getList().add(new Teacher("Baltazar", "Mika", 3000));

        Kontener<FormTutor> formTutorKontener = new Kontener<FormTutor>();
        formTutorKontener.getList().add(new FormTutor("Maria", "Nowak", 2500, "1a", 20));
        formTutorKontener.getList().add(new FormTutor("Pola", "Nowicka", 2800, "2b", 25));
        formTutorKontener.getList().add(new FormTutor("Magda", "Mak", 3500, "3c", 15));
     //   personKontener.getList().add(new Teacher("aa", "b", 1000));


        pokazDanePerson(personKontener);
        pokazDaneTeacher(teacherKontener);
        pokazDaneFormTutor(formTutorKontener);
     //   personKontener.getList().forEach(Person::pokazDanePerson);
     //   teacherKontener.getList().forEach(Teacher::pokazDaneTeacher);
   //     formTutorKontener.getList().forEach(FormTutor::pokazTylkoDanePerson);

        /** BŁĄD KOMPILACJI */
        //pokazDaneFormTutor(personKontener);
        pokazDaneTeacher(formTutorKontener);
    }

    public static void pokazDanePerson(Kontener<? extends Person> kontener){
        for(Person p : kontener.getList()){
     //       p.pokazTylkoDanePerson();
            System.out.println(p.toString());
        }
    }

    public static void pokazDaneTeacher(Kontener<? extends Teacher> kontener){
        for(Teacher p : kontener.getList()){
 //           p.pokazTylkoDaneTeacher();
            System.out.println(p.toString());

        }
    }

    public static void pokazDaneFormTutor(Kontener<? extends FormTutor> kontener){
        for(FormTutor p : kontener.getList()){
     //       p.pokazTylkoDaneFormTutor();
            System.out.println(p.toString());
        }
    }
}
