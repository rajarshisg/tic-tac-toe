import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class TicTacToe 
{
    static char[][] a=new char[3][3];
    char turn='X';
    TicTacToe()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            a[i][j]=' ';
        }
    }
    void displayboard()
    {
        System.out.println("|     |     |     |");
        System.out.println("|  "+a[0][0]+"  |  "+a[0][1]+"  |  "+a[0][2]+"  |");
        System.out.println("|     |     |     |");
        System.out.println("___________________");
        System.out.println("|     |     |     |");
        System.out.println("|  "+a[1][0]+"  |  "+a[1][1]+"  |  "+a[1][2]+"  |");
        System.out.println("|     |     |     |");
        System.out.println("___________________");
        System.out.println("|     |     |     |");
        System.out.println("|  "+a[2][0]+"  |  "+a[2][1]+"  |  "+a[2][2]+"  |");
        System.out.println("|     |     |     |");
    }
    boolean isFull()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]!='X' && a[i][j]!='O')
                return false;
            }
        }
        return true;
    }
    char isWinner()
    {
        for(int i=0;i<3;i++)
        {
            if(a[i][0]=='X' && a[i][1]=='X' && a[i][2]=='X') 
            return 'X';
            if(a[i][0]=='O' && a[i][1]=='O' && a[i][2]=='O')
            return 'O';
        }
         for(int i=0;i<3;i++)
        {
            if(a[0][i]=='X' && a[1][i]=='X' && a[2][i]=='X') 
            return 'X';
            if(a[0][i]=='O' && a[1][i]=='O' && a[2][i]=='O')
            return 'O';
        }
        if(a[0][0]=='X' && a[1][1]=='X' && a[2][2]=='X')
        return 'X';
        if(a[0][2]=='X' && a[1][1]=='X' && a[2][0]=='X')
        return 'X';
        if(a[0][0]=='O' && a[1][1]=='O' && a[2][2]=='O')
        return 'O';
        if(a[0][2]=='O' && a[1][1]=='O' && a[2][0]=='O')
        return 'O';
        return 'F';
    }
    int winPossible()
    {
        for(int i=0;i<3;i++)
      {
      if(a[i][0]=='O' && a[i][1]=='O'  && a[i][2]==' ')
      {
      a[i][2]='O';
      return 1;
      }
      if(a[i][0]=='O' && a[i][2]=='O' && a[i][1]==' ')
      {
      a[i][1]='O';
      return 1;
      }
      if(a[i][1]=='O' && a[i][2]=='O' && a[i][0]==' ')
      {
          a[i][0]='O';
          return 1;  
      }
      }
     for(int i=0;i<3;i++)
      {
      if(a[0][i]=='O' && a[1][i]=='O' && a[2][i]==' ')
      {
      a[2][i]='O';
      return 1;
      }
      if(a[0][i]=='O' && a[2][i]=='O' && a[1][i]==' ')
      {
      a[1][i]='O';
      return 1;
      }
      if(a[1][i]=='O' && a[2][i]=='O' && a[0][i]==' ')
      {
      a[0][i]='O';
      return 1;
      } 
    }
     if(a[0][0]=='O' && a[1][1]=='O' && a[2][2]==' ')
     {
      a[2][2]='O';
      return 1;
     }
     if(a[1][1]=='O' && a[2][2]=='O' && a[0][0]==' ')
     {
     a[0][0]='O';
     return 1;
     }
     if(a[0][0]=='O' && a[2][2]=='O' && a[1][1]==' ')
     {
     a[1][1]='O';
     return 1;
     }
     if(a[2][0]=='O' && a[1][1]=='O' && a[0][2]==' ')
     {
     a[0][2]='O';
     return 1;
     }
     if(a[2][0]=='O' && a[0][2]=='O' && a[1][1]==' ')
     {
     a[1][1]='O';
     return 1;
     }
     if(a[1][1]=='O' && a[0][2]=='O' && a[0][2]==' ')
     {
     a[0][2]='O';
     return 1;
     }
     return -1;
    }
    
    int bestMove()
    {
      
       for(int i=0;i<3;i++)
      {
      if(a[i][0]=='X' && a[i][1]=='X'  && a[i][2]==' ')
      {
      a[i][2]='O';
      return 1;
      }
      if(a[i][0]=='X' && a[i][2]=='X' && a[i][1]==' ')
      {
      a[i][1]='O';
      return 1;
      }
      if(a[i][1]=='X' && a[i][2]=='X' && a[i][0]==' ')
      {
          a[i][0]='O';
          return 1;  
      }
    }
     for(int i=0;i<3;i++)
      {
      if(a[0][i]=='X' && a[1][i]=='X' && a[2][i]==' ')
      {
      a[2][i]='O';
      return 1;
      }
      if(a[0][i]=='X' && a[2][i]=='X' && a[1][i]==' ')
      {
      a[1][i]='O';
      return 1;
      }
      if(a[1][i]=='X' && a[2][i]=='X' && a[0][i]==' ')
      {
      a[0][i]='O';
      return 1;
      } 
    }
     if(a[0][0]=='X' && a[1][1]=='X' && a[2][2]==' ')
     {
      a[2][2]='O';
      return 1;
     }
     if(a[1][1]=='X' && a[2][2]=='X' && a[0][0]==' ')
     {
     a[0][0]='O';
     return 1;
     }
     if(a[0][0]=='X' && a[2][2]=='X' && a[1][1]==' ')
     {
     a[1][1]='O';
     return 1;
     }
     if(a[2][0]=='X' && a[1][1]=='X' && a[0][2]==' ')
     {
     a[0][2]='O';
     return 1;
     }
     if(a[2][0]=='X' && a[0][2]=='X' && a[1][1]==' ')
     {
     a[1][1]='O';
     return 1;
     }
     if(a[1][1]=='X' && a[0][2]=='X' && a[0][2]==' ')
     {
     a[0][2]='O';
     return 1;
     }
      return -1;
   }
        
    void isTurn()
    {
        if(turn=='X')
        turn='O';
        else
        turn='X';
    }
    public static void main(String args[])
    {
        TicTacToe ob=new TicTacToe();
        
        
        try{
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("                            The Tic Tac Toe Game                                    ");
        System.out.println("------------------------------------------------------------------------------------");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("                                Welcome User!                                           ");
        System.out.println("1) User plays with X");
        System.out.println("2) Computer plays with O");
        System.out.println();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This Computer is not a dumb machine. Make your move wisely!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();
        
       }
      catch(InterruptedException e)
     {
        System.err.format("IOException: %s%n",e);
     }
     System.out.println("The Board :");
     ob.displayboard();
     System.out.println();
     System.out.println("User's turn :");
     System.out.println("Choose your cell by entering it's coordinates (x,y) :");
     int x,y;
     Scanner sc=new Scanner(System.in);
     x=sc.nextInt();
     y=sc.nextInt();
     a[x][y]=ob.turn;
     char c;
     while(ob.isFull()==false)
     {
         
         ob.displayboard();
         ob.isTurn();
         if(ob.isFull()==true && ob.isWinner()=='F')
         {
             System.out.println("The game ends in a draw. Thank you for playing this game!");
             break;
         }
         if(ob.isWinner()=='X')
         {
         System.out.println("Congratulations! You have won the game.");
         break;
         }
         if(ob.isWinner()=='O')
         {
         System.out.println("Computer Won. Better luck next time!");
         break;
        }
         if(ob.turn=='X')
         {
             System.out.println();
             System.out.println("User's turn :");
             System.out.println("Choose your cell by entering it's coordinates (x,y) :");
             x=sc.nextInt();
             y=sc.nextInt();
             while(a[x][y]!=' ')
             {
                 System.out.println("Cell is already occupied. Choose another cell.");
                  x=sc.nextInt();
                  y=sc.nextInt();
                 
             }
             a[x][y]=ob.turn;
          }
         if(ob.turn=='O')
         {
             System.out.println();
             System.out.println("Computer's turn :");
             System.out.println("Computer is guessing........");
             try
             {
                 TimeUnit.SECONDS.sleep(3);
             }
             catch(InterruptedException e)
     {
        System.err.format("IOException: %s%n",e);
     }
       
           if(ob.winPossible()==-1)
             {
               if(ob.bestMove()==-1)
                 {
                      Random rand=new Random();
                      x=rand.nextInt(3);
                      y=rand.nextInt(3);
                     while(a[x][y]!=' ')
                    {
                      x=rand.nextInt(3);
                      y=rand.nextInt(3);
                    }
                    a[x][y]=ob.turn;
               }
            }
        
}
}
}
}