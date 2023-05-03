const counter = (function () {
    // Write the logic here
    let c = 0
    function initialize(start) {
        c = start
    }
    function increase() {
        c++
        return c
    }
    return { initialize, increase }
})()



// Input and output has already been handled for you



process.stdin.resume();
process.stdin.setEncoding('utf8');

let remainder = '';
process.stdin.on('data', function (chunk) {
    let lines = chunk.toString().split(' ');
    let start = lines[0];
    let n = lines[1];
    let ans = ''
    counter.initialize(start)
    for(let i=0;i<n;i++) {
        ans += counter.increase()+'\n'
    }

    process.stdout.write(ans);
    process.exit();
});