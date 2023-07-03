/**
 * @param {string} s
 * @param {string} goal
 * @return {boolean}
 */
var buddyStrings = function(s, goal) {
    
    if(s.length!==goal.length){
        return false;
    }
    //array for storing index
    let arr=[]
    for(let i=0;i<s.length;i++){
        if(s[i]!==goal[i]){
            arr.push(i);
        }
        
    }
    if(arr.length===0){
        let set=new Set(s);
        if(set.size<s.length){
            return true;
        }
        
    }
    else if(arr.length===2){
        const[x,y]=arr;
        if(s[x]===goal[y] && s[y]===goal[x]) return true;
    }
    return false;
   
};