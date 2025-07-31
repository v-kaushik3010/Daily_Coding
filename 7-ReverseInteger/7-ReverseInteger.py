# Last updated: 7/31/2025, 6:06:47 PM
class Solution:
  def Rev(self, x):
    arr = []
    while x > 0:
        arr.append(x % 10)
        x = x // 10
    return arr


  def reverse(self, x: int) -> int:  
    negative = x < 0  
    if negative:  
        x = -x  
    
    arr = self.Rev(x)  
    
    ans = 0  
    for num in arr:  
        ans = (ans * 10) + num  
    
    if negative:  
        ans = -ans  
    
    if ans < -2147483648 or ans > 2147483647:  
        return 0  
    
    return ans