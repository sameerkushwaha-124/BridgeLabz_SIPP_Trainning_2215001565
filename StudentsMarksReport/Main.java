// Student Marks Report with Map and List
// Scenario: You're building a report system that stores and analyzes students' marks.
// Requirements:
// Use Map<String, List<Integer>> to store student names and their marks.
// Write logic to:
// Add new marks
// Calculate average marks 
// Get top-performing student

import java.util.*;
class StudentsMarksReport{
    Map<String, List<Integer>> studentsReport;
    Map<String, Double> result;
    StudentsMarksReport(){
        studentsReport = new HashMap<>();
        result = new HashMap<>();
    }
    public void addStudents(String name, List<Integer> marks){
       studentsReport.put(name, marks);
    } 
    public void addMarks(String name, int marks){
        if(studentsReport.containsKey(name)){
            studentsReport.get(name).add(marks);
        }else{
            List<Integer> list = new ArrayList<>();
            list.add(marks);
            studentsReport.put(name, list);
        }
    }
    public void showStudentsDetails(){
        for(String key :  studentsReport.keySet()){
            System.out.println(key + " -> " + studentsReport.get(key));
        }
    }
    public void calcAvg(){
        
        for(String name : studentsReport.keySet()){
            int marks = 0;
            int size = 0;
            for(int num : studentsReport.get(name)){
                marks += num;
                size++;
            }
            result.put(name, marks/(size * 1.0));
        }
    }
    public void showResult(){
        for(String name :  result.keySet()){
            System.out.println(name + " -> " + result.get(name));
        }
    }
    public String getTopStudent(){
        String topStudent = "";
        double maxAvg = 0.0;
        for(Map.Entry<String, Double> entry : result.entrySet()){
            if(entry.getValue() > maxAvg){
                maxAvg = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        return topStudent;
    }
    public void showTopStudent(){
        String topStudent = getTopStudent();
        if(!topStudent.isEmpty()){
            System.out.println("Top Student: " + topStudent + " with average marks: " + result.get(topStudent));
        } else {
            System.out.println("No students available.");
        }
    }
    public void showTopStudentDetails(){
        showTopStudent();
    }
    public Map<String, List<Integer>> getStudentsReport() {
        return studentsReport;
    }
    public Map<String, Double> getResult() {
        return result;
    }
    public void clearReports() {
        studentsReport.clear();
        result.clear();
    }
    public void resetReports() {
        clearReports();
        System.out.println("Reports have been reset.");
    }
    public void resetAndShow() {
        resetReports();
        showStudentsDetails();
        showResult();
    }
    public void resetAndShowTopStudent() {
        resetReports();
        showTopStudentDetails();
    }
    

}

public class Main{
    public static void main(String args[]){
        StudentsMarksReport smr = new StudentsMarksReport();

        String name = "Sameer";
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);

        smr.addStudents(name, list);
        smr.showStudentsDetails();


        smr.addMarks("Sameer", 34);
        smr.addMarks("Nitin", 20);
        smr.showStudentsDetails();

        smr.calcAvg();
        smr.showResult();

        smr.showTopStudentDetails();
        smr.addMarks("Nitin", 30);
        smr.calcAvg();

        smr.showResult();
        smr.showTopStudentDetails();
        smr.resetAndShow();
        smr.resetAndShowTopStudent();
        
    }
}