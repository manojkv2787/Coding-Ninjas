/*
A popular tourist destination country is situated on a breathtakingly beautiful archipelago constantly bathed 
by the sun. The country's residents are very proud of their numerous islands. However, global warming has them 
very worried: raising sea levels are resulting in rapidly increasing loss of dry land, which is diminishing the 
beauty of the archipelago.
The map of the archipelago is represented by a grid of R by C squares (characters). The character 'X' (uppercase 
letter x) represents dry land, while '.' (period) represents sea. It has been estimated that, in fifty years, 
sea will have flooded every square of land that is currently surrounded by sea on three or on all four sides 
(north, south, east, west). Assume that all squares outside the map (along the edges) are covered by sea.
Your task is computing the map of the archipelago in fifty years (after the described sea level rise).
Since there will probably be less land than today, you shouldn't print out the whole map, but only its smallest 
rectangular part that contains all land squares. It is guaranteed that at least one square of land will remain 
in all test cases.

Input Format:
The first line of input contains two positive integers, R and C, the dimensions of the current map.
Each of the following R lines contains C characters. These R by C characters represent the current map of the 
archipelago.

Constraints:
1 ≤ R, C ≤ 10
Time limit: 1 sec
Output Format:
The output must contain an appropriate number of lines representing the required rectangular part of the future 
(flooded) map.
Sample Input 1:
5 3
...
.X.
.X.
.X.
...
Sample Output 1:
X
Sample Input 2:
3 10
..........
..XXX.XXX.
XXX....... 
Sample Output 2:
.XX...X
XX.....
*/

import java.util.Scanner;
public class Main { 
	public static String[] map; 
	public static char[][] newmap = new char[12][12];
	public static int[] u = {0, 0, 1, -1};
	public static int[] v = {1, -1, 0, 0};
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int r=myObj.nextInt();
		int s=myObj.nextInt();
		map=new String[r];
		int mini = 100;
		int maxi = 0;
		int minj = 100;
		int maxj = 0;
		for (int i = 0; i < r; i++)
		{ 
			map[i] = myObj.next();
		} 
		for (int i = 0; i < r; ++i)
		{
			for (int j = 0; j < s; ++j)
			{
				int more = 0;
				for (int k = 0; k < 4; ++k)
				{
					for (int j = 0; j < s; ++j)
					{
						int more = 0;
						for (int k = 0; k < 4; ++k)
						{
							int x = i + u[k];
							int y = j + v[k];
							if (x < 0 || y < 0 || x >= r || y >= s || map[x].charAt(y) == '.')
							{
								more++;
							}
						}
						if (more >= 3)
						{
							newmap[i][j] = '.';
						}
						else
						{
							newmap[i][j] = map[i].charAt(j);
						}
						if (newmap[i][j] == 'X')
						{
							mini = Math.min(mini, i);
							maxi = Math.max(maxi, i);
							minj = Math.min(minj, j);
							maxj = Math.max(maxj, j);
						}
					}
				}
				for (int i = mini; i <= maxi; ++i)
				{
					for (int j = minj; j <= maxj; ++j)
					{
						System.out.print(newmap[i][j]);
					}
					System.out.print("\n");
				}
			
			}
		}
	}
}