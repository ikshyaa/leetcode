class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>();
        String a = "";
        
        for (int i =1; i<=n; i++) {
            
            // (i%15==0)? a= a + "FIzzBuzz"; : (i%3==0) ? a = a +"Fizz";: (i%5==0) ? a = a+ "Buzz";: a=a+i;
            
            if(i%3 ==0 && i%5 == 0) 
            {
                a = "FizzBuzz";
            }
              else if(i%5 == 0)
            {
                a ="Buzz";
            }
            else if(i % 3 == 0  )
            {
                a = "Fizz";
            }
          
            else a = a + i;
            fizzBuzz.add(a);  
            a="";
        }
        return fizzBuzz;
        
    }
}