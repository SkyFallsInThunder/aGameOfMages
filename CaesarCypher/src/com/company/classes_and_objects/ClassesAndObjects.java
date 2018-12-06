package com.company.classes_and_objects;


public class ClassesAndObjects
{
    public static void main (String[] args)
    {
      // create new birth certificate
    BirthCertificate certificate1; // object declaration
    certificate1 = new BirthCertificate(1233); // object initialization
    certificate1.printPersonDetails();
        System.out.println();

    BirthCertificate certificate2 = new BirthCertificate(1234);
//    certificate2.certificateId = 1234;
        System.out.println(certificate2.certificateId);
    certificate2.dateOfBirth = "2018-11-14";
        System.out.println(certificate2.dateOfBirth);
    certificate2.gender = 'F';
        System.out.println(certificate2.gender);
    certificate2.weight = 3.1;
        System.out.println(certificate2.weight);

    System.out.println();

    BirthCertificate certificate3 = new BirthCertificate(1235, "2018-11-14", 3.2, 'M');
        System.out.println(certificate3.certificateId);
        System.out.println(certificate3.dateOfBirth);
        System.out.println(certificate3.gender);
        System.out.println(certificate3.weight);

    System.out.println();

    BirthCertificate certificate4 = new BirthCertificate(1236, "2018-11-14", 3.0, 'F', "Jane");
        System.out.println(certificate4.certificateId);
        System.out.println(certificate4.dateOfBirth);
        System.out.println(certificate4.gender);
        System.out.println(certificate4.weight);
        System.out.println(certificate4.firstName);

    BirthCertificate certificate5 = new BirthCertificate(1237, "2018-11-14", 2.9, 'M');
    BirthCertificate certificate6 = new BirthCertificate(1238, "2018-11-14", 3.3, 'F', "Mary");
        System.out.println();
    certificate5.printPersonDetails();
        System.out.println();
    certificate6.printPersonDetails( );

    BirthCertificate[] arrayOfBirthCertificateObjects = {
            certificate1,
            certificate2,
            certificate3,
            certificate4,
            certificate5,
            certificate6
    };
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(arrayOfBirthCertificateObjects[4].certificateId);
    }
}
