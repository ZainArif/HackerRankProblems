package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of players on the leaderboard : ");
        int n = scanner.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter the leaderboard scores in decreasing order : ");
        for(int i=0;i<n;i++)
            scores[i] = scanner.nextInt();

        System.out.println("Enter the number games Alice plays : ");
        int m = scanner.nextInt();
        int[] alice = new int[m];
        System.out.println("Enter the Alice scores : ");
        for(int i=0;i<m;i++)
            alice[i] = scanner.nextInt();

        int[] aliceRank = climbingLeaderboard(scores,alice);
        for (int k=0;k<aliceRank.length;k++)
            System.out.println(aliceRank[k]);
    }

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int n = scores.length;
        int m = alice.length;

        int[] aliceRank = new int[m];
        int[][] scoresRank = new int[n][2];
        scoresRank[0][0] = 1;
        scoresRank[0][1] = scores[0];

        for (int i=1;i<n;i++){
            if (scores[i-1]==scores[i]){
                scoresRank[i][0] = scoresRank[i-1][0];
                scoresRank[i][1] = scores[i];
            }
            else {
                scoresRank[i][0] = (scoresRank[i-1][0])+1;
                scoresRank[i][1] = scores[i];
            }
        }

        for (int i = 0;i<m;i++) {

            //for (int j = 0; j < n; j++) {
                //System.out.print("Rank = " + scoresRank[j][0] + " , Score = " + scoresRank[j][1] + "\n");
                int start = 0, end = n - 1, mid , index = 0;
//                System.out.println("Enter a number whose index you want to find: ");
//                int target = scanner.nextInt();
                boolean flag = false;
                while (start <= end) {
                    mid = (start+end)/2;
                    if (scoresRank[mid][1]==alice[i]) {
                        //index = mid;
                        aliceRank[i] = scoresRank[mid][0];
                        flag = true;
                        break;
                    }
                    else if (scoresRank[mid][1]>alice[i])
                        start = mid+1;
                    else
                        end = mid-1;
                }

                if (start == n)
                    start--;
                if (end == n)
                    end--;
                if (start<0)
                    start = 0;
                if (end <0)
                    end = 0;

                if (!flag){
                    if (scoresRank[start][1]>=alice[i]){
                        aliceRank[i] = scoresRank[start][0] + 1;
                        for (int x = start+1;x<n;x++)
                            scoresRank[x][0]++;
                    }
                        //index = start;
                    else if (scoresRank[start][1]<alice[i] && alice[i]<=scoresRank[end][1]){
                        aliceRank[i] = scoresRank[end][0] + 1;
                        for (int x = end+1;x<n;x++)
                            scoresRank[x][0]++;
                    }
                        //index = end;
                    else if (end == 0){
                        aliceRank[i] = scoresRank[end][0];
                        for (int x = end;x<n;x++)
                            scoresRank[x][0]++;
                    }
                        //index = end;
                    else{
                        aliceRank[i] = scoresRank[end+1][0] + 1;
                        for (int x = end+2;x<n;x++)
                            scoresRank[x][0]++;
                    }
                        //index = end + 1;

                    //System.out.println("number should be added at index = " + index);
                }
//                else
//                    System.out.print(alice[i] + " found at index = " + index);
            //}

        }


        return aliceRank;
    }
}
