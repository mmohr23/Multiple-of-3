public class LastMultipleOfThree
{

    public static void main(String[] args)
    {
        int[] numbers1 = {76, 75, 3, 17, 12, 22, 7};
        System.out.print("The last multiple of 3 is " + findMultipleOfThree(numbers1));
        
    }
    
    public static int findMultipleOfThree(int[] arr)
    {
        //initialize largest multiple variable
        //starting value is -1 so if there is no multiple within array, variable will not
        //be changed, therefore returning -1 if there is no multiple of 3 in array. 
        int lastMultiple = -1;
        // your code goes here! 
        //iterate through array using for each loop
        for(int number : arr){
            //if number is a multiple of 3
            if(number % 3 == 0){
                lastMultiple = number;
            }
        }
        return lastMultiple;
    }
}