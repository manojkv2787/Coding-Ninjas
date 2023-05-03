function modifyArray(arr) {
    // Write the logic here
        let res = arr.filter((value) => {
            if (typeof value !== "number") return false;
            return value > 0
        })
        res = res.map((value) => {
            return value * 2
        })
        return res
}

// Input and output has already been handled for you

process.stdin.resume();
process.stdin.setEncoding('utf8');

let remainder = '';
process.stdin.on('data', function (chunk) {
    let arr = chunk.toString().split(' ');
    arr = arr.map((val) => parseInt(val))
    
    let ans = modifyArray(arr)
    ans = ans.join(' ')
    
    process.stdout.write(ans);
    process.exit();
});