var fibGenerator = function*() {
    var a=0, b=1
    yield a
    yield b
    while(true){
        var c= a+b
        yield c
        a=b
        b=c
    }
};