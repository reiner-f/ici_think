package org.oop.app;
import org.oop.app.University;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        University u = new University("UAIC", "RO", 100);
        System.out.println(u.getName());
        u.setName("FSV");
        System.out.println(u.getName()); 
    }
}