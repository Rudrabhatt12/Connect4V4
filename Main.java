//V4 10 C (2 classes) Culminating ActPart 5
//Extra time on Friday Jan.27 and Mon.Jan.30 1-3pm
//This version will connect 4 checkers on the bottom row for a win

//1st Objective for AM class: Extend the program to check every row for a win and print win messages. [1c]

//2nd objective. Use the new method called board to replace the print statements throughout the program [1c]

//3rd objective: Input prompts and informative messages to tell the player what to do during gameplay.[1c]

//4th objective: Improved ASCII Graphics for the board[1c]

//5th objective: Embedding Images eg a conclusion screen with a farewell image. See Examples in the Culminating Assignment 
//You will need to download your own pic [1c]

//6th objective: Player 2 Interaction using duplicate statements of Player 1 statements or AI using random or Ifs [1c]

//7th objective: Instructions Screen with clear instructions on how to play the game[1c]

//8th objective: Making your game run smoothly so all the output is coordinated with the input. There should not be weird displays or interuptions. The game should play correctly. [1c]

//9th objective: Your contribution and research. Anything else you can think of to make the game more interesrting and fun [2c]
//eg delay using thread.sleep, checking for diagonal wins etc.
//eg pixel graphics for gameplay instead of ascii graphics (challenging)
//eg animation, music

//PM class: Extend the win check for all rows and columns.




import java.util.Scanner;
class Main {
  //global declaration of array
  static char b[]=new char [16];
  //board method aka subprogram or def
  public static void board() 
  {
     System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
    System.out.println(b[4]+" "+b[5]+" "+b[6]+" "+b[7]);
    System.out.println(b[8]+" "+b[9]+" "+b[10]+" "+b[11]);
    System.out.println(b[12]+" "+b[13]+" "+b[14]+" "+b[15]);
  }
  public static void wincheck()
  {
    if (b[12]=='o'&&b[13]=='o'&&b[14]=='o'&&b[15]=='o')
      System.out.println("4 in a row");
  }
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    char column='A';
    //char b[]=new char [16];
    for (int index=0;index<=15;index++)
      {
        b[index]='*';
      }
    /* Not required because of for loop
    b[0]='*';
    b[1]='*';
    b[2]='*';
    b[3]='*';
    b[4]='*';
    b[5]='*';
    b[6]='*';
    b[7]='*';
    b[8]='*';
    b[9]='*';
    b[10]='*';
    b[11]='*';
    b[12]='*';
    b[13]='*';
    b[14]='*';
    b[15]='*';
    */
    System.out.println('A'+" "+'B'+" "+'C'+" "+'D');
   board();//call statement that activates method/subprogram/definition

    for (int turn=1;turn<=16;turn++)
      {
    
        System.out.println("Choose column A,B,C,D");
        column=sc.next().charAt(0);
        if (column=='A')//initialize the A column
         {
         for(int y=0;y<=12;y=y+4)
          {
            
          //if (b[y]=='o')break;
          if (y!=0&&b[y]=='o')//for case where there
          {                  //is a checker at bottom
            b[y-4]='o';      //and none at top  
            //System.out.println("b[y-4]="+b[y-4]);
            break;
          }
          if (y==12) b[y]='o';//initialize the lowest position of this column
          char temp=b[y];
          b[y]='o';
          //if (b[y+4]=='o'&&(y+4)<=12) 
          //{
           // b[y]='o';
           // break;
         // }//end if b[y+1]
            board();
            /*
          System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
          System.out.println(b[4]+" "+b[5]+" "+b[6]+" "+b[7]);
          System.out.println(b[8]+" "+b[9]+" "+b[10]+" "+b[11]);
          System.out.println(b[12]+" "+b[13]+" "+b[14]+" "+b[15]);
            */
          b[y]=temp;
          System.out.println("Delay - enter any char to continue press enter");
          column=sc.next().charAt(0);
          System. out. print("\033[H\033[2J");
          System. out. flush();
        }//end for col A
    }//end if col==A
    if (column=='B')//initialize the B column
    {
      for(int y=1;y<=13;y=y+4)
        {
          if (y!=1&&b[y]=='o')//for case where there
          {                  //is a checker at bottom
            b[y-4]='o';      //and none at top  
            //System.out.println("b[y-4]="+b[y-4]);
            break;
          }
          if (y==13) b[y]='o';//initialize the lowest position of this column
          char temp=b[y];
          b[y]='o';
          
          System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
          System.out.println(b[4]+" "+b[5]+" "+b[6]+" "+b[7]);
          System.out.println(b[8]+" "+b[9]+" "+b[10]+" "+b[11]);
          System.out.println(b[12]+" "+b[13]+" "+b[14]+" "+b[15]);
          b[y]=temp;
          System.out.println("Delay - enter any char to continue press enter");
          column=sc.next().charAt(0);
          System. out. print("\033[H\033[2J");
          System. out. flush();
        }//end for col B
       }//end if col==B
    if (column=='C')//initialize the C column
    {
      for(int y=2;y<=14;y=y+4)
        {
          if (y!=2&&b[y]=='o')//for case where there
          {                  //is a checker at bottom
            b[y-4]='o';      //and none at top  
            //System.out.println("b[y-4]="+b[y-4]);
            break;
          }
          if (y==14) b[y]='o';//initialize the lowest position of this column
          char temp=b[y];
          b[y]='o';
          
          System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
          System.out.println(b[4]+" "+b[5]+" "+b[6]+" "+b[7]);
          System.out.println(b[8]+" "+b[9]+" "+b[10]+" "+b[11]);
          System.out.println(b[12]+" "+b[13]+" "+b[14]+" "+b[15]);
          b[y]=temp;
          System.out.println("Delay - enter any char to continue and press enter");
          column=sc.next().charAt(0);
          System. out. print("\033[H\033[2J");
          System. out. flush();
        }//end for col C
       }//end if col==C
    if (column=='D')//initialize the D column
    {
      for(int y=3;y<=15;y=y+4)
        {
          if (y!=3&&b[y]=='o')//for case where there
          {                  //is a checker at bottom
            b[y-4]='o';      //and none at top  
            //System.out.println("b[y-4]="+b[y-4]);
            break;
          }
          if (y==15) b[y]='o';//initialize the lowest position of this column
          char temp=b[y];
          b[y]='o';
          
          System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
          System.out.println(b[4]+" "+b[5]+" "+b[6]+" "+b[7]);
          System.out.println(b[8]+" "+b[9]+" "+b[10]+" "+b[11]);
          System.out.println(b[12]+" "+b[13]+" "+b[14]+" "+b[15]);
          b[y]=temp;
          System.out.println("Delay - enter any char to continue press enter");
          column=sc.next().charAt(0);
          System. out. print("\033[H\033[2J");
          System. out. flush();
        }//end for col D
       }//end if col==D
        wincheck();
      }//end of the for turn=4 loop
    
   //here is the initialized board with lowest positions filled
    System.out.println("here is the initialized board with lowest positions filled");
          System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
          System.out.println(b[4]+" "+b[5]+" "+b[6]+" "+b[7]);
          System.out.println(b[8]+" "+b[9]+" "+b[10]+" "+b[11]);
          System.out.println(b[12]+" "+b[13]+" "+b[14]+" "+b[15]);
    
    //Now at this point all positions at bottom are full
    
     
    
    
  }//main
}//class