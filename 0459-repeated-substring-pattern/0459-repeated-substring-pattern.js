/**
 * @param {string} s
 * @return {boolean}
 */
var repeatedSubstringPattern = function(s) {
     const len = s.length;
        for (let i = 0; i < len / 2; i++) {
            const subString = s.substring(0, i + 1);
            if (len % subString.length === 0) {
                const noOfRepetitions = len / subString.length;
                let tempStr = '';
                for (let j = 0; j < noOfRepetitions; j++) {
                    tempStr += subString;
                }
                if (tempStr === s && len>1) {
                    return true;
                }
            }
        }
        return false;
};