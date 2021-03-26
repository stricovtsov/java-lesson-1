package com.amelnikava;

public class Main {
    //обьявление метода
    public static int sum(int a,int b){
        return a+b;
    };

// sum2- с неопред числом параметр
    public  static  int sum2(int ...a){
        //теперь массив типа int a
       // a[0]=1;
        int s= 0;
        for (int e :a){
           s+=e; //s= s+e;
        }
        return  s;
    }

     public  static  void printArray(int[] arr){
         for (int e:arr) {
             System.out.print(e);
             System.out.print(" ");
         }
     }


       public static  int min (int a,int b,int c) {
        if (a<b && a<c ){
           return  a; //заверш мет и возр знач
        }
        if (b<c){
            return  b;
        }
        return c;
       }

    public static void main(String[] args) {


           int v1 = 123;
           int v2 = 100;
           int v3 = 52;
        System.out.println(min(v1,v2,v3));

        System.out.println(sum(12,34)+"kfkjfj");//вызов мет sum

	// write your code here
        int [] arr = {1,2,3,4,56};
        //в этой перем "e" будут по очередно записыв все элемент масс arr
        //после  : в этом цикле может использ либо масс либо коллекц
        for (int e : arr) {
            System.out.println(e);
        }

        float [] []arr2 = {{1,2},{2,5},{2,3}};
        for (float [] e : arr2) {
            for (float v : e){
                System.out.print(v);
                System.out.print(" ");
            }
            System.out.println();
        }
       // оператор "++" инкремент
        // операт "--" декремент

         int a= 12;
        // a = a+1 или a++
        // a = a-1 или a--
        int b = a++;//int b = ++a то b запиш +1 запись префиксная a++ постфиксная
        System.out.println(b);
        System.out.println(a);


        int x = 12;
        int y = 23;
        int z = x++ - --y + y++ - --y - --x;
        // 23 - 22 + 22 - 22 - 23 = -22;
        System.out.println(z);
        for (int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
        // break - останавливает выполн цикла (до срочно )
        //continue - пропускает выполнение текущей опер уикла
        // и переходит к выполнению новой

        //1. дан мас цел числю вывест первое число кратное 3
        int[] arr3 = {1,6,12,5,9,0};
        for (int j : arr3) {
            if (j%3==0){
                System.out.println(j);
                break;
            }
        }
     //2. дан мас цел чисел вывести мас не кратных 3
        for (int j: arr3){
            if (j%3 ==0){
                continue;
            }
            System.out.println(j);
        }

    for (int i = 0; i< 10;i++){
        for (int j =0;j<5;j++){
            break;// прервет цикл j
        }
       break; // прервет цикл i
    }

              // СОРТИРОВКА МЕТОДОМ ПУЗЫРЬКА
        int[] arr4 = {-12,8,7,78,90,56};
       for (int i=0;i<arr4.length;i++){
          for (int j=i+1;j < arr4.length;j++)  {
              if (arr4[i] > arr4[j]){
                  int tmp = arr4[i];
                  arr4[i] = arr4[j];
                  arr4[j] = tmp;
              }
          }
       }
        for (int e:arr4) {
            System.out.print(e);
            System.out.print(" ");

        }
        System.out.println();




        printArray(arr4);
        System.out.println();//перевести на следующую строку

        System.out.println(sum2(1,2,4,5,6,67,7)+"ckfdf");




    }
}
