var throttle = function(fn, t) {
    let flag = false, nextArg;
    
    function run(){
        if(!flag && nextArg){
            fn(...nextArg);
            flag = true;
            nextArg = undefined;
            setTimeout(() => {
                flag = false;
                run();
            }, t);
        };
    };
    
    return function(...args) {
        nextArg = args;
        run();
    };
};