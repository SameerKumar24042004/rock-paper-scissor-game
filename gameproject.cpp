
#include<iostream>
#include<cstdlib>
#include<ctime>
 
 using namespace std;
  
  int main()
  {
      bool isplaying = true;
      char user,computer;
      int randnum, userchoice;
     while(isplaying)
     {
          srand(5);
      randnum=rand ()%3;
      if(randnum==0)
      computer='r';
      else if(randnum==1)
      computer='p';
      else
      computer='s';
       
       cout<<"enter the choice=";
       cin>>user;
       
       if(computer=='r')
       {
           if(user=='r')
           cout<<"its a tie";
           else if(user=='p')
         cout<<"the use is the winner" ;
         else
         cout<<"the computer is winner";
         
       }
       else if(computer=='p')                         //r=rock ,s=scissor ,p=paper
       {
      if (user =='p')
      cout<<"this a tie";
      else if(user=='s')
      cout<<"the winner is user";
      else
      cout<<"the computer is the winner";
       }
      else if(computer =='s')
      {if(user=='s')
      cout<<"its a tie";
      else if(user=='r')
     cout<<"the user is the winner";
     else
     cout<<"the computer is te winner";
      }
      cout << endl;
      cout << "press 1 to play again and 0 to exit: ";
      cin >> userchoice;
      if  (userchoice != 1) {
          isplaying = false;
      }
     }
       return 0;
  }
  