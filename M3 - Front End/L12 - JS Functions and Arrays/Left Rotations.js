/*
Implement a function that returns an updated array with 1 left 
rotation on an array of integers
rotateLeft([1,2,3,4]) // returns [2,3,4,1]
*/

//Write your function here
function rotateLeft(arr) {
    let newArr = []
    for (let i = 1; i < arr.length; i++) {
      newArr.push(arr[i])
    }
    newArr.push(arr[0])
    return newArr
  }
  
  // Input and output has already been handled for you
  process.stdin.resume();
  process.stdin.setEncoding('utf8');
  
  let remainder = '';
  process.stdin.on('data', function (chunk) {
    let arr = chunk.toString()
    arr = arr.split(' ')
    let nums = []
    for(const c of arr) {
        nums.push(parseInt(c))
    }
  
    const ans = rotateLeft(nums).join(' ')
    process.stdout.write(ans)
    process.exit();
  });