# Algorithms

#Asymptotic Notation/ Big-O Notation
    
    * Uniform way of measuring algorithm efficiency, introduced the concepts by computer scientist and developers for measuring 
      the asymptotic complexity of a program.
      
    * O(n)-> The run time of an algorithm will increase linearly with the input length.
    
    * O(1)-> It runtime is constant even if input size grows.
    
    * O(nˆ2)-> An amount of input grows, eventually runtime of an algorithms will take more time.
    
    * O(logn)-> It operate in logarithmic time. Eg:- If array size is 8, operations needed to find an element is "3".
                                                     If array size is 16, operations needed to find an element is "4".
                                                     
    * Ω(1)-> If the first element is the searching element in an array then, the run time will take Ω(1).       
    
#Note:
          Ω(1) O(logn)-> for best and worst case.
          
    * ø(Theta)-> This has to be used to mention best and worst case as same.
    
                Eg: To find the length of the string:Ω(1)->at best case
                                                     O(1)->at worst case.

                    This can be said to run in ø(1) time.
