package com.company.setters_and_getters;


public class GettersAndSetters
{
    public static void main (String[] args) {
        BirthCertificate cert1 = new BirthCertificate(1);
        cert1.setCertificateId(2);
        System.out.println(cert1.getCertificateId());
        System.out.println("====================");
        String[] A = { "A1" };
        String[] B = { "B1", "B2" };
        String[] C = { "C1", "C2", "C3" };
        // A1 B1 C1, A1 B1 C2, A1 B1 C3
        // A1 B2 C1, A1 B2 C2, A1 B2 C3
        // you need 3 nested for loops
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < C.length; k++) {
                    System.out.println(A[i] + " " + B[j] + " " + C[k]);
                }
            }

        }
    }
}
