// array5.js

const ary = [12, 20, 2, 1, 100, 88]
ary.sort((a, b) => {
    // 오름차순: -1, 내림차순: 1
    if (a > b) {
        return -1;
    } else {
        return 1;
    }
});
console.log("Hong" > "Park");
const friends = [
    {name:"Hong", age: 12},
    {name:"Hwang", age: 111},
    {name:"Park", age: 2},
    {name:"Kim", age: 33}
]
friends.sort((a, b) => {
    if(a.name < b.name) {
        return -1;
    }else{
        return 1;
    }
})
console.log(friends);