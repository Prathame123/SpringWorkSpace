package com.dp.test;

import com.dp.prototypepattern.*;
import com.dp.registry.DocumentRegistry;

import dom.dp.concrete.Address;

public class ProtoTypeDPTest {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Address baseAddress = new Address("123 Main Street");
        Resume resumePrototype = new Resume("Professional Template", baseAddress);
        Report reportPrototype = new Report("Annual Report");

        registry.registerDocument("Resume", resumePrototype);
        registry.registerDocument("Report", reportPrototype);

        Resume resume1 = (Resume) registry.getDocument("Resume");
        resume1.setName("John Doe");
        resume1.showInfo();

        Resume resume2 = (Resume) registry.getDocument("Resume");
        resume2.setName("Alice Smith");
        resume2.showInfo();

        System.out.println("\n--- Changing Address of resume1 ---");
        resume1.setAddress(new Address("456 New Road"));

        resume1.showInfo();
        resume2.showInfo();
    }
}
