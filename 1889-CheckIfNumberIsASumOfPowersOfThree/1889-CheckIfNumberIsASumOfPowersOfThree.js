// Last updated: 7/31/2025, 6:04:14 PM
var checkPowersOfThree = function(n) {
    while (n > 0) {
        if (n % 3 == 2) {
            return false;
        }
        n = Math.round(n / 3);
    }
    return true;
}