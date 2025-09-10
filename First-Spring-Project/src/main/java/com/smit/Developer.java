package com.smit;
import org.springframework.stereotype.Component;
@Component

public class Developer {
    private Laptop lap1;

    public Developer(){
        System.out.println("Constructor created");
    }

    public Laptop getLap1() {
        return lap1;
    }

    public void setLap1(Laptop lap1) {
        this.lap1 = lap1;
    }
    public void Method(){
        System.out.println("Developing....");
        lap1.Compile();
    }
}
