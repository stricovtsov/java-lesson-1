package com.amelnikava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int month = 7;//входной аргумент должен быть переменной
        //после касе указывается одна константа
        //тип данных этой константы должен совпадать
        //с типом входногого аргумента
        // тип входного аргум должн быть челочис,
        // либо перечислением или строкой или shar
        switch (month) {
            case 1:
                System.out.println("Janaru");  // код выполнится  1
                break;//
            case 2:
                System.out.println("febreru");
                break;//
            case 3:
                System.out.println("mart");
                break;//
            case 4:
                System.out.println("апрель");
                break;//
            case 5:
                System.out.println("мфй");
                break;//
            case 6:
                System.out.println("июнь");
                break;//
            case 7:
                System.out.println("июнь");
                break;//
            case 8:
                System.out.println("август");
                break;//
            case 9:
                System.out.println("сентябрь");
                break;//
            case 10:
                System.out.println("октябрь");
                break;//
            case 11:
                System.out.println("ноябрь");
                break;//
            case 12:
                System.out.println("декабрь");
                break;//
            default:
                System.out.println("месяца нет ");
                //выполниться в том случае если не сработает ни один из кейсов
        }
        // пример со строкой  "dddddd"


        String n = "HELOO";
        switch (n){
            case "HELLO":
                System.out.println("hello");
                break;
            case "not hello":
                System.out.println("no hello");
                break;
            default:
                System.out.println("???7 ");
        }

        // вывести по номеру месяца пору года
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("winner");
                break ;
            case 4:
            case 5:
            case 6:
                System.out.println("springl");
                break ;
            case 7:
            case 8:
            case 9:
                System.out.println("summer");
                break ;
            case 10:
            case 11:
            case 12:
                System.out.println("outem");
        }

        //МАССИВЫ

        // МАССИВ - это совокупность элементов одного типа
        //  тип данных
        int[] arr = new int [5];
        // new - динамическое выделение памяти
        //5- это размер массива или количество элем в массиве
        //все массивы в джава должны иметь фиксированный размер
        // индексация элемент массива с нуля 0
        arr[0] = 122;
        arr[4] = 125;
        arr[1] =  arr[0] +  arr[4];
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println(arr[1]);
        int x = 3;
        arr[x] = 34;
        System.out.println(arr[3]);
        System.out.println(arr.length);// количество элем массива

        // многомерные массивы
        float[] [] m = new float[3][4];
        m[1][0] = 12.45f;
        // m[1].length =4;
        // m.length =3;
        // m[3] не может быть счет с  нуля т.е m[2]
        System.out.println(m[0].length*m.length );
        // inline  обьявление массивов
        int[] arr3 = {1,2,4,5,};
        System.out.println(arr3[2]);
        // массив текст
        String[] arr4 = {"hello","world"};
        System.out.println( arr4[0]);
        // многомерн массив
        int [][] arr5 = {{1,2},{3,4},{5,6}};

                     //ЦИКЛЫ
        // ()указыв лщгическое выражение
        // пока выражен истино цикл продолж выполн
        // как только но станов ложн цикл прекращ
        // в {} указыв любой код который нужн повторить
        int k = 0 ;
        /*while (k<5){
            System.out.println(k);
            k=k+1;
        }*/
        // k = 5 ;
        //do-while - цикл с постпроверкой условия
        do {
            k = k+1;
            System.out.println(k);
        }while (k<5);
        // условие цикла фор сост из 3-ех частей
        // каждая из частей не обязятельн
        //в 1-первой происх обьяв или инициализ пременной
        // в первой части являтся {} цикла for
        // во 2-второй части указыв условие выполн цикла
        // 3-третья указывается одно действие
        //порядок выполнения цикла :
        //1 (один раз) -> 2 ->цикл итерация цикла в фиг скобк->
        // ->3
        for (int j= 0;j<7;j=j+1){
            System.out.println(j*j);
        }

        int w = 0;
        for (;w<3;w=w+1){
            System.out.println(w);
        }
        System.out.println(w);

        for (int j=0;j<arr.length;j=j+1){
            System.out.print(arr[j]);
            System.out.print(",");
        }



    }
}
