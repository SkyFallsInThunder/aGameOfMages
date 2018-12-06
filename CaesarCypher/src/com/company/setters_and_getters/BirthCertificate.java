package com.company.setters_and_getters;


// A class is a blueprint for creating objects, kinda
public class BirthCertificate {
    // Toate aceste variabile se numesc "class members":
    private int certificateId;
    String dateOfBirth;
    String firstName;
    String lastName;
    int personId;
    String placeOfBirth;
    double weight;
    char gender;

    // Class constructor (aka object initializer):
    // The constructor gets called every single time an object is
    // created using the class.
    // Basically, the class constructor is a method
    BirthCertificate(int certId){
        this.certificateId = certId;
//        printPersonDetails();
    }
    BirthCertificate(int certId, String dob, double w, char gen){
        this.certificateId = certId; // "this" refers to the name of the class
        this.dateOfBirth = dob;
        this.weight = w;
        this.gender = gen;
//        printPersonDetails(this.certificateId, this.dateOfBirth, this.weight, this.gender);
    }
    BirthCertificate(int certId, String dob, double w, char gen, String fName){
        this.certificateId = certId; // "this" refers to the name of the class
        this.dateOfBirth = dob;
        this.weight = w;
        this.gender = gen;
        this.firstName = fName;
//        printPersonDetails(this.certificateId, this.dateOfBirth, this.weight, this.gender, this.firstName);
    }

//    void printPersonDetails(){
//        System.out.println("no detail available");
//    }
//    void printPersonDetails(int certId, String dob, double w, char gen){
//        System.out.println(certId);
//        System.out.println(dob);
//        System.out.println(w);
//        System.out.println(gen);
//    }

    void printPersonDetails(  ){
        if (this.certificateId != 0){
            System.out.println(this.certificateId);
        }
        else{
            System.out.println("N/A");
        }

        if (this.dateOfBirth != null) {
            System.out.println(this.dateOfBirth);
        }
        else{
            System.out.println("N/A");
        }
        if (this.weight != 0) {
            System.out.println(this.weight);
        }
        else{
            System.out.println("N/A");
        }

        if (this.gender != 0) {
            System.out.println(this.gender);
        }
        else{
            System.out.println("N/A");
        }

        if (this.firstName != null) {
            System.out.println(this.firstName);
        }
        else{
            System.out.println("N/A");
        }

    }




    // Do we need getters and setters? Short answer: Maybe!


    // Setters (methods that help initialize class members):
public void setCertificateId(int n){
        this.certificateId = n;
}

    // Getters (methods that help retrieve class members' values):
public int getCertificateId(){
        return this.certificateId;
}
}
