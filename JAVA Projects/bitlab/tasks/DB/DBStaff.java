package kz.tasks.DB;

import java.util.ArrayList;

public class DBStaff {
    private static ArrayList<Staff> staff = new ArrayList<>();

    static {
        staff.add(new Staff("Ilyas", "Zhuanyshev", "IT", 550000));
        staff.add(new Staff("Aibek", "Bagit", "Management", 650000));
        staff.add(new Staff("Alibek", "Serikov", "HR", 350000));
        staff.add(new Staff("Serzhan", "Serikov", "IT", 450000));
        staff.add(new Staff("Madina", "Assetova", "PR", 350000));
        staff.add(new Staff("Anel", "Mukhametzhanova", "Management", 400000));

    }

    public static ArrayList<Staff> getStaff() {
        return staff;
    }
}
