// Last updated: 9/22/2026, 2:53:41 PM
class Solution {
        public int minimumNumbers(int num, int k) {
        if (num == 0) return 0;
        for (int i = 1; i * k <= num && i <= 10; ++i)
            if (k * i % 10 == num % 10)
                return i;
        return -1;
    }
}