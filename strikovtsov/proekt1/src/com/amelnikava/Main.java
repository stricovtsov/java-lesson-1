package com.amelnikava;

public class Main {

    public static void main(String[] args) {
	byte b = 123;// -128 до 128
        short s = 240;// 2 байта
        int i = 45465454;
        long l = 12222222222l;
        float f = 12.6F;
        float f2 = 343.f;
        float f3 = .2323f;
        double d = 122323.5454;
        char ch = 'f';// один символ
        char ch2 = 127;//задаем символ по его коду 127
        char ch3 = 64 ;
        System.out.println(ch3);//
        System.out.println((int)ch);
        boolean flag = true;
        boolean flag2 = false;


        //условные операторы
        //() - указыввается логика
        // в {} указывается код
        //только в том случае ,если условие истино
        // <,>, <=,>=,
        // ==, знак равенства
        //!= - знак не раветства

        if  (f<=f2) {
            System.out.println("if works");
            // && - знак "и"
            //   || - знак "или"
        }
            if (s>=b || (b==123  && s!=b) ) {
                System.out.println("hello");
            }

 boolean isMale = false;
            if (isMale) {   //работает с лгич перем типа boolean
                System.out.println("is male");
            }
            //! ставиться только перед лог выражениями в частности перем bollean
        // для инвертирования логического знфчения
        if (!isMale) {   //работает с лгич перем типа boolean
            System.out.println("not male");
        }
        // cpaзу  после конструкции if () {}
        // можно указать блок else {}

        if (f2 != 124) {   //работает с лгич перем типа boolean
            System.out.println("java");//ВЫПОЛНИТ если выраж в if true
        }
        else  {
            System.out.println("not java");// выполн если в if false
        }

        int age = 12;
        // baby <13
        //[13;21) - teneger
        // >=21 adult
         if (age <13){
             System.out.println("baby");
        }
         else {
             if (age>=13 && age <21){
                 System.out.println("tineger");
             }else  {
                 System.out.println("adult");
             }

         }
        if (age <13){
            System.out.println("baby");
        }
        else if (age>=13 && age <21){
                System.out.println("tineger");
            }
        else  {
                System.out.println("adult");
            }

        }




        }

        }


