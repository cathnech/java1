package gb.lesson2;

public class lesTwo
{
    public  static  void    main(String[] args)
    {
//как я поняла из заданий, методы нужно было создасть только на два, или это не принципиально?        
/*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        System.out.println("задание 1");
        int[] arr1 = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] = (arr1[i] == 1) ?  0 :  1);
        }
/*2. Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
        System.out.println("\n\nзадание 2");

        int[] arr2  =   new int[8];
        for (int i = 0,j = 0; i < arr2.length; i++, j+=3)
        {
            System.out.print((arr2[i]=j)+" ");
        }
/*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
        System.out.println("\n\nзадание 3");

        int[] arr3  =   {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int ar:arr3)
        {
            System.out.print((ar = (ar<6)?ar*2:ar)  +   " ");
        }
/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
        System.out.println("\n\nзадание 4");

        int[][] arr4 =
                {
                        {5,4,2,8,3},
                        {2,4,6,4,8},
                        {8,2,1,8,9},
                        {4,2,2,5,6},
                        {9,1,8,4,8}
                };
        for(int i = 0; i < arr4.length; i++)
        {
            for(int j = 0; j < arr4.length; j++)
            {
                arr4[i][j]  =   (i==j||arr4.length-i==j+1)    ?   0:arr4[i][j];
                System.out.print(arr4[i][j]+" ");
            }
            System.out.print("\n");
        }

        /*5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);*/
//сначала думала сделать сортировкой пузырьком, и вывести первый и последний элемент массива
        System.out.println("\nзадание 5");

        int[] arr5  =   {6,3,8,3,9,0,3,76,3,4};
        int arrMin = arr5[0];
        int arrMax = arr5[0] ;
        for (int ar:arr5)
        {
            if (ar<arrMin)
            {
                arrMin =   ar;
            }
            if (ar>arrMax)
            {
                arrMax =   ar;
            }

        }
        System.out.println("максимальное значение "+arrMax+" минимальное значение "+arrMin);
/*6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
граница показана символами ||, эти символы в массив не входят.*/
        System.out.println("\nзадание 6");
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
/*7. **** Написать метод, которому на вход подается
одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементымассива на n позиций.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.*/
        System.out.println("\nзадание 7");
        arrShift(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},-4);


    }

    static boolean checkBalance(int[] arr)
    {
        for(int Lim = arr.length-1; Lim!=0; Lim--)
        {
            int sumRight    =   0;
            int sumLeft     =   0;
            for (int i = 0; i < Lim; i++) {
                sumRight += arr[i];
            }
            for (int j = arr.length-1; j >= Lim; j--) {
                sumLeft += arr[j];
            }
            if (sumRight == sumLeft)
            {
                return true;
            }
        }
        return false;
    }
    static void arrShift(int[] arr, int num)
    {
        while (num !=0)
        {
            if (num < 0) {
                int a = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = a;
                num++;
            } else if (num > 0) {

                int a = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = a;
                num--;
            }
        }
        for (int ar:arr)
        {
            System.out.print(ar +   " ");
        }
    }
}
