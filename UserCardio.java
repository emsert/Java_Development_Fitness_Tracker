class UserCardio{

   //variables 
     String name;
     String week; 
     double time = 1; 
     double distance = 1; 
      
         //no arg constructor 
            UserCardio(){
            }
    
               //constructor 
                  UserCardio(String newName,String newWeek,double newTime,double newDistance){
                  this.name = newName;
                  this.week = newWeek;
                  this.time= newTime;
                  this.distance = newDistance; 
                  }
                  
                     //get time
                        String getName(){
                        return name;
                        } 
                        String getWeek(){
                        return week;
                        }
                        double getTime(){
                        return time;
                        }
                        double getDistance(){
                        return distance;
                        }
                        double getGoal(){
                        return time - 2.00;
                        }
                        
                        
                           //set as new values 
                                 void setName(String newName){
                                 name = newName;
                                 }
                                 void setWeek(String newWeek){
                                 week= newWeek;
                                 }
                                 
                                 void setTime(double newTime){
                                 time = newTime;
                                 
                                 }
                                 
                                 void setDistance(double newDistance){
                                 distance = newDistance;
                                 }
                                 
                        

}