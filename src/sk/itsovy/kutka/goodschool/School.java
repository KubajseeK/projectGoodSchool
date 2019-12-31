package sk.itsovy.kutka.goodschool;

import java.util.List;

public class School implements SchoolStat {
    private int count = 0;
    private List<Student> list;





















    @Override
    public Student getTheBestStudent() {
        return null;
    }

    @Override
    public int getAverageAbsence() {
        double absence = 0;
        for (int i = 0; i < list.size(); i++) {
            absence += list.get(i).getAbsence();
        }
        return (int) absence / list.size();
    }

    @Override
    public double getAverageGrade() {
        double counter = 0;
        double[] arr = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).getAverageGrade();
        }

        for (int i = 0; i < list.size(); i++) {
            count += arr[i];
        }
        return counter / (double) list.size();
    }

    @Override
    public double getAverageGradeFromMath() {
        return 0;
    }

    @Override
    public Student getTheWorstStudent() {
        return null;
    }

    @Override
    public int getTheLowestAbsence() {
        return 0;
    }

    @Override
    public List getListSortedByLastNameAsc() {
        return null;
    }

    @Override
    public List getListSortedByAbsenceDesc() {
        return null;
    }
}

