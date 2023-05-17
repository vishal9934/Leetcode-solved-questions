var promisePool = async function(functions, n) {

    let i=0;
    async function callback(){
        
        if(i===functions.length){
            return ;
        }
        await functions[i++]();
        await callback();
    }

    const nPromises = Array(n).fill().map(callback);
    await Promise.all(nPromises);
    

};