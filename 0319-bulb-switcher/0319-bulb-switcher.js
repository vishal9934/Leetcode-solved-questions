/**
 * @param {number} n
 * @return {number}
 */
var bulbSwitch = function(n) {
    let count=0;
    for(let i=1;i*i<=n;i++){
        count++;
    }
    return count;
};