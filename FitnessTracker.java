import java.util.Scanner;

public class FitnessTracker
{

public static void main(String[] args) 
    {
Scanner input = new Scanner(System.in);
  //variables
        int age;
        int height;
        double weight;
        double bmi;
        String exercise;
        boolean none = false;
        boolean light = false;
        boolean moderately = false;
        boolean intensely = false;
        boolean five;
        double cal;


   //Prompting the user to enter name.
   System.out.print("Enter full name: ");
   String name = input.nextLine();
      
   //Prompting the user to enter weight.
   System.out.print("Enter weight in pounds: ");
    weight = input.nextDouble();
   
   //Prompting the user to enter height.
   System.out.print("Enter height in inches: ");
    height = input.nextInt();
   
   //Prompting the user to enter age.
   System.out.print("Enter age please: ");
    age = input.nextInt();
   
   //Printing the user's full name to a new line in upper cases.
   System.out.println("\n" + name.toUpperCase() + ",");
   
   //Calculating the Body Mass Index data of the user..
      bmi = ((weight * 703) / (height * height));
   
   //Checking whether the user is underweight.   
   if (bmi < 18.5) {
   System.out.println("\nAccording to your BMI, you are considered underweight.");
}
   
   //Checking whether the user is average weight.   
   else if (bmi >18.5 && bmi < 24.9) {
   System.out.println("\nAccording to your BMI, your weight is average.");
}
   
   //Checking whether the user is overweight.
   else if (bmi > 25 && bmi < 29.9) {
   System.out.println("\nAccording to your BMI, you are considered overweight.");
}
   
   //Checking whether the user is obese.
   else {
   System.out.println("\nAccording to your BMI, you are considered obese.");
}

      

                //Determining your bmi 

                    {
            bmi = (int) (20 + (6.23 * weight) + (12.7 * height) - (6.8 * age));
        }
                //Show bmi

         System.out.println("Your BMI is " + bmi);

        //Level of Exercises

        if (none)
        {
            cal =  (bmi * 1.69);
        }
        else if (light)
        {
            cal = (bmi * 1.125);
        }
        else if (moderately)
        {
            cal = (bmi * 1.3);
        }
        else if (intensely)
        {   
            cal = (bmi * 1.2);
        }
        else
        {
            cal = (bmi * 1.5);
        }

        System.out.println("What is your Exercise level? Select one of the answers below:");
        System.out.println("Type  NONE  , if you do not exercise. ");
        System.out.println("Type 2 light exercise one to three days a week.");
        System.out.println("Type in 3 if you do exercise moderately three to five times a week.");
        System.out.println("Type in 4 if you do intensely six to seven days a week.");
        System.out.println("Type in 5 if you do exercise intensely six to seven days a week and have a physically active job.");

        exercise = input.nextLine();
        none = input.nextLine() != null;

        System.out.println("Your daily calorie needs " + cal);
        
        //calculate amount of water intake based on weight 
       //display caculation for average water intake 
       double waterIntake = .5 * weight; 
       System.out.printf("\nAccording to your weight, your recommended water intake is " + waterIntake + " ounces.");
       
       //water intake if the user is an active person 
       //ask if the user excercises
       System.out.printf("\n\nEnter the amount of minutes you exercise.");
       double exerciseMin = input.nextDouble();
       
       //caclulation for water intake with exercise
       double exerciseWater = waterIntake + ((exerciseMin/30) * 12); 
       
       //display how much water they should drink based on exercise
       System.out.printf("\nAccording to your exercise minutes, you recommended water intake is " + exerciseWater + " ounces"); 
      
       
       //this is the class User Cardio: object one 
         UserCardio loryn1 = new UserCardio("Loryn","Week 1 ",16.00, 1.21);
         System.out.printf("\n \n Name: " + loryn1.getName() + " , "+ loryn1.getWeek() + "\n Time: " + loryn1.getTime() 
         + " minutes " + "\n Distance: " +  loryn1.getDistance()+" miles" + "\n Goal time for next week: " 
         +  loryn1.getGoal() + " minutes");
   
       //this is the class user cardio: object two
         UserCardio loryn2 = new UserCardio("Loryn","Week 2 ",14.00, 1.21);
         System.out.printf("\n \n Name: " + loryn2.getName() + " , "+ loryn2.getWeek() + "\n Time: " + loryn2.getTime() 
         + " minutes " + "\n Distance: " +  loryn2.getDistance()+" miles" + "\n Goal time for next week: " 
         +  loryn2.getGoal() + " minutes");
      
   
      //array that calculates the average run time for the number of days the user worked out 
         System.out.printf("\n \n Enter the number of days you exercised this week: ");
         int n = input.nextInt();
         double numbers[]= new double[n];
         double sum = 0;
   
         System.out.print("Enter the times of each run: ");
         for (int i = 0; i < n; i++) {
         numbers[i] = input.nextDouble();
             sum += numbers[i];
          }
          double average = sum / n;
          System.out.println("Average is run time is:  " + average);
       
       //calculating sleep efficiency
       //recommend sleep hours = recSleepHours
       double recSleepMins = 420;
       
       //prompt the user to enter the time it takese to fall asleep, time awake, and total time slept
        System.out.printf("\n\n How long does it take you to fall asleep (in minutes)?");
        double fallAsleep = input.nextDouble();
        System.out.printf("\n How many minutes are you awake at night?");
        double timeAwake = input.nextDouble();
         
       //calculation for sleep efficiency 
       double totalAwake= fallAsleep + timeAwake;
       double minsOfSleep = recSleepMins - totalAwake; 
       double sleepEficiency = minsOfSleep/recSleepMins;
       
       //display sleep efficiency 
       System.out.printf("\n Your sleep efficiency is %.2f"  ,sleepEficiency );
       
      }
   }