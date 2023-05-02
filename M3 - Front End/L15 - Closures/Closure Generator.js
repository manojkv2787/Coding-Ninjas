function generateID(start) {
    let count = start
    return function () {
        return `A-2021_${count++}`
    }
}

process.stdin.resume();
process.stdin.setEncoding('utf8');

let remainder = '';
process.stdin.on('data', function (chunk) {
    let lines = chunk.toString().split(' ');
    let start = lines[0];
    let n = lines[1];
    let ans = ''
    let id = generateID(start)
    for(let i=0;i<n;i++) {
        ans += id()+'\n'
    }

    process.stdout.write(ans);
    process.exit();
});