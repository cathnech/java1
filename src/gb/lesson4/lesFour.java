package gb.lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesFour
{
    static char[][] map;
    static final int size   =   5;
	static final int winCount = 4; // кол-во фишек

    static final char dot_x = 'X';
    static final char dot_o = 'O';
    static final char dot_empty = '.';

	public static void main(String[] args)
	{
		initMap();
		printMap();
		while (true) {
			humanTurn();
			printMap();
			if (isWinner2(dot_x))
			{
				System.out.println("Победил человек");
				break;
			}
			if (isMapFull())
			{
				System.out.println("Ничья");
				break;
			}
			aiTurn();
			printMap();
			if (isWinner2(dot_o))
			{
				System.out.println("Победил Искуственный Интеллект");
				break;
			}
			if (isMapFull())
			{
				System.out.println("Ничья");
				break;
			}
		}
		System.out.println("Игра закончена");
	}
    static void initMap()
    {
        map =   new char[size][size];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                map[i][j]   =   dot_empty;
            }
        }

    }

    static void printMap()
    {
	    for (int i = 0; i <= size; i++)
	    {
		    System.out.print(i + " ");
	    }

	    System.out.println();

	    for (int i = 0; i < size; i++)
	    {
		    System.out.print((i+1) + " ");
		    for (int j = 0; j < size; j++)
		    {
		    	System.out.print(map[i][j] + " ");
		    }
		    System.out.println();
	    }
    }

    static void humanTurn()
    {
	    Scanner scanner = new Scanner(System.in);
	    int x,y;

	    do
		{
			System.out.println("Введите координаты в формате X Y");
			x   =   scanner.nextInt() - 1;
			y   =   scanner.nextInt() - 1;
	    } while (isCellValid(x, y));
	    map[y][x] = dot_x;
    }

	static void aiTurn()
	{
		Random random = new Random();
		int x = 0,y = 0,flag = 0;

		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if (checkWinPosition(j,i))
				{
					flag = 1;
					x=j;
					y=i;
					break;
				}
			}
			if (flag == 1) break;
		}
		if (flag != 1)
		{
			do
			{
				x   =   random.nextInt(size);
				y   =   random.nextInt(size);
			} while (isCellValid(x, y));
			map[y][x] = dot_o;
		}
		System.out.println("Компьютер походил: " + (x+1) + " и " + (y+1));

	}

    static boolean isCellValid(int x, int y)
    {
	    return x < 0 || x >= size || y < 0 || y >= size || map[y][x] != dot_empty;
    }

	static boolean isWinner2(char symb)
	{
		int flag1,flag2,flag3,flag4;
		flag3 = 0;
		flag4 = 0;
		for (int i = 0; i < size ; i++)
		{
			flag1 = 0;
			flag2 = 0;

			flag3 = (map[i][i] == symb) ? (flag3+1) : 0;
			flag4 = (map[i][size - 1 - i] == symb) ? (flag4+1) : 0;

			if (flag3 == winCount || flag4 == winCount) return true;

			for (int j = 0; j < size; j++)
			{
				flag1 = (map[i][j] == symb) ? (flag1+1) : 0;
				flag2 = (map[j][i] == symb) ? (flag2+1) : 0;

				if (flag1 == winCount || flag2 == winCount) return true;
			}

		}
		return false;
	}

    static boolean isMapFull()
    {
	    for (int i = 0; i < size; i++)
	    {
		    for (int j = 0; j < size; j++)
		    {
			    if (map[i][j] == dot_empty) return false;
		    }
	    }
    	return true;
    }

	static boolean checkWinPosition(int x, int y)
	{
		if (map[y][x] != dot_empty) return false;
		map[y][x] = dot_o;

		if (isWinner2(dot_o))
		{
			return true;
		}
		map[y][x] = dot_x;
		if (isWinner2(dot_x))
		{
			map[y][x] = dot_o;
			return true;
		}
		map[y][x] = dot_empty;
		return false;

	}
}
