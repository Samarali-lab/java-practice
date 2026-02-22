package com.practice.day02;

/**
 * ☕ Java Practice - Day 2
 * Topic: Variables & Data Types
 */
public class Variables {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("  📦 Day 2: Variables & Data Types");
        System.out.println("==============================");

        // 1️⃣ int - whole numbers
        int age = 20;
        int year = 2026;
        System.out.println("🔢 int    → age  : " + age);
        System.out.println("🔢 int    → year : " + year);

        // 2️⃣ double - decimal numbers
        double gpa = 3.95;
        double pi  = 3.14159;
        System.out.println("💠 double → gpa  : " + gpa);
        System.out.println("💠 double → pi   : " + pi);

        // 3️⃣ String - text
        String name    = "Samar";
        String country = "Saudi Arabia";
        System.out.println("📝 String → name    : " + name);
        System.out.println("📝 String → country : " + country);

        // 4️⃣ boolean - true or false
        boolean isStudent  = true;
        boolean isGraduate = false;
        System.out.println("✅ boolean → isStudent  : " + isStudent);
        System.out.println("✅ boolean → isGraduate : " + isGraduate);

        // 5️⃣ char - single character
        char grade  = 'A';
        char initial = 'S';
        System.out.println("🔤 char   → grade   : " + grade);
        System.out.println("🔤 char   → initial : " + initial);

        // 6️⃣ long - large whole numbers
        long population = 8000000000L;
        System.out.println("📏 long   → population : " + population);

        // 7️⃣ float - less precise decimal
        float temperature = 36.6f;
        System.out.println("🌡️ float  → temperature : " + temperature);

        System.out.println("==============================");
        System.out.println("✅ Day 2 - Variables Complete!");
        System.out.println("==============================");
    }
}