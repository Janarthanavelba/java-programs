/* Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, 
where d is a positive integer. Do the mentioned change in the array in place. */

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        
        d=d%arr.length;
        
        int temp[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
        }
        
        int j=0;
        
        for(int i=d;i<arr.length;i++)
        {
            arr[j]=temp[i];
            j++;
        }
        
        for(int i=0;i<d;i++)
            {
                arr[j]=temp[i];
                j++;
            }
    }
}
