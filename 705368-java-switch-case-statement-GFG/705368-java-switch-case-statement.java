class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
      switch(choice){
          case 1:
              double radius = arr.get(0);
              return Math.PI*radius*radius;
              
              case 2:
                  double length= arr.get(0);
                  double breadth=arr.get(1);
                  return length*breadth;
                  
                  default:
                  return 0.0;
          
      }  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna