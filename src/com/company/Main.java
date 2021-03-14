package com.company;

import com.sun.nio.sctp.PeerAddressChangeNotification;

public class Main {

    public static void main(String[] args) {
        /* Scrie o clasa denumita "Persoana " care contine 3 caracteristici(campuri) specifice si care are un constructor
        default(gol) si unul care initializeaza campurile clasei.Atribuie o valoare fiecarui camp din clasa si afisaseaza rezultatul
        intr-un format pe intelesul oricui.*/


            Person personOne=new Person();
            personOne.name="Ionut";
            personOne.age=29;
            personOne.mail="ionut@gmail.com";
            System.out.println("Persoana1 se numeste "+personOne.name+" , are "+personOne.age+" ani si are adresa de email: "+personOne.mail);

           
            Person personNew=new Person("Ana",19,"ana@yahoo.com");
            System.out.println("Persoana noua se numeste "+personNew.name+" , are "+personNew.age+" ani si are adresa de email: "+personNew.mail);

    }
}
