//This code is just for understanding of the working

 class Thermoscanner
{
 public static void main(String args[])
 {
 double temp;
 boolean censor=true;//value to find whether person is coming in(signal true) or going out(signal false)
 int count=0;//To count no of people enter and leaving in bus by using a censor so as to calculate seat availability
 int noofseat=60;//can be set according to each bus
  
  while(5>0)//infinte condition as we dont know how many people will come
   {
    censor=true;//or false according to situation
    
    if(censor==true)//person coming in
    {
     temp=35;//the temperature value to be  recieved from the thermal scanner
     if(temp>41)
       System.out.println("Dont enter");
     else 
       {
        System.out.println("You may Enter");
        count++;
       }
    }
    else
    {
     count--;    
    }
    
    System.out.println(count+" out of "+noofseat+" full");
    
    //Code can be modified to give desired message output 
    //It will stop working once the power is turned off
    
   }
 }
}
