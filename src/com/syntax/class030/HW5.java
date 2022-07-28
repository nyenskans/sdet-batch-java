package com.syntax.class030;

import java.util.HashMap;
import java.util.Map;

public class HW5 {
    /*
    Create a map that will store Employee name and salary
    Write the logic that gets the highest salary Output should be in this format:
     */
    public static void main(String[] args) {

        HashMap<String, Integer> employeeMap=new HashMap<>();
        employeeMap.put("John", 70000);
        employeeMap.put("Marc", 75000);
        employeeMap.put("Ann", 80000);
        employeeMap.put("Mary", 690000);
        employeeMap.put("Jane", 94000);

        String name="";
        Integer maxSalary=0;
            for(Map.Entry<String, Integer> entry: employeeMap.entrySet()){
                if(entry.getValue()>maxSalary){
                    maxSalary= entry.getValue();
                    name= entry.getKey();
                }

                System.out.println(name+" earns the higherst salary"+maxSalary);

        }
    }
}
