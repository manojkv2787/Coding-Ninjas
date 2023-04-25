/*
Given a number N, print sum of all even numbers from 1 to N.
Input Format :
Integer N
Output Format :
Required Sum 
Sample Input 1 :
6
Sample Output 1 :
12
*/

process.stdin.resume(); 
process.stdin.setEncoding('ascii');

var input_stdin = ""; 
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
input_stdin += data;
});

process.stdin.on('end', function () {
input_stdin_array = input_stdin.split("\n");
main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

function sum(num) {
    var sum = 0;
    var idx = 1;
        while(idx <= num){ 
            if(idx % 2 == 0){
                sum += idx;
            }
            idx++;
        }
     return sum;
}

function main() {
    var num= parseInt(readLine());
    var ans = sum(num);
    console.log(ans);
}