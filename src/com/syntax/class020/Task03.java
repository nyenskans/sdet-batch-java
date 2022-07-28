package com.syntax.class020;
public class Task03 {
    public static void main(String[] args) {
ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
chemistryTeacher.name="Adem";
chemistryTeacher.favoriteChemSubject="Organic Chemistry";
chemistryTeacher.teachesChemistry();
    }
}

    class Teacher {
        String name;
        String typeOfTeacher;

        void teach() {
            System.out.println(name + " teaches " + typeOfTeacher);
        }
    }

    class MathTeacher extends Teacher {
        String favoriteMathSubject;

        public void teachesMath() {
            System.out.println(name + " teaches math and his favorite math subject is " + favoriteMathSubject);
        }
    }

    class ChemistryTeacher extends Teacher {
        String favoriteChemSubject;

        public void teachesChemistry() {
            System.out.println(name + " teaches chemistry and his favorite chemistry subject is " + favoriteChemSubject);
        }
    }

    class PianoTeacher extends Teacher {
        String favoritePianoSubject;

        public void teachesPiano() {
            System.out.println(name + " teaches piano and his favorite piano subject is " + favoritePianoSubject);
        }
    }
